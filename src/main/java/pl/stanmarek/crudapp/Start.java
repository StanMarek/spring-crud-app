package pl.stanmarek.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import pl.stanmarek.crudapp.dao.UserRepo;

public class Start {

    private UserRepo userRepo;

    @Autowired
    public Start(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runExample(){

    }
}
