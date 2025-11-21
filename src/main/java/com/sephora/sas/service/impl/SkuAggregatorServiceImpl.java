package com.sephora.sas.service.impl;

import org.springframework.stereotype.Component;

import com.sephora.sas.dto.ProductInfo;
import com.sephora.sas.dto.SkuInfo;
import com.sephora.sas.response.AggregatedSkuResponse;
import com.sephora.sas.response.CmsResponse;
import com.sephora.sas.response.PxmResponse;
import com.sephora.sas.response.PxsResponse;
import com.sephora.sas.service.SkuAggregatorService;

@Component
public class SkuAggregatorServiceImpl implements SkuAggregatorService {

	@Override
	public AggregatedSkuResponse getSkuDetails(String sku) {

	        // -------- PXM / CMS / PXS common structures --------
	        ProductInfo productInfo = new ProductInfo();
	        productInfo.setActive(true);

	        SkuInfo skuInfo = new SkuInfo();
	        skuInfo.setActive(true);
	        skuInfo.setStartDate("2020-06-01 07:00");
	        skuInfo.setEndDate("2020-06-01 07:00");
	        skuInfo.setOnHold(true);
	        skuInfo.setRestrictedCountry("US");

	        // -------- PXM --------
	        PxmResponse pxm = new PxmResponse();
	        pxm.setProductInfo(productInfo);
	        pxm.setSkuInfo(skuInfo);

	        // -------- CMS --------
	        CmsResponse cms = new CmsResponse();
	        cms.setProductInfo(productInfo);
	        cms.setSkuInfo(skuInfo);

	        // -------- PXS --------
	        PxsResponse pxs = new PxsResponse();
	        pxs.setProductInfo(productInfo);
	        pxs.setSkuInfo(skuInfo);

	        // -------- SKU-HOLD --------
//	        SkuHoldResponse holdSkuInfo  = new SkuHoldResponse();
//	        holdSkuInfo.setActive(true);
//
//	        SkuHoldInventoryInfo inventoryInfo = new SkuHoldInventoryInfo();
//	        inventoryInfo.setOutOfStock(false);
//	        inventoryInfo.setAvailableForSales(2069);
//
//	        SkuHoldResponse skuHold = new SkuHoldResponse();
//	        skuHold.setSkuInfo(holdSkuInfo);
//	        skuHold.setInventoryInfo(inventoryInfo);

	        // -------- Final Aggregated Response --------
	        AggregatedSkuResponse response = new AggregatedSkuResponse();
	        response.setPxm(pxm);
	        response.setCms(cms);
	        response.setPxs(pxs);
	       // response.setSkuhold(skuHold);

	        return response;
	    }
	

}
