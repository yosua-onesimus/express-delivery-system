package controller.zul.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.framework.zk.controller.zul.ZulDefaultCtrl;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class ZulRouteCtrl extends ZulDefaultCtrl {

    @Override
    protected Class _getClass() {
        return ZulRouteCtrl.class;
    }

    @Override
    protected void _initComponent() {
        super._initComponent();
        ZulRouteNodeListCtrl zulRouteNodeListCtrl = new ZulRouteNodeListCtrl();
        parameter.put(zulRouteNodeListCtrl.toString() + "txtNodeFrom", parameter.get(callerCtrl.toString() + "txtNodeFrom"));
        parameter.put(zulRouteNodeListCtrl.toString() + "txtNodeTo", parameter.get(callerCtrl.toString() + "txtNodeTo"));
        _addChildScreen("route", zulRouteNodeListCtrl, "zulRouteNodeList");
    }
}