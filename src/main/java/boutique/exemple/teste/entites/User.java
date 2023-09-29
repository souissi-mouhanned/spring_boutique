package boutique.exemple.teste.entites;

 
import javax.persistence.*;

 import lombok.Data;

@Data

@Entity
@Table 
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_user;

	String nom;
	String prenom;
	String mod_passe;
	String email;
	String adress;
	int num_tel;
}
