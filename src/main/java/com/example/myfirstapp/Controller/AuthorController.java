package com.example.myfirstapp.Controller;

import com.example.myfirstapp.Model.Author;
import com.example.myfirstapp.Service.AuthorsService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorsService authorsService;

    @GetMapping
    public ResponseEntity<List<Author>> getAuthors() {
        return ResponseEntity.status(HttpStatus.OK).body(authorsService.getAllAuthors());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthor(@PathVariable int id) {

        return ResponseEntity.status(HttpStatus.OK).body(authorsService.getAuthor(id));
    }

    @PostMapping
    public ResponseEntity<Author> saveRecord(@RequestBody Author author) {
        authorsService.saveAuthor(author);
        return ResponseEntity.status(HttpStatus.OK).body(authorsService.getAuthor(author.getAuthorId()));
    }

    @DeleteMapping("/{id}")
    @CacheEvict(key = "#id", value = "Author")
    public ResponseEntity<List<Author>> deleteRecord(@PathVariable int id) {
        System.out.println("Product removed");
        authorsService.deleteAuthor(id);
        return ResponseEntity.status(HttpStatus.OK).body(authorsService.getAllAuthors());
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Author> updateRecord(@PathVariable int id, @RequestBody Author author) {
//        authorsService.updateRecord(id, author);
////        return ResponseEntity.status(HttpStatus.OK).body(authorsService.getAuthor(id));
//    }
}
