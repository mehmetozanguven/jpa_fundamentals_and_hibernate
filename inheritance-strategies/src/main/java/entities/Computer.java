package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "computer")
public class Computer extends Product {

    private String ram;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
