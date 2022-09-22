public class Subject {
    String name;
    double units;
    int gradeLevel;

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
}