public class Sponsor {
    private final String name;
    private final int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
    public void toSponsorRace(){
        System.out.printf("Спонсор %d проспансировал заезд на %d%n",name,amount);
    }
}
