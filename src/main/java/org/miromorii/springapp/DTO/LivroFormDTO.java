package org.miromorii.springapp.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.miromorii.springapp.entity.Categoria;
import org.miromorii.springapp.entity.Livro;
import org.miromorii.springapp.entity.Modelo;

@Getter
@AllArgsConstructor
public class LivroFormDTO {

    private String titulo;
    private Integer edicao;
    private String autor;
    private String categoria;
    private String modelo;

    public Livro converter() {
        Livro livro = new Livro();
        livro.setAutor(autor);
        livro.setCategoria(Categoria.valueOf(categoria));
        livro.setEdicao(edicao);
        livro.setModelo(Modelo.valueOf(modelo));
        livro.setTitulo(titulo);
        return livro;
    }
}

