package model.obj.eds;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.common.CCFieldConfig;
import cococare.common.CCFieldConfig.Accessible;
import cococare.common.CCFieldConfig.Type;
import cococare.common.CCTypeConfig;
import cococare.database.CCEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
@Entity
@Table(name = "eds_services")
@CCTypeConfig(label = "Service", uniqueKey = "name", parameter = true)
public class EdsService extends CCEntity {

    @Column(length = 8)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, sequence = "000", unique = true)
    private String code;
    @Column(length = 24)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, requestFocus = true)
    private String name;
    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name")
    private EdsCoverageType coverageType;
    @Column(length = 24)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY)
    private String disclaimer;
    @CCFieldConfig(group = "General", maxLength = 4)
    private Boolean premium;
    @CCFieldConfig(group = "Service Level Agreement", accessible = Accessible.MANDATORY, type = Type.NUMERIC)
    private Integer arrivalTime = 1;
    @CCFieldConfig(group = "Service Level Agreement", accessible = Accessible.MANDATORY, type = Type.NUMERIC)
    private Integer maximum = 1;
    @CCFieldConfig(group = "Service Level Agreement", maxLength = 4)
    private Boolean includeWeekends;
    @CCFieldConfig(group = "Service Level Agreement", maxLength = 4)
    private Boolean includeHolidays;

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

    public EdsCoverageType getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(EdsCoverageType coverageType) {
        this.coverageType = coverageType;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public Boolean getPremium() {
        return premium;
    }

    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    public Integer getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Integer arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    public Boolean getIncludeWeekends() {
        return includeWeekends;
    }

    public void setIncludeWeekends(Boolean includeWeekends) {
        this.includeWeekends = includeWeekends;
    }

    public Boolean getIncludeHolidays() {
        return includeHolidays;
    }

    public void setIncludeHolidays(Boolean includeHolidays) {
        this.includeHolidays = includeHolidays;
    }
//</editor-fold>
}