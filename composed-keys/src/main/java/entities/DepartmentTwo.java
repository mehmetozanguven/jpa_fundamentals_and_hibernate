package entities;

import javax.persistence.*;

@Entity
@Table(name = "department_two")
public class DepartmentTwo {

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "number", column = @Column(name = "number")),
            @AttributeOverride(name = "code", column = @Column(name = "code")),
    })
    private DepartmentEmbeddablePK departmentEmbeddablePK;

    private String name;

    public DepartmentEmbeddablePK getDepartmentEmbeddablePK() {
        return departmentEmbeddablePK;
    }

    public void setDepartmentEmbeddablePK(DepartmentEmbeddablePK departmentEmbeddablePK) {
        this.departmentEmbeddablePK = departmentEmbeddablePK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
