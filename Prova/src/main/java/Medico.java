
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Medico extends Funcionario {
    private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, int salario, LocalDate of, Genero MASCULINO, String rafael, String string3, String rafael25gmailcom, String rua_Pacheco_de_Oliveira, String dendezeiros, String string4, String ao_Lado_do_colegio_militar, String string5, String salvador, String string6, String funcionario) {
        super(cpf, rg, matricula, setor, salario, of, MASCULINO, rafael, string3, rafael25gmailcom, rua_Pacheco_de_Oliveira, dendezeiros, string4, ao_Lado_do_colegio_militar, string5, salvador, string6, funcionario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    @Override
    public String toString() {
        return "\n crm: " + crm;
    }
    
    

   
    }
    



    

    
    
    

    
  

    
   
    
    


    
    
    
    
    
    
    
    


    
    
