import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        int sayi=scn.nextInt();
        int mukSayi=0;

        for (int i=1;i<sayi;++i){
            if (sayi%i==0){
                mukSayi+=i;
                //kontrol mekanizması
                System.out.println(mukSayi);
            }
        }

        if (sayi==mukSayi){
            System.out.println(sayi+" Mükemmel sayıdır.");
        }
        else{
            System.out.println(sayi+" Mükemmel sayı değildir.");
        }
    }
}
/*
*28/1**
* 28/2**
* 28/3
* 28/4**
* 28/5
* 28/6
* 28/7**
* 28/14**
* 1+2+4+7+14
*
*
*
* */