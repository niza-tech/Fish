import java.time.LocalDate;


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
}