package com.github.jotagit.mybatis.service.impl;

import com.github.jotagit.mybatis.component.RestConnector;
import com.github.jotagit.mybatis.entity.Objeto;
import com.github.jotagit.mybatis.repository.IRepositorio;
import com.github.jotagit.mybatis.service.IServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoImpl implements IServico {

	@Autowired
	IRepositorio usuarioRepositorioImpl;

	@Autowired
	RestConnector restConnector;
	
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

		Boolean eventoPublicado = restConnector.publicarEvento("mensagem".concat(objeto.getId().toString()));

		System.out.println(eventoPublicado);

		return usuarioRepositorioImpl.getOne(idsaved);
	}

	@Override
	public Boolean delete(Objeto objeto) {
		return usuarioRepositorioImpl.delete(objeto);
	}
}
