public class Wizard extends GameCharacter {
    private int mana;
    public Wizard(String n, int h, int d) {
        super(n, h, d);
    }
    public Wizard(String n, int h, int d, int m) {
        super(n, h, d);
        mana = m;
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    @Override
    public void fight(GameCharacter gC) {
        System.out.printf("%s cast a spell on %s. ", super.getName(), gC.getName());
        mana--;
        super.fight(gC);
        //assure that they have the ability to continue fighting and removes them if they cannot
        if(mana == 0){
            super.setAlive(false);
            System.out.printf("Because %s ran out of mana, they retreated.\n",super.getName());
        }
        else{
            System.out.printf("%s now has %d mana remaining.\n", super.getName(), getMana());
        }
    }
    @Override
    public String toString() {
        return (super.toString()+"\nMana: "+mana);
    }
}
