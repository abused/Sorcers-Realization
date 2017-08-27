package abused_master.spectral_wizardry.api;

public interface IMana {

    void fill(int amount);
    void consume(int amount);
    void setAmount(int amount);
    void setCapacity(int amount);

    void activationToggle(boolean toggle);
    boolean isActivated();

    int getMana();
    int getCapacity();
}
