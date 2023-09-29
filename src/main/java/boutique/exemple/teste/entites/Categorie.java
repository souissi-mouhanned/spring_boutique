package boutique.exemple.teste.entites;
import javax.persistence.*;


import lombok.Data;

@Data

@Entity
@Table 
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_Categorie;

	String cat_nom;
	String cat_description;
 }
