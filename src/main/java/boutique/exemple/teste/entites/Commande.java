package boutique.exemple.teste.entites;
import java.util.Date;

import javax.persistence.*;


import lombok.Data;

@Data

@Entity
@Table 
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_Commande;

	String commande_nom;
	double prix_totale;
	Date date_creation;
	String commande_type;
	Date date_payement;
}
