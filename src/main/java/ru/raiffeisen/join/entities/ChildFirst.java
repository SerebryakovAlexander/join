package ru.raiffeisen.join.entities;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Table(name = "CHILD1")
@Data
public class ChildFirst {

    public ChildFirst()
    {
        master = new Master();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String field1;
    private String field2;
    private String field3;


    @OneToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id", referencedColumnName = "documentId")
    @Fetch(FetchMode.JOIN)
    private Master master;

}
