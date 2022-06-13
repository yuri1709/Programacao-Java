/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula11.model;

/**
 *
 * @author Gamer
 */
public class livro {
    String autor,
           titulo;
    int codISBN;
    double preco;
    int nEdicao;

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

    public int getCodISBN() {
        return codISBN;
    }

    public void setCodISBN(int codISBN) {
        this.codISBN = codISBN;
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
    
    
    
    
}
