package boutique.exemple.teste.entites;
import javax.persistence.*;


import lombok.Data;

@Data

@Entity
@Table 
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_Image;

	String image_type;
	String image_saze;
	String image_nom;
}
