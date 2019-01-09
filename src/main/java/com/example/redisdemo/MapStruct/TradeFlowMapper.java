package com.example.redisdemo.MapStruct;

import com.example.redisdemo.domain.dto.TtradeFlowDto;
import com.example.redisdemo.domain.entity.TtradeFlow;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TradeFlowMapper {
    TradeFlowMapper TRADE_FLOW_MAPPER = Mappers.getMapper(TradeFlowMapper.class);

    @Mappings({
            @Mapping(source = "tradeType",target = "tradeTypeEnum"),
            @Mapping(source = "tradeStatus",target = "tradeStatusEnum")
          })
    TtradeFlowDto tradeFlowToDto(TtradeFlow ttradeFlow);

}
