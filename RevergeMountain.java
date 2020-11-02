package mycat;

public class RevergeMountain {
	public static void main(String[] args) {
		RevergeMountain obj=new RevergeMountain();
		obj.converter(5);
	}
	public void converter(int x) {
		int k=0;
		int number=1;
		for(int i=x;i>=1;i--, k=0, number=1) {
			for(int count=0;count<x-i;count++) {
				System.out.print(" ");
			}
			while(k !=2*i-1) {
				System.out.print(number);
				k++;
				number++;
			}
			System.out.println();
		}
	}
}
