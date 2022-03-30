public class Archer extends GameCharacter {
    private int arrows;
    public Archer(String n, int h, int d) {
        super(n, h, d);
    }
    public Archer(String n, int h, int d, int a) {
        super(n, h, d);
        arrows = a;
    }
    public int getArrows() {
        return arrows;
    }
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    @Override
    public void fight(GameCharacter gC) {
        System.out.printf("%s shot %s. ", super.getName(), gC.getName());
        arrows--;
        super.fight(gC);
        //assure that they have the ability to continue fighting and removes them if they cannot
        if(arrows == 0){
            super.setAlive(false);
            System.out.printf("Because %s ran out of arrows, they retreated.\n",super.getName());
        }
        else{
            System.out.printf("%s now has %d arrows remaining.\n", super.getName(), getArrows());
        }
    }
    @Override
    public String toString() {
        return (super.toString()+"\nArrows: "+arrows);
    }
}
