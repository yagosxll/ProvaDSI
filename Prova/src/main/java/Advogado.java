
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Advogado extends Funcionario {
    
    private final String oab;

    public Advogado(String oab, String cpf, String rg, String matricula, Setor setor, int salario, LocalDate of, Genero MASCULINO, String rafael, String string3, String rafael25gmailcom, String rua_Pacheco_de_Oliveira, String dendezeiros, String string4, String ao_Lado_do_colegio_militar, String string5, String salvador, String string6, String funcionario) {
        super(cpf, rg, matricula, setor, salario, of, MASCULINO, rafael, string3, rafael25gmailcom, rua_Pacheco_de_Oliveira, dendezeiros, string4, ao_Lado_do_colegio_militar, string5, salvador, string6, funcionario);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }
    @Override
     public String toString() {
        return "\n oab: " + oab;
    

    
    }
    
    
    
    

   
    
    
    


    
   
   
    
    
}
