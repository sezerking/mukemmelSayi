package com.company;

public class Main {

    public static void main(String[] args) {
	
        int mukemmelSayi=28;
        int p=0;
        int[] pozitifBolenler = new int[mukemmelSayi];

        for (int i=1; i<mukemmelSayi;i++) {
            if (mukemmelSayi%i==0){
                pozitifBolenler[p]=i;
                p++;
            }
        }
        int sum=0;

        for (int sayilar: pozitifBolenler) {
            sum=sum+sayilar;
        }
        if (mukemmelSayi==sum){
            System.out.println(mukemmelSayi+" mükemmel bir sayıdır");
        }
        else if(mukemmelSayi!=sum){
            System.out.println(mukemmelSayi+" mükemmel bir sayı değildir");
        }
        
    }
}
