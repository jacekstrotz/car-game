/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.Random;

/**
 *
 * @author strotz
 */
public class Utility {
    
    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    
    public static boolean isLessThan(String one, String two) {
        if (one.compareTo( two ) < 0) {
            return true;
        }else {
            return  false;
        }
    }
}
