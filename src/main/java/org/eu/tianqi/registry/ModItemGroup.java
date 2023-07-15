package org.eu.tianqi.registry;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.eu.tianqi.TianQiMod;

public class ModItemGroup {
    public static ItemGroup FUN = FabricItemGroup.builder(new Identifier(TianQiMod.MOD_ID, "fun"))
            .displayName(Text.translatable("itemgroup.tianqi-mod.fun"))
            .icon(() -> new ItemStack(ModItems.FLIGHT_STICK))
            .build();

    public static void registerModItemGroup() {
        TianQiMod.LOGGER.debug("Registering Mod Item Groups for " + TianQiMod.MOD_ID);
    }
}
