package dangthuongngo.com.test;

import dangthuongngo.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		SinhVien obama = new SinhVien();
		SinhVien putin = new SinhVien("Putin", 9);
		System.out.println("Điểm của Putin" + putin.getDiem());
		System.out.println("Tên của Putin là "+ putin.getHoTen());
		System.out.println("---------------------");
		putin.xuatThongTin();
		System.out.println("---------------------");
		System.out.println(putin);
		
	}

}
