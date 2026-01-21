package com.restoneradio;

import com.restoneradio.item.Radio;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RADIO = register("radio", 
        new Radio(new Item.Settings().maxCount(1)));

    private static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, 
            Identifier.of(RestoneRadio.MOD_ID, id), item);
    }

    public static void initialize() {
        // Add to tools tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
            .register(content -> content.add(RADIO));
    }
}
