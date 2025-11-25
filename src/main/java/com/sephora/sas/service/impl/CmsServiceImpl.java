package com.sephora.sas.service.impl;

import org.springframework.stereotype.Service;

import com.sephora.sas.client.CmsClient;
import com.sephora.sas.mapper.CmsMapper;
import com.sephora.sas.response.CmsRawResponse;
import com.sephora.sas.response.CmsResponse;
import com.sephora.sas.service.CmsService;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class CmsServiceImpl implements CmsService {

	private final CmsClient cmsClient;
    private final CmsMapper cmsMapper;

    public CmsResponse getCmsData(String skuId) {
        CmsRawResponse raw = cmsClient.getSku(skuId, "cms");
        return cmsMapper.toCmsResponse(raw);
    }

}
