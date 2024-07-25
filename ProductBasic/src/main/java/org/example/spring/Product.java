package org.example.spring;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@ToString
public class Product {

    @Getter @Setter private String name;
    @Getter @Setter private String type;
    @Getter @Setter private String place;
    @Getter @Setter private LocalDate warranty;

}
