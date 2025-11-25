package com.sephora.sas.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class SkuInfo {
	private boolean active;
    private String startDate;
    private String endDate;
    private boolean onHold;
    private String availableCountry;    
    private Boolean outOfStock;
    private Boolean addToBasket;
}
