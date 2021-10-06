/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author you have to better
 */
public class xDate {

    static SimpleDateFormat formater = new SimpleDateFormat();

    // String s = "1-9-1970";
    // Date date = XDate.toDate(s, "dd-mm-yyyy");
    public static Date toDate(String date, String pattern) {
        try {
            formater.applyPattern(pattern);
            return formater.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    //Date now = new date();
    //String s = XDate.toString(now, "dd-MM-yyyy");
    public static String toString(Date date, String parttern) {
        formater.applyPattern(parttern);
        return formater.format(date);
    }
    
    public static Date addDays(Date date, long days){
        date.setTime(date.getTime() + days*24*60*60*1000);
        return date;
    }
}
