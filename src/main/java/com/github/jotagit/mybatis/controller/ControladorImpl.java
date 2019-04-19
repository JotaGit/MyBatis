package com.github.jotagit.mybatis.controller;

import java.util.ArrayList;
import java.util.List;

import com.github.jotagit.mybatis.entity.Objeto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.github.jotagit.mybatis.service.IServico;

@Controller
@RequestMapping("/objeto")
public class ControladorImpl implements IControlador {

	@Autowired
	IServico IServicoImpl;

	@Override
	@GetMapping
	@ResponseBody
	public List<Objeto> buscarTodos() {
		List<Objeto> objetoList = IServicoImpl.findAll();
		return objetoList;
	}

	@Override
	@GetMapping("/{id}")
	@ResponseBody
	public Objeto buscarUm(@PathVariable Integer id) {
		Objeto ret = IServicoImpl.getOne(id);
		return ret;
	}


	@Override
	@PostMapping
	@ResponseBody
	public Objeto salvar(@RequestBody Objeto objeto) {
		Objeto ret = IServicoImpl.save(objeto);
		return ret;
	}
	
	
	@Override
	@DeleteMapping("/{id}")
	@ResponseBody
	public Boolean borrar(Objeto objeto) {
		Objeto objetoABorrar = IServicoImpl.getOne(objeto.getId());
		return IServicoImpl.delete(objetoABorrar);
	}
	

	@RequestMapping(value="/mock")
	@ResponseBody
	public List<Objeto> mock(Objeto objeto){
		
		List<Objeto> objetoList = new ArrayList<Objeto>();
		Objeto p = new Objeto();
		p.setTexto(String.valueOf(Math.random()));
		objetoList.add(p);

		IServicoImpl.save(p);

		return this.buscarTodos();
	}
}
