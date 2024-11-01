package com.delishoes.intergalacticraft.registries;

import com.delishoes.intergalacticraft.Intergalacticraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import static net.minecraft.world.item.Items.registerItem;

public class ItemRegistry {
    public static final Item RUTILE_CRYSTAL_SHARD = register("rutile_crystal_shard",new Item(new FabricItemSettings()));

    public static Item register(String id, Item item) {
        ResourceLocation ItemID = new ResourceLocation(Intergalacticraft.MOD_ID, id);
        return registerItem(ItemID, item);
    }
    public static void init() {
    }
}
