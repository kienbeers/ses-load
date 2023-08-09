package com.example.load.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class PKS3DataLoadFrame1 implements Serializable {
    private static final long serialVersionUID = 5419345600310440297L;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "transaction_date")
    private Long transactionDate;
    public PKS3DataLoadFrame1(Long transactionDate) {
        this.transactionDate = transactionDate;
    }
}
