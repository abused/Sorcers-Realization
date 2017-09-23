package abused_master.spectral_wizardry.api;

public interface IEssence {

    void fill(int amount);
    void consume(int amount);
    void setAmount(int amount);
    void setCapacity(int amount);

    int getEssence();
    int getCapacity();
}
