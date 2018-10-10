package com.zr.model;

public class SqlParam {
	private String id;
	
    private String key;

    private String validateType;

    private String validateVal;

    private String errorMsg;

	public SqlParam() {
		super();
	}

	public SqlParam(String id, String key, String validateType, String validateVal, String errorMsg) {
		super();
		this.id = id;
		this.key = key;
		this.validateType = validateType;
		this.validateVal = validateVal;
		this.errorMsg = errorMsg;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValidateType() {
		return validateType;
	}

	public void setValidateType(String validateType) {
		this.validateType = validateType;
	}

	public String getValidateVal() {
		return validateVal;
	}

	public void setValidateVal(String validateVal) {
		this.validateVal = validateVal;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

  
}