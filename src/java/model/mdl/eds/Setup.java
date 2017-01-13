package model.mdl.eds;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.framework.zk.CFSetup;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class Setup {

    public static void main(String[] args) {
        CFSetup.executeWebRootFile("web");
    }
}