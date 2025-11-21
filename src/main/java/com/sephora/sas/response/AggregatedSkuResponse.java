package com.sephora.sas.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class AggregatedSkuResponse {
    private PxmResponse pxm;
    public PxmResponse getPxm() {
		return pxm;
	}
	public void setPxm(PxmResponse pxm) {
		this.pxm = pxm;
	}
	public CmsResponse getCms() {
		return cms;
	}
	public void setCms(CmsResponse cms) {
		this.cms = cms;
	}
	public PxsResponse getPxs() {
		return pxs;
	}
	public void setPxs(PxsResponse pxs) {
		this.pxs = pxs;
	}
	public SkuHoldResponse getSkuhold() {
		return skuhold;
	}
	public void setSkuhold(SkuHoldResponse skuhold) {
		this.skuhold = skuhold;
	}
	private CmsResponse cms;
    private PxsResponse pxs;
    private SkuHoldResponse skuhold;
}
