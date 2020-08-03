package com.maven.model;

public class shortenerURL {
	private int id;
	private String url_completa;
	private String url_corta;
	private String alias;
	
	//Constructor vacio
	public shortenerURL() {
		// TODO Auto-generated constructor stub
	}

	//Inicializar las variables
	public shortenerURL(int id, String url_completa, String url_corta, String alias) {
		super();
		this.id = id;
		this.url_completa = url_completa;
		this.url_corta = url_corta;
		this.alias = alias;
	}

	//get y set de las variables
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl_completa() {
		return url_completa;
	}

	public void setUrl_completa(String url_completa) {
		this.url_completa = url_completa;
	}

	public String getUrl_corta() {
		return url_corta;
	}

	public void setUrl_corta(String url_corta) {
		this.url_corta = url_corta;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	
	
}
