/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.atakancetinkaya.siniflar;
import com.atakancetinkaya.veritabani.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ataka
 */
public class girisYap {
    
    ResultSet rs; //ResultSet sınıfından rs adında nesne oluşturdum
    PreparedStatement ps; //PreparedStatement sınıfından ps adında nesne oluşturdum
    
    public boolean giris(String kAdi,String kSifre)
    {
        VeriTabani vt = new VeriTabani();// VeriTabani sınıfından vt adında nesne oluşturdum
        vt.baglan();//veritabanına bağlan
        String sorgu ="select * from kullanici where kullaniciAdi=?";// sorgu adında değişken oluşturup veri tabanı yolunu belirttim.
        try 
        {
            ps=vt.con.prepareStatement(sorgu);//sorgu yu veri tabanına gönderdim.
            ps.setString(1, kAdi);//kullanıcı adı dışarıdan parametre olarak geldiği zaman onu alıp sorguyu gönder.
            rs=ps.executeQuery();//sorguyu çalıştır ve sonucu rs nesnesine at.
            
            while(rs.next())//rs nin içerisinde bilgi olduğu sürece döngü dönsün
            {
                String ka=rs.getString("kullaniciAdi");//veri tabanındaki "kAdi" alanındaki bilgiyi oku "ka" değişkenine ata
                String s=rs.getString("sifre");//veri tabanındaki "sifre" alanındaki bilgiyi oku "s" değişkenine ata
                
                if (ka.equals(kAdi) && s.equals(kSifre))//dışarıdan gelen bilgilerle veritabanındaki bilgileri karşılaştır 
                {
                    return true;//bilgiler doğru geriye döndür
                }
                else
                {
                    return false;
                }
            }
            rs.close();//rs kapat
            ps.close();//ps kapat
            vt.kapat();//vt kapat
            
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        return false;
    }
    
    
    
}
