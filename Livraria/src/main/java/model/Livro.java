/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gamer
 */
public class Livro {
    String autor, titulo;
    int cod_ISBN;
    double preco;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCod_ISBN() {
        return cod_ISBN;
    }

    public void setCod_ISBN(int codISBN) {
        this.cod_ISBN = codISBN;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getnEdicao() {
        return nEdicao;
    }

    public void setnEdicao(int nEdicao) {
        this.nEdicao = nEdicao;
    }
    int nEdicao;
}
