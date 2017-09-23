package abused_master.spectral_wizardry.items;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class SecretWand extends ItemBase {

    public SecretWand() {
        super("secret_wand");
        this.setCreativeTab(null);
        this.setMaxStackSize(1);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(I18n.format("&d&k&lhasvdghvDFUY").replace("&", "\u00a7"));
        tooltip.add(I18n.format("&a&nWand of Mystery").replace("&", "\u00a7"));
        tooltip.add(I18n.format("&d&k&lhasvdghvDFUY").replace("&", "\u00a7"));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
