package com.sephora.sas.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sephora.sas.dto.ProductInfo;
import com.sephora.sas.dto.SkuInfo;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CmsResponse {
	private ProductInfo productInfo;
	private SkuInfo skuInfo;
}
