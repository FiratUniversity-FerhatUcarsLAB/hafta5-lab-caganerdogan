/*
 * Ad Soyad: Çağan Ahmet Erdoğan
 * Ogrenci No: 250541059
 * Tarih: 13/11/2025
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

public class SepetHesap {

    // Sabitler
    final static double VAT_RATE = 0.18;      // KDV Orani (%18)
    final static double SHIPPING_FEE = 29.99; // Sabit kargo ucreti (TL)

    // --- ZORUNLU METOTLAR ---

    // 1. Bir urunun toplam fiyatini hesaplar (fiyat * adet)
    public static double calculateLineTotal(double productPrice, int quantity) {
        return productPrice * quantity;
    }

    // 2. Sepetteki 3 urunun ara toplamini hesaplar
    public static double calculateSubtotal(double line1, double line2, double line3) {
        return line1 + line2 + line3;
    }

    // 3. Indirim tutarini hesaplar (araToplam * (indirimYuzdesi / 100))
    public static double calculateDiscountAmount(double subtotal, double discountPercentage) {
        return subtotal * (discountPercentage / 100.0);
    }

    // 4. Indirimli fiyati hesaplar (araToplam - indirimTutari)
    public static double applyDiscount(double subtotal, double discountAmount) {
        return subtotal - discountAmount;
    }

    // 5. KDV tutarini hesaplar (indirimliTutar * kdvOrani)
    public static double calculateVAT(double discountedTotal, double vatRate) {
        return discountedTotal * vatRate;
    }

    // 6. Genel toplami hesaplar (indirimliTutar + KDV tutari + Kargo)
    public static double calculateGrandTotal(double discountedTotal, double vatAmount, double shippingFee) {
        return discountedTotal + vatAmount + shippingFee;
    }

    // --- ORNEK KULLANIM (Main Metodu) ---

    public static void main(String[] args) {
        // Ciktida ondalik ayirici olarak noktayi kullanmak icin
        java.util.Locale.setDefault(java.util.Locale.US);

        // --- GIRDI DEGERLERI ---
        // Urun 1
        final double PRICE_1 = 150.0;
        final int QTY_1 = 8;
        // Urun 2
        final double PRICE_2 = 60.0;
        final int QTY_2 = 2;
        // Urun 3
        final double PRICE_3 = 300.0;
        final int QTY_3 = 4;

        final double DISCOUNT_PERCENTAGE = 15.0; // %15 indirim

        // --- HESAPLAMA ADIMLARI ---

        // 1. Urun Satir Toplamlari
        double lineTotal1 = calculateLineTotal(PRICE_1, QTY_1); 
        double lineTotal2 = calculateLineTotal(PRICE_2, QTY_2); 
        double lineTotal3 = calculateLineTotal(PRICE_3, QTY_3); 

        // 2. Ara Toplam
        double subtotal = calculateSubtotal(lineTotal1, lineTotal2, lineTotal3); 

        // 3. Indirim Tutari
        double discountAmount = calculateDiscountAmount(subtotal, DISCOUNT_PERCENTAGE); 

        // 4. Indirimli Toplam
        double discountedTotal = applyDiscount(subtotal, discountAmount); 

        // 5. KDV Tutari
        double vatAmount = calculateVAT(discountedTotal, VAT_RATE); 

        // 6. Genel Toplam
        double grandTotal = calculateGrandTotal(discountedTotal, vatAmount, SHIPPING_FEE); 


        // --- SONUCLARI GOSTERME ---

        System.out.println("=== E-TICARET SEPET HESAPLAYICISI ===");
        System.out.println("\n--- URUN BILGILERI ---");
        System.out.printf("Urun 1: %.2f TL x %d Adet = %.2f TL%n", PRICE_1, QTY_1, lineTotal1);
        System.out.printf("Urun 2: %.2f TL x %d Adet = %.2f TL%n", PRICE_2, QTY_2, lineTotal2);
        System.out.printf("Urun 3: %.2f TL x %d Adet = %.2f TL%n", PRICE_3, QTY_3, lineTotal3);
        
        System.out.println("\n--- HESAPLAMA OZETI ---");
        System.out.printf("1. Ara Toplam (KDV'siz)  : %.2f TL%n", subtotal);
        System.out.printf("   Indirim Yuzdesi       : %.0f%%%n", DISCOUNT_PERCENTAGE);
        System.out.printf("2. Indirim Tutari        : -%.2f TL%n", discountAmount);
        System.out.printf("3. Indirimli Toplam      : %.2f TL%n", discountedTotal);
        System.out.printf("4. KDV Orani (%.0f%%)       : %.2f TL%n", VAT_RATE * 100, vatAmount);
        System.out.printf("5. Kargo Ucreti          : +%.2f TL%n", SHIPPING_FEE);
        
        System.out.println("------------------------------------");
        System.out.printf("6. GENEL TOPLAM              : %.2f TL%n", grandTotal);
        System.out.println("====================================");
    }
}
