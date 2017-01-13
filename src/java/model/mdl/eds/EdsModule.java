package model.mdl.eds;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.database.CCHibernateModule;
import cococare.framework.model.obj.util.UtilProvince;
import cococare.framework.model.obj.util.UtilRegency;
import cococare.framework.model.obj.util.UtilSubDistrict;
import cococare.framework.model.obj.util.UtilVillage;
import java.util.Arrays;
import java.util.List;
import model.obj.eds.*;
import model.obj.eds2.EdsCustomer;
import model.obj.eds3.EdsConsignmentNotes;
import model.obj.eds3.EdsConsignmentNotesItem;
import model.obj.eds3.EdsPickUp;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class EdsModule extends CCHibernateModule {

    public static EdsModule INSTANCE = new EdsModule();

    @Override
    protected List<Class> _getAnnotatedClasses() {
        return (List) Arrays.asList(
                //Parameter
                EdsCustomerType.class,
                UtilProvince.class,
                UtilRegency.class,
                UtilSubDistrict.class,
                UtilVillage.class,
                EdsGoodsType.class,
                EdsVehicleType.class,
                EdsPickUpStatus.class,
                EdsGoodsCategory.class,
                EdsCommodity.class,
                EdsCoverageType.class,
                EdsService.class,
                EdsHandling.class,
                EdsInsurance.class,
                //Archive
                EdsCustomer.class,
                //Transaction
                EdsPickUp.class,
                EdsConsignmentNotes.class,
                EdsConsignmentNotesItem.class);
    }
}