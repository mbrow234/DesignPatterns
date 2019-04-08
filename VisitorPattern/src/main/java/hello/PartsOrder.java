package hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 2/12/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class PartsOrder implements AtvPart{

    private List<AtvPart> parts = new ArrayList<>();

    public PartsOrder() {

    }

    public void addPart(AtvPart atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    @Override
    public void accept(AtvPartVisitor visitor) {
        for (AtvPart atvPart : parts) {
            atvPart.accept(visitor);
        }
        visitor.visit(this);
    }
}
