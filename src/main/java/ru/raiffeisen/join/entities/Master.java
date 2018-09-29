package ru.raiffeisen.join.entities;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
    @Column(name = "document_id", insertable = false, updatable = false)
    private Long documentId;

    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "document_id")
    @Fetch(FetchMode.JOIN)
    private ChildFirst childFirst;

    @Override
    public String toString()
    {
        return "Master(" + "id=" + id + ",field1=" + field1 + ",field2=" + field2 + ",field3=" + field3 + ",documentId=" + documentId + ")";
    }
}
