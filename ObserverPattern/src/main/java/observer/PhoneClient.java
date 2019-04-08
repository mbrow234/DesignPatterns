package observer;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/31/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class PhoneClient extends Observer {

    public PhoneClient (Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from phone");
    }

    @Override
    void update() {
        System.out.println("Phone Stream: " + subject.getState());
    }
}
