package entities;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class DepartmentDetails {

    @ManyToOne
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
