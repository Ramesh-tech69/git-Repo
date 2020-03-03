package com.app;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Product {
	private List<String> models;
	private Set<String> codes;
	private Map<Integer,String> data;
	private Properties info;
	public Product() {
		super();
	}
	public List<String> getModels() {
		return models;
	}
	public void setModels(List<String> models) {
		this.models = models;
	}
	public Set<String> getCodes() {
		return codes;
	}
	public void setCodes(Set<String> codes) {
		this.codes = codes;
	}
	public Map<Integer, String> getData() {
		return data;
	}
	public void setData(Map<Integer, String> data) {
		this.data = data;
	}
	public Properties getInfo() {
		return info;
	}
	public void setInfo(Properties info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Product [models=" + models + ", codes=" + codes + ", data=" + data + ", info=" + info + "]";
	}
}
