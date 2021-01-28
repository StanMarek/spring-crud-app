package pl.stanmarek.crudapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.stanmarek.crudapp.other.Status;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String content;

    /**
     * default value for post status is public
     * user (owner) can make it private or public
     */
    private Status status = Status.PUBLIC;

    public Post() {

    }
}
