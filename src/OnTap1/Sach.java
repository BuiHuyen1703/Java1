package OnTap1;

import java.util.Scanner;

public class Sach extends TaiLieu {
	//thuộc tính
	private String tacGia;
    private int soTrang;
 
    public Sach() {
    	
    }
 
    public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tacGia, int soTrang ) {
    	super(maTaiLieu, tenNXB, soBanPhatHanh);
    	this.tacGia=tacGia;
    	this.soTrang=soTrang;
    }
    
    public void nhapThongTin(Scanner sc) {
    	super.nhapThongTin(sc);
    	System.out.print("\tNhap tac gia: ");
    	tacGia = sc.nextLine();
    	System.out.print("\t Nhhap so trang:");
    	soTrang= sc.nextInt();
    	sc.nextLine();
    }
    
    public void hienThiThongTin() {
    	super.hienThiThongTin();
    	System.out.println("\tTen tac gia: "+tacGia);
    	System.out.println("\tSo trang: "+soTrang);
    }
    
 
    
}
