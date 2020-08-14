package listaraniversario;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ListarAniversario {

    public static void main(String[] args) {
//        Date date = new Date();
//        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
//        cal.setTime(date);
//        System.out.println(cal.get(Calendar.DAY_OF_MONTH) + " " + cal.get(Calendar.MONTH));
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataAniversario = LocalDate.of(2001, 01, 17);
        LocalDate dataRestante = LocalDate.of(dataAtual.getYear(), dataAniversario.getMonth(), dataAniversario.getDayOfMonth());
        
        Period intervalo = Period.between(dataAtual, dataRestante);
        int idade = Period.between(dataAniversario, dataAtual).getYears();
        
        System.out.println(intervalo.getDays() + " " + intervalo.getMonths());
        System.out.println(idade);
    }
    
}
