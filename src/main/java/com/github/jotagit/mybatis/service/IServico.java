package com.github.jotagit.mybatis.service;

import com.github.jotagit.mybatis.entity.Objeto;

import java.util.List;

public interface IServico {

	Objeto getOne(Integer id);
	
	List<Objeto> findAll();

	Objeto save(Objeto objeto);

	Boolean delete(Objeto objeto);

}