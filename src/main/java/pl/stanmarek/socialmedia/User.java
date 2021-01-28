package pl.stanmarek.socialmedia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(unique = true)
    private Long id;

    @Column(unique = true)
    @NonNull
    private String username;

    @NonNull
    private String password;

    @NonNull
    private String emailAddress;

    /**
     * One entity class always needs no params constructor
     * JPA will not create entity object
     */
    public User() {

    }

    public User(String username, String password, String emailAddress){
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
    }
}
