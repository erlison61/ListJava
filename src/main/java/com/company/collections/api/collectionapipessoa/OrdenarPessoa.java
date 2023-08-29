package com.company.collectionapipessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarPessoa {
    private List<Pessoa> pessoaList;

    public OrdenarPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        
        Collections.sort(pessoaList);
        
        return pessoasPorIdade;
    }
    
}
