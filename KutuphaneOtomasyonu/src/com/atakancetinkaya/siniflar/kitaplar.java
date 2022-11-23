/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.atakancetinkaya.siniflar;

import com.atakancetinkaya.veritabani.VeriTabani;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ataka
 */
public class kitaplar {
    
    PreparedStatement ps;//PreparedStatement sınıfından ps adında nesne oluşturdum
    ResultSet rs;//ResultSet sınıfından rs adında nesne oluşturdum
    VeriTabani vt = new VeriTabani();// VeriTabani sınıfından vt adında nesne oluşturdum
    
    private String k_id; //k_id adında değişken oluşturdum.
    private String k_adi; //k_adi adında değişken oluşturdum.
    private String k_turu;//k_turu adında değişken oluşturdum.
    private String k_yEvi; //k_yEvi adında değişken oluşturdum.
    private String k_yazar;//k_yazar adında değişken oluşturdum.

    public String getK_id() {
        return k_id;
    }

    public void setK_id(String k_id) {
        this.k_id = k_id;
    }

    public String getK_adi() {
        return k_adi;
    }

    public void setK_adi(String k_adi) {
        this.k_adi = k_adi;
    }

    public String getK_turu() {
        return k_turu;
    }

    public void setK_turu(String k_turu) {
        this.k_turu = k_turu;
    }

    public String getK_yEvi() {
        return k_yEvi;
    }

    public void setK_yEvi(String k_yEvi) {
        this.k_yEvi = k_yEvi;
    }

    public String getK_yazar() {
        return k_yazar;
    }

    public void setK_yazar(String k_yazar) {
        this.k_yazar = k_yazar;
    }
    
    public boolean kitapEkle(kitaplar k_ekle)
    {
        try 
        {
            vt.baglan();//veritabanına bağlan
            String sorgu ="insert into kitaplar(id,adi,turu,yEvi,yazar) values(?,?,?,?,?)";// sorgu adında değişken oluşturup ekleme işleminin komutunu yazdım.
            ps=vt.con.prepareStatement(sorgu);//sorgu yu veri tabanına gönderdim.
            
            ps.setString(1, k_ekle.getK_id());//dışarıdan gelen "K_id" yu al veri tabanına gönder.
            ps.setString(2, k_ekle.getK_adi());//dışarıdan gelen "K_adi" ı al veri tabanına gönder.
            ps.setString(3, k_ekle.getK_turu());//dışarıdan gelen "K_turu" i al veri tabanına gönder.
            ps.setString(4, k_ekle.getK_yEvi());//dışarıdan gelen "K_yEvi" i al veri tabanına gönder.
            ps.setString(5, k_ekle.getK_yazar());//dışarıdan gelen "K_yazar" i al veri tabanına gönder.
            
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
    
    public boolean kitapBul(kitaplar k_bul)
    {
        try 
        {
            vt.baglan();//vt bağlan
            String sorgu="select * from kitaplar where id=?";// sorgu adında değişken oluşturup bulma işleminin komutunu yazdım.
            ps=vt.con.prepareStatement(sorgu);//sorgu yu veri tabanına gönderdim.
            ps.setString(1, k_bul.getK_id());//dışarıdan gelen "U_tcNo" yu al veri tabanında bul.
            rs=ps.executeQuery();//ps çalıştır ve rs ye at.
            rs.next();//kaydı ilerlet
            setK_adi(rs.getString("adi"));//veritabanındaki adi alanındaki bilgiyi oku setK_adi methoduna gönder.
            setK_turu(rs.getString("turu"));//veritabanındaki turu alanındaki bilgiyi oku setK_turu methoduna gönder.
            setK_yEvi(rs.getString("yEvi"));//veritabanındaki yEvi alanındaki bilgiyi oku setK_yEvi methoduna gönder.
            setK_yazar(rs.getString("yazar"));//veritabanındaki yazar alanındaki bilgiyi oku setK_yazar methoduna gönder.
            
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
    
    public boolean kitapSil(kitaplar k_sil)
    {
        try 
        {
            vt.baglan();//vt bağlan
            String sorgu="delete from kitaplar where id=?";// sorgu adında değişken oluşturup silme işleminin komutunu yazdım.
            ps=vt.con.prepareStatement(sorgu);//sorgu yu veri tabanına gönderdim.
            ps.setString(1, k_sil.getK_id());//dışarıdan gelen K_id veri tabanından sil
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
    
     public boolean kitapGuncelle(kitaplar k_guncelle)
   {
       try 
       {
           vt.baglan();
           String sorgu="update kitaplar set adi=?, turu=?, yEvi=?, yazar=? where id=?";//sorgu adında değişken oluşturup update işleminin komutunu yazdım
           ps=vt.con.prepareStatement(sorgu);//sorgu yu veri tabanına gönderdim.
           ps.setString(1, k_guncelle.getK_adi());//dışarıdan gelen K_adi ı veri tabanında ilgili alanda güncelle
           ps.setString(2, k_guncelle.getK_turu());//dışarıdan gelen K_turu i veri tabanında ilgili alanda güncelle
           ps.setString(3, k_guncelle.getK_yEvi());//dışarıdan gelen K_yEvi i veri tabanında ilgili alanda güncelle
           ps.setString(4, k_guncelle.getK_yazar());//dışarıdan gelen K_yazar i veri tabanında ilgili alanda güncelle
           ps.setString(5, k_guncelle.getK_id());//dışarıdan gelen K_id yu veri tabanında ilgili alanda güncelle
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
