public class Puffenduy extends Hogwarts {
    private int likingForHardWork;
    private int devotion;
    private int honesty;

    public Puffenduy(String nameStudent, String surnameStudent, int powerWitchcraft, int distanceTransgression,
                     int likingForHardWork, int devotion, int honesty) {
        super(nameStudent, surnameStudent, powerWitchcraft, distanceTransgression);
        this.likingForHardWork = likingForHardWork;
        this.devotion = devotion;
        this.honesty = honesty;
    }

    public int getLikingForHardWork() {
        return likingForHardWork;
    }

    public void setLikingForHardWork(int likingForHardWork) {
        this.likingForHardWork = likingForHardWork;
    }

    public int getDevotion() {
        return devotion;
    }

    public void setDevotion(int devotion) {
        this.devotion = devotion;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
