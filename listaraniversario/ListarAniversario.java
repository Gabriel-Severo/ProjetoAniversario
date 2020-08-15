package listaraniversario;

import java.time.LocalDate;
import java.time.Period;

public class ListarAniversario {

    public static void main(String[] args) {
//        LocalDate dataAtual = LocalDate.now();
//        LocalDate dataAniversario = LocalDate.of(2001, 01, 17);
//        LocalDate dataRestante = LocalDate.of(dataAtual.getYear(), dataAniversario.getMonth(), dataAniversario.getDayOfMonth());
//        
//        Period intervalo = Period.between(dataAtual, dataRestante);
//        int idade = Period.between(dataAniversario, dataAtual).getYears();
//        
//        System.out.println(intervalo.getDays() + " " + intervalo.getMonths());
//        System.out.println(idade);

//        Aniversariante aniversariante1 = new Aniversariante();;
//        aniversariante1.setNome("Gabriel");
//        aniversariante1.setDataAniversario(LocalDate.of(2001, 01, 17));
//        
//        System.out.println(aniversariante1);
//        System.out.println(aniversariante1.getIdade());
//        System.out.println(aniversariante1.getProximoAniversarioString());

        AniversarianteList<Aniversariante> aniversariantes = new AniversarianteList<>();
        Aniversariante aniversariante1 = new Aniversariante();
        aniversariante1.setDataAniversario(LocalDate.of(2001, 01, 17));
        aniversariante1.setNome("A");
        aniversariantes.add(aniversariante1);
        
        Aniversariante aniversariante2 = new Aniversariante();
        aniversariante2.setDataAniversario(LocalDate.of(2001, 05, 17));
        aniversariante2.setNome("B");
        aniversariantes.add(aniversariante2);
        
        Aniversariante aniversariante3 = new Aniversariante();
        aniversariante3.setDataAniversario(LocalDate.of(2001, 10, 17));
        aniversariante3.setNome("C");
        aniversariantes.add(aniversariante3);
        
        aniversariantes.sort();
        System.out.println(aniversariantes.get(0));
        System.out.println(aniversariantes.get(1));
        System.out.println(aniversariantes.get(2));
        aniversariantes.add(aniversariante3);
        System.out.println(aniversariantes.get(3));
        
        
    }
    
}
