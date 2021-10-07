/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Utils.xDate;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author you have to better
 */
public class Test {

    public static void main(String[] args) {
//        String str = "please";
//
//        try {
//            byte[] byteOfMessage = str.getBytes("UTF-8");
//            MessageDigest md = MessageDigest.getInstance("MD5");
//            md.update(byteOfMessage);
//            byte[] thedisgest = md.digest();
//            String s = String.format("%032x", new BigInteger(1, thedisgest));
//            System.out.println("Ma hoa: " + s);
//        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
//        }
//        File fi = new File("src/image_background/FPT_Polytechnic.png");
//        File fi2 = new File("C:\\Users\\you have to better\\Pictures\\FPT_Polytechnic.png");
//        Path path = Paths.get(fi.getAbsolutePath());
//        Path path2 = Paths.get(fi2.getAbsolutePath());
//        try {
//            Files.copy(path2, path, StandardCopyOption.REPLACE_EXISTING);
//            System.out.println("Sao chep thanh cong");
//        } catch (IOException ex) {
//            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println("path" + path);
////        createFile(fi);
////        System.out.println("fi: " + fi.getAbsolutePath());

        System.out.println("Date: "+ xDate.isDate("16-19-2000"));
    }

    public static void createFile(File src) {
        File file = new File("test/logos", src.getName());
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
            System.out.println("File khong ton tai");
            System.out.println("file: " + file.getParentFile().getAbsolutePath());
        } else {

        }
    }
}
