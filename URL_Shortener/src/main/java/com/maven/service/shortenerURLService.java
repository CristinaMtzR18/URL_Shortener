package com.maven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.model.shortenerURL;
import com.maven.modelDAO.IshortenerURL;

@Service
public class shortenerURLService implements IshortenerURLService {
	
	@Autowired
	private IshortenerURL dao;
	
	@Override
	public List<shortenerURL> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public shortenerURL listshortenerURLId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int agregar(shortenerURL sURL) {
		// TODO Auto-generated method stub
		return 0;
	}

}
