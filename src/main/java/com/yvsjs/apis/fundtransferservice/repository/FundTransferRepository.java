package com.yvsjs.apis.fundtransferservice.repository;

import com.yvsjs.apis.fundtransferservice.entity.FundTransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundTransferRepository extends JpaRepository<FundTransferEntity, Long> {
    //
}