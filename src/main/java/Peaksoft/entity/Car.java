package Peaksoft.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name="cars")

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String car_name;
    private int price;
    private LocalDate date_of_issue;
    @ManyToOne(cascade = {CascadeType.ALL}, mappedBy = "Company")
    private List<Company> companies;

    public Person(String name, int age) {
        this.car_name = car_name;
        this.price = price;
    }


    public Car(String car_name, int price, List<Company> companies) {
        this.car_name = car_name;
        this.price = price;
        this.companies = companies;
    }
}

