package com.jp.clase.controllers.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jp.clase.controllers.entity.Tecnicos;
import com.jp.clase.controllers.interfaces.ITecnicos;

@Service
public class TecnicosImpl implements ITecnicos {

	@Override
	public List<Tecnicos> getAll() {
		//simular la lista
		Tecnicos tecnico = new Tecnicos();
		tecnico.setIdtecnicos(1);
		tecnico.setPrimernombre("Juan");
		tecnico.setSegundonombre("Antonio");
		tecnico.setPrimerapellido("Perez");
		tecnico.setSegundoapellido("Lopez");
		tecnico.setFechanacimiento("25/08/1980");
		
		List<Tecnicos> listTecnicos = new ArrayList<>();
		
		listTecnicos.add(tecnico);
		
		return listTecnicos;
	}

	@Override
	public String save(Tecnicos tecnico) {
		return tecnico.getPrimerapellido();
	}

	@Override
	public Tecnicos update(int idtecnicos, Tecnicos Tecnico) {
		// TODO Auto-generated method stub
		return null;
	}

}
