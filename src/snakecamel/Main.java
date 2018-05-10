package snakecamel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String st;
		if(s.matches(".*_.*")){
        	st = SnakeCamelUtil.snakeToCamelcase(s);
		}else if(s.matches("[a-z].*")){
			st = SnakeCamelUtil.snakeToCamelcase(s);
		}else{
            st = SnakeCamelUtil.camelToSnakecase(s);
		}
        System.out.println(st);
	}
}
