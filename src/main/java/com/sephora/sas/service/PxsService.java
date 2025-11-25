package com.sephora.sas.service;

import com.sephora.sas.response.PxsResponse;

public interface PxsService {

	PxsResponse getPxsData(String sku, String country, String locale);

}
