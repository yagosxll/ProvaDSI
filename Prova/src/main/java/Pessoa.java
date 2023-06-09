/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public abstract class Pessoa extends Endereco {
    
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;

    public Pessoa(String nome, String telefone, String email, String logradouro) {
        super(logradouro, numero, complemento, cep, cidade, uf, texto);
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "\n nome: " + nome + 
               "\n telefone: " + telefone + 
               "\n email: " + email + 
               "\n endereco: " + endereco;
    }
    

    
    
    

    

    
 
    
    
    
    
    
    

