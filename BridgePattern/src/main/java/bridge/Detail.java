package bridge;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 12/12/17.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class Detail {

    private String label;
    private String value;

    public Detail(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }
}
