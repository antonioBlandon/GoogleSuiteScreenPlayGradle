package co.com.bancolombia.certification.googlesuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class GoogleTranslatePage {

	public static final Target SOURCE_LANGUAGE_OPTION = Target.the("Source Language Button").located(By.id("gt-sl-gms"));
	public static final Target TARGET_LANGUAGE_OPTION = Target.the("Target Language Button").located(By.id("gt-tl-gms"));
	public static final Target SOURCE_LANGUAGE_TEXT_AREA = Target.the("Source language text area").located(By.id("source"));
	public static final Target TARGET_LANGUAGE_TEXT_AREA = Target.the("Target language text area").located(By.id("gt-res-dir-ctr"));
	public static final Target TRANSLATE_BUTTON = Target.the("Translate Button").located(By.id("gt-submit"));
	
	public static Target getTargetSourceLanguage(String language) {
		return Target.the("Source Language").locatedBy(String.format("//div[@id='gt-sl-gms-menu']/table/tbody/tr/td//div[contains(text(), '%s')]", language));
	}
	
	public static Target getTargetTargetLanguage(String language) {
		return Target.the("Target Language").locatedBy(String.format("//div[@id='gt-tl-gms-menu']/table/tbody/tr/td//div[contains(text(), '%s')]", language));
	}
	
}
