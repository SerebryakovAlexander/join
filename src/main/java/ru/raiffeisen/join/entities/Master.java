package ru.raiffeisen.join.entities;

import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "MASTER")
@Data
public class Master {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String field1;
    private String field2;
    private String field3;
    private Long documentId;
}
