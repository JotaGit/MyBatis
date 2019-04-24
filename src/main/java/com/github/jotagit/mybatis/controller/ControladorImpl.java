package com.github.jotagit.mybatis.controller;

import com.github.jotagit.mybatis.entity.Objeto;
import com.github.jotagit.mybatis.service.IServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/objeto")
public class ControladorImpl implements IControlador {

	@Autowired
	IServico servico;

	@Override
	@GetMapping
	@ResponseBody
	public List<Objeto> buscarTodos() {
		return servico.findAll();
	}

	@Override
	@GetMapping("/{id}")
	@ResponseBody
	public Objeto buscarUm(@PathVariable Integer id) {
		return servico.getOne(id);
	}


	@Override
	@PostMapping
	@ResponseBody
	public Objeto salvar(@RequestBody Objeto objeto) {
		return servico.save(objeto);
	}
	
	
	@Override
	@DeleteMapping("/{id}")
	@ResponseBody
	public Boolean borrar(Objeto objeto) {
		Objeto objetoABorrar = servico.getOne(objeto.getId());
		return servico.delete(objetoABorrar);
	}
	

	@RequestMapping(value="/mock")
	@ResponseBody
	public List<Objeto> mock(Objeto objeto){
		
		List<Objeto> objetoList = new ArrayList<>();
		Objeto p = new Objeto();
		p.setTexto(String.valueOf(Math.random()));
		objetoList.add(p);

		servico.save(p);

		return this.buscarTodos();
	}
}
