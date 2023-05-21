package edu.kis.vh.nursery.list;
/**
 * Klasa reprezentująca listę jednokierunkową przechowującą wartości całkowite.
 */
public class IntLinkedList {

    Node last;
    int i;

    /**
     * Dodaje nową wartość na koniec listy.
     *
     * @param i Wartość do dodania.
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * Sprawdza, czy lista jest pusta.
     *
     * @return Wartość logiczna, czy lista jest pusta.
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Sprawdza, czy lista jest pełna.
     *
     * @return Wartość logiczna, czy lista jest pełna.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Zwraca wartość elementu na szczycie listy, bez usuwania go.
     *
     * @return Wartość elementu na szczycie listy.
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.value;
    }

    /**
     * Usuwa element ze szczycie listy i zwraca jego wartość.
     *
     * @return Usunięta wartość ze szczycie listy.
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
