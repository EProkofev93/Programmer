public class Programmer {

    private String name;
    private String company;

    private String position = "intern";

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public String work() {
        if (position == "intern") {
            position = "junior";
            return position;
        }
        if (position == "junior") {
            position = "middle";
            return position;
        }
        if (position == "middle") {
            position = "senior";
            return position;
        }
        if (position == "senior") {
            position = "leed";
            return position;
        }
        return position;

    }
}
