package boutique.exemple.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import boutique.exemple.teste.entites.User;

@Repository


public interface user_repo extends JpaRepository<User,Long>{

}
