package model.obj.eds3;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.common.CCFieldConfig;
import cococare.common.CCFieldConfig.Accessible;
import cococare.common.CCFieldConfig.Type;
import cococare.common.CCTypeConfig;
import cococare.database.CCEntity;
import java.sql.Time;
import java.util.Date;
import javax.persistence.*;
import model.obj.eds.EdsGoodsType;
import model.obj.eds.EdsPickUpStatus;
import model.obj.eds.EdsVehicleType;
import model.obj.eds2.EdsCustomer;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
@Entity
@Table(name = "eds_pick_ups")
@CCTypeConfig(label = "Pick Up", uniqueKey = "code")
public class EdsPickUp extends CCEntity {

    @Column(length = 12)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, sequence = "[yyMMdd]/000", unique = true)
    private String code;
    @ManyToOne
    @CCFieldConfig(group = "General", maxLength = 32, uniqueKey = "fullName", visible = false, requestFocus = true)
    transient private EdsCustomer shipperInfoDummy;
    @ManyToOne
    @CCFieldConfig(group = "General", maxLength = 32, uniqueKey = "fullName", visible2 = false)
    private EdsCustomer shipperInfo;
    @ManyToOne
    @CCFieldConfig(group = "General", maxLength = 32, uniqueKey = "fullName")
    private EdsCustomer pickUpInfo;
    @Temporal(value = TemporalType.DATE)
    @CCFieldConfig(group = "Instruction", accessible = Accessible.MANDATORY, type = Type.DATE)
    private Date pickUpDate = new Date();
    @CCFieldConfig(group = "Instruction", accessible = Accessible.MANDATORY, type = Type.TIME)
    private Time pickUpTime = new Time(new Date().getTime());
    @ManyToOne
    @CCFieldConfig(group = "Instruction", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name", visible = false)
    private EdsGoodsType goodsType;
    @CCFieldConfig(group = "Instruction", accessible = Accessible.MANDATORY, type = Type.NUMERIC, visible = false)
    private Integer quantity;
    @ManyToOne
    @CCFieldConfig(group = "Instruction", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name", visible = false)
    private EdsVehicleType vehicleType;
    @Column(length = 255)
    @CCFieldConfig(group = "Instruction", maxLength = Short.MAX_VALUE, visible = false)
    private String remark;
    @Column(length = 32)
    @CCFieldConfig(group = "Instruction", accessible = Accessible.MANDATORY)
    private String pic;
    @ManyToOne
    @CCFieldConfig(group = "Instruction", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name")
    private EdsPickUpStatus status;

//<editor-fold defaultstate="collapsed" desc=" getter-setter ">
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public EdsCustomer getShipperInfoDummy() {
        return shipperInfoDummy;
    }

    public void setShipperInfoDummy(EdsCustomer shipperInfoDummy) {
        this.shipperInfoDummy = shipperInfoDummy;
    }

    public EdsCustomer getShipperInfo() {
        return shipperInfo;
    }

    public void setShipperInfo(EdsCustomer shipperInfo) {
        this.shipperInfo = shipperInfo;
    }

    public EdsCustomer getPickUpInfo() {
        return pickUpInfo;
    }

    public void setPickUpInfo(EdsCustomer pickUpInfo) {
        this.pickUpInfo = pickUpInfo;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public Time getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(Time pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public EdsGoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(EdsGoodsType goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public EdsVehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(EdsVehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public EdsPickUpStatus getStatus() {
        return status;
    }

    public void setStatus(EdsPickUpStatus status) {
        this.status = status;
    }
//</editor-fold>
}