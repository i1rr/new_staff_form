package au.com.recruit.controller;

import au.com.recruit.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NewStaffFormControllerTest {
    @Test
    void whenStartAppThenGetIndexPage() {
        NewStaffFormController newStaffFormController = new NewStaffFormController();
        String view = newStaffFormController.getIndex();
        assertEquals("index", view);
    }

    @Test
    void whenRequestNewStaffFormPageThenGetPageWithTax() {
        NewStaffFormController newStaffFormController = new NewStaffFormController();
        var model = new ConcurrentModel();
        var employee = new Employee();
        String view = newStaffFormController.getSummary(employee, model);
        assertEquals("result", view);
    }
}