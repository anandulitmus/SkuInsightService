package com.sephora.sas.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sephora.sas.client.PxsClient;
import com.sephora.sas.mapper.PxsMapper;
import com.sephora.sas.response.PxsRawResponse;
import com.sephora.sas.response.PxsResponse;
import com.sephora.sas.service.PxsService;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class PxsServiceImpl implements PxsService{
	@Autowired
	private PxsClient client;
	@Autowired
    private PxsMapper mapper;
	@Override
	public PxsResponse getPxsData(String skuId, String country, String locale) {
		 Map<String, PxsRawResponse> response = client.getSku(country,locale, skuId);
        return mapper.toPxsResponse(response.get(skuId));
	}

}
