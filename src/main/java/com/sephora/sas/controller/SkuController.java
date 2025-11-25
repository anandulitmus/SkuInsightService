package com.sephora.sas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sephora.sas.response.AggregatedSkuResponse;
import com.sephora.sas.service.SkuAggregatorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sku")
@RequiredArgsConstructor
public class SkuController {
	@Autowired
    private SkuAggregatorService service;

	@GetMapping("/sku-details")
	public ResponseEntity<AggregatedSkuResponse> getSkuDetails(
	        @RequestParam String skuId,
	        @RequestParam String locale,
	        @RequestParam String country
	){
		AggregatedSkuResponse response = service.getSkuDetails(skuId, locale, country);
	    return ResponseEntity.ok(response);
    }
}

