package Bai10;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	private ArrayList<TamGiac> ds;
	
	public Test() {
		ds=new ArrayList<TamGiac>();
	}
	
	public void themTG(TamGiac tg) {
		ds.add(tg);
	}
	
	public void nhapDS(Scanner sc) {
		TamGiac tg;
		System.out.println("Nhap vao so luong tam giac:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Tam giac thu" +(i+1)+":");
			do {
				tg= new TamGiac();
				tg.nhapThongTin(sc);
				if(tg.ktTG()==false) {
					System.out.println("Ban nhap sai dồi. Hãy nhập lại!");
				}
			}while(tg.ktTG()==false);
			themTG(tg);
		}
	}
	
	//sstim tg có dt max
	public void tinMaxTG() {
		double max= ds.get(0).tinhDT();
		for(int i=0;i<ds.size();i++) {
			if(max<ds.get(i).tinhDT()) {
				max=ds.get(i).tinhDT();
			}
		}
		for(TamGiac tamGiac : ds) {
			if(max==tamGiac.tinhDT()) {
				tamGiac.display();
			}
		}
	}
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		Test ql = new Test();
		ql.nhapDS(sc);
		System.out.println("\ntam giac co dt max là:");
		ql.tinMaxTG();
		sc.close();
	}

}
