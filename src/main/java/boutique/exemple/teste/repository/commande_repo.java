package boutique.exemple.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import boutique.exemple.teste.entites.Commande;
 @Repository

public interface commande_repo extends JpaRepository<Commande,Long>{

}
