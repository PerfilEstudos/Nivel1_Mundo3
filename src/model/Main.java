/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;
        
/**
 *
 * @author Note Pessoal
 */

public class Main {

    public static void main(String[] args) {
        int opc;
        String F,J,Id,Nome,CPF,Idade;
        Pessoa novaPessoa = new Pessoa();
        PessoaFisica novaPessoaFisica = new PessoaFisica();
        PessoaJuridica novaPessoaJuridica = new PessoaJuridica();
        Scanner teclado;
        
        teclado = new Scanner(System.in);
        
        do{
            System.out.println("\n---------------");
            System.out.println("1 - Incluir Pessoa");
            System.out.println("2 - Alterar Pessoa");
            System.out.println("3 - Excluir Pessoa");
            System.out.println("4 - Buscar pelo Id");
            System.out.println("5 - Exibir Todos");
            System.out.println("6 - Persistir Dados");
            System.out.println("7 - Recuperar Dados");            
            System.out.println("0 - Finalizacao Programa");              
            
            opc = teclado.nextInt();
            teclado.nextLine();
            
            switch(opc){
                
                case 1:
                    System.out.println("F - Pessoa Fisica");
                    System.out.println("J - Pessoa Juridica:");
                    teclado.nextLine();      
                    
                    System.out.println("\nId:");
                    Id = teclado.nextLine();
                    System.out.println("\nNome:");
                    Nome = teclado.nextLine();
         
                    novaPessoa = new Pessoa(Id, Nome);                                     
                    novaPessoaFisica.inserirPessoa(novaPessoa);
                    
                                        
                    System.out.println("\nCPF:");
                    CPF = teclado.nextLine();
                    System.out.println("\nIdade:");
                    Idade = teclado.nextLine();
                    
                    
                    break;
                    
                case 2:
                    System.out.println("F - Pessoa Fisica");
                    System.out.println("J - Pessoa Juridica:");
                    
                    teclado.nextLine();
                    
                    System.out.println("\nId:");
                    Id = teclado.nextLine();
                    break;   
                case 3:
                    System.out.println("F - Pessoa Fisica");
                    System.out.println("J - Pessoa Juridica:");
                    
                    teclado.nextLine();
                    
                    System.out.println("\nId:");
                    Id = teclado.nextLine();
                    break;    
                case 4:
                    System.out.println("F - Pessoa Fisica");
                    System.out.println("J - Pessoa Juridica:");
                    
                    teclado.nextLine();
                    
                    System.out.println("\nId:");
                    Id = teclado.nextLine();
                    break;    
                case 5:
                    novaPessoaFisica.listarPessoa();   
                    novaPessoaJuridica.listarPessoa();  
                    break;
                case 6:
                    break;    
                case 7:
                    break; 
                case 0:
                    System.out.println("\nSaindo!");
                    break; 
                default:
                    System.out.println("\nOpcao invalida!");
                                       
                    
            }
            
        }while (opc != 0);
        
    } 

}
