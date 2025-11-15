/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.atividade;
/**
 *
 * @author fatec-dsm2
 */
public class Aluno {
    private String nome;
    double media = 0;
    double somaNotas = 0;
    private Double[] notas = new Double[3];
    
    public Aluno (String nome){
        this.nome = nome;
    }
  
    public String getNome(){
        return nome;
    }
     
    public Double[] getNotas(){
        return notas;
    }
    
    public void setAdicionaNota(int i, double nota){
        notas[i++] = nota;
    }
    
    public double calcMedia(){
        for(int i = 0; i < notas.length; i++){
            somaNotas = somaNotas + notas[i];
        }
        media = somaNotas / 3;
        return media;
    }
    
    
    public String mostraMedia(){
        if(media < 6.0){
        return "Voce foi Reprovado";
    }
        else if(media >= 6.0 && media<=9.0){
            return "Voce foi Aprovado";
        }
        
        else if(media > 9.0 && media <= 10.0){
            return "Otimo Aproveitamento";
        }
        else{
            return "As notas estao invalidas";
        }
    }
}
