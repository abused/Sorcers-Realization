package abused_master.sorcerers_realization.proxy;

import abused_master.sorcerers_realization.registry.ModBlocks;
import abused_master.sorcerers_realization.registry.ModItems;
import abused_master.sorcerers_realization.registry.TileEntityRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        ModBlocks.regRenders();
        ModItems.regRenders();
        TileEntityRegistry.regTileEntity();
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
