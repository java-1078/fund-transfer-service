package com.yvsjs.apis.fundtransferservice.mapper;

import com.yvsjs.apis.fundtransferservice.dtos.FundTransfer;
import com.yvsjs.apis.fundtransferservice.entity.FundTransferEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class FundTransferMapper extends BaseMapper<FundTransferEntity, FundTransfer> {

    @Override
    public FundTransferEntity convertToEntity(FundTransfer dto, Object... args) {
        FundTransferEntity entity = new FundTransferEntity();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity);
        }
        return entity;
    }

    @Override
    public FundTransfer convertToDto(FundTransferEntity entity, Object... args) {
        FundTransfer dto = new FundTransfer();
        if (entity != null) {
            BeanUtils.copyProperties(entity, dto);
        }
        return dto;
    }

}
