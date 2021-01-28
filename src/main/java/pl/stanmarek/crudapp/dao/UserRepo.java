package pl.stanmarek.crudapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.stanmarek.crudapp.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User,Long> {

}
