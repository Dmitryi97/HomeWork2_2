public class ComparisonStudent {
    public void comparisonPowerMagic(Hogwarts student1, Hogwarts student2) {
        if ((student1.getPowerWitchcraft() + student1.getDistanceTransgression()) >
                (student2.getPowerWitchcraft() + student2.getDistanceTransgression())) {
            System.out.println(student1.getNameStudent() + " " + student1.getSurnameStudent() +
                    " обладает большей мощностью магии, чем  " + student2.getNameStudent() + " " + student2.getSurnameStudent());
        } else {
            System.out.println(student2.getNameStudent() + " " + student2.getSurnameStudent() +
                    " обладает большей мощностью магии, чем  " + student1.getNameStudent() + " " + student1.getSurnameStudent());
        }
    }

    public void comparisonStudentFacuity(Gryffindor student1, Gryffindor student2) {
        if ((student1.getNobility() + student1.getNonor() + student1.getBravery()) >
                (student2.getNobility() + student2.getNonor() + student2.getBravery())) {
            System.out.println(student1.getNameStudent() + " " + student1.getSurnameStudent() +
                    " лучший Грифиндорец, чем " + student2.getNameStudent() + " " + student2.getSurnameStudent());
        } else {
            System.out.println(student2.getNameStudent() + " " + student2.getSurnameStudent() +
                    " лучший Грифиндорец, чем " + student1.getNameStudent() + " " + student1.getSurnameStudent());
        }
    }

    public  void comparisonStudentFacuity(Puffenduy student1, Puffenduy student2) {
        if ((student1.getLikingForHardWork() + student1.getDevotion() + student1.getHonesty()) >
                (student2.getLikingForHardWork() + student2.getDevotion() + student2.getHonesty())) {
            System.out.println(student1.getNameStudent() + " " + student1.getSurnameStudent() +
                    " лучший Пуффиндуец, чем " + student2.getNameStudent() + " " + student2.getSurnameStudent());
        } else {
            System.out.println(student2.getNameStudent() + " " + student2.getSurnameStudent() +
                    " лучший Пуффиндуец, чем " + student1.getNameStudent() + " " + student1.getSurnameStudent());
        }
    }

    public  void comparisonStudentFacuity(Coctevran student1, Coctevran student2) {
        if ((student1.getMind() + student1.getWisdom() + student1.getWit() + student1.getCreativeWork()) >
                (student2.getMind() + student2.getWisdom() + student2.getWit() + student2.getCreativeWork())) {
            System.out.println(student1.getNameStudent() + " " + student1.getSurnameStudent() +
                    " лучший Коктевранец, чем " + student2.getNameStudent() + " " + student2.getSurnameStudent());
        } else {
            System.out.println(student2.getNameStudent() + " " + student2.getSurnameStudent() +
                    " лучший Коктевранец, чем " + student1.getNameStudent() + " " + student1.getSurnameStudent());
        }
    }

    public  void comparisonStudentFacuity(Slytherin student1, Slytherin student2) {
        if ((student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getThirstForPower()) >
                (student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getThirstForPower())) {
            System.out.println(student1.getNameStudent() + " " + student1.getSurnameStudent() +
                    " лучший Слизаренец, чем " + student2.getNameStudent() + " " + student2.getSurnameStudent());
        } else {
            System.out.println(student2.getNameStudent() + " " + student2.getSurnameStudent() +
                    " лучший Слизаренец, чем " + student1.getNameStudent() + " " + student1.getSurnameStudent());
        }
    }
}
