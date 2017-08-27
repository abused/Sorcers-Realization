package abused_master.spectral_wizardry.blocks;

import abused_master.spectral_wizardry.api.IMana;
import abused_master.spectral_wizardry.network.capability.ManaProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class TestBlock extends BlockBase {

    //public boolean activated = false;

    public TestBlock() {
        super(Material.GROUND, "test_block");
        this.setCreativeTab(null);
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(player.hasCapability(ManaProvider.CAPABILITY_MANA, null)) {
            IMana mana = player.getCapability(ManaProvider.CAPABILITY_MANA, null);
            if(!mana.isActivated()) {
                mana.setCapacity(10000);
                mana.setAmount(mana.getCapacity());
                mana.activationToggle(true);
            }
            if(world.isRemote)
                player.sendMessage(new TextComponentString("Mana Stored: " + mana.getMana() +  "/ " + mana.getCapacity()));
        }
        return super.onBlockActivated(world, pos, state, player, hand, facing, hitX, hitY, hitZ);
    }
}
