package com.sephora.sas.service;

import org.springframework.stereotype.Component;

import com.sephora.sas.response.AggregatedSkuResponse;

@Component
public interface SkuAggregatorService {
	public AggregatedSkuResponse getSkuDetails(String sku, String locale, String country);
}
