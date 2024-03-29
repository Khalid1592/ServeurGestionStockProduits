package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;
import com.example.demo.repository.ProduitRepository;

@Service
@Primary
public class ProduitService implements IProduitService{

	@Autowired
	private ProduitRepository produitRepository;
	
	@Override
	public List<Produit> getProduits() {
		return produitRepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		this.produitRepository.save(produit);		
	}

	@Override
	public void updateProduit(Produit produit) {
		//La différence c'est que la clé est null dans add mais différent de null dans update
		this.produitRepository.save(produit);
		
	}

	@Override
	public void deleteProduit(Long id) {
		Produit produit = new Produit();
		produit.setId(id);
		this.produitRepository.delete(produit);
		//this.produitRepository.deleteById(id);
		
	}

}
