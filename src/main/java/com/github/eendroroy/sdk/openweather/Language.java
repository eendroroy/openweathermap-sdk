package com.github.eendroroy.sdk.openweather;

/**
 * @author indrajit
 */

public enum Language {
    AFRIKAANS("af"),
	ALBANIAN("al"),
	ARABIC("ar"),
	AZERBAIJANI("az"),
	BULGARIAN("bg"),
	CATALAN("ca"),
	CZECH("cz"),
	DANISH("da"),
	GERMAN("de"),
	GREEK("el"),
	ENGLISH("en"),
	BASQUE("eu"),
	PERSIAN("fa"),
	FARSI("fa"),
	FINNISH("fi"),
	FRENCH("fr"),
	GALICIAN("gl"),
	HEBREW("he"),
	HINDI("hi"),
	CROATIAN("hr"),
	HUNGARIAN("hu"),
	INDONESIAN("id"),
	ITALIAN("it"),
	JAPANESE("ja"),
	KOREAN("kr"),
	LATVIAN("la"),
	LITHUANIAN("lt"),
	MACEDONIAN("mk"),
	NORWEGIAN("no"),
	DUTCH("nl"),
	POLISH("pl"),
	PORTUGUESE("pt"),
	PORTUGUESE_BRASIL("pt_br"),
	ROMANIAN("ro"),
	RUSSIAN("ru"),
	SWEDISH1("sv"),
	SWEDISH2("se"),
	SLOVAK("sk"),
	SLOVENIAN("sl"),
	SPANISH1("sp"),
	SPANISH2("es"),
	SERBIAN("sr"),
	THAI("th"),
	TURKISH("tr"),
	UKRAINIAN1("ua"),
	UKRAINIAN2("uk"),
	VIETNAMESE("vi"),
	CHINESE_SIMPLIFIED("zh_cn"),
	CHINESE_TRADITIONAL("zh_tw"),
	ZULU("zu");

	private final String value;

	Language(String value) {
		this.value = value;
	}

	@Override
	public String toString(){
		return this.value;
	}

	public String value(){
		return this.value;
	}
}
