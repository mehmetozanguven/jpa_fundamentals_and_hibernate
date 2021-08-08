package entities.mappedSuperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bicycle")
public class Bicycle extends Vehicle {

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
