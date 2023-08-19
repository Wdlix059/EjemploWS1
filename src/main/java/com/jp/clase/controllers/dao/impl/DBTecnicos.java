package com.jp.clase.controllers.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import com.jp.clase.controllers.dao.IDBTecnicos;
import com.jp.clase.controllers.entity.Tecnicos;

@Repository
@Transactional
public class DBTecnicos implements IDBTecnicos {
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Tecnicos> findAll() {
		try {
			List<Tecnicos> listaTecnicos = em.createQuery("from Tecnicos").getResultList();
			return listaTecnicos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer save(Tecnicos tecnico) {
		try {
			em.persist(tecnico);
			return tecnico.getIdtecnicos();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
