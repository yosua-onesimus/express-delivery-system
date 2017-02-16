package model.obj.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.common.CCFieldConfig;
import cococare.common.CCFieldConfig.Accessible;
import cococare.common.CCFieldConfig.Type;
import cococare.common.CCTypeConfig;
import cococare.database.CCEntity;
import cococare.framework.model.obj.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import model.mdl.eds.EdsEnum.NodeLevel;
import model.obj.eds.EdsRegional;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
@Entity
@Table(name = "eds_nodes")
@CCTypeConfig(label = "Node", uniqueKey = "name")
public class EdsNode extends CCEntity {

    @Column(length = 8)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, sequence = "000", unique = true)
    private String code;
    @Column(length = 24)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, requestFocus = true)
    private String name;
    @Column(length = 24)
    @CCFieldConfig(group = "General", visible = false)
    private String description;
    @CCFieldConfig(group = "General", label = "Level", accessible = Accessible.MANDATORY, optionSource = "model.mdl.eds.EdsEnum$NodeLevel", optionReflectKey = "level", visible = false)
    private Integer levelIndex = NodeLevel.GATEWAY.ordinal();
    @Column(name = "level_", length = 18)
    @CCFieldConfig(group = "General", visible2 = false)
    private String level = NodeLevel.GATEWAY.toString();
    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name")
    private EdsRegional regional;
    @ManyToOne
    @CCFieldConfig(group = "General", maxLength = 24, uniqueKey = "name")
    private EdsNode parentNode;
    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.READONLY, maxLength = 24, uniqueKey = "name", visible = false)
    private EdsNode mainNode;
    @Column(length = 32)
    @CCFieldConfig(group = "Contact Person", label = "Name", accessible = Accessible.MANDATORY, visible = false)
    private String cpName;
    @Column(length = 16)
    @CCFieldConfig(group = "Contact Person", label = "Phone", accessible = Accessible.MANDATORY, type = Type.PHONE_NUMBER, visible = false)
    private String cpPhone;
    @Column(length = 255)
    @CCFieldConfig(group = "Address", accessible = Accessible.MANDATORY, maxLength = Short.MAX_VALUE, visible = false)
    private String address;
    @Column(length = 16)
    @CCFieldConfig(group = "Address", tooltiptext = "RT/RW", visible = false)
    private String neighborhood;
    @ManyToOne
    @CCFieldConfig(group = "Address", tooltiptext = "Kode Pos", accessible = Accessible.MANDATORY, maxLength = 5, uniqueKey = "code", visible = false)
    private UtilZipCode zipCode;
    @ManyToOne
    @CCFieldConfig(group = "Address", tooltiptext = "Kelurahan", accessible = Accessible.MANDATORY, maxLength = 48, uniqueKey = "name", visible = false)
    private UtilVillage village;
    @ManyToOne
    @CCFieldConfig(group = "Address", tooltiptext = "Kecamatan", accessible = Accessible.MANDATORY, maxLength = 48, uniqueKey = "name", visible = false)
    private UtilSubDistrict subDistrict;
    @ManyToOne
    @CCFieldConfig(group = "Address", tooltiptext = "Kabupaten", accessible = Accessible.MANDATORY, maxLength = 48, uniqueKey = "name", visible = false)
    private UtilRegency regency;
    @ManyToOne
    @CCFieldConfig(group = "Address", tooltiptext = "Propinsi", accessible = Accessible.MANDATORY, maxLength = 48, uniqueKey = "name", visible = false)
    private UtilProvince province;
    @ManyToOne
    @CCFieldConfig(group = "Address", tooltiptext = "Negara", accessible = Accessible.MANDATORY, maxLength = 48, uniqueKey = "name", visible = false)
    private UtilCountry country;

//<editor-fold defaultstate="collapsed" desc=" getter-setter ">
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLevelIndex() {
        return levelIndex;
    }

    public void setLevelIndex(Integer levelIndex) {
        this.levelIndex = levelIndex;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public EdsRegional getRegional() {
        return regional;
    }

    public void setRegional(EdsRegional regional) {
        this.regional = regional;
    }

    public EdsNode getParentNode() {
        return parentNode;
    }

    public void setParentNode(EdsNode parentNode) {
        this.parentNode = parentNode;
    }

    public EdsNode getMainNode() {
        return mainNode;
    }

    public void setMainNode(EdsNode mainNode) {
        this.mainNode = mainNode;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public String getCpPhone() {
        return cpPhone;
    }

    public void setCpPhone(String cpPhone) {
        this.cpPhone = cpPhone;
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
//</editor-fold>
}