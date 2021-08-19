package OnTap1;

import java.util.ArrayList;
import java.util.Scanner;

//import java.util.Scanner;
public class QuanLySach {
	private ArrayList<TaiLieu> dstl;
	
	public QuanLySach() {
		dstl= new ArrayList<TaiLieu>(10);
	}
	//them moi tl
	public void themTaiLieu(TaiLieu tl) {
		dstl.add(tl);
	}
	
	public void nhapDanhSachTL(Scanner sc) {
		int chon;
		String stop;
		TaiLieu tl;
		do {
			System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
			chon=sc.nextInt();
			sc.nextLine();
			switch (chon) {
			case 1: 
				tl= new Sach();
				break;
			case 2: 
				tl= new TapTri();
				break;
			case 3: 
				tl= new Bao();
				break;
			default:
				tl= new Sach();
				break;
			}
			tl.nhapThongTin(sc);
			themTaiLieu(tl);
			System.out.println("\nBan co mun them khong (c/k):");
			stop=sc.next();
		} while (stop.equals("c"));
	}
	// tim kiem theo ma
	public void timMaTL(String maTL) {
		for(TaiLieu tl : dstl) {
			if(maTL.equals(tl.getMaTaiLieu())) {
				tl.hienThiThongTin();
			}
		}
	}
	
	public void timLoaiTL(String loai) {
		for(TaiLieu tl:dstl) {
			if(loai.equals("Sach")&&(tl instanceof Sach)) {
				tl.hienThiThongTin();
			}else if(loai.equals("TapTri")&&(tl instanceof TapTri)) {
				tl.hienThiThongTin();
			}else if(loai.equals("Bao")&&(tl instanceof Bao)) {
				tl.hienThiThongTin();
			}
		}
		
	}
	
}
