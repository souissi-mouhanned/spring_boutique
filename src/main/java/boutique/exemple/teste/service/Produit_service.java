package boutique.exemple.teste.service;

import java.util.List;

import org.springframework.stereotype.Service;

import boutique.exemple.teste.entites.*;

public interface Produit_service {
	// categorie
	public Categorie ajouter_categorie(Categorie cat);

	public List<Categorie> afficher_cat();

	public Categorie get_cat_by_mane(String name);

	public String Delete_categorie(long id);

	public Categorie Update_categorie(Categorie cat);
	
	//produit 
	
	public Produit add_produit (Produit pro);
}
