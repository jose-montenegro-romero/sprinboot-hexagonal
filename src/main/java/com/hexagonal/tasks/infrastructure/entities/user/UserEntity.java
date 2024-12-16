package com.hexagonal.tasks.infrastructure.entities.user;

import com.hexagonal.tasks.domain.model.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String firstName;

    private String lastName;

    private String emailAddress;

//    public static UserEntity fromDomainModel(User user) {
//        return new UserEntity(user.getId(), user.getFirstName(), user.getLastName(), user.getEmailAddress());
//    }

    public User toDomainModel() {
        return new User(id, firstName, lastName, emailAddress);
    }
}
