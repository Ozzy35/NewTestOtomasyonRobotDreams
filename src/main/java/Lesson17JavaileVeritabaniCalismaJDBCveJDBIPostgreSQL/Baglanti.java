package Lesson17JavaileVeritabaniCalismaJDBCveJDBIPostgreSQL;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Baglanti {

    private String kullaniciAdi = "root";
    private String parola = "";

    private String dataBaseName = "demo";

    private String host = "localhost";

    private int port = 3306;

    //connection claas ından obje olusturduk baglatı ıcın, constroctor cınde connection saglıycaz

    private Connection con = null;
    private PreparedStatement preparedStatement = null;
    private Statement statement =null;
    public void preparedCalisanlariGetir(int Id) throws SQLException {

        String sorgu = "Select * From calisanlar where Id > ? ";

        preparedStatement =con.prepareStatement(sorgu);
        preparedStatement.setInt(1, Id);

        preparedStatement.executeQuery();
        ResultSet rs= preparedStatement.executeQuery();

        while (rs.next()){
            String ad=rs.getString("ad");
            String soyad=rs.getString("soyad");
            String email =rs.getString("email");

            System.out.println("Ad:" + ad + "Soyad:" + soyad + "Email:  " + email );

        }

    }

//           throws SQLException {
//
//        statement =con.createStatement();
//
//        String sorgu ="Select * From calisanlar where Ad like 'ö%' ";
//
//        ResultSet rs = statement.executeQuery(sorgu);
//
//        while (rs.next()){
//            System.out.println("Ad : " + rs.getString("Ad"));
//        }
//    }


    public void calisanlariGetir(){
        String sorgu ="Select * From calisanlar";

        try{

        statement =con.createStatement();
        ResultSet rs= statement.executeQuery(sorgu);

        while (rs.next()){
            int id = rs.getInt("id");
            String ad=rs.getString("ad");
            String soyad=rs.getString("soyad");
            String email =rs.getString("email");

            System.out.println("Id :" +id+  "Ad:" + ad + "Soyad:" + soyad + "Email:  " + email );

        }

    }catch (SQLException ex){
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE,null,ex );
        }
    }

    //"jdbc:mysql://localhost:3306//demo

    public Baglanti() {
        String url = "jdbc:mysql:// " + host + ":" + port + "/" + dataBaseName;

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı........");

        }

        try {
            con = DriverManager.getConnection(url, kullaniciAdi, parola);
            System.out.println("Bağlantı başarılı........");

        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız......");
//            ex.printStackTrace();

        }

    }

    public static void main(String[] args) throws SQLException {
        Baglanti baglanti =new Baglanti();
       // baglanti.calisanlariGetir();
        baglanti.preparedCalisanlariGetir(1);

    }
}
 