public class Superhero {
    // Instance variables
    private String name;
    private String costume;
    private String weapon;
    private boolean life;
    private int weaponStrength;

    // 1. Updated Default Constructor
    public Superhero() {
        this.name = "No name";
        this.costume = "a t-shirt";
        this.weapon = "fist";
        this.life = true;
        this.weaponStrength = 0;
    }

    // Parameterized Constructor (3 arguments)
    public Superhero(String name, String costume, String weapon) {
        this.name = name;
        this.costume = costume;
        this.weapon = weapon;
        this.life = true;
        this.weaponStrength = (int)(Math.random() * 10) + 1;
    }

    // Parameterized Constructor (4 arguments)
    public Superhero(String name, String costume, String weapon, int weaponStrength) {
        this.name = name;
        this.costume = costume;
        this.weapon = weapon;
        this.life = true;
        this.weaponStrength = weaponStrength;
    }

    // 2.1 specialAttack Method
    public int specialAttack(int powerLevel) {
        int randomBonus = (int)(Math.random() * powerLevel) + 1;
        return this.weaponStrength + randomBonus;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCostume() {
        return costume;
    }

    public String getWeapon() {
        return weapon;
    }

    public boolean isAlive() {
        return life;
    }

    public int getWeaponStrength() {
        return weaponStrength;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    // 2.2 Overloaded setWeaponStrength (Random 1-10)
    public void setWeaponStrength() {
        this.weaponStrength = (int)(Math.random() * 10) + 1;
    }

    // 2.3 setWeaponStrength with argument
    public void setWeaponStrength(int weaponStrength) {
        this.weaponStrength = weaponStrength;
    }

    // toString Method
    public String toString() {
        return "Superhero Name: " + name + "\n" +
               "Costume: " + costume + "\n" +
               "Weapon: " + weapon + " (Strength: " + weaponStrength + ")\n" +
               "Status: " + (life ? "Alive" : "Defeated");
    }