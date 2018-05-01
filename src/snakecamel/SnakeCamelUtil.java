package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_", -1); //空文字も全て配列に格納する
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length ; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i); //i番目の文字をcに代入
			if (Character.isUpperCase(c)) { //もしcが大文字なら
				sb.append(camelcase.substring(j, i)); //j番目からi番目までの文字列を取得、sbに追加
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c)); //cを小文字にしてsbに追加
				j = i+1;
			}
		}
		sb.append(camelcase.substring(j)); //j番目から最後までの文字列を取得
		return new String(sb);
	}
	
	public static String capitalize(String s) {
		if(s.length() == 0) { return ""; } //空文字なら空文字を返す
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	public static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}
