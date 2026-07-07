package com.raptor.undergroundbiomes_neoforge;

import com.raptor.undergroundbiomes_neoforge.init.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredRegister;


@Mod(Main.MOD_ID)
public class Main {

    @SuppressWarnings("WeakerAccess")
    public static final String MOD_ID = "undergroundbiomes";
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registries.PLACED_FEATURE, Main.MOD_ID);
    public static String configData;

    public Main(IEventBus modEventBus, ModContainer modContainer) {

        //modEventBus.addListener(this::commonSetup);

        //NeoForge.EVENT_BUS.register(this);

        ModItemGroup.CREATIVE_TAB_UNDERGROUND_BIOMES_BLOCKS.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModItemGroup.registerTabWoodGateBasic();

        PLACED_FEATURES.register(modEventBus);
        //PLACEMENT_MODIFIERS.register(EVENT_BUS);
        //MinecraftForge.EVENT_BUS.register(this);
        //EVENT_BUS.addListener(ModConfiguredFeatures::bootstrap);
        //modEventBus.addListener(ModPlacedFeatures::bootstrap);

    }


    private void commonSetup(final FMLCommonSetupEvent event) {

    }

}
