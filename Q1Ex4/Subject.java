public class Subject {
    private String name;
    private double units;
    private int gradeLevel;

    public Subject(String name, double units, int gradeLevel) {
        this.name = name;
        this.units = units;
        this.gradeLevel = gradeLevel;
    }
    
    // if no arguments are given
    public Subject() {
        name = "Mathematics 2";
        units = 1.7;
        gradeLevel = 8;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}