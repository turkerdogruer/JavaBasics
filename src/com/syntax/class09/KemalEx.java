package com.syntax.class09;

public class KemalEx {
	public static void main(String[] args) {
		int[] sayilar= {10,20,30,40};
		int toplam=0;
		for(int dizi:sayilar) {
		toplam = toplam + dizi;
		//System.out.print(toplam+" ");
		}
		System.out.print("aha da bu dizideki sayilarin toplami "+toplam);
	}

}
