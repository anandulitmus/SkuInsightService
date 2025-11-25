package com.sephora.sas.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ProductInfo {
	private boolean active;
	private String productId;
	private String type;
	private String brandName;
	private String url;
	private String targetUrl;

}
