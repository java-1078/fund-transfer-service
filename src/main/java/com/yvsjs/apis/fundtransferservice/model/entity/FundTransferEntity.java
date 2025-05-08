package com.yvsjs.apis.fundtransferservice.model.entity;

import com.yvsjs.apis.fundtransferservice.model.TransactionStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "fund_transfer")
public class FundTransferEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String transactionReference;
    private String fromAccount;
    private String toAccount;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private TransactionStatus status;
}