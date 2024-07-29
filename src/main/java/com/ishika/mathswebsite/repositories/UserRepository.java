package com.ishika.mathswebsite.repositories;
import com.ishika.mathswebsite.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long>
{
    User findByUsername(String username);
}
