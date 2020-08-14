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
        Aniversario aniversario1 = new Aniversario();
        aniversario1.setNome("Gabriel");
        aniversario1.setDataAniversario(LocalDate.of(2001, 1, 17));
        
        System.out.println(aniversario1);
    }
    
}
