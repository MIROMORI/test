package org.miromorii.springapp.DTO;

import lombok.Getter;
import org.miromorii.springapp.entity.Livro;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class LivroDTO {
    private Long isbn;
    private String titulo;
    private Integer edicao;
    private String autor;

    public LivroDTO(Livro livro) {
        this.isbn = livro.getIsbn();
        this.titulo = livro.getTitulo();
        this.edicao = livro.getEdicao();
        this.autor = livro.getAutor();
    }

    public static List<LivroDTO> converter(List<Livro> livros){
        return livros.stream().map(LivroDTO::new).collect(Collectors.toList());
    }

    public static LivroDTO converter(Livro livro){
        return new LivroDTO(livro);
    }

}
