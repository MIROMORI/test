package org.miromorii.springapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long isbn;

    @Column
    private String titulo;
    @Column
    private Integer edicao;
    @Column
    private String autor;
    @Column
    private Categoria categoria;
    @Column
    private Modelo modelo;

}
