package mk.finki.ukim.wp.lab.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Random;

@Data
@Entity
@Table(name = "manufacturers")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String country;

    private String address;

    public Manufacturer(String name, String country, String address) {
        this.name = name;
        this.country = country;
        this.address = address;
    }

    public Manufacturer() {
    }

    public Manufacturer(Long id,String name, String country, String address) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.address = address;
    }
}
