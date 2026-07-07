package com.raptor.undergroundbiomes_fabric;

import com.raptor.undergroundbiomes_fabric.init.ModBlocks;
import com.raptor.undergroundbiomes_fabric.init.ModItemGroup;
import com.raptor.undergroundbiomes_fabric.init.ModItems;
import net.fabricmc.api.ModInitializer;

import java.util.EventListener;


public class Main implements ModInitializer {

    @SuppressWarnings("WeakerAccess")
    public static final String MOD_ID = "undergroundbiomes";
    public static EventListener MOD_EVENT_BUS;

    //public static ModConfig config;

    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModItemGroup.registerTab();

    }

}
