package org.miromorii.springapp.controller;

import org.miromorii.springapp.entity.Livro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/livros") // value =
public class LivroController {

    @GetMapping(value = "/{id}")
    public Livro findById(@PathVariable(value = "id") Integer id){
        return new Livro();
    }

    @GetMapping()
    public List<Livro> findAll(){
        return null;
    }
}
