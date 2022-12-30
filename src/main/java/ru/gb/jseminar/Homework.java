package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

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
        Notebook notebook1 = new Notebook(1, "Sony", "white", 27, "Celeron R1000", 8, "Windows", 45000);
        Notebook notebook2 = new Notebook(2, "HP", "black", 23, "Celeron R1000f", 6, "Linux", 37000);
        Notebook notebook3 = new Notebook(3, "Lenovo", "grey", 17, "Celeron K2300", 4, "none", 23000);
        List<Notebook> nouts = hw.initListNotebooks(notebook1, notebook2, notebook3);
        hw.printListNB(hw.filter(hw.params(), nouts));

    }

    public List<Notebook> initListNotebooks(Notebook ...notebooks) {

        return new ArrayList<>(Arrays.asList(notebooks));
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {

        List<Notebook> resultList = new ArrayList<>();
        for (Notebook item: notebooks) {
            if ((Objects.equals(item.getModel(), params.get("model")))
                    || (Objects.equals(item.getColor(), params.get("color")))
                    || (Objects.equals(item.getDiagonal(), (Integer.parseInt(params.get("diagonal")))))
                    || (Objects.equals(item.getProcessor(), params.get("processor")))
                    || (Objects.equals(item.getRam(), (Integer.parseInt(params.get("ram")))))
                    || (Objects.equals(item.getOs(), params.get("os")))
                    || (Objects.equals(item.getPrice(), (Integer.parseInt(params.get("price"))))))
            {
                resultList.add(item);
            }

        }



        return resultList;
    }

    public void printListNB(List <Notebook> notebookList) {
        for ( Notebook i : notebookList) {
            i.print();
        }
    }

    public Map<String, String> params () {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> res = new HashMap<>();{
            res.put("model", "");
            res.put("color", "");
            res.put("diagonal", "0");
            res.put("processor", "");
            res.put("ram", "0");
            res.put("os", "");
            res.put("price", "0");
        }
        System.out.println("Выберите параметр ноутбука для фильтра(введите цифру №): \n" +
                "№1 Модель \n" +
                "№2 Цвет \n" +
                "№3 Диагональ экрана \n" +
                "№4 Процессор \n" +
                "№5 Обьём оперативной памяти \n" +
                "№6 Операционная система \n" +
                "№7 Розничная цена");

        int field = scanner.nextInt();
        if (field == 1) {
            System.out.println("Выберите модель ноутбука из списка ниже(введите цифру №): \n " +
                    "№1 Sony \n " +
                    "№2 HP \n " +
                    "№3 Lenovo \n");
            int model = scanner.nextInt();
            switch (model) {
                case 1:
                    res.put("model", "Sony");
                    break;
                case 2:
                    res.put("model", "HP");
                    break;
                case 3:
                    res.put("model", "Lenovo");
                    break;
                default:
                    System.out.println("Такой модели нет");
                    break;

            }
        } else if (field == 2) {
            System.out.println("Выберите цвет ноутбука из списка ниже(введите цифру №): \n " +
                    "№1 White \n " +
                    "№2 Black \n " +
                    "№3 Grey \n");
            int color = scanner.nextInt();
            switch (color) {
                case 1:
                    res.put("color", "white");
                    break;
                case 2:
                    res.put("color", "black");
                    break;
                case 3:
                    res.put("color", "grey");
                    break;
                default:
                    System.out.println("Такого цвета нет");
            }

        } else if (field == 3) {
            System.out.println("Выберите диагональ экрана из списка ниже(введите цифру №): \n " +
                    "№1 27 \n " +
                    "№2 23 \n " +
                    "№3 17 \n");
            int color = scanner.nextInt();
            switch (color) {
                case 1:
                    res.put("diagonal", "27");
                    break;
                case 2:
                    res.put("diagonal", "23");
                    break;
                case 3:
                    res.put("diagonal", "17");
                    break;
                default:
                    System.out.println("Такой диагонали нет");
            }

        } else if (field == 4) {
            System.out.println("Выберите процессор из списка ниже(введите цифру №): \n " +
                    "№1 Celeron R1000 \n " +
                    "№2 Celeron R1000f \n " +
                    "№3 Celeron K2300 \n");
            int color = scanner.nextInt();
            switch (color) {
                case 1:
                    res.put("processor", "Celeron R1000");
                    break;
                case 2:
                    res.put("processor", "Celeron R1000f");
                    break;
                case 3:
                    res.put("processor", "Celeron K2300");
                    break;
                default:
                    System.out.println("Такого процессора нет");
            }

        } else if (field == 5) {
            System.out.println("Выберите Обьём оперативной памяти из списка ниже(введите цифру №): \n " +
                    "№1 8 Гб \n " +
                    "№2 6 Гб \n " +
                    "№3 4 Гб K2300 \n");
            int color = scanner.nextInt();
            switch (color) {
                case 1:
                    res.put("ram", "8");
                    break;
                case 2:
                    res.put("ram", "6");
                    break;
                case 3:
                    res.put("ram", "4");
                    break;
                default:
                    System.out.println("Такой памяти нет");
            }

        } else if (field == 6) {
            System.out.println("Выберите Операционную систему из списка ниже(введите цифру №): \n " +
                    "№1 Windows \n " +
                    "№2 Linux \n " +
                    "№3 Не установлена \n");
            int color = scanner.nextInt();
            switch (color) {
                case 1:
                    res.put("os", "Windows");
                    break;
                case 2:
                    res.put("os", "Linux");
                    break;
                case 3:
                    res.put("os", "none");
                    break;
                default:
                    System.out.println("Такой OS нет");
            }

        } else if (field == 7) {
            System.out.println("Выберите Розничную цену из списка ниже(введите цифру №): \n " +
                    "№1 45 т.р. \n " +
                    "№2 37 т.р. \n " +
                    "№3 23 т.р. \n");
            int color = scanner.nextInt();
            switch (color) {
                case 1:
                    res.put("price", "45000");
                    break;
                case 2:
                    res.put("price", "37000");
                    break;
                case 3:
                    res.put("price", "23000");
                    break;
                default:
                    System.out.println("Такой цены нет");
            }

        } else {
            System.out.println("from 1 to 7");
        }
        return res;
    }

}
