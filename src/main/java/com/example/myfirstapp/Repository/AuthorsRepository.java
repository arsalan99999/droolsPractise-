package com.example.myfirstapp.Repository;

import com.example.myfirstapp.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AuthorsRepository extends JpaRepository<Author,Integer> {
    Author findAuthorByAuthorId(int id);
}
