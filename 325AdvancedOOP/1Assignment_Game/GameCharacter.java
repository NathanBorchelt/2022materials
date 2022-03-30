public class GameCharacter {
    private String name;
    private int health;
    private int damage;
    private boolean alive;
    public GameCharacter(String n, int h, int d){
        name = n;
        health = h;
        damage = d;
        alive = true;
    }
    //getters and setters
    public boolean isAlive() { //a boolean value for assuring that only the living battle
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getDamage() {
        return damage;
    }
    public int getHealth() {
        return health;
    }
    public String getName() {
        return name;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void fight(GameCharacter gC){
        gC.getHurt(damage);//uses the damage of the attacker on the health of the victim
        System.out.printf("Dealing %d, %s has %d health left.\n", getDamage(), gC.getName(), gC.getHealth());
    }
    public void getHurt(int damageDelt){// seperate function in order to have seperate functions
                                        // and allow for the potential of poision damage functions
        health -= damageDelt;
        if(health<1){
            health = 0;
            alive = false;
        }
    }
    @Override
    public String toString() {
        return ("Name: "+name+"\nHealth: "+health+"\nDamage: "+damage);
    }
}
