/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Modul_PrakPBO5;

/**
 *
 * @author yasaw
 */
public class HewanDarat extends Hewan {
    String Habitat;
    int kaki;
    
    @Override
    public void info() {
        super.info();
        System.out.println("Habitat di " + Habitat);
        System.out.println("Berkaki " + kaki);
    }
}
