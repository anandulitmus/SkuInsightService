package com.sephora.sas.mapper;

import org.mapstruct.Mapper;

import com.sephora.sas.response.AggregatedSkuResponse;
import com.sephora.sas.response.CmsResponse;
import com.sephora.sas.response.PxmResponse;
import com.sephora.sas.response.PxsResponse;
import com.sephora.sas.response.SkuHoldResponse;

@Mapper(componentModel = "spring")
public interface SkuMapper {

    AggregatedSkuResponse mapToAggregated(
            PxmResponse pxm,
            CmsResponse cms,
            PxsResponse pxs,
            SkuHoldResponse hold
    );
}
