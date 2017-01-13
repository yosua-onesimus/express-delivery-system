package model.obj.eds3;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.common.CCFieldConfig;
import cococare.common.CCFieldConfig.Accessible;
import cococare.common.CCTypeConfig;
import cococare.database.CCEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import model.obj.eds.*;
import model.obj.eds2.EdsCustomer;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
@Entity
@Table(name = "eds_consignment_notes")
@CCTypeConfig(label = "Consignment Notes", uniqueKey = "code")
public class EdsConsignmentNotes extends CCEntity {

    @Column(length = 12)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, sequence = "[yyMMdd]/000", unique = true)
    private String code;
    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = 32, uniqueKey = "fullName")
    private EdsCustomer shipperInfo;
    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = 32, uniqueKey = "fullName")
    private EdsCustomer consigneeInfo;
    @ManyToOne
    @CCFieldConfig(group = "Goods Description", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name", visible = false)
    private EdsGoodsType goodsType;
    @ManyToOne
    @CCFieldConfig(group = "Goods Description", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name", visible = false)
    private EdsGoodsCategory goodsCategory;
    @ManyToOne
    @CCFieldConfig(group = "Goods Description", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name", visible = false)
    private EdsCommodity commodity;
    @ManyToOne
    @CCFieldConfig(group = "Instruction", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name", visible = false)
    private EdsService service;
    @ManyToOne
    @CCFieldConfig(group = "Instruction", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name", visible = false)
    private EdsHandling handling;
    @ManyToOne
    @CCFieldConfig(group = "Instruction", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name", visible = false)
    private EdsInsurance insurance;

//<editor-fold defaultstate="collapsed" desc=" getter-setter ">
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public EdsCustomer getShipperInfo() {
        return shipperInfo;
    }

    public void setShipperInfo(EdsCustomer shipperInfo) {
        this.shipperInfo = shipperInfo;
    }

    public EdsCustomer getConsigneeInfo() {
        return consigneeInfo;
    }

    public void setConsigneeInfo(EdsCustomer consigneeInfo) {
        this.consigneeInfo = consigneeInfo;
    }

    public EdsGoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(EdsGoodsType goodsType) {
        this.goodsType = goodsType;
    }

    public EdsGoodsCategory getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(EdsGoodsCategory goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    public EdsCommodity getCommodity() {
        return commodity;
    }

    public void setCommodity(EdsCommodity commodity) {
        this.commodity = commodity;
    }

    public EdsService getService() {
        return service;
    }

    public void setService(EdsService service) {
        this.service = service;
    }

    public EdsHandling getHandling() {
        return handling;
    }

    public void setHandling(EdsHandling handling) {
        this.handling = handling;
    }

    public EdsInsurance getInsurance() {
        return insurance;
    }

    public void setInsurance(EdsInsurance insurance) {
        this.insurance = insurance;
    }
//</editor-fold>
}