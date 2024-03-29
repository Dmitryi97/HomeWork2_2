public class PrintStudent {
    public void print(Hogwarts student) {
        System.out.println("Студент: " + student.getNameStudent() + " " + student.getSurnameStudent() + "." +
                " Мощность магии: " + student.getPowerWitchcraft() +
                " Расстояние трансгрессирования: " + student.getDistanceTransgression());
    }

    public void print(Gryffindor student) {
        System.out.println("Студент факультета Грифендор: " + student.getNameStudent() + " " + student.getSurnameStudent() + "." +
                " Мощность магии: " + student.getPowerWitchcraft() +
                " Расстояние трансгрессирования: " + student.getDistanceTransgression() + "\n" +
                " Благородство = " + student.getNobility() +
                " Честь = " + student.getNonor() +
                " Храбрость = " + student.getBravery());
    }

    public void print(Puffenduy student) {
        System.out.println("Студент факультета Пуфендуй: " + student.getNameStudent() + " " + student.getSurnameStudent() + "." +
                " Мощность магии: " + student.getPowerWitchcraft() +
                " Расстояние трансгрессирования: " + student.getDistanceTransgression() + "\n" +
                " Трудолюбие = " + student.getLikingForHardWork() +
                " Вернось = " + student.getDevotion() +
                " Честность = " + student.getHonesty());
    }

    public void print(Coctevran student) {
        System.out.println("Студент факультета Коктевран: " + student.getNameStudent() + " " + student.getSurnameStudent() + "." +
                " Мощность магии: " + student.getPowerWitchcraft() +
                " Расстояние трансгрессирования: " + student.getDistanceTransgression() + "\n" +
                " Ум = " + student.getMind() +
                " Мудрость = " + student.getWisdom() +
                " Остроумие = " + student.getWit() +
                " Творчество = " + student.getCreativeWork());
    }

    public void print(Slytherin student) {
        System.out.println("Студент факультета Слизарен: " + student.getNameStudent() + " " + student.getSurnameStudent() + "." +
                " Мощность магии: " + student.getPowerWitchcraft() +
                " Расстояние трансгрессирования: " + student.getDistanceTransgression() + "\n" +
                " Хитрость = " + student.getCunning() +
                " Решительность = " + student.getDetermination() +
                " Амбициозность = " + student.getAmbition() +
                " Находчивость = " + student.getResourcefulness() +
                " Жажда власти = " + student.getThirstForPower());
    }
}
