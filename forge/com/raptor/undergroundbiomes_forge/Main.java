package com.raptor.undergroundbiomes_forge;

import com.raptor.undergroundbiomes_forge.init.ModBlocks;
import com.raptor.undergroundbiomes_forge.init.ModItemGroup;
import com.raptor.undergroundbiomes_forge.init.ModItems;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(Main.MOD_ID)
public class Main {

    @SuppressWarnings("WeakerAccess")
    public static final String MOD_ID = "undergroundbiomes";

    public Main(FMLJavaModLoadingContext modLoadingContext) {


        BusGroup MOD_EVENT_BUS = modLoadingContext.getModBusGroup();
        ModItemGroup.UNDERGROUNDBIOMES.register(MOD_EVENT_BUS);

        // Registers and Loads Config File
        //modLoadingContext.registerConfig(ModConfig.Type.COMMON, ConfigHandler.COMMON_CONFIG);
        //ConfigHandler.loadConfig(ConfigHandler.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("undergroundbiomes-common.toml"));

        ModItems.register(MOD_EVENT_BUS);
        ModBlocks.register(MOD_EVENT_BUS);
        ModItemGroup.registerTab();

        //StoneConfiguration.setup(modLoadingContext);
        //PLACED_FEATURES.register(MOD_EVENT_BUS);
        //CONFIGURED_FEATURES.register(EVENT_BUS);
        //PLACEMENT_MODIFIERS.register(EVENT_BUS);
        //MinecraftForge.EVENT_BUS.register(this);
        //EVENT_BUS.addListener(ModConfiguredFeatures::bootstrap);
        //EVENT_BUS.addListener(ModPlacedFeatures::bootstrap);

    }



}
