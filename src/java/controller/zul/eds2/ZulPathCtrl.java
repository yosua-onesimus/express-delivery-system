package controller.zul.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.framework.zk.controller.zul.ZulDefaultCtrl;
import cococare.zk.CCBandbox;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class ZulPathCtrl extends ZulDefaultCtrl {

//<editor-fold defaultstate="collapsed" desc=" private object ">
    private CCBandbox txtNodeFrom;
    private CCBandbox txtNodeTo;
//</editor-fold>

    @Override
    protected Class _getClass() {
        return ZulPathCtrl.class;
    }

    @Override
    protected void _initComponent() {
        super._initComponent();
        ZulRouteListCtrl zulRouteListCtrl = new ZulRouteListCtrl();
        parameter.put(zulRouteListCtrl.toString() + "txtNodeFrom", txtNodeFrom);
        parameter.put(zulRouteListCtrl.toString() + "txtNodeTo", txtNodeTo);
        _addChildScreen("path", zulRouteListCtrl, "zulRouteList");
    }
}