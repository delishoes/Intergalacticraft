package com.delishoes.intergalacticraft.registries;

import com.delishoes.intergalacticraft.Intergalacticraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlockRegistry {

    public static final Block MOON_SOIL = register("moon_soil", new Block(BlockBehaviour.Properties.of()
            .sound(SoundType.SAND).strength(0.5f)), true);

    private static Block register(String name, Block block, boolean item) {
        if(item)
            registerItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, Intergalacticraft.identifier(name), block);
    }
    private static void registerItem(String name, Block block)
    {
        Registry.register(BuiltInRegistries.ITEM, Intergalacticraft.identifier(name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void init() {
    }
}
