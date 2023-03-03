package seminar_6;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

// Создать множество ноутбуков.

// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации 
// и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


public class ShopOLaptops {

    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        laptops.add(new Laptop("Irbis NB77 13.3 JYU4525RU", 256, "Windows 11 Домашняя"));

        laptops.add(new Laptop("DEXP Aquilon 15 F415EA-UB34", 128, "Windows 10 Домашняя S-режим"));

        laptops.add(new Laptop("Digma EVE 14 14.1 C414-dy2067ms 4W2K2UA", 256, "Windows 11 Домашняя S-режим"));

        laptops.add(new Laptop("Echips Envy 14 BoM-WFQ9 5500U/16+512 Mystic Silver", 512, "Windows 11 Домашняя"));

        laptops.add(new Laptop("Acer Extensa 15 15.6 EX215-31-C3FF", 256, "не установлена"));

        System.out.println("===== Первый фильтр =====");
        Map<Object, Set<Laptop>> filteredLaptops = Laptop.filterByCriterion(laptops);
        print(filteredLaptops);

        System.out.println("===== Второй фильтр =====");
        Map<Object, Set<Laptop>> filteredLaptops2 = Laptop.filterByMinValue(laptops);
        print(filteredLaptops2);

    }

    private static void print(Map<Object, Set<Laptop>> map) {
        for (Map.Entry<Object, Set<Laptop>> entry : map.entrySet()) {
            System.out.println(entry);
            System.out.println();
        }
    }
}