public class Fish {
    //Attributes
    private String name;
    private String healthStatus;

    //Constructor
    public Fish(String name, String healthStatus) {
        this.name = name;
        this.healthStatus = "Healthy";
    }

    //Getters and setters

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String gethealthStatus() {
        return healthStatus;
    }

    public void sethealthStatus() {
        this.healthStatus = healthStatus;
    }

    //Method to update healthstatus
    public void updateHealthStatus(String newHealthStatus) {
        this.healthStatus = newHealthStatus;

    }

    public String toString() {
        System.out.println("FishList:");
        return "Fish Name: " + name + "Health Status: " + healthStatus;
    }

}



