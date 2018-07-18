package co.com.bancolombia.certification.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {
	
	public static final Target GOOGLE_APPS = Target.the("Google apps button").located(By.id("gbwa"));
	//public static final Target GOOGLE_APPS_MORE = Target.the("Google apps button more").located(By.id("gbwa"));
	public static final Target GOOGLE_TRANSLATE = Target.the("Google Translate Option").located(By.id("gb51"));

}
