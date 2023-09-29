package boutique.exemple.teste.entites;
import javax.persistence.*;


import lombok.Data;

@Data

@Entity
@Table 
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_Role;

	role_name role_name;
 
}
