

//работники, должности и действия

public class Rab {

    private String name;
    private String doljnost;
    private int ZP;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDoljnost(String doljnost) {
        this.doljnost = doljnost;
    }

    public String getDoljnost() {
        return doljnost;
    }

    public void setZP(int ZP) {
        this.ZP = ZP;
    }

    public int getZP() {
        return ZP;
    }


    public void present() {
        System.out.println("Привет! Меня зовут " + getName() + ", я " + getDoljnost() + " и у меня зарплата " + getZP() + " рублей.");
    }


}

