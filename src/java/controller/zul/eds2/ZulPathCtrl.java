package controller.zul.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.framework.zk.controller.zul.ZulDefaultWithChildCtrl;
import cococare.zk.CCBandbox;
import static model.mdl.eds.EdsLanguage.Route;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class ZulPathCtrl extends ZulDefaultWithChildCtrl {

//<editor-fold defaultstate="collapsed" desc=" private object ">
    private CCBandbox txtNodeFrom;
    private CCBandbox txtNodeTo;
//</editor-fold>

    @Override
    protected void _initComponent() {
        super._initComponent();
        ZulRouteListCtrl zulRouteListCtrl = new ZulRouteListCtrl();
        parameter.put(zulRouteListCtrl + "txtNodeFrom", txtNodeFrom);
        parameter.put(zulRouteListCtrl + "txtNodeTo", txtNodeTo);
        _addChildScreen2(Route + "s", "path", zulRouteListCtrl);
    }
}