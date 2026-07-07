package com.raptor.undergroundbiomes_neoforge.init;

import com.raptor.undergroundbiomes_neoforge.Main;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

@SuppressWarnings({"WeakerAccess", "unused"})
public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Main.MOD_ID);

    public static <T extends Item> DeferredItem<Item> register(String name, Function<Item.Properties, Item> item) {
        return ITEMS.register(name, () -> item.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }

    public static <T extends Item> DeferredItem<Item> register(String name, Function<Item.Properties, Item> item, Item.Properties properties) {
        return ITEMS.register(name, () -> item.apply(properties.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }

    private static <T extends Item> DeferredItem<Item> registerItem(String name, Function<Item.Properties, Item> item, Item.Properties properties) {
        DeferredItem<Item> toReturn = register(name, item, properties.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name))));
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
