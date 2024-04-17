/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Note Pessoal
 */
public class Pessoa {
    String Id, Nome;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String Id, String Nome){
        setId(Id);
        setNome(Nome);
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    void listar(){
        System.out.println("\nId: " + this.Id);
        System.out.println("\nNome: " + this.Nome); 
    }

}
