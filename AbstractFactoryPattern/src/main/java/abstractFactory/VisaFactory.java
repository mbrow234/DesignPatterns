package abstractFactory;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 12/6/17.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:

                return new VisaGoldCreditCard();
            case PLATINUM:

                return new VisaBlackCreditCard();
        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }
}
