import java.util.Random;
import com.Boy;
import com.Human;
public class TestInfrastructure {
    public static void main(String[] args) {
        Random random = new Random();
        int numberOfObjects = random.nextInt(8) + 3; 
        System.out.println("Random number of objects to create: " + numberOfObjects);
        for (int i = 1; i <= numberOfObjects; i++) {
            int choice = random.nextInt(4);
            switch (choice) {
                case 0:
                    Human h = new Human();
                    h.identify();
                    break;
                case 1:
                    Boy b = new Boy();
                    b.identify();
                    break;
                case 2:
                    Girl g = new Girl();
                    g.identify();
                    break;
                case 3:
                    Robot r = new Robot();
                    r.identify();
                    break;
            }
        }
        System.out.println("\nTotal Human Population: " + Human.getHumanCount());
    }
}
