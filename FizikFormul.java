/*
 * Ad Soyad: Çağan Ahmet Erdoğan
 * Ogrenci No: 250541059
 * Tarih: 13/11/2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

public class FizikFormul {

    // Formüllerden ve Sabitlerden alınmıştır.
    // Yerçekimi ivmesi (g)
    final static double GRAVITY = 9.8; // m/s²

    // --- ZORUNLU METOTLAR ---

    // 1. Hız hesapla (v = s / t)
    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    // 2. İvme hesapla (a = Δv / t)
    public static double calculateAcceleration(double velocityChange, double time) {
        return velocityChange / time;
    }

    // 3. Kuvvet hesapla (F = m * a)
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // 4. İş hesapla (W = F * d)
    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    // 5. Güç hesapla (P = W / t)
    public static double calculatePower(double work, double time) {
        return work / time;
    }

    // 6. Kinetik enerji (KE = 0.5 * m * v²)
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * velocity * velocity;
    }

    // 7. Potansiyel enerji (PE = m * g * h)
    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        return mass * gravity * height;
    }

    // 8. Momentum (p = m * v)
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }

    // --- ÖRNEK KULLANIM (Main Metodu) ---

    public static void main(String[] args) {
        // Çıktıda ondalık ayırıcı olarak noktayı kullanmak için
        java.util.Locale.setDefault(java.util.Locale.US);

        // --- GİRDİ DEĞERLERİ ---
        final double M = 50.0; // Kütle (m) kg
        final double S = 150.0; // Mesafe (s) metre
        final double T = 10.0; // Zaman (t) saniye
        final double DV = 25.0; // Hız Değişimi (Δv) m/s
        final double H = 20.0; // Yükseklik (h) metre

        // --- ARACIL HESAPLAMALAR ---
        
        // 1. Hız
        double V = calculateVelocity(S, T); // 150 / 10 = 15.0 m/s
        
        // 2. İvme
        double A = calculateAcceleration(DV, T); // 25 / 10 = 2.5 m/s²
        
        // 3. Kuvvet (F)
        double F = calculateForce(M, A); // 50 * 2.5 = 125.0 N
        
        // 4. İş (W)
        double W = calculateWork(F, S); // 125.0 * 150 = 18750.0 J

        // 5. Güç (P)
        double P = calculatePower(W, T); // 18750.0 / 10 = 1875.0 W

        // 6. Kinetik Enerji (KE)
        double KE = calculateKineticEnergy(M, V); // 0.5 * 50 * 15² = 5625.0 J

        // 7. Potansiyel Enerji (PE)
        double PE = calculatePotentialEnergy(M, GRAVITY, H); // 50 * 9.8 * 20 = 9800.0 J

        // 8. Momentum (p)
        double p = calculateMomentum(M, V); // 50 * 15 = 750.0 kg·m/s


        // --- SONUÇLARI GÖSTERME ---
        
        System.out.println("=== FİZİKSEL BÜYÜKLÜK HESAPLAYICISI ===");
        System.out.println("\n--- GİRDİ DEĞERLERİ ---");
        System.out.printf("Kütle (m)             : %.1f kg%n", M);
        System.out.printf("Mesafe (s/d)          : %.1f m%n", S);
        System.out.printf("Zaman (t)             : %.1f s%n", T);
        System.out.printf("Hız Değişimi (Δv)     : %.1f m/s%n", DV);
        System.out.printf("Yükseklik (h)         : %.1f m%n", H);
        System.out.printf("Yerçekimi (g)         : %.1f m/s²%n", GRAVITY);
        
        System.out.println("\n--- HESAPLAMA SONUÇLARI ---");
        
        System.out.printf("1. Hız (v) [s/t]      : %.2f m/s%n", V); 
        System.out.printf("2. İvme (a) [Δv/t]    : %.2f m/s²%n", A); 
        System.out.printf("3. Kuvvet (F) [m*a]   : %.2f Newton%n", F);
        System.out.printf("4. İş (W) [F*d]       : %.2f Joule%n", W);
        System.out.printf("5. Güç (P) [W/t]      : %.2f Watt%n", P);
        System.out.printf("6. Kinetik Enerji (KE): %.2f Joule%n", KE);
        System.out.printf("7. Potansiyel Enerji (PE): %.2f Joule%n", PE);
        System.out.printf("8. Momentum (p)       : %.2f kg·m/s%n", p);

        System.out.println("\n=========================================");
    }
}
