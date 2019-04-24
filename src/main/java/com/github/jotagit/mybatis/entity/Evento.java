package com.github.jotagit.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String origem;

    private AcaoEnum acao;

}
