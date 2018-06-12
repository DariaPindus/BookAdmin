package com.daria.test.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@NoArgsConstructor
public class User implements IEntity{
    @Getter @Setter private Long id;
    @Getter @Setter private String password;
    @Email
    @NotBlank
    @Getter @Setter private String email;
    @Cascade(CascadeType.DELETE)
    private List<BookOrder> orders;

    public User(String email) {
        this.email = email;
    }
}
