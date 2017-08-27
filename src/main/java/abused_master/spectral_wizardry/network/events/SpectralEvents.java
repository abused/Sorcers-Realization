package abused_master.spectral_wizardry.network.events;

import abused_master.spectral_wizardry.api.IMana;
import abused_master.spectral_wizardry.network.capability.ManaProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class SpectralEvents {

    @SubscribeEvent
    public void onPlayerClone(PlayerEvent.Clone event) {
        EntityPlayer player = event.getEntityPlayer();
        if(player.hasCapability(ManaProvider.CAPABILITY_MANA, null)) {
            IMana mana = player.getCapability(ManaProvider.CAPABILITY_MANA, null);
            IMana oldMana = event.getOriginal().getCapability(ManaProvider.CAPABILITY_MANA, null);
            if(oldMana.isActivated() || mana.isActivated()) {
                mana.setAmount(oldMana.getMana());
            }
        }
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if(event.player.hasCapability(ManaProvider.CAPABILITY_MANA, null)) {
            IMana mana = event.player.getCapability(ManaProvider.CAPABILITY_MANA, null);
            if(mana.getMana() < mana.getCapacity() && mana.isActivated()) {
                mana.fill(1);
            }
        }
    }

    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        if(event.getEntity() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getEntity();
            if(player.hasCapability(ManaProvider.CAPABILITY_MANA, null)) {
                IMana mana = player.getCapability(ManaProvider.CAPABILITY_MANA, null);
                mana.consume(100);
            }
        }
    }
}
