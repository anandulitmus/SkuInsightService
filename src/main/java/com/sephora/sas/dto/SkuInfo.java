package com.sephora.sas.dto;


public class SkuInfo {

	private boolean isActive;
    private String startDate;
    private String endDate;
    private boolean isOnHold;
    private String restrictedCountry;
    
    public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public boolean isOnHold() {
		return isOnHold;
	}
	public void setOnHold(boolean isOnHold) {
		this.isOnHold = isOnHold;
	}
	public String getRestrictedCountry() {
		return restrictedCountry;
	}
	public void setRestrictedCountry(String restrictedCountry) {
		this.restrictedCountry = restrictedCountry;
	}
}
