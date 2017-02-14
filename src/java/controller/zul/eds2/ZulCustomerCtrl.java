package controller.zul.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.framework.zk.controller.zul.ZulDefaultCtrl;
import controller.misc.eds.AreaListener;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class ZulCustomerCtrl extends ZulDefaultCtrl {

    @Override
    protected void _initListener() {
        super._initListener();
        AreaListener.init(getContainer());
    }
}