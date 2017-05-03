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
import model.obj.eds2.EdsNode;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
@Entity
@Table(name = "eds_timber_packings")
@CCTypeConfig(label = "Timber Packing", uniqueKey = "code")
public class EdsTimberPacking extends CCEntity {

    @Column(length = 12)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, sequence = "[yyMMdd]/000", unique = true)
    private String code;
    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = 12, uniqueKey = "code")
    private EdsConsignmentNotesItem consignmentNotesItem;
    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name")
    private EdsNode node;
    @Column(length = 32)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY)
    private String pic;
}