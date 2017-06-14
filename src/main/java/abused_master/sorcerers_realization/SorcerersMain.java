package abused_master.sorcerers_realization;

import abused_master.sorcerers_realization.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SorcerersMain.MODID, name = SorcerersMain.MODNAME, version = SorcerersMain.VERSION)
public class SorcerersMain {

    public static final String MODID = "reals";
    public static final String MODNAME = "Sorcerers Realization";
    public static final String VERSION = "1.0_1.11.2";

    @SidedProxy(clientSide = "abused_master.sorcerers_realization.proxy.ClientProxy", serverSide = "abused_master.sorcerers_realization.proxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        this.proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        this.proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        this.proxy.postInit(e);
    }

    public static CreativeTabs SorcerersTab = new CreativeTabs("sorcerersRealization") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.REDSTONE);
        }
    };
}
