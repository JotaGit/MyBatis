package com.github.jotagit.mybatis.controller;

import com.github.jotagit.mybatis.entity.Objeto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IControlador {
    @GetMapping("/objeto")
    @ResponseBody
    List<Objeto> buscarTodos();

    @GetMapping("/objeto/{id}")
    @ResponseBody
    Objeto buscarUm(@PathVariable Integer id);

    @PostMapping("/objeto")
    @ResponseBody
    Objeto salvar(@RequestBody Objeto objeto);

    @DeleteMapping("/objeto/{id}")
    @ResponseBody
    Boolean borrar(Objeto objeto);
}
