package abused_master.spectral_wizardry.registry;

import abused_master.spectral_wizardry.items.SecretWand;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ModItems {

    public static Item SecretWand = new SecretWand();

    public static void initModels() {
        reg(SecretWand);
    }

    public static void reg(Item item) {
        ModelResourceLocation res = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, res);
    }
}
