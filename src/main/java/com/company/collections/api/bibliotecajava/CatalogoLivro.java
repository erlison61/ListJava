package com.company.bibliotecajava;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    private final List<Livro> listLivro;

    public CatalogoLivro() {
        this.listLivro = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublic ){
        this.listLivro.add(new Livro(titulo, autor, anoPublic));
    }
    
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        for(Livro livro: listLivro){
            if(livro.getAutor().equalsIgnoreCase(autor)){
                livrosAutor.add(livro);
            }
        }
        return livrosAutor;
    }
 
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        for(Livro livro: listLivro){
            if(livro.getAnoPublic() >= anoInicial && livro.getAnoPublic() <= anoFinal){
                livrosPorAno.add(livro);
            }
        }
        return livrosPorAno;
    }
    
    
    public Livro pesquisarPorTitulo(String titulo){
        for(Livro livro: listLivro){
            if(livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }
}
