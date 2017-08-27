package abused_master.spectral_wizardry.network.capability;

import abused_master.spectral_wizardry.SpectralWizardry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CapabilityHandler {

    public static final ResourceLocation CAPABILITY_MANA = new ResourceLocation(SpectralWizardry.MODID, "mana");

    @SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<Entity> event) {
        if(event.getObject() instanceof EntityPlayer) {
            event.addCapability(CAPABILITY_MANA, new ManaProvider());
        }
    }
}
