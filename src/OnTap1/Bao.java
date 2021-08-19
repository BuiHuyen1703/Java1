package OnTap1;
import java.util.Scanner;
public class Bao extends TaiLieu {

	private String ngayPhatHanh;

	public Bao() {}	
	public Bao(String maTaiLieu,String tenNXB, int soBanPhatHanh, String ngayPhatHanh ) {
		super(maTaiLieu, tenNXB,soBanPhatHanh);
		this.ngayPhatHanh=ngayPhatHanh;
	}	
	
    public void nhapThongTin(Scanner sc) {
    	super.nhapThongTin(sc);;
    	System.out.print("Nhập ngày phát hành: ");
    	ngayPhatHanh= sc.nextLine();
    }
    
    public void hienThiThongTin() {
    	super.hienThiThongTin();
    	System.out.println("\tNgay phat hanh: "+ngayPhatHanh);
    }
    
}
