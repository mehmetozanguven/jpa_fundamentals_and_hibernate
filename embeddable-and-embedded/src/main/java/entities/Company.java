package entities;

import entities.embeddables.Address;

import javax.persistence.*;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "number", column = @Column(name = "number")),
            @AttributeOverride( name = "street", column = @Column(name = "street")),
            @AttributeOverride( name = "city", column = @Column(name = "city"))
    })
    private Address address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
