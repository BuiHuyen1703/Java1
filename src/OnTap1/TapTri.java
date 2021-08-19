package OnTap1;
import java.util.Scanner;
public class TapTri extends TaiLieu {
	private int soPhatHanh;
	private int thangPhatHanh;

	public TapTri() {
    	
    }

	public TapTri(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh)
	{
    	super(maTaiLieu, tenNXB, soBanPhatHanh);
    	this.soPhatHanh=soPhatHanh;
    	this.thangPhatHanh=thangPhatHanh;
    }
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so phat hanh: ");soPhatHanh= sc.nextInt();
		System.out.print("\tNhap thnah phat hanh: ");thangPhatHanh=sc.nextInt(); sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh "+soPhatHanh);
		System.out.println("\tThang phat hanh "+thangPhatHanh);
	}
}
