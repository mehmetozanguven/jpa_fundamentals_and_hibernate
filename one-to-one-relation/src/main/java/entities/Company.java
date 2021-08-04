package entities;


import javax.persistence.*;

@Entity
@Table(name = "company")
@SecondaryTable(name = "Address",
pkJoinColumns = @PrimaryKeyJoinColumn(name = "company"))
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Column(table = "Address")
    private String street;

    @Column(table = "Address")
    private String number;

    @Column(table = "Address")
    private String city;

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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
