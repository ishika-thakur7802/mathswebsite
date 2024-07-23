package com.ishika.mathswebsite.entities;
import jakarta.persistence.*;

import javax.management.relation.Role;
import java.util.Set;

@Entity
@Table(name="user")
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Set<Role> roles;
    @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        public long getId()
        {
            return id;
        }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @ManyToMany
        @JoinTable(name="user_role",
        joinColumns =@JoinColumn(name="user_id"),
        inverseJoinColumns = @JoinColumn(name="role_id"))
        public Set<Role> getRoles()
        {
            return roles;
        }
    public void setRoles(Set<Role> roles)
    {
        this.roles=roles;
    }

}
