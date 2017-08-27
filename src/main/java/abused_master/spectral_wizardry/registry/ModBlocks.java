package abused_master.spectral_wizardry.registry;

import abused_master.spectral_wizardry.blocks.TestBlock;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ModBlocks {

    public static Block TestBlock = new TestBlock();

    public static void initModels() {
        reg(TestBlock);
    }

    public static void reg(Block block) {
        ModelResourceLocation res = new
                ModelResourceLocation(block.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, res);
    }
}
