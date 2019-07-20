package buoi3;
import java.util.Scanner;

public class baitapvenha {
	private String lastname;
	private String firstname;
	private String masinhvien;
	private int tuoi;
	private int mon1;
	private int mon2;
	private int mon3;
	private int tc1;
	private int tc2;
	private int tc3;
	private String lop;
	
	public baitapvenha(String lastname, String firstname, String masinhvien, int tuoi, int mon1, int mon2, int mon3,
			int tc1, int tc2, int tc3, String lop) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.masinhvien = masinhvien;
		this.tuoi = tuoi;
		this.mon1 = mon1;
		this.mon2 = mon2;
		this.mon3 = mon3;
		this.tc1 = tc1;
		this.tc2 = tc2;
		this.tc3 = tc3;
		this.lop = lop;
	}
	

	public baitapvenha() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getMasinhvien() {
		return masinhvien;
	}


	public void setMasinhvien(String masinhvien) {
		this.masinhvien = masinhvien;
	}


	public int getTuoi() {
		return tuoi;
	}


	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}


	public int getMon1() {
		return mon1;
	}


	public void setMon1(int mon1) {
		this.mon1 = mon1;
	}


	public int getMon2() {
		return mon2;
	}


	public void setMon2(int mon2) {
		this.mon2 = mon2;
	}


	public int getMon3() {
		return mon3;
	}


	public void setMon3(int mon3) {
		this.mon3 = mon3;
	}


	public int getTc1() {
		return tc1;
	}


	public void setTc1(int tc1) {
		this.tc1 = tc1;
	}


	public int getTc2() {
		return tc2;
	}


	public void setTc2(int tc2) {
		this.tc2 = tc2;
	}


	public int getTc3() {
		return tc3;
	}


	public void setTc3(int tc3) {
		this.tc3 = tc3;
	}


	public String getLop() {
		return lop;
	}


	public void setLop(String lop) {
		this.lop = lop;
	}


	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap lastname : ");
		lastname =sc.nextLine();
		System.out.println("Nhap firstname : ");
		firstname=sc.nextLine();
		System.out.println("Nhap ma sinh vien : ");
		masinhvien=sc.nextLine();
		System.out.println("Nhap tuoi: ");
		tuoi=sc.nextInt();
		System.out.println("Nhap diem mon 1: ");
		mon1=sc.nextInt();
		System.out.println("Nhap diem mon 2: ");
		mon2=sc.nextInt();
		System.out.println("Nhap diem mon 3: ");
		mon3=sc.nextInt();
		System.out.println("Nhap tin chi mon 1: ");
		tc1=sc.nextInt();
		System.out.println("Nhap tin chi mon 2: ");
		tc2=sc.nextInt();
		System.out.println("Nhap tin chi mon 3: ");
		tc3=sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap lop : ");
		lop =sc.nextLine();
	}
	public void display() {
		System.out.println("Ten:" + firstname+ lastname );
		System.out.println("Ma sinh vien :" + masinhvien );
		System.out.println("Tuoi :" + tuoi );
		System.out.println("Diem mon 1 :" + mon1+ ";" +"Tin chi mon 1 : "+ tc1 );
		System.out.println("Diem mon 2 :" + mon2+ ";" +"Tin chi mon 2 : "+ tc2 );
		System.out.println("Diem mon 3 :" + mon3+ ";" +"Tin chi mon 3 : "+ tc3 );
		System.out.println("Lop :" + lop );
		
}
	
	
}
