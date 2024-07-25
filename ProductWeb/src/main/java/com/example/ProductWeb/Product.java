package com.example.ProductWeb;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@ToString
@Entity
@Table(name="PRODUCT")
public class Product {

    @Id @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter @Setter private String name;
    @Getter @Setter private String type;
    @Getter @Setter private String place;
    @Getter @Setter private LocalDate warranty;

}
