package controller.zul.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.framework.zk.controller.zul.ZulDefaultListCtrl;
import model.obj.eds2.EdsLink;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class ZulLinkListCtrl extends ZulDefaultListCtrl {

    @Override
    protected Class _getEntity() {
        return EdsLink.class;
    }
}