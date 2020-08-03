package com.maven.service;

import java.util.List;

import com.maven.model.shortenerURL;

public interface IshortenerURLService {
	public List<shortenerURL>listar();
	public shortenerURL listshortenerURLId(int id);
	public int agregar(shortenerURL sURL);
}
