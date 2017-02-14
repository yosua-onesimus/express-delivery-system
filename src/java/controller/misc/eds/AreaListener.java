package controller.misc.eds;

//<editor-fold defaultstate="collapsed" desc=" import ">
import static cococare.common.CCLogic.isNotNull;
import cococare.framework.model.obj.util.UtilZipCode;
import static cococare.zk.CCZk.addListener;
import static cococare.zk.CCZk.initSpecialComponent;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import cococare.zk.CCBandbox;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class AreaListener {

//<editor-fold defaultstate="collapsed" desc=" private object ">
    private CCBandbox txtZipCode;
    private CCBandbox txtVillage;
    private CCBandbox txtSubDistrict;
    private CCBandbox txtRegency;
    private CCBandbox txtProvince;
    private CCBandbox txtCountry;
//</editor-fold>

    public AreaListener(Component container) {
        initSpecialComponent(container, this);
        if (isNotNull(txtZipCode)) {
            addListener(txtZipCode.getBandbox(), new EventListener() {
                @Override
                public void onEvent(Event event) throws Exception {
                    UtilZipCode zipCode = getTxtZipCode().getObject();
                    if (isNotNull(zipCode)) {
                        getTxtVillage().setObject(zipCode.getVillage());
                        getTxtSubDistrict().setObject(zipCode.getVillage().getSubDistrict());
                        getTxtRegency().setObject(zipCode.getVillage().getSubDistrict().getRegency());
                        getTxtProvince().setObject(zipCode.getVillage().getSubDistrict().getRegency().getProvince());
                        getTxtCountry().setObject(zipCode.getVillage().getSubDistrict().getRegency().getProvince().getCountry());
                    }
                }
            });
        }
    }

    public CCBandbox getTxtZipCode() {
        return txtZipCode;
    }

    public CCBandbox getTxtVillage() {
        return txtVillage;
    }

    public CCBandbox getTxtSubDistrict() {
        return txtSubDistrict;
    }

    public CCBandbox getTxtRegency() {
        return txtRegency;
    }

    public CCBandbox getTxtProvince() {
        return txtProvince;
    }

    public CCBandbox getTxtCountry() {
        return txtCountry;
    }

    public static AreaListener init(Component container) {
        return new AreaListener(container);
    }
}