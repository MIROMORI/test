package org.miromorii.springapp.controller;

import org.miromorii.springapp.DTO.LivroDTO;
import org.miromorii.springapp.DTO.LivroFormDTO;
import org.miromorii.springapp.entity.Categoria;
import org.miromorii.springapp.entity.Livro;
import org.miromorii.springapp.entity.Modelo;
import org.miromorii.springapp.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {
    @Autowired
    private LivroService service;

    @GetMapping(value = "/{id}")
    public LivroDTO findById(@PathVariable(value = "id") Integer id){
        return LivroDTO.converter(service.findById(id));
    }

    @GetMapping()
    public List<LivroDTO> findAll(){
        return LivroDTO.converter(service.findAll());
    }

    @PostMapping
    public LivroDTO save(@RequestBody LivroFormDTO livroDTO){
        Livro livro = livroDTO.converter();
        service.save(livro);
        return new LivroDTO(livro);
    }

    @PutMapping
    public void update(@RequestBody Livro livro){
        service.update(livro);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(value = "id") long id){
        service.delete(id);
    }
}
