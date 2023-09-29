package boutique.exemple.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import boutique.exemple.teste.entites.Image;
@Repository

public interface image_repo extends JpaRepository<Image,Long>{

}
