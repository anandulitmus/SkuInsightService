package com.sephora.sas.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PxsRawResponse {
	private String type;
	private String url;
	private String seoTitle;

	@JsonProperty("isOutOfStock")
	private boolean isOutOfStock;

	private ActionFlags actionFlags;
	private String brandName;
	private String targetUrl;
	private PrimaryProduct primaryProduct;

	@Data
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class ActionFlags {
		@JsonProperty("isAddToBasket")
		private boolean isAddToBasket;
	}

	@Data
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class PrimaryProduct {
		private String productId;
	}
}
