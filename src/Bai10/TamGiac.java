package Bai10;
import java.lang.Math;
public class TamGiac extends DaGiac{
	public TamGiac() {
		soCanh=3;
		kichThuoc= new int[3];
	}
	
	public int tinhCV() {
		 int chuVi=0;
		 for(int i=0;i<3;i++) {
			 chuVi+= kichThuoc[i];
		 }
		 return chuVi;
	 }
	public double tinhDT() {
		double p =tinhCV()/2;
		return Math.sqrt(p*(p-kichThuoc[0])*(p-kichThuoc[1])*(p-kichThuoc[2]));
	}
	 
	public boolean ktTG() {
		int a=kichThuoc[0];
		int b=kichThuoc[1];
		int c=kichThuoc[2];
		if((a+b>c) && (a+c>b) &&(b+c>a)) {
			return true;
		}
		return false;
	}
	
	public void display() {
		System.out.println(kichThuoc[0]+"," +kichThuoc[1]+","+kichThuoc[2]);
	}
	
}
