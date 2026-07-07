package com.raptor.undergroundbiomes_forge.init;

import com.raptor.undergroundbiomes_forge.Main;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings({"WeakerAccess", "unused"})
public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static void register(BusGroup eventBus) {
        ITEMS.register(eventBus);
    }
}
