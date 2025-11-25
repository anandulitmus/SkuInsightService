package com.sephora.sas.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CmsRawResponse {
    private Attributes attributes;
    
    @Data
    public static class Attributes {
        private boolean active;
        private String startDate;
        private String endDate;
        private String canadaStartDate;
        private List<String> availableCountries;
    }
}

