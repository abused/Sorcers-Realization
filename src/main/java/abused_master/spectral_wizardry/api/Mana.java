package abused_master.spectral_wizardry.api;

/**
 * Default IMana implementation
 */
public class Mana implements IMana {

    private int manaStored;
    private int capacity;
    private boolean isActivated = false;

    public Mana(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Fills the player's mana with the specified amount
     */
    @Override
    public void fill(int amount) {
        int availableStorage = capacity - manaStored;
        if(availableStorage >= amount) {
            manaStored += amount;
        }else {
            manaStored = capacity;
        }

        if (this.manaStored > capacity) {
            this.manaStored = capacity;
        } else if (this.manaStored < 0) {
            this.manaStored = 0;
        }
    }

    /**
     * Consumes the player's mana with the specified amount
     */
    @Override
    public void consume(int amount) {
        if(manaStored >= amount) {
            this.manaStored -= amount;
        }

        if (this.manaStored < 0) {
            this.manaStored = 0;
        }
    }

    /**
     * Sets the player's mana stored to the specified amount
     */
    @Override
    public void setAmount(int amount) {
        this.manaStored = amount;

        if (manaStored > capacity) {
            manaStored = capacity;
        }else if(this.manaStored < 0) {
            this.manaStored = 0;
        }
    }

    /**
     * Sets the player's max mana capacity to the specified amount
     */
    @Override
    public void setCapacity(int amount) {
        this.capacity = amount;
    }

    /**
     * Toggles whether the player has achieved access to mana
     */
    @Override
    public void activationToggle(boolean toggle) {
        this.isActivated = toggle;
    }

    /**
     * Returns whether player's access to mana is true/false
     */
    @Override
    public boolean isActivated() {
        return isActivated;
    }

    /**
     * returns the player's mana stored
     */
    @Override
    public int getMana() {
        return manaStored;
    }

    /**
     * Returns the player's mana capacity
     */
    @Override
    public int getCapacity() {
        return capacity;
    }
}
