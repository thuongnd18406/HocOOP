package dangthuongngo.com.model;

public class SinhVien {
	private String hoTen;
	private double diem;
	public SinhVien(String hoTen, double diem) {
		this.hoTen = hoTen;
		this.diem = diem;
		System.out.println("Đây là Constructor có đối số!");
	}

	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	public SinhVien()
	{
		System.out.println("Đây là Constructor mặc định");
	}
	public void xuatThongTin()
	{
		System.out.println(this.hoTen+"->"+this.diem);
	}

	
	public String toString() {
		return "ha ha ha";
	}
	
}
