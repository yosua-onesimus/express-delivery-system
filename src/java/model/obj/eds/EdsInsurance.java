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
@Table(name = "eds_insurances")
@CCTypeConfig(label = "Insurance", uniqueKey = "name", parameter = true)
public class EdsInsurance extends CCEntity {

    @Column(length = 8)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, sequence = "000", unique = true)
    private String code;
    @Column(length = 24)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, requestFocus = true)
    private String name;
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, type = Type.DECIMAL)
    private Float premiPercent;
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, type = Type.NUMBER_FORMAT)
    private Double premiNominal;
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, type = Type.DECIMAL)
    private Float adminFeePercent;
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, type = Type.NUMBER_FORMAT)
    private Double adminFeeNominal;

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

    public Float getPremiPercent() {
        return premiPercent;
    }

    public void setPremiPercent(Float premiPercent) {
        this.premiPercent = premiPercent;
    }

    public Double getPremiNominal() {
        return premiNominal;
    }

    public void setPremiNominal(Double premiNominal) {
        this.premiNominal = premiNominal;
    }

    public Float getAdminFeePercent() {
        return adminFeePercent;
    }

    public void setAdminFeePercent(Float adminFeePercent) {
        this.adminFeePercent = adminFeePercent;
    }

    public Double getAdminFeeNominal() {
        return adminFeeNominal;
    }

    public void setAdminFeeNominal(Double adminFeeNominal) {
        this.adminFeeNominal = adminFeeNominal;
    }
//</editor-fold>
}