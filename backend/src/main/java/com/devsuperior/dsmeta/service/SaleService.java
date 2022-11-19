package com.devsuperior.dsmeta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entites.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service /*Transforma a Classe abaixo como componente do sistema */
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales() {
		
		 return repository.findAll();
		
	}

}
