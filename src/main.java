
import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vinic
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());
        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev jose = new Dev();
        jose.setNome("José");
        jose.inscreverBootcamp(bootcamp);
        System.out.println("Conteídos Inscritos Jose: " + jose.getConteudosInscritos());
        
        jose.progredir();
        jose.progredir();
        System.out.println("Conteídos Inscritos Jose: " + jose.getConteudosInscritos());
        System.out.println("Conteídos Concluidos Jose: " + jose.getConteudosConcluidos());
        System.out.println("XP: "  + jose.calcularTotalXP());
        
        System.out.println("--------------------------------------------------------------------");
        
        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteídos Inscritos Joao: " + joao.getConteudosInscritos());
   
        joao.progredir();
        joao.progredir();
        joao.progredir();
        System.out.println("Conteídos Inscritos Joao: " + joao.getConteudosInscritos());
        System.out.println("Conteídos Concluidos Joao: " + joao.getConteudosConcluidos());
        System.out.println("XP: "  + joao.calcularTotalXP());
    }
    
}
