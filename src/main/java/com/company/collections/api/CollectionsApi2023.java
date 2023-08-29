package com.company.collections.api;

public class CollectionsApi2023 {
    public static void main(String[] args) {
        ListaTarefas l = new ListaTarefas();
        
        
        l.adicionarTarefa("completar o bootcamp");
        l.adicionarTarefa("fazer as atividades do curso tsi");
        l.adicionarTarefa("dormir");
        
        System.out.println("total de tarefas: "+ l.obterNumeroTotalTarefas());
        l.obterDescricoesTarefas();
       
    }
}
