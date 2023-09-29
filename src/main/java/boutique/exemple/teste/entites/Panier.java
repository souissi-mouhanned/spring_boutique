package boutique.exemple.teste.entites;
import javax.persistence.*;


import lombok.Data;

@Data

@Entity
@Table 
public class Panier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_Panier;

	String type;
	int quantité;
	double totale;
}
