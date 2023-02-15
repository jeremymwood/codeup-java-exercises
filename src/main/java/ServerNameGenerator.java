import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    //alt method for randoms
    private static Random random = new Random();

    //probably dont need to access these arrays again, so they are private
    private static String[] adjectives = {"odd", "comprehensive", "shrill", "simplistic", "healthy", "obese", "square", "kaput", "fluffy", "squealing"};

    private static String[] nouns = {"loss", "leadership", "church", "member", "procedure", "confusion", "magazine", "childhood", "elevator", "protection"};

    public static String getRandomString(String [] strings) {
        int ranNum = random.nextInt(strings.length);
        return strings[ranNum];
    }

    public static void main(String[] args) {

        String ranNoun = getRandomString(nouns);
        String ranAdj = getRandomString(adjectives);
        System.out.printf("""
                Here is your server:
                %s-%s
                """, ranNoun, ranAdj);


//        int lowerBound = 0;
//        int upperBound = adjectives.length;
//        int range = upperBound - lowerBound;
//        int random = (int)(Math.random() * range) + lowerBound;
//        System.out.printf("Here is your server name:\n%s-%s", adjectives[random], nouns[random]);
    }


}
