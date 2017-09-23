package abused_master.spectral_wizardry.api;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

/**
 * This class is responsible for saving and reading essence data from or to server
 */
public class EssenceStorage implements Capability.IStorage<IEssence> {

    @Override
    public NBTBase writeNBT(Capability<IEssence> capability, IEssence instance, EnumFacing side)
    {
        return new NBTTagInt(instance.getEssence());
    }

    @Override
    public void readNBT(Capability<IEssence> capability, IEssence instance, EnumFacing side, NBTBase nbt)
    {
        instance.setAmount(((NBTPrimitive) nbt).getInt());
    }
}
