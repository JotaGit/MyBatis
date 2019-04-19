package com.github.jotagit.mybatis.service;

import com.github.jotagit.mybatis.entity.Objeto;
import com.github.jotagit.mybatis.repository.IRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicoImpl implements IServico {

	@Autowired
	IRepositorio usuarioRepositorioImpl;
	
	@Override
	public List<Objeto> findAll(){
		List<Objeto> ret = new ArrayList<Objeto>();
		ret = usuarioRepositorioImpl.findAll();
		return ret;
	}
	
	@Override
	public Objeto getOne(Integer id){
		Objeto ret = new Objeto();
		ret = usuarioRepositorioImpl.getOne(id);
		return ret;
	}

	@Override
	public Objeto save(Objeto objeto) {
		Objeto ret = new Objeto();
		usuarioRepositorioImpl.save(objeto);
		ret = objeto;
		return ret;
	}

	@Override
	public Boolean delete(Objeto objeto) {
		Objeto ret = new Objeto();
        usuarioRepositorioImpl.delete(objeto);
		return Boolean.TRUE;
	}
}
