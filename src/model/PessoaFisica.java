/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author Note Pessoal
 */
public class PessoaFisica extends Pessoa{
    String CPF, Idade;    
    ArrayList <Pessoa> listaDePessoaF;
    
    public PessoaFisica(){
        this.listaDePessoaF = new ArrayList<>();
    }
    
    public PessoaFisica(String CPF, String Idade){
        setCPF(CPF);
        setIdade(Idade);
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String Idade) {
        this.Idade = Idade;
    }
    
    void listar(){
        System.out.println("\nCPF: " + this.CPF);
        System.out.println("\nIdade: " + this.Idade); 
    }
    
    void inserirPessoa(Pessoa novaPessoaF){
        listaDePessoaF.add(novaPessoaF);
    }
    void listarPessoa(){
        System.out.println("\nLista de PessoaF");
        
        for(Pessoa PessoaNaLista:listaDePessoaF){
            PessoaNaLista.listar();
        }
    }
}

 
