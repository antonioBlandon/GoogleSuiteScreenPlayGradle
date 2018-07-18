package co.com.bancolombia.certification.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleTranslatePage;

public class Translate implements Task {
	
	private Target sourceLanguage;
	private Target targetLanguage;
	
	private String word;
	
	public Translate(String word, Target sourceLanguage, Target targetLanguage) {
		this.word = word;
		this.sourceLanguage = sourceLanguage;
		this.targetLanguage = targetLanguage;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_OPTION), 
				Click.on(sourceLanguage), 
				Click.on(GoogleTranslatePage.TARGET_LANGUAGE_OPTION), 
				Click.on(targetLanguage), 
				Enter.theValue(word).into(GoogleTranslatePage.SOURCE_LANGUAGE_TEXT_AREA),
				Click.on(GoogleTranslatePage.TRANSLATE_BUTTON)
		);
	}

	public static Translate the(String word, Target sourceLanguage, Target targetLanguage) {
		return instrumented(Translate.class, word, sourceLanguage, targetLanguage);
	}

}
