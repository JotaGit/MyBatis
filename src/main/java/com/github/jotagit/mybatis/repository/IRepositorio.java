package com.github.jotagit.mybatis.repository;

import com.github.jotagit.mybatis.entity.Objeto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IRepositorio {

    @Select("SELECT * FROM Objeto")
    public List<Objeto> findAll();

    @Select("SELECT * FROM Objeto WHERE id = #{id}")
    public Objeto getOne(Integer id);

    @Insert({"INSERT INTO Objeto (id, texto, boleano) VALUES (#{obj.id},#{obj.texto},#{obj.boleano})"})
    @SelectKey(statement="SELECT nextVal('objetoid_sequence')", keyProperty="obj.id", before=true, resultType=int.class)
    public Integer save(@Param("obj") Objeto obj);

    @Delete("DELETE FROM Objeto WHERE id = #{obj.id}")
    public Boolean delete(@Param("obj") Objeto obj);

}