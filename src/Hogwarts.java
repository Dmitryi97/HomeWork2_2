public class Hogwarts {
    private String nameStudent;
    private String surnameStudent;
    private int powerWitchcraft;
    private int distanceTransgression;

    public Hogwarts(String nameStudent, String surnameStudent, int powerWitchcraft, int distanceTransgression) {
        this.nameStudent = nameStudent;
        this.surnameStudent = surnameStudent;
        this.powerWitchcraft = powerWitchcraft;
        this.distanceTransgression = distanceTransgression;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getSurnameStudent() {
        return surnameStudent;
    }

    public void setSurnameStudent(String surnameStudent) {
        this.surnameStudent = surnameStudent;
    }

    public int getPowerWitchcraft() {
        return powerWitchcraft;
    }

    public void setPowerWitchcraft(int powerWitchcraft) {
        this.powerWitchcraft = powerWitchcraft;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        this.distanceTransgression = distanceTransgression;
    }
}
