/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_PraktikumPBO4;

/**
 *
 * @author yasaw
 */
public class main {
    public static void main (String[] Args) {
        Pekerja susilo = new Pekerja ("Susilo", 25, "Sales", 2000000);
        
        System.out.println(susilo.toString());
        
        susilo.setNama("Paidi");
        System.out.println(susilo.toString());
    }
}
