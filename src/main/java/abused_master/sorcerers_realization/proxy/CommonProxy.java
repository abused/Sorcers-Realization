package abused_master.sorcerers_realization.proxy;

import abused_master.sorcerers_realization.registry.ModBlocks;
import abused_master.sorcerers_realization.registry.ModCrafting;
import abused_master.sorcerers_realization.registry.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        ModBlocks.regBlocks();
        ModItems.regItems();
        ModCrafting.regRecipes();
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}
