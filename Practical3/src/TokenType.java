import java.util.regex.Pattern;

public enum TokenType {
    NUMBER("[0-9]+"),
    ADD("\\+"),
    SPACE("[ \t\r\n]+");

    final Pattern pattern;

    TokenType(String regexp) {
        pattern = Pattern.compile(regexp);
    }
}
