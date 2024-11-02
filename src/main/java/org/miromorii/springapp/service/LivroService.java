package org.miromorii.springapp.service;

import org.miromorii.springapp.entity.Livro;
import org.miromorii.springapp.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repository;

    public void save(Livro livro){
        repository.save(livro);
    }

    public List<Livro> findAll(){
        return repository.findAll();
    }

    public Livro findById(long id){
        return repository.findById(id).get();
    }

    public void update(Livro livro){
        repository.save(livro);
    }

    public void delete(long id){
        repository.deleteById(id);
    }
}
