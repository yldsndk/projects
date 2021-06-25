/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foroernek3;

/**
 *
 * @author Yelda
 */
public class ForOernek3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String metin = "Merhaba Java Dersi";
        char karakterler ='a';
        int karakterSayisi=0;
        for(int i=0; i<metin.length(); i++){
            if(karakterler==metin.charAt(i)){
                karakterSayisi++;
            }
        }
        System.out.println(karakterler + " " + metin + " icerisinde " + karakterSayisi +" tanedir.");
    
   /* String metin = "Merhaba Java Dersi";
    int karakterSayisi = 0;
    for(int i=0; i<metin.length(); i++){
        karakterSayisi++;
        System.out.println(karakterSayisi);*/
    }
}