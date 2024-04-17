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
public class PessoaJuridica extends Pessoa {
    String CNPJ;    
    ArrayList <Pessoa> listaDePessoaJ;
    
    public PessoaJuridica(){
        this.listaDePessoaJ = new ArrayList<>();
    }
        
    public PessoaJuridica(String CNPJ){
        setCNPJ(CNPJ);
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
 
    
    void listar(){
        System.out.println("\nCNPJ: " + this.CNPJ);
    }    
    
    void inserirPessoa(Pessoa novaPessoa){
        listaDePessoaJ.add(novaPessoa);
    }
    void listarPessoa(){
        System.out.println("\nLista de PessoaJ");
        
        for(Pessoa PessoaNaLista:listaDePessoaJ){
            PessoaNaLista.listar();
        }
    }
}
