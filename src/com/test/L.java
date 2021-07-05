package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class L {
    public static void main(String[] args) throws IOException {
        String path = "D:/CLCK.RU/starye/2021-6-2.txt"; //исходный файл
        BufferedReader b = new BufferedReader(new FileReader(path));
        List<String> list = new LinkedList<>();
        while (b.ready())
            list.add(b.readLine());//добавление в list
        b.close();

        for (int i = list.size() - 1; i >= 0; i--) {//вывод в обратном порядке
            System.out.println(list.get(i));
        }
    }
}