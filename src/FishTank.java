
import java.time.LocalDateTime;
import java.util.Scanner;

public class FishTank {

    private String lastWaterChange;
    private String waterQuality;

    public FishTank(String lastWaterChange, String waterQuality) {
        this.lastWaterChange = lastWaterChange;
        this.waterQuality = waterQuality;
    }

    public enum waterQuality {
        perfekt, godt, okay, dårlig
    }

    //Method to update water info
    public void changeWater(Scanner scanner) {
        System.out.println(LocalDateTime.now() + "Enter comment: ");
        String comment = scanner.nextLine();
    }
    public String toString(){
        return "Last water change: " + name + , "Health Status: " + healthStatus;
}