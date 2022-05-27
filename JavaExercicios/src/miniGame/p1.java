/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniGame;

import java.util.Random;

/**
 *
 * @author 36127512021.2
 */
public class p1 {
    String nome;
    int atk, 
        def;
    
    Random rdm = new Random();
    public int atacar(){
        atk = rdm.nextInt(5555);
        return atk;
    }
    
    public int defender(){
        def = rdm.nextInt(5555);
        return def;
    }
}
