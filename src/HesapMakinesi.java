import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi1, sayi2, secim;
		System.out.print("Ýlk Sayýyý Giriniz: ");
		sayi1 = scan.nextInt();
		System.out.print("\nÝkinci Sayýyý Giriniz: ");
		sayi2 = scan.nextInt();
		System.out.println("\nLütfen Yapmak Ýstediðiniz Ýþlemi Seçiniz: ");
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		System.out.print("\nSeçiminiz: ");
		secim = scan.nextInt();
		
		if(secim == 1) {
			System.out.println("Toplama: " + (sayi1 + sayi2));
		}else if(secim == 2) {
			System.out.println("Çýkarma: " + (sayi1 - sayi2));
		}else if(secim == 3) {
			System.out.println("Çarpma: " + (sayi1 * sayi2));
		}else if(secim == 4) {
			if(sayi2 == 0) {
				System.out.println("Ýkinci sayý 0'a eþittir ve sonuç belirsizdir!");
			}else {
				System.out.println("Bölme: " + (sayi1 / sayi2));
			}
		}else {
			System.out.println("\nGeçersiz bir iþlem girdiniz tekrar deneyiniz!");
		}

	}

}
