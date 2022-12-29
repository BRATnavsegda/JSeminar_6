package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.lang.reflect.Array;
import java.util.*;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {

        Homework hw = new Homework();
        Notebook nout1 = new Notebook(1, "Sony", "white", 27, "Celeron R1000", 8, "Windows", 45000);
        Notebook nout2 = new Notebook(2, "HP", "black", 23, "Celeron R1000f", 6, "Windows", 37000);
        Notebook nout3 = new Notebook(3, "Lenovo", "grey", 17, "Celeron K2300", 4, "none", 23000);
        List<Notebook> nouts = hw.initListNotebooks(nout1, nout2, nout3);
        hw.printListNB(nouts);

    }

    public List<Notebook> initListNotebooks(Notebook ...notebooks) {

        return new ArrayList<>(Arrays.asList(notebooks));
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){

        return null;
    }

    public void printListNB(List <Notebook> notebookList) {
        for ( Notebook i : notebookList) {
            i.print();
        }
    }

}
