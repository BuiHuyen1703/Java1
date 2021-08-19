package Bai10;

import java.util.Scanner;

public class DaGiac {
	//Phuong thuc
	
	protected int soCanh;
	protected int[] kichThuoc;
	
	
	public DaGiac() {
		soCanh=0;
		kichThuoc= new int [soCanh];
	}
	 public DaGiac(int soCanh) {
		 this.soCanh= soCanh;
		 kichThuoc = new int[soCanh];
	 }
	 
	 public void nhapThongTin(Scanner sc) {
		 System.out.println("Nhap vao so canh:");
		 soCanh=sc.nextInt();
		 System.out.println("Nhap vao do dai cua cac canh:");
		 for(int i=0; i<soCanh; i++) {
			 System.out.println("\nNhap vao canh thu "+(i+1)+ ":");
			 kichThuoc[i] =sc.nextInt();
		 }
	 }
	 
	 public void hienThiThongTin() {
		 System.out.println("Đoai cac canh la: ");
		 for(int i=0; i<0;i++) {
			 System.out.println("\tCanh thu "+(i+1) +":");
		 }
	 }
	 //tinh chi vi
	 public int tinhCV() {
		 int chuVi=0;
		 for(int i=0;i<soCanh;i++) {
			 chuVi+= kichThuoc[i];
		 }
		 return chuVi;
	 }
	 
}
