/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

public class Demo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Selam");
        human human = new human();
        human.boy = 169;
        human.kilo=74;
        human.yas= 22;
        System.out.println("boyu "+human.boy + " kilosu "+human.kilo + " yaşı "+human.yas);
        human.eat();
        System.out.println("boyu "+human.boy + "kilosu "+human.kilo + "yaşı "+human.yas);
        worker ali = new worker();
        ali.boy =190;
        ali.kilo = 77;
        ali.yas = 21;
        ali.eat();
        ali.salary = 2000;
        System.out.println("zamsız maaş "+ali.salary);
        ali.zam(22);
        System.out.println("zamlı maaş "+ali.salary);

              
    }
    
}
