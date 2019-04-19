package com.github.jotagit.mybatis.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

@Data
@Alias("Objeto")
public class Objeto implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String texto;

	private Boolean boleano;

	private List<Objeto> lista;

}
