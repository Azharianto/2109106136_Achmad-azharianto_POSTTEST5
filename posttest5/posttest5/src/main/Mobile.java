package main;

public class Mobile {
    int idMobile;
    String Status;
    private final String Kodepromo = "RIEPROMO2801";
    public Mobile(String name,int price,int idmobile,String Status){
        super();
        this.idMobile = idmobile;
        this.Status = Status;
    }
    public int getIdMobile() {
        return idMobile;
    }
 
    public String getStatus() {
        return Status;
    }
    public void setIdMobile(int idMobile) {
        this.idMobile = idMobile;
    }
  
    public void setStatus(String status) {
        Status = status;
    }
    public String getKodepromo(){
        return Kodepromo;
    }
    public void DataPenjualanProduk(String nama){
    System.out.println("nama :" + nama);
    }
    public void DataPenjualanProduk(int harga){
    System.out.println("harga :" + harga);
    }
}
