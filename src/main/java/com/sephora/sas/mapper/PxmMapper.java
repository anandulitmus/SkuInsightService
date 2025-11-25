package com.sephora.sas.mapper;

import java.util.Map;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.sephora.sas.response.PxmRawResponse;
import com.sephora.sas.response.PxmResponse;


@Mapper(componentModel = "spring")
public interface PxmMapper {

    @Mapping(target = "productInfo.active", expression = "java(Boolean.valueOf(PxmMapper.extractSingle(pxmRawResponse.getData().getAttributes(), \"isactive\")))")
    @Mapping(target = "skuInfo.availableCountry", expression = "java(PxmMapper.joinList(pxmRawResponse.getData().getAttributes(), \"availablecountries\"))")
    @Mapping(target = "skuInfo.startDate", expression = "java(PxmMapper.extractSingle(pxmRawResponse.getData().getAttributes(), \"uslivedate\"))")
    @Mapping(target = "skuInfo.endDate", expression = "java(PxmMapper.extractSingle(pxmRawResponse.getData().getAttributes(), \"usenddate\"))")
    @Mapping(target = "skuInfo.active", expression = "java(Boolean.valueOf(PxmMapper.extractSingle(pxmRawResponse.getData().getAttributes(), \"isactive\")))")
    PxmResponse toPxmResponse(PxmRawResponse pxmRawResponse);

    static String extractSingle(Map<String, PxmRawResponse.AttributeValues> attrs, String key) {
        if (attrs == null || !attrs.containsKey(key)) return null;
        var list = attrs.get(key).getValues();
        return list == null || list.isEmpty() ? null : list.get(0).getValue();
    }

    static String joinList(Map<String, PxmRawResponse.AttributeValues> attrs, String key) {
        if (attrs == null || !attrs.containsKey(key)) return null;
        return attrs.get(key).getValues().stream()
                    .map(PxmRawResponse.ValueWrapper::getValue)
                    .collect(Collectors.joining(","));
    }
}

