package abused_master.spectral_wizardry;

import abused_master.spectral_wizardry.proxy.CommonProxy;
import abused_master.spectral_wizardry.registry.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SpectralWizardry.MODID, name = SpectralWizardry.MODNAME, version = SpectralWizardry.VERSION)
public class SpectralWizardry {

    public static final String MODID = "spectralw";
    public static final String MODNAME = "Spectral Wizardry";
    public static final String VERSION = "1.0.0_1.12";

    @SidedProxy(clientSide = "abused_master.spectral_wizardry.proxy.ClientProxy", serverSide = "abused_master.spectral_wizardry.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        this.proxy.preInit(e);
        MinecraftForge.EVENT_BUS.register(new ModBlocks());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        this.proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        this.proxy.postInit(e);
    }

    public static CreativeTabs SpectralTab = new CreativeTabs("spectralwizardry") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemFromBlock(ModBlocks.TestBlock));
        }
    };
}
