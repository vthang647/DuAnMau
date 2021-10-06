/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author you have to better
 */
public class checkForm {

    public static boolean isNum(String str) {
        try {
            float f = Float.parseFloat(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    
    public static boolean check_numberChar(String str, int limit) {
        return (!str.trim().isEmpty() && str.trim().matches(".*[a-zA-Z0-9]{1, " + limit + "}"));
    }

}
