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
public class uyeler {//uyeler adında sınıf oluşturdum.
    PreparedStatement ps;//PreparedStatement sınıfından ps adında nesne oluşturdum
    ResultSet rs;//ResultSet sınıfından rs adında nesne oluşturdum
    VeriTabani vt = new VeriTabani();// VeriTabani sınıfından vt adında nesne oluşturdum
    
    private int u_id; //u_id adında değişken oluşturdum.
    private long u_tcNo; //u_tcNo adında değişken oluşturdum.
    private String u_adSoyad;//u_adSoyad adında değişken oluşturdum.
    private boolean u_cinsiyet; //u_cinsiyet adında değişken oluşturdum.
    private String u_tel;//u_tel adında değişken oluşturdum.
    private String u_adres;//u_adres adında değişken oluşturdum.

    public long getU_tcNo() {
        return u_tcNo;
    }

    public void setU_tcNo(long u_tcNo) {
        this.u_tcNo = u_tcNo;
    }

    public String getU_adSoyad() {
        return u_adSoyad;
    }

    public void setU_adSoyad(String u_adSoyad) {
        this.u_adSoyad = u_adSoyad;
    }

    public boolean isU_cinsiyet() {
        return u_cinsiyet;
    }

    public void setU_cinsiyet(boolean u_cinsiyet) {
        this.u_cinsiyet = u_cinsiyet;
    }

    public String getU_tel() {
        return u_tel;
    }

    public void setU_tel(String u_tel) {
        this.u_tel = u_tel;
    }

    public String getU_adres() {
        return u_adres;
    }

    public void setU_adres(String u_adres) {
        this.u_adres = u_adres;
    }

   

   
    
    public boolean uyeEkle(uyeler u_ekle)
    {
        try 
        {
            vt.baglan();//veritabanına bağlan
            String sorgu ="insert into uye(tcNo,adSoyad,cinsiyet,tel,adres) values(?,?,?,?,?)";// sorgu adında değişken oluşturup ekleme işleminin komutunu yazdım.
            ps=vt.con.prepareStatement(sorgu);//sorgu yu veri tabanına gönderdim.
            
            ps.setLong(1, u_ekle.getU_tcNo());//dışarıdan gelen "U_tcNo" yu al veri tabanına gönder.
            ps.setString(2, u_ekle.getU_adSoyad());//dışarıdan gelen "U_adSoyad" ı al veri tabanına gönder.
            ps.setBoolean(3, u_ekle.isU_cinsiyet());//dışarıdan gelen "U_cinsiyet" i al veri tabanına gönder.
            ps.setString(4, u_ekle.getU_tel());//dışarıdan gelen "U_tel" i al veri tabanına gönder.
            ps.setString(5, u_ekle.getU_adres());//dışarıdan gelen "U_adres" i al veri tabanına gönder.
            
            ps.execute();//sorguyu çalıştır
            ps.close();//ps kapat
            vt.kapat();//vt kapat;
           
        } 
        catch (Exception e) 
        {
            System.out.println(e);//hatayı yazdır.
        }
        return true;
    }
    
    public boolean uyeBul(uyeler u_bul)
    {
        try 
        {
            vt.baglan();//vt bağlan
            String sorgu="select * from uye where tcNo=?";// sorgu adında değişken oluşturup işleminin komutunu yazdım.
            ps=vt.con.prepareStatement(sorgu);//sorgu yu veri tabanına gönderdim.
            ps.setLong(1, u_bul.getU_tcNo());//dışarıdan gelen "U_tcNo" yu al veri tabanında bul.
            rs=ps.executeQuery();//ps çalıştır ve rs ye at.
            rs.next();//kaydı ilerlet
            setU_adSoyad(rs.getString("adSoyad"));//veritabanındaki adSoyad alanındaki bilgiyi oku setU_adSoyad methoduna gönder.
            setU_cinsiyet(rs.getBoolean("cinsiyet"));//veritabanındaki cinsiyet alanındaki bilgiyi oku setU_cinsiyet methoduna gönder.
            setU_tel(rs.getString("tel"));//veritabanındaki tel alanındaki bilgiyi oku setU_tel methoduna gönder.
            setU_adres(rs.getString("adres"));//veritabanındaki adres alanındaki bilgiyi oku setU_adres methoduna gönder.
            
            ps.close();//ps kapat
            vt.kapat();//vt kapat
            return true;
        } 
        catch (Exception e) 
        {
            System.out.println(e);//hata mesajını yazdır.
            return false;
        }
        
        
    }
    
    public boolean uyeSil(uyeler u_sil)
    {
        try 
        {
            vt.baglan();//vt bağlan
            String sorgu="delete from uye where tcNo=?";// sorgu adında değişken oluşturup silme işleminin komutunu yazdım.
            ps=vt.con.prepareStatement(sorgu);//sorgu yu veri tabanına gönderdim.
            ps.setLong(1, u_sil.getU_tcNo());//dışarıdan gelen U_tcNo veri tabanından sil
            ps.execute();//ps çalıştır
            ps.close();//ps kapat
            vt.kapat();//vt kapat
            return true;
        } 
        catch (Exception e) 
        {
            System.out.println(e);//hata mesajını yazdır.
            return false;
        }
        
    }

   public boolean uyeGuncelle(uyeler u_guncelle)
   {
       try 
       {
           vt.baglan();
           String sorgu="update uye set adSoyad=?, cinsiyet=?, tel=?, adres=? where tcNo=?";//sorgu adında değişken oluşturup update işleminin komutunu yazdım
           ps=vt.con.prepareStatement(sorgu);//sorgu yu veri tabanına gönderdim.
           ps.setString(1, u_guncelle.getU_adSoyad());//dışarıdan gelen U_adSoyad ı veri tabanında ilgili alanda güncelle
           ps.setBoolean(2, u_guncelle.isU_cinsiyet());//dışarıdan gelen U_cinsiyet i veri tabanında ilgili alanda güncelle
           ps.setString(3, u_guncelle.getU_tel());//dışarıdan gelen U_tel i veri tabanında ilgili alanda güncelle
           ps.setString(4, u_guncelle.getU_adres());//dışarıdan gelen U_adres i veri tabanında ilgili alanda güncelle
           ps.setLong(5, u_guncelle.getU_tcNo());//dışarıdan gelen U_tcNo yu veri tabanında ilgili alanda güncelle
           ps.executeUpdate();//güncelleme işlemini yap
           ps.close();//ps kapat
           vt.kapat();//vt kapat
           return true;
           
       } 
       catch (Exception e) 
       {
           System.out.println(e);//hata mesajını yazdır
           return false;
       }
   }
    
}
