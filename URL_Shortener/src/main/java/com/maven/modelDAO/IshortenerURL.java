package com.maven.modelDAO;

import java.util.List;

import com.maven.model.shortenerURL;

public interface IshortenerURL {
	public List<shortenerURL>listar();
	public shortenerURL listshortenerURLId(int id);
	public int agregar(shortenerURL sURL);
}