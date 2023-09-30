package boutique.exemple.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boutique.exemple.teste.entites.*;
import boutique.exemple.teste.repository.categorie_repo;
@Service
public class Produits_service_impl implements Produit_service{
	@Autowired
	categorie_repo categorie_repo;

	//kamelleha ya mariem ("hannni mariem bil a mouch bil e")
	@Override
	public Categorie ajouter_categorie(Categorie cat) {
		categorie_repo.save(cat);
		return cat;
	}

	@Override
	public List<Categorie> afficher_cat() {
		List<Categorie> cats = categorie_repo.findAll();
		return cats;
	}
	//kamelleha ya mariem ("hannni mariem bil a mouch bil e")
	@Override
	public Categorie get_cat_by_mane(String name) {
		 
		return null;
	}
	 
	@Override
	public String Delete_categorie(long id) {
		categorie_repo.deleteById(id);
		return "categorie deleted";
	}
	//kamelleha ya mariem ("hannni mariem bil a mouch bil e")
	@Override
	public Categorie Update_categorie(Categorie cat) {
		categorie_repo.save(cat);
		return cat;
	}
	//kamelleha ya mariem ("hannni mariem bil a mouch bil e")
	@Override
	public Produit add_produit(Produit pro) {
		 
		return null;
	}

}
