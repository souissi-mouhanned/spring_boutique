package boutique.exemple.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import boutique.exemple.teste.entites.Categorie;
 @Repository
public interface categorie_repo extends JpaRepository<Categorie,Long>{

}
