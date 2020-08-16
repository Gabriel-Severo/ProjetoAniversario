package listaraniversario;

import java.time.LocalDate;
import java.time.Period;

public class Aniversariante implements Comparable<Aniversariante>{
    private LocalDate dataAniversario;
    private String nome;
    
    public Aniversariante(String nome, LocalDate data){
        this.dataAniversario = data;
        this.nome = nome;
    }
    
    public LocalDate getDataAniversario(){
        return dataAniversario;
    }
    
    public void setDataAniversario(LocalDate dataAniversario){
        this.dataAniversario = dataAniversario;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + "\n" +
               "Data do aniversário: " + dataAniversario;
    }
    
    public int getIdade(){
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.getYear() - dataAniversario.getYear();
    }
    
    public String getProximoAniversarioString(){
        LocalDate dataAtual = LocalDate.now();
        Period intervalo = Period.between(dataAtual, dataAniversario.withYear(dataAtual.getYear()));
        if(intervalo.getDays() < 0 || intervalo.getMonths() < 0){
            return "Já passou";
        }else if(intervalo.getMonths() == 0 && intervalo.getDays() == 0){
            return "É hoje";
        }else{
            return (intervalo.getMonths() == 0 ? "" : intervalo.getMonths() > 1 ? 
                   intervalo.getMonths() + " meses e " : intervalo.getMonths() + " mes e ") +
                   intervalo.getDays() + " dias";
        }
    }
    
    public Period getProximoAnivesarioPeriod(){
        LocalDate dataAtual = LocalDate.now();
        Period intervalo = Period.between(dataAtual, dataAniversario.withYear(dataAtual.getYear()));
        return intervalo;
    }
    
    @Override
    public int compareTo(Aniversariante aniversariante){
        LocalDate dataAtual = LocalDate.now();
        LocalDate data1 = dataAniversario.withYear(dataAtual.getYear());
        LocalDate data2 = aniversariante.getDataAniversario().withYear(dataAtual.getYear());
		if(data1.isBefore(data2)){
            return -1;
        }else if(data2.isBefore(data1)){
            return 1;
        }
        return 0;
    }
    
}