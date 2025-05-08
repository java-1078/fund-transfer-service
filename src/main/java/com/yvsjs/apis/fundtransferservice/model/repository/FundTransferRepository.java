package com.yvsjs.apis.fundtransferservice.model.repository;

import com.yvsjs.apis.fundtransferservice.model.entity.FundTransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundTransferRepository extends JpaRepository<FundTransferEntity, Long> {
}