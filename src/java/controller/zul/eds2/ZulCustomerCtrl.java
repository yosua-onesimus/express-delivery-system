package controller.zul.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import static cococare.common.CCLogic.isNotNull;
import cococare.framework.model.obj.util.UtilZipCode;
import cococare.framework.zk.controller.zul.ZulDefaultCtrl;
import cococare.zk.CCBandbox;
import static cococare.zk.CCZk.addListener;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class ZulCustomerCtrl extends ZulDefaultCtrl {

//<editor-fold defaultstate="collapsed" desc=" private object ">
    private CCBandbox txtZipCode;
    private CCBandbox txtVillage;
    private CCBandbox txtSubDistrict;
    private CCBandbox txtRegency;
    private CCBandbox txtProvince;
    private CCBandbox txtCountry;
//</editor-fold>

    @Override
    protected void _initListener() {
        super._initListener();
        addListener(txtZipCode.getBandbox(), new EventListener() {
            @Override
            public void onEvent(Event event) throws Exception {
                UtilZipCode zipCode = txtZipCode.getObject();
                if (isNotNull(zipCode)) {
                    txtVillage.setObject(zipCode.getVillage());
                    txtSubDistrict.setObject(zipCode.getVillage().getSubDistrict());
                    txtRegency.setObject(zipCode.getVillage().getSubDistrict().getRegency());
                    txtProvince.setObject(zipCode.getVillage().getSubDistrict().getRegency().getProvince());
                    txtCountry.setObject(zipCode.getVillage().getSubDistrict().getRegency().getProvince().getCountry());
                }
            }
        });
    }
}