package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ParserTest {

    @Test
    void parse_remove_operation() {
        var input = "- id";
        String[] expected = {"-", "id"};
        assertArrayEquals(expected, InputParser.parse(input));
    }

    @Test
    void parse_add_operation() {
        var input = "+ Ma nouvelle tâche";
        String[] expected = {"+", "Ma nouvelle tâche"};
        assertArrayEquals(expected, InputParser.parse(input));
    }

    @Test
    void parse_quit_operation() {
        var input = "q";
        String[] expected = {"q"};
        assertArrayEquals(expected, InputParser.parse(input));
    }

}
