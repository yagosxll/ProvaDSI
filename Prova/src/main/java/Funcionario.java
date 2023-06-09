
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public abstract class Funcionario {
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected Setor setor;
    protected double salario;

    public Funcionario(String cpf, String rg, String matricula, Setor setor, int salario, LocalDate of, Genero MASCULINO, String rafael, String string3, String rafael25gmailcom, String rua_Pacheco_de_Oliveira, String dendezeiros, String string4, String ao_Lado_do_colegio_militar, String string5, String salvador, String string6, String funcionario) {
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }

    

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }
    
    

    
    
   
    @Override
    public String toString() {
        return "\n cpf: " + cpf + 
               "\n rg: " + rg + 
               "\n matricula: " + matricula + 
               "\n setor: " + setor + 
               "\n salario: " + salario;
    }
    
    
    
    
    

    
    }

    
    
    
   
