package boutique.exemple.teste.entites;

import java.util.Date;

import javax.persistence.*;
 

import lombok.Data;

@Data

@Entity
@Table 
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_Produit;

	String produit_nom;
	String description;
	boolean produit_statut;
	String stock;
	double prix;
	double prix_promo;
	Date date_promo;
	String image_id;
	String catégorie_ids;
}
