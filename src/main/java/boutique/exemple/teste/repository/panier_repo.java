package boutique.exemple.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import boutique.exemple.teste.entites.Panier;
 @Repository

public interface panier_repo extends JpaRepository<Panier,Long> {

}
