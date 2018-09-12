package twentyeight;

public class MyMainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number[]= {10,20,30,40};
int num[]=new int[4];
num[0]=50;
num[1]=60;
num[2]=70;
num[3]=80;
for (int i = 0; i < number.length; i++) {
	System.out.println(number[i]);
}
for (int i : num) {
	System.out.println(i);
}
int num1[][]= {{10,20},{30,40}};
for (int i = 0; i < num1.length; i++) {
	for (int j = 0; j < num1.length; j++) {
		System.out.println(num1[i][j]);
	}
	System.out.println("\n");
}

int []num2[]=new int[1][3];
int num3[][]=new int[3][];
int num4[][]=new [1]int[];
int num5[][]=new int[][];

	}

}
