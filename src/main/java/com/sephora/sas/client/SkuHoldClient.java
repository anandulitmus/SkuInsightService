package com.sephora.sas.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sephora.sas.response.SkuHoldResponse;

@FeignClient(name = "skuHoldClient", url = "${services.skuhold.base-url}")
public interface SkuHoldClient {
    @GetMapping("/v1/hold/sku/{sku}")
    SkuHoldResponse getSku(@PathVariable String sku);
}
