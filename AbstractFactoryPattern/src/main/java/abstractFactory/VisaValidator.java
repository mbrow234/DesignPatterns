package abstractFactory;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 12/6/17.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class VisaValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {

        return false;
    }
}
