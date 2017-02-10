package model.mdl.eds;

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class EdsEnum {

    public enum NodeLevel {

        GATEWAY("Gateway"),
        CABANG_UTAMA("Cabang Utama"),
        CABANG("Cabang"),
        AGEN("Agen"),
        KANTOR_PERWAKILAN("Kantor Perwakilan"),
        OPERATIONAL("Operational");
        private String string;

        private NodeLevel(String string) {
            this.string = string;
        }

        @Override
        public String toString() {
            return string;
        }
    }
}