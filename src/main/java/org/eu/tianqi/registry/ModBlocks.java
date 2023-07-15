package org.eu.tianqi.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import org.eu.tianqi.TianQiMod;

public class ModBlocks {
    public static final Block FUN_BLOCK = registerBlock("fun_block",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool(), UniformIntProvider.create(11, 45)),
            ModItemGroup.FUN);
    public static Block registerBlock(String name, Block block, ItemGroup... itemGroups) {
        ModItems.registerItem(name, new BlockItem(block, new FabricItemSettings()), itemGroups);
        return Registry.register(Registries.BLOCK, new Identifier(TianQiMod.MOD_ID, name), block);
    }
    public static void registerModBlocks() {
        TianQiMod.LOGGER.debug("Registering mod blocks for" + TianQiMod.MOD_ID);
    }
}