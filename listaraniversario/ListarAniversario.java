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
        Aniversariante aniversariante1 = new Aniversariante();
        aniversariante1.setNome("Gabriel");
        aniversariante1.setDataAniversario(LocalDate.of(2001, 8, 14));
        
        System.out.println(aniversariante1);
        System.out.println(aniversariante1.getIdade());
        System.out.println(aniversariante1.getProximoAniversarioString());
    }
    
}
