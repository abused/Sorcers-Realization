package abused_master.sorcerers_realization.blocks;

import abused_master.sorcerers_realization.SorcerersMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {

    public BlockBase(Material material, String name) {
        super(material);
        this.setCreativeTab(SorcerersMain.SorcerersTab);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(1.0f);
    }
}
