package org.yesid.f1_crud.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "drivers")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class F1Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String team;

    private int carNumber;

    private String country;

    private Integer poles;

    private Integer wins;

    private Integer podiums;
}