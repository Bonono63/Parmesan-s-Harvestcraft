package net.mrbonono63.phc.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.mrbonono63.phc.Main;
import net.mrbonono63.phc.block.ChoppingBoardBlock;
import net.mrbonono63.phc.block.CounterBlock;
import net.mrbonono63.phc.block.cabinet.BasicCabinetBlock;
import net.mrbonono63.phc.block.cabinet.GlassCabinet;
import net.mrbonono63.phc.block.sink.BasicSinkBlock;

import java.util.function.Function;

public class PBlocks {

    public static final Block OVEN = register("oven", new Block(FabricBlockSettings.of(Material.METAL)));
    public static final Block DEEP_FRYER = register("deep_fryer", new Block(FabricBlockSettings.of(Material.METAL)));
    public static final Block WAFFLE_IRON = register("waffle_iron", new Block(FabricBlockSettings.of(Material.METAL)));

    //sink
    public static final Block ACACIA_SINK = register("acacia_sink", new BasicSinkBlock(FabricBlockSettings.of(Material.METAL)));
    public static final Block BIRCH_SINK = register("birch_sink", new BasicSinkBlock(FabricBlockSettings.of(Material.METAL)));
    public static final Block CRIMSON_SINK = register("crimson_sink", new BasicSinkBlock(FabricBlockSettings.of(Material.METAL)));
    public static final Block DARK_OAK_SINK = register("dark_oak_sink", new BasicSinkBlock(FabricBlockSettings.of(Material.METAL)));
    public static final Block JUNGLE_SINK = register("jungle_sink", new BasicSinkBlock(FabricBlockSettings.of(Material.METAL)));
    public static final Block OAK_SINK = register("oak_sink", new BasicSinkBlock(FabricBlockSettings.of(Material.METAL)));
    public static final Block SPRUCE_SINK = register("spruce_sink", new BasicSinkBlock(FabricBlockSettings.of(Material.METAL)));
    public static final Block WARPED_SINK = register("warped_sink", new BasicSinkBlock(FabricBlockSettings.of(Material.METAL)));

    //cabinets
    public static final Block ACACIA_CABINET = register("acacia_cabinet", new BasicCabinetBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block BIRCH_CABINET = register("birch_cabinet", new BasicCabinetBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block CRIMSON_CABINET = register("crimson_cabinet", new BasicCabinetBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block DARK_OAK_CABINET = register("dark_oak_cabinet", new BasicCabinetBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block JUNGLE_CABINET = register("jungle_cabinet", new BasicCabinetBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block OAK_CABINET = register("oak_cabinet", new BasicCabinetBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block SPRUCE_CABINET = register("spruce_cabinet", new BasicCabinetBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block WARPED_CABINET = register("warped_cabinet", new BasicCabinetBlock(FabricBlockSettings.of(Material.WOOD)));

    public static final Block GLASS_CABINET = register("glass_cabinet", new GlassCabinet(FabricBlockSettings.of(Material.WOOD)));

    //chopping boards
    public static final Block ACACIA_CHOPPING_BOARD = register("acacia_chopping_board", new ChoppingBoardBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block BIRCH_CHOPPING_BOARD = register("birch_chopping_board", new ChoppingBoardBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block CRIMSON_CHOPPING_BOARD = register("crimson_chopping_board", new ChoppingBoardBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block DARK_OAK_CHOPPING_BOARD = register("dark_oak_chopping_board", new ChoppingBoardBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block JUNGLE_CHOPPING_BOARD = register("jungle_chopping_board", new ChoppingBoardBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block OAK_CHOPPING_BOARD = register("oak_chopping_board", new ChoppingBoardBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block SPRUCE_CHOPPING_BOARD = register("spruce_chopping_board", new ChoppingBoardBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block WARPED_CHOPPING_BOARD = register("warped_chopping_board", new ChoppingBoardBlock(FabricBlockSettings.of(Material.WOOD)));

    //counters

    public static final Block ANDESTITE_ACACIA_COUNTER = register("andesite_acacia_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block ANDESTITE_BIRCH_COUNTER = register("andesite_birch_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block ANDESTITE_CRIMSON_COUNTER = register("andesite_crimson_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block ANDESTITE_DARK_OAK_COUNTER = register("andesite_dark_oak_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block ANDESTITE_JUNGLE_COUNTER = register("andesite_jungle_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block ANDESTITE_OAK_COUNTER = register("andesite_oak_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block ANDESTITE_SPRUCE_COUNTER = register("andesite_spruce_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block ANDESTITE_WARPED_COUNTER = register("andesite_warped_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));

    public static final Block DIORITE_ACACIA_COUNTER = register("diorite_acacia_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block DIORITE_BIRCH_COUNTER = register("diorite_birch_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block DIORITE_CRIMSON_COUNTER = register("diorite_crimson_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block DIORITE_DARK_OAK_COUNTER = register("diorite_dark_oak_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block DIORITE_JUNGLE_COUNTER = register("diorite_jungle_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block DIORITE_OAK_COUNTER = register("diorite_oak_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block DIORITE_SPRUCE_COUNTER = register("diorite_spruce_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block DIORITE_WARPED_COUNTER = register("diorite_warped_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));

    public static final Block GRANITE_ACACIA_COUNTER = register("granite_acacia_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block GRANITE_BIRCH_COUNTER = register("granite_birch_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block GRANITE_CRIMSON_COUNTER = register("granite_crimson_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block GRANITE_DARK_OAK_COUNTER = register("granite_dark_oak_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block GRANITE_JUNGLE_COUNTER = register("granite_jungle_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block GRANITE_OAK_COUNTER = register("granite_oak_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block GRANITE_SPRUCE_COUNTER = register("granite_spruce_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block GRANITE_WARPED_COUNTER = register("granite_warped_counter", new CounterBlock(FabricBlockSettings.of(Material.WOOD)));

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
