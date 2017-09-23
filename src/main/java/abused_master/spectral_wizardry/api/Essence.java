package abused_master.spectral_wizardry.api;

/**
 * Default IEssence implementation
 */
public class Essence implements IEssence {

    private int essenceStored = 0;
    private int capacity = 0;

    public Essence() {
    }

    public Essence(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Fills the object's essence with the specified amount
     */
    @Override
    public void fill(int amount) {
        int availableStorage = capacity - essenceStored;
        if(availableStorage >= amount) {
            essenceStored += amount;
        }else {
            essenceStored = capacity;
        }

        if (this.essenceStored > capacity) {
            this.essenceStored = capacity;
        } else if (this.essenceStored < 0) {
            this.essenceStored = 0;
        }
    }

    /**
     * Consumes the object's essence with the specified amount
     */
    @Override
    public void consume(int amount) {
        if(essenceStored >= amount) {
            this.essenceStored -= amount;
        }

        if (this.essenceStored < 0) {
            this.essenceStored = 0;
        }
    }

    /**
     * Sets the object's essence stored to the specified amount
     */
    @Override
    public void setAmount(int amount) {
        this.essenceStored = amount;

        if (essenceStored > capacity) {
            essenceStored = capacity;
        }else if(this.essenceStored < 0) {
            this.essenceStored = 0;
        }
    }

    /**
     * Sets the object's max essence capacity to the specified amount
     */
    @Override
    public void setCapacity(int amount) {
        this.capacity = amount;
    }

    /**
     * returns the objects's essence stored
     */
    @Override
    public int getEssence() {
        return essenceStored;
    }

    /**
     * Returns the objects's essence capacity
     */
    @Override
    public int getCapacity() {
        return capacity;
    }
}
