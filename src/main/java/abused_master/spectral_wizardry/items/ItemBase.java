package abused_master.spectral_wizardry.items;

import abused_master.spectral_wizardry.SpectralWizardry;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(String name) {
        super();
        this.setCreativeTab(SpectralWizardry.SpectralTab);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
    }
}
