package boutique.exemple.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import boutique.exemple.teste.entites.Produit;
@Repository

public interface produit_repo extends JpaRepository<Produit,Long>{

}
