package pl.stanmarek.crudapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.stanmarek.crudapp.entity.User;
import pl.stanmarek.crudapp.manager.UserManager;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserApi {

    private UserManager users;

    @Autowired
    public UserApi(UserManager users) {
        this.users = users;
    }

    @GetMapping("/all")
    public Iterable<User> getUsers(){
        return users.findAll();
    }

    @GetMapping
    public Optional<User> getUserById(@RequestParam Long id){
        return users.findUserById(id);
    }

    /*@GetMapping("/{username}")
    public Optional<User> getUserByUsername(@PathVariable String username){
        Optional<User> userOptional = users.stream().filter(e -> e.getUsername().equals(username)).findFirst();

        return userOptional;
    }*/

    @PostMapping
    public User addUser(@RequestBody User user){
        return users.saveUser(user);
    }

    @PutMapping
    public User updateUserData(@RequestBody User user){
        return users.saveUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam Long id){
        users.deleteUserById(id);
    }
}
