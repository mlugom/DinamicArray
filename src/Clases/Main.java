/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author manuel
 */
public class Main {
    public static void main(String[] args) {
        DinamicArr<Integer> miArr = new DinamicArr<>();
        miArr.add(12);
        miArr.add(3);
        miArr.add(4);
        miArr.add(1);
        miArr.add(11);
        miArr.sort();
        for (int i = 0; i < miArr.size(); i++) {
            System.out.println(miArr.get(i));
        }
    }
}
