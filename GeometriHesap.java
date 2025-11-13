/*
 * Ad Soyad: Çağan Ahmet Erddoğan
 * Ogrenci No: 250541059
 * Tarih: 13/11/2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.lang.Math;
import java.util.Locale; // Locale.US kullanıldı

public class GeometriHesap {

    // --- Geometrik Hesaplama Metotları ---

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }


    public static void main(String[] args) {
        // Uyarıyı gidermek için yeni kullanım: Locale.US
        // Bu, çıktıda ondalık ayırıcı olarak noktayı korur.
        Locale.setDefault(Locale.US); 

        // --- GİRDİ DEĞERLERİ ---
        double kareKenar = 6.0;

        double dikdortgenKisa = 5.0;
        double dikdortgenUzun = 8.0;

        double daireYaricap = 10.0;

        double ucgenTaban = 5.0;
        double ucgenYukseklik = 12.0;
        // Üçgen çevre kenarları (önceki örnekten: 6, 8, 10)
        double ucgenKenar1 = 6.0;
        double ucgenKenar2 = 8.0;
        double ucgenKenar3 = 10.0; 

        // --- Konsol Çıktısı (Girdi Alanı) ---

        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");
        System.out.println();
        
        System.out.println("KARE:");
        System.out.printf("Kenar uzunlugu (cm): %.0f%n", kareKenar);

        System.out.println();
        System.out.println("DIKDORTGEN:");
        System.out.printf("Kisa kenar (cm): %.0f%n", dikdortgenKisa);
        System.out.printf("Uzun kenar (cm): %.0f%n", dikdortgenUzun);

        System.out.println();
        System.out.println("DAIRE:");
        System.out.printf("Yaricap (cm): %.0f%n", daireYaricap);

        System.out.println();
        System.out.println("UCGEN:");
        System.out.printf("Taban (cm): %.0f%n", ucgenTaban);
        System.out.printf("Yukseklik (cm): %.0f%n", ucgenYukseklik);
        System.out.printf("1. kenar (cm): %.0f%n", ucgenKenar1);
        System.out.printf("2. kenar (cm): %.0f%n", ucgenKenar2);
        System.out.printf("3. kenar (cm): %.0f%n", ucgenKenar3);

        System.out.println();
        System.out.println("========================================");
        System.out.println("     HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        // KARE SONUÇLARI
        System.out.printf("%nKARE (kenar: %.1f cm):%n", kareKenar);
        System.out.printf("  Alan      : %.2f cm²%n", calculateSquareArea(kareKenar));
        System.out.printf("  Cevre     : %.2f cm%n", calculateSquarePerimeter(kareKenar));

        // DİKDÖRTGEN SONUÇLARI
        System.out.printf("%nDIKDORTGEN (%.1f x %.1f cm):%n", dikdortgenKisa, dikdortgenUzun);
        System.out.printf("  Alan      : %.2f cm²%n", calculateRectangleArea(dikdortgenKisa, dikdortgenUzun));
        System.out.printf("  Cevre     : %.2f cm%n", calculateRectanglePerimeter(dikdortgenKisa, dikdortgenUzun));

        // DAİRE SONUÇLARI
        System.out.printf("%nDAIRE (yaricap: %.1f cm):%n", daireYaricap);
        System.out.printf("  Alan      : %.2f cm²%n", calculateCircleArea(daireYaricap));
        System.out.printf("  Cevre     : %.2f cm%n", calculateCircleCircumference(daireYaricap));

        // ÜÇGEN SONUÇLARI
        System.out.printf("%nUCGEN (taban: %.1f, yukseklik: %.1f cm):%n", ucgenTaban, ucgenYukseklik);
        System.out.printf("  Alan      : %.2f cm²%n", calculateTriangleArea(ucgenTaban, ucgenYukseklik));
        System.out.printf("  Cevre     : %.2f cm%n", calculateTrianglePerimeter(ucgenKenar1, ucgenKenar2, ucgenKenar3));

        System.out.println();
        System.out.println("========================================");
    }
}
