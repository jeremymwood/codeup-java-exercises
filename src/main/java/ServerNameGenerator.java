import java.util.Arrays;

public class ServerNameGenerator {


    public static void main(String[] args) {
    String[] adjectives = {"odd", "comprehensive", "shrill", "simplistic", "healthy", "obese", "square", "kaput", "fluffy", "squealing"};

    String[] nouns = {"loss", "leadership", "church", "member", "procedure", "confusion", "magazine", "childhood", "elevator", "protection"};

    int lowerBound = 0;
    int upperBound = adjectives.length;
    int range = upperBound - lowerBound;
    int random = (int)(Math.random() * range) + lowerBound;
    System.out.printf("Here is your server name:\n%s-%s", adjectives[random], nouns[random]);
    }


}
