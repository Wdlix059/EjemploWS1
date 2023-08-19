package com.jp.clase.controllers.interfaces;

import java.util.List;

import com.jp.clase.controllers.entity.Tecnicos;

public interface ITecnicos {
	public List<Tecnicos> getAll();
	public String save(Tecnicos tecnico);
	public Tecnicos update(int idtecnicos, Tecnicos Tecnico);
}
