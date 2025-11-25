package com.sephora.sas.service.impl;

import org.springframework.stereotype.Service;

import com.sephora.sas.client.CmsClient;
import com.sephora.sas.client.PxmClient;
import com.sephora.sas.mapper.CmsMapper;
import com.sephora.sas.mapper.PxmMapper;
import com.sephora.sas.mapper.PxsMapper;
import com.sephora.sas.response.CmsRawResponse;
import com.sephora.sas.response.PxmRawResponse;
import com.sephora.sas.response.PxmResponse;
import com.sephora.sas.service.PxmService;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class PxmServiceImpl implements PxmService {
	
	private final PxmClient client;
    private final PxmMapper mapper;

	@Override
	public PxmResponse getPxmData(String skuId) {
		PxmRawResponse raw = client.getSku(skuId, "pxm");
        return mapper.toPxmResponse(raw);
	}

}
