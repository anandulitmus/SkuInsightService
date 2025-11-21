package com.sephora.sas.response;

import com.sephora.sas.dto.ProductInfo;
import com.sephora.sas.dto.SkuInfo;


public class CmsResponse {
	private ProductInfo productInfo;
    public ProductInfo getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}
	public SkuInfo getSkuInfo() {
		return skuInfo;
	}
	public void setSkuInfo(SkuInfo skuInfo) {
		this.skuInfo = skuInfo;
	}
	private SkuInfo skuInfo;
}
