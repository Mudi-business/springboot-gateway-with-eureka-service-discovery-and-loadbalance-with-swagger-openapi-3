package zra.org.service_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zra.org.service_1.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long>{

    
}
    

