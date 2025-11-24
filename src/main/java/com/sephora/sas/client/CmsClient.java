package com.sephora.sas.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.sephora.sas.response.CmsResponse;

@FeignClient(name = "cmsClient", url = "${services.catalog.base-url}")
public interface CmsClient {
	 @GetMapping("/sku")
	    CmsResponse getSku(
	            @RequestParam("skuId") String skuId,
	            @RequestParam("messageType") String messageType
	    );
}

