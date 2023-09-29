package boutique.exemple.teste.conroller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import boutique.exemple.teste.entites.*;
import boutique.exemple.teste.service.*;
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/CompteController")
public class Produit_Conroller {
	@Autowired
	Produit_service produit_service;
	
	 @PostMapping("/add/categorie")
	public Categorie ajouter_categorie( @RequestBody Categorie cat) {
		 System.err.println(cat);
		return produit_service.ajouter_categorie(cat) ;
	} 
}
