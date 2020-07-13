package net.mrbonono63.phc.registry;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.mrbonono63.phc.Main;

import java.util.function.Function;

public class PBlocks {

    public static final Block FERMINTATION_BARREL = register();

    public static void init() {
    }

    static <T extends Block> T register(String name, T block, Item.Settings settings) {
        return register(name, block, new BlockItem(block, settings));
    }

    static <T extends Block> T register(String name, T block) {
        return register(name, block, new Item.Settings().group(Main.GROUP));
    }

    static <T extends Block> T register(String name, T block, Function<T, BlockItem> itemFactory) {
        return register(name, block, itemFactory.apply(block));
    }

    static <T extends Block> T register(String name, T block, BlockItem item) {
        T b = Registry.register(Registry.BLOCK, Main.id(name), block);
        if (item != null) {
            PItems.register(name, item);
        }
        return b;
    }
}
