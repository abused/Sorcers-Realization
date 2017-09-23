package abused_master.spectral_wizardry.network.capability;

import abused_master.spectral_wizardry.SpectralWizardry;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CapabilityHandler {

    public static final ResourceLocation CAPABILITY_ESSENCE = new ResourceLocation(SpectralWizardry.MODID, "essence");

    @SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<Entity> event) {
    }
}
