package entities;

import javax.persistence.*;

@Entity
@Table(name = "department")
public class Deparment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
}
