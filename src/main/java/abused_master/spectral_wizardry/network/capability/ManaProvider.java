package abused_master.spectral_wizardry.network.capability;

import abused_master.spectral_wizardry.api.IMana;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class ManaProvider implements ICapabilitySerializable<NBTBase> {

    @CapabilityInject(IMana.class)
    public static final Capability<IMana> CAPABILITY_MANA = null;

    private IMana instance = CAPABILITY_MANA.getDefaultInstance();

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == CAPABILITY_MANA;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        return capability == CAPABILITY_MANA ? CAPABILITY_MANA.<T> cast(this.instance) : null;
    }

    @Override
    public NBTBase serializeNBT() {
        return CAPABILITY_MANA.getStorage().writeNBT(CAPABILITY_MANA, this.instance, null);
    }

    @Override
    public void deserializeNBT(NBTBase nbt) {
        CAPABILITY_MANA.getStorage().readNBT(CAPABILITY_MANA, this.instance, null, nbt);
    }
}