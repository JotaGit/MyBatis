package com.github.jotagit.mybatis.service;

import java.util.List;

import com.github.jotagit.mybatis.entity.Objeto;

public interface IServico {

	Objeto getOne(Integer id);
	
	List<Objeto> findAll();

	Objeto save(Objeto objeto);

	Boolean delete(Objeto objeto);

}