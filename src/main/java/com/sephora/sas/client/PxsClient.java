package com.sephora.sas.client;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;

import com.sephora.sas.response.PxsRawResponse;
import com.sephora.sas.response.PxsResponse;

@FeignClient(name = "pxsClient", url = "${services.pxs.base-url}")
public interface PxsClient {
	@GetMapping("/util/skuList")
    Map<String, PxsRawResponse> getSku(
            @RequestParam("country") String country,
            @RequestParam("loc") String locale,
            @RequestParam("skuIds") String skuId
    ); 
    
}
