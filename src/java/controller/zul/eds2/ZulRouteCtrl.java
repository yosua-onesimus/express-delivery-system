package controller.zul.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.framework.zk.controller.zul.ZulDefaultWithChildCtrl;
import static model.mdl.eds.EdsLanguage.Node;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class ZulRouteCtrl extends ZulDefaultWithChildCtrl {

    @Override
    protected void _initComponent() {
        super._initComponent();
        ZulRouteNodeListCtrl zulRouteNodeListCtrl = new ZulRouteNodeListCtrl();
        parameter.put(zulRouteNodeListCtrl + "txtNodeFrom", parameter.get(callerCtrl + "txtNodeFrom"));
        parameter.put(zulRouteNodeListCtrl + "txtNodeTo", parameter.get(callerCtrl + "txtNodeTo"));
        _addChildScreen2(Node + "s", "route", zulRouteNodeListCtrl);
    }
}