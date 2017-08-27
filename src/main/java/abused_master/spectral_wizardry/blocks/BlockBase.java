package abused_master.spectral_wizardry.blocks;

import abused_master.spectral_wizardry.SpectralWizardry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {

    public BlockBase(Material material, String name) {
        super(material);
        this.setCreativeTab(SpectralWizardry.SpectralTab);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(1.0f);
    }
}
