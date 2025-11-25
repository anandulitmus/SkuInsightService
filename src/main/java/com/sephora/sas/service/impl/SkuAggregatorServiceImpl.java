package com.sephora.sas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sephora.sas.client.CmsClient;
import com.sephora.sas.client.PxmClient;
import com.sephora.sas.dto.ProductInfo;
import com.sephora.sas.dto.SkuInfo;
import com.sephora.sas.response.AggregatedSkuResponse;
import com.sephora.sas.response.CmsResponse;
import com.sephora.sas.response.PxmResponse;
import com.sephora.sas.response.PxsResponse;
import com.sephora.sas.service.CmsService;
import com.sephora.sas.service.PxmService;
import com.sephora.sas.service.PxsService;
import com.sephora.sas.service.SkuAggregatorService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SkuAggregatorServiceImpl implements SkuAggregatorService {
		@Autowired
 	    private PxmService pxmService;
		@Autowired
		private CmsService cmsService;
		@Autowired
 	    private PxsService pxsService;
 	    
//	    private final PxsClient pxsClient;
//	    private final SkuHoldClient skuHoldClient;
//	    private final SkuMapper skuMapper;

	@Override
	public AggregatedSkuResponse getSkuDetails(String sku,String locale,String country) {
		
		PxmResponse pxmData = pxmService.getPxmData(sku);
		CmsResponse cmsData =  cmsService.getCmsData(sku);
		PxsResponse pxsData  =  pxsService.getPxsData(sku,country,locale);
// TODO SkuOnHold, inventory, CT
		
		
		AggregatedSkuResponse response = new AggregatedSkuResponse();
		response.setPxm(pxmData);
		response.setCms(cmsData);
		response.setPxs(pxsData);
		// response.setSkuhold(skuHold);

		return response;
	}

}
