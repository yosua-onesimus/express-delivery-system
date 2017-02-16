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
        txtNodeFrom = (CCBandbox) parameter.get(this + "txtNodeFrom");
        txtNodeTo = (CCBandbox) parameter.get(this + "txtNodeTo");
    }

    @Override
    protected void _initTable() {
        super._initTable();
        if (newEntity) {
            System.out.println("newEntity");
        }
    }
}