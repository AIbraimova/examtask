package Peaksoft.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@ToString
@Entity
@Table(name="companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company_name;
    private String country;
    @OneToMany(cascade = {CascadeType.PERSIST})
    private Car car;

    public Company(String company_name, String country) {
        this.company_name = company_name;
        this.country = country;
    }

    public Company(String company_name, String country, Car car) {
        this.company_name = company_name;
        this.country = country;
        this.car = car;

    }

    public Company() {

    }
}
