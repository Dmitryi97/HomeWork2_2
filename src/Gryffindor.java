import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int nonor;
    private int bravery;

    public Gryffindor(String nameStudent, String surnameStudent, int powerWitchcraft, int distanceTransgression,
                      int nobility, int nonor, int bravery) {
        super(nameStudent, surnameStudent, powerWitchcraft, distanceTransgression);
        this.nobility = nobility;
        this.nonor = nobility;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getNonor() {
        return nonor;
    }

    public void setNonor(int nonor) {
        this.nonor = nonor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
