package com.jp.clase.controllers.dao;

import java.util.List;

import com.jp.clase.controllers.entity.Tecnicos;

public interface IDBTecnicos {
	public List<Tecnicos> findAll();
	public Integer save(Tecnicos tecnico);
}
