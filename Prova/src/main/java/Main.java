
import java.time.LocalDate;
import java.time.Month;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("1526359", "04703365985", "516515656151665", "15", Setor.JURIDICO, 1750, LocalDate.of(2002, Month.MARCH, 7), Genero.MASCULINO, "Iago", "71987726535", "yagosxll@gmail.com", "motoboy", "Melo Morais", "03", "Lado do banco", "40350258", "Salvador", "BA", "motoboy");
        Endereco endereco = new Endereco("48", "265", "Perto da praia", "40350256", "Salvador", "65", "endereco");
        Pessoa pessoa = new Pessoa("Yago", "33045868", "yagoxcabal@gmail.com", "Travessa") {};
        Funcionario funcionario = new Funcionario("0450263565", "95959889894", "65", Setor.JURIDICO, 1780, LocalDate.of(1993, Month.MARCH, 4), Genero.MASCULINO, "Rafael", "33045868", "rafael25@gmail.com", "Rua Pacheco de Oliveira", "Dendezeiros", "35", "Ao Lado do colegio militar", "4035012565", "Salvador", "25", "funcionario") {};
        Medico medico = new Medico("6548", "0470336568", "959559845", "68", Setor.SAUDE, 4750, LocalDate.of(2001, Month.JANUARY, 5), Genero.MASCULINO, "Helton", "71988548725", "helton25@gmail.com", "Pituba", "458", "36", "Em frente a praia", "403506898", "Salvador", "25", "medico");
        Advogado advodado = new Advogado("458", "04725536598", "8585895890", "25", Setor.JURIDICO, 1795, LocalDate.of(1995, Month.MARCH, 25), Genero.FEMININO, "Fernanda", "71982256565", "fernanda25@gmail.com", "rua abrantes", "545", "25", "proximo a farmacia", "403583659", "Salavador", "25", "advogado");
                
                System.out.println(motoboy.toString());
                System.out.println(endereco.toString());
                System.out.println(pessoa.toString());
                System.out.println(funcionario.toString());
                System.out.println(medico.toString());
                System.out.println(advodado.toString());
                

    }
    
    
}
