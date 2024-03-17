


import java.util.Scanner;


public class BodyMassIndex {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    double kilo;
    double boy;
    double sonuc;
        System.out.print("Lütfen Kilonuzu giriniz Örnek:72kg:  ");
        kilo= input.nextDouble();


        Scanner output = new Scanner(System.in);
        System.out.print("Lüften Boyunuzu Giriniz: ");
        boy= input.nextDouble();


      sonuc =  (kilo)/ (boy*boy);

        System.out.print("Vucut Kitle İndexiniz;"+sonuc);


    }
}