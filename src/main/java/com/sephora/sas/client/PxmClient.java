package com.sephora.sas.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.sephora.sas.response.PxmRawResponse;
import com.sephora.sas.response.PxmResponse;

@FeignClient(name = "pxmClient", url = "${services.catalog.base-url}")
public interface PxmClient {

    @GetMapping("/sku")
    PxmRawResponse getSku(
            @RequestParam("skuId") String skuId,
            @RequestParam("messageType") String messageType
    );
}
