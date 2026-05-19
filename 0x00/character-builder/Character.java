public abstract class Character {

    protected String name;
    protected CharacterType type;
    protected int intelligence;
    protected int strength;
    protected int endurance;
    protected int resilience;
    protected int dexterity;

    public Character(String name,
                     CharacterType type,
                     int intelligence,
                     int strength,
                     int endurance,
                     int resilience,
                     int dexterity) {

        this.name = name;
        this.type = type;
        this.intelligence = intelligence;
        this.strength = strength;
        this.endurance = endurance;
        this.resilience = resilience;
        this.dexterity = dexterity;
    }

    public abstract double getAttackDamage();

    @Override
    public String toString() {

        return String.format(
                "Character { name = %s, type = %s, intelligence = %d, strength = %d, endurance = %d, resilience = %d, dexterity = %d, attack damage = %.2f }",
                name,
                type,
                intelligence,
                strength,
                endurance,
                resilience,
                dexterity,
                getAttackDamage()
        );
    }
}
