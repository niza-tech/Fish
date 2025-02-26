public class Fish {
    //Attributes
private String name;
private String healthStatus;

//Constructur
        public Fish(String name, String healthStatus){
            this.name = name;
            this.healthStatus = "Healthy";
        }
        //Getters and setters

    public String getname(){
return name;

    }
    public String setname() {
        this.name = name;
    }

    public String gethealthStatus(){
            return healthStatus;
    }
        public String sethealthStatus() {
            this.healthStatus = healthStatus;
        }
        //Method to update healthstatus
        public void updateHealthStatus(String newHealthStatus){
            this.healthStatus = newHealthStatus;

        }
        public String toString(){
            return "Fish Name: " + name + , "Health Status: " + healthStatus;
        }
}


