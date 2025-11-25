package com.sephora.sas.response;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PxmRawResponse {
    private String id;
    private String name;
    private String type;
    private DataWrapper data;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class DataWrapper {
        private Map<String, AttributeValues> attributes;
        private Map<String, Object> relationships;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class AttributeValues {
        private List<ValueWrapper> values;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ValueWrapper {
        private String id;
        private String value;
        private String locale;
        private String source;
        private Map<String, Object> properties;
    }
}

