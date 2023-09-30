package boutique.exemple.teste.conroller;

import java.util.List;

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
	public Categorie ajouter_categorie(@RequestBody Categorie cat) {
		return produit_service.ajouter_categorie(cat);
	}

	@GetMapping("/all/categorie")
	public List<Categorie> afficher_cat() {
		return produit_service.afficher_cat();
	}

	@PutMapping("/update/categorie")
	public Categorie Update_categorie(Categorie cat) {
		return produit_service.Update_categorie(cat);

	}

	@DeleteMapping("/delete/categorie/{id}")

	public String Delete_categorie(@PathVariable long id) {
		return produit_service.Delete_categorie(id);
	}
}
