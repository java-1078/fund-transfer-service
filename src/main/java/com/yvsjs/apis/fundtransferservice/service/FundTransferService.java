package com.yvsjs.apis.fundtransferservice.service;

import com.yvsjs.apis.fundtransferservice.types.TransactionStatus;
import com.yvsjs.apis.fundtransferservice.dtos.FundTransfer;
import com.yvsjs.apis.fundtransferservice.request.FundTransferRequest;
import com.yvsjs.apis.fundtransferservice.response.FundTransferResponse;
import com.yvsjs.apis.fundtransferservice.entity.FundTransferEntity;
import com.yvsjs.apis.fundtransferservice.mapper.FundTransferMapper;
import com.yvsjs.apis.fundtransferservice.repository.FundTransferRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class FundTransferService {

    private final FundTransferRepository fundTransferRepository;
    private final FundTransferMapper mapper;

    public FundTransferResponse fundTransfer(FundTransferRequest request) {
        log.info("Sending fund transfer request {}", request.toString());
        FundTransferEntity entity = new FundTransferEntity();
        BeanUtils.copyProperties(request, entity);
        entity.setStatus(TransactionStatus.PENDING);
        FundTransferEntity optFundTransfer = fundTransferRepository.save(entity);
        FundTransferResponse fundTransferResponse = new FundTransferResponse();
        fundTransferResponse.setTransactionId(UUID.randomUUID().toString());
        fundTransferResponse.setMessage("Success");
        return fundTransferResponse;
    }

    public List<FundTransfer> readAllTransfers(Pageable pageable) {
        return mapper.convertToDtoList(fundTransferRepository.findAll(pageable).getContent());
    }

}
