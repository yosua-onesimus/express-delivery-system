package controller.zul.eds3;

//<editor-fold defaultstate="collapsed" desc=" import ">
import static cococare.common.CCLogic.coalesce;
import static cococare.zk.CCZk.addListener;
import cococare.framework.zk.controller.zul.ZulDefaultCtrl;
import cococare.zk.CCBandbox;
import static cococare.zk.CCZk.setVisible;
import cococare.zk.CCEditor;
import controller.misc.eds.AreaListener;
import controller.misc.eds.PanelNewEntity;
import model.obj.eds2.EdsCustomer;
import model.obj.eds3.EdsPickUp;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.Cell;
import org.zkoss.zul.Row;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class ZulPickUpCtrl extends ZulDefaultCtrl {

    private EdsPickUp pickUp;
    private Row rowShipperInfoDummy;
    private CCBandbox txtShipperInfoDummy;
    private CCEditor edtShipperInfo;

    @Override
    protected void _initObject() {
        super._initObject();
        pickUp = (EdsPickUp) objEntity;
    }

    @Override
    protected void _initEditor() {
        super._initEditor();
        {
            Cell cell = PanelNewEntity.newCell(rowShipperInfoDummy);
            PanelNewEntity.init(cell, true, "Shipper Info",// 
                    edtShipperInfo = PanelNewEntity.newEditor(EdsCustomer.class, PanelNewEntity.BLANK));
            AreaListener.init(edtShipperInfo.getContainer());
        }
    }

    @Override
    protected void _initListener() {
        super._initListener();
        addListener(txtShipperInfoDummy.getBandbox(), new EventListener() {
            @Override
            public void onEvent(Event event) throws Exception {
                _doTxtShipperInfoDummy();
            }
        });
    }

    @Override
    protected void _doUpdateAccessible() {
        super._doUpdateAccessible();
        if (!newEntity) {
            setVisible(false, rowShipperInfoDummy);
        }
    }

    @Override
    protected boolean _isValueValid() {
        return super._isValueValid()//
                && edtShipperInfo.isValueValid();
    }

    @Override
    protected boolean _doSaveEntity() {
        pickUp.setShipperInfo((EdsCustomer) edtShipperInfo.getValueFromEditor());
        return super._doSaveEntity();
    }

    private void _doTxtShipperInfoDummy() {
        EdsCustomer shipperInfo = txtShipperInfoDummy.getObject();
        pickUp.setShipperInfo(coalesce(shipperInfo, new EdsCustomer()));
        _doUpdateEditorShipperInfo();
    }

    @Override
    protected void _doUpdateEditor() {
        _doUpdateEditorShipperInfo();
        super._doUpdateEditor();
    }

    private void _doUpdateEditorShipperInfo() {
        try {
            edtShipperInfo.setValueToEditor(pickUp.getShipperInfo());
        } catch (Exception exception) {
        }
    }
}