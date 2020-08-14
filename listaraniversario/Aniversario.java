package listaraniversario;

import java.time.LocalDate;

public class Aniversario {
    private LocalDate dataAniversario;
    private String nome;
    
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
}
