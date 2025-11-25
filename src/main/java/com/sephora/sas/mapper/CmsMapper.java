package com.sephora.sas.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.sephora.sas.response.CmsRawResponse;
import com.sephora.sas.response.CmsResponse;

@Mapper(componentModel = "spring")
public interface CmsMapper {

    // ProductInfo.active ← raw.attributes.active
    @Mapping(target = "productInfo.active",
             source = "raw.attributes.active")

    // SkuInfo mappings
    @Mapping(target = "skuInfo.active",
             source = "raw.attributes.active")
    @Mapping(target = "skuInfo.startDate",
             source = "raw.attributes.startDate")
    @Mapping(target = "skuInfo.endDate",
             source = "raw.attributes.endDate")
    //@Mapping(target = "skuInfo.availableCountry", source = "raw.attributes.availableCountries")
    CmsResponse toCmsResponse(CmsRawResponse raw);


}
