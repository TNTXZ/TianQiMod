package org.eu.tianqi.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.eu.tianqi.TianQiMod;

public class ModItems {
    public static final Item FLIGHT_STICK = registerItem("flight_stick", new Item(new FabricItemSettings().maxCount(1)), ModItemGroup.FUN);
    public static Item registerItem(String name, Item item, ItemGroup... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(TianQiMod.MOD_ID, name), item);
        for (ItemGroup itemGroup : itemGroups) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }
    public static void registerModItems() {
        TianQiMod.LOGGER.debug("Registering Mod Items for " + TianQiMod.MOD_ID);
    }
}
