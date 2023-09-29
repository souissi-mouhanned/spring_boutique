package boutique.exemple.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import boutique.exemple.teste.entites.Role;
@Repository

public interface role_repo extends JpaRepository<Role,Long>{

}
