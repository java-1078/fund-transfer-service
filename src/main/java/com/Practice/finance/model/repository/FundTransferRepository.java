package com.Practice.finance.model.repository;

import com.Practice.finance.model.entity.FundTransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FundTransferRepository extends JpaRepository<FundTransferEntity, Long> {
}