
import java.time.LocalDateTime;
import java.util.Scanner;

public class FishTank {

    private String lastWaterChange;
    private WaterQuality waterQuality;
    private Fish Wogglie;
    private Fish Swimmie;

    public FishTank(String lastWaterChange, WaterQuality waterQuality) {
        this.lastWaterChange = lastWaterChange;
        this.waterQuality = waterQuality;

        this.Wogglie = new Fish("Wogglie", "Healthy");
        this.Swimmie = new Fish("Svimmie", "Healthy");
    }



    //Method to update water info
    public void changeWater(Scanner scanner) {
        lastWaterChange = LocalDateTime.now().toString();
        System.out.println(lastWaterChange + "Enter comment: ");
        String comment = scanner.nextLine();

    }

    public String toString() {
        return "Last water change: " + lastWaterChange;
    }
}
