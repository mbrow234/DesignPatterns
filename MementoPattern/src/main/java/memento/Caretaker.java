package memento;

import java.util.Stack;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/25/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */

//caretaker
public class Caretaker {

    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee emp) {
        employeeHistory.push(emp.save());
    }

    public void revert(Employee emp) {
        emp.revert(employeeHistory.pop());
    }
}
