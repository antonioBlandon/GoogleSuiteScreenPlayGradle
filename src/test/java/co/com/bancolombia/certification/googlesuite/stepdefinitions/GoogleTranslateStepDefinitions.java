package co.com.bancolombia.certification.googlesuite.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.googlesuite.tasks.GoTo;
import co.com.bancolombia.certification.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.googlesuite.tasks.Translate;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleHomePage;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleTranslatePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor antonio = Actor.named("Antonio");
	
	private GoogleHomePage googleHomePage;
	
	@Before
	public void setUp() {
		antonio.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that Antonio wants to translate a word$")
	public void thatAntonioWantsToTranslateAWord() {
		// Precondiciones: Estar en google translate
		antonio.wasAbleTo(OpenTheBrowser.on(googleHomePage), 
				GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
	}


	@When("^he translates the word cheese from english to spanish$")
	public void heTranslatesTheWordCheeseFromEnglishToSpanish() {
		// Condiciones: Traducir una palabra de inglés a español
		antonio.wasAbleTo(Translate.the("cheese", GoogleTranslatePage.getTargetSourceLanguage("Inglés"), GoogleTranslatePage.getTargetTargetLanguage("Italiano")));
	}

	@Then("^he should see the word queso in the screen$")
	public void heShouldSeeTheWordQuesoInTheScreen() {
	    // Consecuencias: Aparece la palabra traducida -> Verificarlo
	}

}
