package model.obj.eds;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.common.CCFieldConfig;
import cococare.common.CCFieldConfig.Accessible;
import cococare.common.CCFieldConfig.Type;
import cococare.common.CCTypeConfig;
import cococare.database.CCEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
@Entity
@Table(name = "eds_commodities")
@CCTypeConfig(label = "Commodity", uniqueKey = "name", parameter = true)
public class EdsCommodity extends CCEntity {

    @Column(length = 8)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, sequence = "000", unique = true)
    private String code;
    @Column(length = 24)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, requestFocus = true)
    private String name;
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, type = Type.DECIMAL)
    private Float surchargePercent;
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, type = Type.NUMBER_FORMAT)
    private Double surchargeNominal;

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

    public Float getSurchargePercent() {
        return surchargePercent;
    }

    public void setSurchargePercent(Float surchargePercent) {
        this.surchargePercent = surchargePercent;
    }

    public Double getSurchargeNominal() {
        return surchargeNominal;
    }

    public void setSurchargeNominal(Double surchargeNominal) {
        this.surchargeNominal = surchargeNominal;
    }
//</editor-fold>
}