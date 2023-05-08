package com.algaworks.algamoneyapi.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // A tabela do Mysql terá a função de gerar os códigos para a API.
    private Long codigo;
    @NotNull
    @Size(min = 3, max = 20)
    private String nome;

    // getters e setters

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    // equals e hashcode: serve para comparar classes, nesse caso se os códigos identificadores são iguais ou não.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return codigo.equals(categoria.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
