package entities;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product extends GeneralEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @PostLoad
    public void postLoad() {
        System.out.println("Post load event called");
        System.out.println("Entity: " + this + " was loaded");
    }

    @PreRemove
    public void preRemove() {
        System.out.println("PreRemove event called");
        System.out.println("Entity: " + this + " will be removed");
    }

    @PostRemove
    public void postRemove() {
        System.out.println("PostRemove event called");
        System.out.println("Entity: " + this + " was removed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +

                ", name='" + name + '\'' +
                '}';
    }
}
