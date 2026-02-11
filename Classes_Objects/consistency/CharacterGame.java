public class CharacterGame {

    private int currentHealth;
    private String name;
    private String status;

    public CharacterGame(int currentHealth, String name) {
        setName(name);
        setCurrentHealth(currentHealth);
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {

        if (currentHealth < 0) {
            currentHealth = 0;
        }

        if (currentHealth > 100) {
            currentHealth = 100;
        }

        this.currentHealth = currentHealth;

        if (this.currentHealth > 0) {
            this.status = "alive";
        } else {
            this.status = "dead";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name.trim().isEmpty()) {
            return;
        }

        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void takeDamage(int damageAmount) {
        setCurrentHealth(this.currentHealth - damageAmount);
    }

    public void receiveHealing(int healingAmount) {
        setCurrentHealth(this.currentHealth + healingAmount);
    }
}
