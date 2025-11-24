package com.sephora.sas.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sephora.sas.response.PxsResponse;

@FeignClient(name = "pxsClient", url = "${services.pxs.base-url}")
public interface PxsClient {
    @GetMapping("/v1/pxs/sku/{sku}")
    PxsResponse getSku(@PathVariable String sku);
}
