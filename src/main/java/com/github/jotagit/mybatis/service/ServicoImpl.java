package com.github.jotagit.mybatis.service;

import com.github.jotagit.mybatis.entity.Objeto;
import com.github.jotagit.mybatis.repository.IRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoImpl implements IServico {

	@Autowired
	IRepositorio usuarioRepositorioImpl;
	
	@Override
	public List<Objeto> findAll(){
		return usuarioRepositorioImpl.findAll();
	}
	
	@Override
	public Objeto getOne(Integer id){
		return usuarioRepositorioImpl.getOne(id);
	}

	@Override
	public Objeto save(Objeto objeto) {
		Integer idsaved = usuarioRepositorioImpl.save(objeto);
		return usuarioRepositorioImpl.getOne(idsaved);
	}

	@Override
	public Boolean delete(Objeto objeto) {
		return usuarioRepositorioImpl.delete(objeto);
	}
}
