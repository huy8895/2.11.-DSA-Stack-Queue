package optionalCheckBracket;

public class CheckBracketTest {
    public static void main(String[] args) {
        String string = "s * (s – a) * (s – b) * (s – c)   ";
        CheckBracket checkBracket = new CheckBracket(string);
        System.out.println(checkBracket.isOK());
    }
}
