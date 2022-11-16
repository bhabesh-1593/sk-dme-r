package com.sunknowledge.changehealthcare.pojo.professionalclaims;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "conditionCodes", "codeCategory", "certificationConditionIndicator", "sequenceOrder" })
@Generated("jsonschema2pojo")
public class PatientConditionInformationVision {

	@JsonProperty("conditionCodes")
	private List<String> conditionCodes = null;
	@JsonProperty("codeCategory")
	private String codeCategory;
	@JsonProperty("certificationConditionIndicator")
	private String certificationConditionIndicator;
	@JsonProperty("sequenceOrder")
	private String sequenceOrder;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("conditionCodes")
	public List<String> getConditionCodes() {
		return conditionCodes;
	}

	@JsonProperty("conditionCodes")
	public void setConditionCodes(List<String> conditionCodes) {
		this.conditionCodes = conditionCodes;
	}

	@JsonProperty("codeCategory")
	public String getCodeCategory() {
		return codeCategory;
	}

	@JsonProperty("codeCategory")
	public void setCodeCategory(String codeCategory) {
		this.codeCategory = codeCategory;
	}

	@JsonProperty("certificationConditionIndicator")
	public String getCertificationConditionIndicator() {
		return certificationConditionIndicator;
	}

	@JsonProperty("certificationConditionIndicator")
	public void setCertificationConditionIndicator(String certificationConditionIndicator) {
		this.certificationConditionIndicator = certificationConditionIndicator;
	}

	@JsonProperty("sequenceOrder")
	public String getSequenceOrder() {
		return sequenceOrder;
	}

	@JsonProperty("sequenceOrder")
	public void setSequenceOrder(String sequenceOrder) {
		this.sequenceOrder = sequenceOrder;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}