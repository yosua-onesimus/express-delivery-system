package controller.zul.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.framework.zk.controller.zul.ZulDefaultListCtrl;
import cococare.zk.CCBandbox;
import model.obj.eds2.EdsRouteNode;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class ZulRouteNodeListCtrl extends ZulDefaultListCtrl {

//<editor-fold defaultstate="collapsed" desc=" private object ">
    private CCBandbox txtNodeFrom;
    private CCBandbox txtNodeTo;
//</editor-fold>

    @Override
    protected Class _getClass() {
        return _getDefaultToCustomClass();
    }

    @Override
    protected Class _getEntity() {
        return EdsRouteNode.class;
    }

    @Override
    protected void _initComponent() {
        super._initComponent();
        txtNodeFrom = (CCBandbox) parameter.get(toString() + "txtNodeFrom");
        txtNodeTo = (CCBandbox) parameter.get(toString() + "txtNodeTo");
    }

    @Override
    public void doUpdateTable() {
        super.doUpdateTable();
        if (tblEntity.getList().isEmpty()) {
            System.out.println("X");
        }
    }
}