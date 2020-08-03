package com.maven.modelDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.maven.model.shortenerURL;

@Repository
public class shortenerURLDAO implements IshortenerURL {

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<shortenerURL> listar() {
		// TODO Auto-generated method stub
		String sql="select * from shortener_URL";
		List<shortenerURL>urls=template.query(sql, new BeanPropertyRowMapper<shortenerURL>(shortenerURL.class));
		return urls;
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
