public class Main {
    public static void main(String[] args) {
        HumanIMB human = new HumanIMB(80, 1.52);
        System.out.println(human.getResult());
    }
}

class HumanIMB {
    private double weight;
    private double height;

    public HumanIMB(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateIMB() {
        return weight / (height * height);
    }

    public String getResult() {
        double imb = calculateIMB();
        if (imb < 18.5) return "Deficit";
        if (imb < 25) return "Norm";
        if (imb < 30) return "Warning!";
        return "Fat";
    }
}