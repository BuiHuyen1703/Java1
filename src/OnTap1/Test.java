package OnTap1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLySach sql = new QuanLySach();
		sql.nhapDanhSachTL(sc);
		
		System.out.println("\nNhap vao loai tai lieu can tim: ");
		String loai = sc.nextLine();
		sql.timLoaiTL(loai);
		sc.nextLine();
		System.out.println("\nNhap ma tai lieu can tim: ");
		String maTL =sc.nextLine();
		sql.timMaTL(maTL);
		
		sc.close();
	}

}
