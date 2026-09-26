public class Main {
    public static void main(String[] args) {
        int toplam = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                int kup = i * i * i;
                toplam = toplam + kup;
                System.out.println(i + " sayısının küpü: " + kup + " | Güncel Toplam: " + toplam);
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("1-20 arası çift sayıların küplerinin genel toplamı: " + toplam);
    }
}
