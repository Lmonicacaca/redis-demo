package com.example.redisdemo.MapStruct;

import com.example.redisdemo.domain.dto.TtradeFlowDto;
import com.example.redisdemo.domain.entity.TtradeFlow;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TradeFlowMapper {
    TradeFlowMapper TRADE_FLOW_MAPPER = Mappers.getMapper(TradeFlowMapper.class);

    @Mappings({
            @Mapping(source = "tradeType",target = "tradeTypeEnum"),
            @Mapping(source = "tradeStatus",target = "tradeStatusEnum"),
            @Mapping(target = "fcd",expression = "java(org.apache.commons.lang3.time.DateFormatUtils.format(ttradeFlow.getFcd(),\"yyyy-MM-dd HH:mm:ss\"))")
          })
    TtradeFlowDto tradeFlowToDto(TtradeFlow ttradeFlow);

    List<TtradeFlowDto> tradeFlowToDtos(List<TtradeFlow> list);

}
