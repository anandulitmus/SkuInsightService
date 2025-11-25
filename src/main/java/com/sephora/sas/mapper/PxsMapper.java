package com.sephora.sas.mapper;

import java.util.Map;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.sephora.sas.dto.SkuInfo;
import com.sephora.sas.response.PxmRawResponse;
import com.sephora.sas.response.PxmRawResponse.AttributeValues;
import com.sephora.sas.response.PxmRawResponse.ValueWrapper;
import com.sephora.sas.response.PxmResponse;
import com.sephora.sas.response.PxsRawResponse;
import com.sephora.sas.response.PxsResponse;

@Mapper(componentModel = "spring")
public interface PxsMapper {

	    @Mapping(target = "productInfo.productId", 
	             source = "primaryProduct.productId")

	    @Mapping(target = "productInfo.type", 
	             source = "type")

	    @Mapping(target = "productInfo.brandName", 
	             source = "brandName")

	    @Mapping(target = "productInfo.url", 
	             source = "url")

	    @Mapping(target = "productInfo.targetUrl", 
	             source = "targetUrl")

	    @Mapping(target = "skuInfo.outOfStock", 
	             source = "outOfStock")

	    @Mapping(target = "skuInfo.addToBasket", 
	             source = "actionFlags.addToBasket")
	    PxsResponse toPxsResponse(PxsRawResponse raw);

	
}
