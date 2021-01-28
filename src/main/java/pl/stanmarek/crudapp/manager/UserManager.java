package pl.stanmarek.crudapp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.stanmarek.crudapp.dao.UserRepo;
import pl.stanmarek.crudapp.entity.User;

import java.util.Optional;

@Service
public class UserManager {

    private UserRepo userRepo;

    @Autowired
    public UserManager(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Optional<User> findUserById(Long id){
        return userRepo.findById(id);
    }

    public Iterable<User> findAll(){
        return userRepo.findAll();
    }

    public User saveUser(User user){
        return userRepo.save(user);
    }

    public void deleteUserById(Long id){
        userRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDataBase(){
        saveUser(new User(1L, "username1", "password1", "email1"));
        saveUser(new User(2L, "username2", "password2", "email2"));
        saveUser(new User(3L, "username3", "password3", "email3"));
    }
}
