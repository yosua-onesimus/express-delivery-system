package model.obj.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.common.CCFieldConfig;
import cococare.common.CCFieldConfig.Accessible;
import cococare.common.CCFieldConfig.Type;
import cococare.common.CCTypeConfig;
import cococare.database.CCEntity;
import cococare.framework.model.obj.util.UtilCountry;
import cococare.framework.model.obj.util.UtilProvince;
import cococare.framework.model.obj.util.UtilRegency;
import cococare.framework.model.obj.util.UtilSubDistrict;
import cococare.framework.model.obj.util.UtilVillage;
import cococare.framework.model.obj.util.UtilZipCode;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import model.obj.eds.EdsCustomerType;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
@Entity
@Table(name = "eds_customers")
@CCTypeConfig(label = "Customer", uniqueKey = "fullName")
public class EdsCustomer extends CCEntity {

    @Column(length = 8)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, sequence = "000", unique = true)
    private String code;
    @Column(length = 32)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, requestFocus = true)
    private String fullName;
    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name", visible = false)
    private EdsCustomerType type;
    @Column(length = 255)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = Short.MAX_VALUE, visible = false)
    private String address;
    @Column(length = 16)
    @CCFieldConfig(group = "General", tooltiptext = "RT/RW", visible = false)
    private String neighborhood;
    @ManyToOne
    @CCFieldConfig(group = "General", tooltiptext = "Kode Pos", accessible = Accessible.MANDATORY, maxLength = 5, uniqueKey = "code", visible = false)
    private UtilZipCode zipCode;
    @ManyToOne
    @CCFieldConfig(group = "General", tooltiptext = "Kelurahan", accessible = Accessible.MANDATORY, maxLength = 48, uniqueKey = "name", visible = false)
    private UtilVillage village;
    @ManyToOne
    @CCFieldConfig(group = "General", tooltiptext = "Kecamatan", accessible = Accessible.MANDATORY, maxLength = 48, uniqueKey = "name", visible = false)
    private UtilSubDistrict subDistrict;
    @ManyToOne
    @CCFieldConfig(group = "General", tooltiptext = "Kabupaten", accessible = Accessible.MANDATORY, maxLength = 48, uniqueKey = "name", visible = false)
    private UtilRegency regency;
    @ManyToOne
    @CCFieldConfig(group = "General", tooltiptext = "Propinsi", accessible = Accessible.MANDATORY, maxLength = 48, uniqueKey = "name", visible = false)
    private UtilProvince province;
    @ManyToOne
    @CCFieldConfig(group = "General", tooltiptext = "Negara", accessible = Accessible.MANDATORY, maxLength = 48, uniqueKey = "name", visible = false)
    private UtilCountry country;
    @Column(length = 16)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, type = Type.PHONE_NUMBER)
    private String phone;

//<editor-fold defaultstate="collapsed" desc=" getter-setter ">
    public EdsCustomerType getType() {
        return type;
    }

    public void setType(EdsCustomerType type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public UtilZipCode getZipCode() {
        return zipCode;
    }

    public void setZipCode(UtilZipCode zipCode) {
        this.zipCode = zipCode;
    }

    public UtilVillage getVillage() {
        return village;
    }

    public void setVillage(UtilVillage village) {
        this.village = village;
    }

    public UtilSubDistrict getSubDistrict() {
        return subDistrict;
    }

    public void setSubDistrict(UtilSubDistrict subDistrict) {
        this.subDistrict = subDistrict;
    }

    public UtilRegency getRegency() {
        return regency;
    }

    public void setRegency(UtilRegency regency) {
        this.regency = regency;
    }

    public UtilProvince getProvince() {
        return province;
    }

    public void setProvince(UtilProvince province) {
        this.province = province;
    }

    public UtilCountry getCountry() {
        return country;
    }

    public void setCountry(UtilCountry country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
//</editor-fold>
}