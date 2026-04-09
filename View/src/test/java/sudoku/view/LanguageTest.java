package sudoku.view;

import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LanguageTest {
    @Test
    void test_Language() {
        assertEquals("English", LanguageEnum.ENGLISH.toString());
        assertEquals("Polski", LanguageEnum.POLISH.toString());
    }

    @Test
    void test_InterfaceText() {
        LanguageEnum.setSelectedLanguage(LanguageEnum.ENGLISH);
        ResourceBundle resource = LanguageEnum.getResourceBundle();

        assertNotNull(resource, "English resource bundle is null");
        assertEquals("Modified by Vassiliy", resource.getString("MENU_TITLE"));
        assertEquals("New Game", resource.getString("START_GAME"));
        assertEquals("Exit Game", resource.getString("EXIT_GAME"));

        LanguageEnum.setSelectedLanguage(LanguageEnum.ENGLISH);
        resource = LanguageEnum.getResourceBundle();

        assertNotNull(resource, "Polish resource bundle is null");
        assertEquals("Sudoku Menu główne", resource.getString("MENU_TITLE"));
        assertEquals("Nowa gra", resource.getString("START_GAME"));
        assertEquals("Wyjdź z gry", resource.getString("EXIT_GAME"));
    }
}