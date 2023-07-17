package Lesson5;

class Phone {
    private String number;
    private String model;
    private float weight;

    public Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name,String number ) {
        System.out.println("Звонит " + name + " " + number);
    }
    public void sendMessage(String... d) {
        for(int i=1; i<d.length; i++){
            System.out.print(d[i]+ " ");
        }
    }

    public String getNumber() {
        return (number);
    }

    public String getModel() {
        return model;
    }

    public float getWeight() {
        return weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void PrintInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
