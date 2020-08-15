package listaraniversario;

import java.util.AbstractList;
import java.util.Arrays;

public class AniversarianteList<E> extends AbstractList<E> implements IAniversarianteList<E> {
    private E[] aniversariantes;
    private int index;
    
    public AniversarianteList(){
        index = 0;
        aniversariantes = (E[]) new Object[0];
    }
    
    @Override
    public E get(int index){
        if(index > size() || index < 0 || aniversariantes[index] == null){
            throw new ArrayIndexOutOfBoundsException("O indice informado está fora do tamanho do vetor");
        }
        return aniversariantes[index];
    }
    
    @Override
    public E set(int index, E aniversariante){
        if(index > size() || index < 0 || aniversariantes[index] == null){
            throw new ArrayIndexOutOfBoundsException("O indice informado está fora do tamanho do vetor");
        }
        return (aniversariantes[index] = aniversariante);
    }
    
    @Override
    public int size(){
        return aniversariantes.length;
    }
    
    @Override
    public void sort(){
        Arrays.sort(aniversariantes);
    }
    
    @Override
    public E remove(int index){
        if(index > size() || index < 0 || aniversariantes[index] == null){
            throw new ArrayIndexOutOfBoundsException();
        }
        
        E elemento = aniversariantes[index];
        E[] aux = Arrays.copyOfRange(aniversariantes, 0, size()-1);
        
        for(int i = index; i < size()-1; i++){
            aux[i] = aniversariantes[i+1];
        }
        aniversariantes = aux;
        this.index--;
        return elemento;
    }
    
    @Override
    public boolean add(E aniversariante){
        aniversariantes = Arrays.copyOfRange(aniversariantes, 0, size()+1);
        aniversariantes[index++] = aniversariante;
        return true;
    }
    
    public int getIndex(){
        return index;
    }
}
