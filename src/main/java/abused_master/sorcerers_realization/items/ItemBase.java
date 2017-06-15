package abused_master.sorcerers_realization.items;

import abused_master.sorcerers_realization.SorcerersMain;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(String name) {
        super();
        this.setCreativeTab(SorcerersMain.SorcerersTab);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
    }
}
