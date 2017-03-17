package model.mdl.eds;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.database.CCHibernateModule;
import cococare.framework.model.obj.util.*;
import java.util.Arrays;
import java.util.List;
import model.obj.eds.*;
import model.obj.eds2.*;
import model.obj.eds3.EdsConnoteActivity;
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
                UtilCountry.class,
                UtilProvince.class,
                UtilRegency.class,
                UtilSubDistrict.class,
                UtilVillage.class,
                UtilZipCode.class,
                //insert here
                EdsRegional.class,
                EdsVehicleType.class,
                //insert here
                EdsGoodsType.class,
                EdsPickUpStatus.class,
                EdsGoodsCategory.class,
                EdsCommodity.class,
                EdsCoverageType.class,
                EdsService.class,
                EdsHandling.class,
                EdsInsurance.class,
                //Archive
                EdsNode.class,
                EdsLink.class,
                EdsPath.class,
                EdsRoute.class,
                EdsRouteNode.class,
                EdsCustomer.class,
                //Transaction
                EdsPickUp.class,
                EdsConsignmentNotes.class,
                EdsConsignmentNotesItem.class,
                EdsConnoteActivity.class);
    }
}