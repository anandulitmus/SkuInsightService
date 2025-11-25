package com.sephora.sas.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AggregatedSkuResponse {
	private PxmResponse pxm;
	private CmsResponse cms;
	private PxsResponse pxs;
	private SkuHoldResponse skuhold;
}
