package pl.stanmarek.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

public class Start {

    private UserRepo userRepo;

    @Autowired
    public Start(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runExample(){
        User user = new User("username", "password", "email");
        User user2 = new User("username2", "password2", "email2");
        User user3 = new User("username3", "password3", "email3");

        userRepo.save(user);
        userRepo.save(user2);
        userRepo.save(user3);

        Iterable<User> allUsers = userRepo.findAll();
        allUsers.forEach(System.out::println);
    }
}
