package com.raptor.undergroundbiomes_forge.init;

import com.raptor.undergroundbiomes_forge.Main;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.Field;

public class ModItemGroup {

    public static final DeferredRegister<CreativeModeTab> UNDERGROUNDBIOMES = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);

    public static void registerTab() {
        UNDERGROUNDBIOMES.register("tab_undergroundbiomes", () ->
                CreativeModeTab.builder()
                        .icon(() -> new ItemStack(ModBlocks.RED_GRANITE.get()))
                        .title(Component.translatable("itemGroup.undergroundbiomes.tab_undergroundbiomes"))
                        .displayItems((displayParameters, output) -> {
                            // Add blocks
                            for (Field field : ModBlocks.class.getFields())
                            {
                                if (field.getType() != RegistryObject.class) continue;

                                try
                                {
                                    RegistryObject<Block> block = (RegistryObject)field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                }
                                catch (IllegalAccessException e) {}
                            }

                        }).build()
        );
    }

}
