package pl.stanmarek.crudapp.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import javax.persistence.*;


@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    public User(Long id, @NonNull String username, @NonNull String password, @NonNull String emailAddress) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
    }

}
