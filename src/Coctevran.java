public class Coctevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativeWork;

    public Coctevran(String nameStudent, String surnameStudent, int powerWitchcraft, int distanceTransgression,
                     int mind, int wisdom, int wit, int creativeWork) {
        super(nameStudent, surnameStudent, powerWitchcraft, distanceTransgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativeWork = creativeWork;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativeWork() {
        return creativeWork;
    }

    public void setCreativeWork(int creativeWork) {
        this.creativeWork = creativeWork;
    }
}
