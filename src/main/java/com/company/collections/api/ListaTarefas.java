package com.company.collections.api;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private final List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }
    
    public void adicionarTarefa(String description){
        tarefas.add(new Tarefa(description));
    }
    

    public void removerTarefa(String description){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefa: tarefas){
            if(tarefa.getDescription().equalsIgnoreCase(description)){
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefas.removeAll(tarefasParaRemover);
    }
    
    public int obterNumeroTotalTarefas(){
        return tarefas.size();
    }
    
    
   public void obterDescricoesTarefas(){
       System.out.println(tarefas);
   }
    
}
