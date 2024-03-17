package com.bitlab.sprinttask.entity;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int exam;
    @Column
    private String mark;


    public String isExamLow() {
        if (this.exam < 50) {
            return "red";
        } else {
            return "black";
        }

    }
}
