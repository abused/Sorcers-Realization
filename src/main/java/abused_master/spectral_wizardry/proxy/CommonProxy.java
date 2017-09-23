package abused_master.spectral_wizardry.proxy;

import abused_master.spectral_wizardry.api.Essence;
import abused_master.spectral_wizardry.api.EssenceStorage;
import abused_master.spectral_wizardry.api.IEssence;
import abused_master.spectral_wizardry.network.capability.CapabilityHandler;
import abused_master.spectral_wizardry.network.events.SpectralEvents;
import abused_master.spectral_wizardry.registry.ModBlocks;
import abused_master.spectral_wizardry.registry.ModCrafting;
import abused_master.spectral_wizardry.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        ModCrafting.regRecipes();
    }

    public void init(FMLInitializationEvent e) {
        MinecraftForge.EVENT_BUS.register(new SpectralEvents());
        MinecraftForge.EVENT_BUS.register(new CapabilityHandler());
        CapabilityManager.INSTANCE.register(IEssence.class, new EssenceStorage(), Essence.class);
    }

    public void postInit(FMLPostInitializationEvent e) {
    }


    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(ModBlocks.TestBlock);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(ModBlocks.TestBlock).setRegistryName(ModBlocks.TestBlock.getRegistryName()));
        event.getRegistry().register(ModItems.SecretWand);
    }
}
