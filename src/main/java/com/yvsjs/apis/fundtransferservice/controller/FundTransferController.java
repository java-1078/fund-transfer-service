package com.yvsjs.apis.fundtransferservice.controller;

import com.yvsjs.apis.fundtransferservice.model.dto.FundTransfer;
import com.yvsjs.apis.fundtransferservice.model.dto.request.FundTransferRequest;
import com.yvsjs.apis.fundtransferservice.model.dto.response.FundTransferResponse;
import com.yvsjs.apis.fundtransferservice.service.FundTransferService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/transfer")
public class FundTransferController {
    private final FundTransferService fundTransferService;
    @PostMapping
    public ResponseEntity<FundTransferResponse> sendFundTransfer(@RequestBody FundTransferRequest fundTransferRequest) {
        log.info("Got fund transfer request from API {}", fundTransferRequest.toString());
        return ResponseEntity.ok(fundTransferService.fundTransfer(fundTransferRequest));
    }
    @GetMapping
    public ResponseEntity<List<FundTransfer>> readFundTransfers (Pageable pageable) {
        log.info("Reading fund transfers from core");
        return ResponseEntity.ok(fundTransferService.readAllTransfers(pageable));
    }
}