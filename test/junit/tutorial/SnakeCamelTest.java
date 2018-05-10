package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class SnakeCamelTest {

	@Test
	public void capitalizeで空文字を空文字に変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "";
		String actual = scu.capitalize("");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeでaをAに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "A";
		String actual = scu.capitalize("a");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeでabcをAbcに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = scu.capitalize("abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeで空文字を空文字に変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "";
		String actual = scu.capitalize("");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeでAをaに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "a";
		String actual = scu.uncapitalize("A");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeでAbcをabcに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc";
		String actual = scu.uncapitalize("Abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでabcをAbcに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = scu.snakeToCamelcase("abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでabc_defをAbcDefに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = scu.snakeToCamelcase("abc_def");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでabc_def_ghをAbcDefGhに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = scu.snakeToCamelcase("abc_def_gh");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでabc__def___ghをAbcDefGhに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = scu.snakeToCamelcase("abc__def___gh");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseで_abc_def__をAbcDefに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = scu.snakeToCamelcase("_abc_def__");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでabc_def_ghiをAbcDefGhiに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual = scu.snakeToCamelcase("abc_def_ghi");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでAbcをabcに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc";
		String actual = scu.camelToSnakecase("Abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでAbcDefをabc_defに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = scu.camelToSnakecase("AbcDef");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでAbcDefGhiをabc_def_ghiに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = scu.camelToSnakecase("AbcDefGhi");
		assertThat(actual, is(expected));
	}

	
}
