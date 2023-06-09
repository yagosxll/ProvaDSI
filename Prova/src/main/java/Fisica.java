
import java.time.LocalDate;
import java.time.Period;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public abstract class Fisica extends Pessoa {
    
    protected LocalDate dataNascimento;
    protected Genero genero;

    public Fisica(LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco, String logradouro, String numero, String complemento, String cep, String cidade, String uf, String texto) {
        super(nome, telefone, email, logradouro);
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    
    
    /**
     *
     * @return
     */
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
        
        
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "\n dataNascimento: " + dataNascimento + 
               "\n genero: " + genero;
    }
    
    
   
    }


