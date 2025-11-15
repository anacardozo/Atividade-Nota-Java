/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.atividade;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Atividade {

    public static void main(String[] args) {
        
    String nome = JOptionPane.showInputDialog(null, 
                "Digite o Nome Completo", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
    
    Aluno al = new Aluno(nome);
    
    for(int i = 0; i < 3; i++){
        String snota = JOptionPane.showInputDialog(null,
                "Digite a nota N:" + (i + 1), "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
        double nota = Double.parseDouble(snota);
        al.setAdicionaNota(i, nota);
    }
    double media = al.calcMedia();
    String status = al.mostraMedia();
    
    
    String mensagem = String.format(
            "O nome do aluno eh: " + nome +
            "\nA media eh: %.2f" +
            "\nStatus: " + status, 
            media
        );
    
    JOptionPane.showMessageDialog(null, mensagem, "Resultado da Projeção" ,JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}

