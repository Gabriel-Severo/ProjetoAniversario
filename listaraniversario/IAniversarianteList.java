package listaraniversario;

import java.util.Collection;

public interface IAniversarianteList<E> extends Collection<E> {
    boolean add(E aniversariante);
    E remove(int index);
    E get(int index);
    E set(int i, E aniversariante);
    void sort();
}
