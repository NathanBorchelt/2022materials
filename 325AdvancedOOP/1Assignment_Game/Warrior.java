public class Warrior extends GameCharacter {
    private int stamina;
    public Warrior(String n, int h, int d, int s) {
        super(n, h, d);
        stamina = s;
    }
    public Warrior(String n, int h, int d) {
        super(n, h, d);
    }
    public int getStamina() {
        return stamina;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    @Override
    public void fight(GameCharacter gC) {
        System.out.printf("%s hit %s with their sword. ", super.getName(), gC.getName());
        stamina--;
        super.fight(gC);
        //assure that they have the ability to continue fighting and removes them if they cannot
        if(stamina == 0){
            super.setAlive(false);
            System.out.printf("Because %s ran out of stamina, they retreated.\n",super.getName());
        }
        else{
            System.out.printf("%s now has %d stamina remaining.\n", super.getName(), getStamina());
        }
    }
    @Override
    public String toString() {
        return (super.toString()+"\nStamina: "+stamina);
    }
}
