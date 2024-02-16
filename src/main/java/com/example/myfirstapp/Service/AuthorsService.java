package com.example.myfirstapp.Service;

import com.example.myfirstapp.Model.Author;
import com.example.myfirstapp.Repository.AuthorsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorsService {

    private final AuthorsRepository authorsRepository;

    public List<Author> getAllAuthors() {
        return authorsRepository.findAll();
    }


    @Cacheable(key = "#id", value = "1")
    public Author getAuthor(int id) {
        System.out.println("called from db");
        return authorsRepository.findById(id).orElse(null);
    }

    public void saveAuthor(Author author) {
        authorsRepository.save(author);
    }

    public void deleteAuthor(int id) {
        authorsRepository.deleteById(id);
    }

    public void updateRecord(int id, Author author) {
        if (authorsRepository.findById(id).isPresent()) {
            Author resultAuthor = authorsRepository.findById(id).get();
            resultAuthor.setAuthorName(author.getAuthorName());
            authorsRepository.save(resultAuthor);
        }
    }
}
