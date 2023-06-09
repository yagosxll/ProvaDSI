
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Cliente extends Fisica {
    private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco, String logradouro, String numero, String complemento, String cep, String cidade, String uf, String texto) {
        super(dataNascimento, genero, nome, telefone, email, endereco, logradouro, numero, complemento, cep, cidade, uf, texto);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "\n protocoloAtendimento: " + protocoloAtendimento;
    }
    
    

    
    }

    
    
    