package adapter;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 12/7/17.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class EmployeeDB implements Employee {

    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeDB(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }


    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("Id: " + id + ", FirstName: " + firstName + ", LastName: " + lastName + ", Email: " + email);
    }
}
