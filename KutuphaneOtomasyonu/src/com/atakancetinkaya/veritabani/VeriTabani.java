/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.atakancetinkaya.veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ataka
 */
public class VeriTabani {
    
    public Connection con; //Connection sınıfından con adında nesne oluşturdum
    private String url="jdbc:mysql://localhost:3306/"; //url adında değişken oluşturup içine adres yolunu yazdım
    private String dbname="kutuphane";
    private String driver="com.mysql.jdbc.Driver"; //driver adında değiken oluşturup içine veri tabanı bağlantısı için kullanmış oluduğum sürücüyü yazdım
    private String username="root";//username adında değişken oluşturup içine veri tabanı kullanıcı adını yazdım
    private String password="";// password adında değişken oluşturup içine şifremi yazdım
    
    public void baglan()//baglan adında metod oluşturdum
    {
        try 
        {
            Class.forName(driver).newInstance();//veri tabanı bağlantısı için sürücü yüklemesi yapar.
            con=DriverManager.getConnection(url+dbname,username,password);//bağlanacağımız veritabanı bilgilerini tek satırda birleştik.
            System.out.println("Başarılı");//uyarı mesajını yazdırma
        } 
        catch (Exception ex) 
        {
            System.out.println(ex);//uyarı mesajını yazdırma

        }
        
    }
    
    public void kapat()//kapat adında metod oluşturdum
        {
            try 
            {
                con.close();//bağlantıyı kapat
                //JOptionPane.showMessageDialog(null, "Bağlantı Kapatıldı");//ekrana uyarı mesajını yazdırdım
                
            } 
            catch (Exception ex)
            {
                //JOptionPane.showMessageDialog(null, "Bağlantı kapatılamadı"+ex);//ekrana uyarı mesajını yazdırdım
            }
        }
    
    
}
