package info.dmerej;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTest {
    @Test
    void parse_operation_from_string_should_return_command() {
        var input = "+ <description>";

        var expected = List.of("+", "<description>");
        assertEquals(expected,InputParser.parse(input));
    }
}
