package net.mrbonono63.phc.registry;

import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.mrbonono63.phc.Main;

public class PItems {

    public static final Item PARMESAN = register("parmesan", new Item(newSettings()));
    public static final Item BRIE = register("brie", new Item(newSettings()));
    public static final Item CHEDDAR = register("cheddar", new Item(newSettings()));
    public static final Item GOLDEN_PARMESAN = register("golden_parmesan", new Item(newSettings()));
    public static final Item ASPARAGUS = register("asparagus", new Item(newSettings()));
    public static final Item TOMATO = register("tomato", new Item(newSettings()));
    public static final Item GREEN_PEAS = register("green_peas", new Item(newSettings()));
    public static final Item BROCCOLI = register("broccoli", new Item(newSettings()));
    public static final Item ANCHOVIES = register("anchovies", new Item(newSettings()));
    public static final Item ONION = register("onion", new Item(newSettings()));
    public static final Item GARLIC = register("garlic", new Item(newSettings()));
    public static final Item GINGER = register("ginger", new Item(newSettings()));
    public static final Item CUCUMBER = register("cucumber", new Item(newSettings()));
    public static final Item PICKLE = register("pickle", new Item(newSettings()));
    public static final Item VINEGAR = register("vinegar", new Item(newSettings()));
    public static final Item LEMON = register("lemon", new Item(newSettings()));
    public static final Item LIME = register("lime", new Item(newSettings()));
    public static final Item ORANGE = register("orange", new Item(newSettings()));
    public static final Item SPINACH = register("spinach", new Item(newSettings()));
    public static final Item LETTUCE = register("lettuce", new Item(newSettings()));
    public static final Item CHIVES = register("chives", new Item(newSettings()));
    public static final Item CHICKPEAS = register("chickpeas", new Item(newSettings()));
    public static final Item CORN = register("corn", new Item(newSettings()));
    public static final Item GRAPES = register("grapes", new Item(newSettings()));
    public static final Item FIG = register("fig", new Item(newSettings()));
    public static final Item DATE = register("date", new Item(newSettings()));
    public static final Item PLUM = register("plum", new Item(newSettings()));
    public static final Item OAT = register("oat", new Item(newSettings()));
    public static final Item RYE = register("rye", new Item(newSettings()));
    public static final Item BARLEY = register("barley", new Item(newSettings()));
    public static final Item RICE = register("rice", new Item(newSettings()));
    public static final Item BEEF_EMPANADA = register("empanada", new Item(newSettings()));
    public static final Item CHEESE_EMPANADA = register("cheese_empanada", new Item(newSettings()));
    public static final Item SPINACH_EMPANADA = register("spinach_empanada", new Item(newSettings()));
    public static final Item QUESADILLA = register("quesadilla", new Item(newSettings()));
    public static final Item OMELETTE = register("omelette", new Item(newSettings()));
    public static final Item FRIED = register("fried", new Item(newSettings()));
    public static final Item PASTA = register("pasta", new Item(newSettings()));
    public static final Item STOCK = register("stock", new Item(newSettings()));
    public static final Item POTATO_CHIP = register("potato_chip", new Item(newSettings()));
    public static final Item OYSTER = register("oyster", new Item(newSettings()));
    public static final Item AREPAS = register("arepas", new Item(newSettings()));
    public static final Item CACHAPA = register("cachapa", new Item(newSettings()));
    public static final Item TEKENOS = register("tekenos", new Item(newSettings()));
    public static final Item KIMCHI = register("kimchi", new Item(newSettings()));
    public static final Item CHOCOLATE_BAR = register("chocolate_bar", new Item(newSettings()));
    public static final Item CHEESECAKE = register("cheesecake", new Item(newSettings()));
    public static final Item FLAN = register("flan", new Item(newSettings()));
    public static final Item BAKLAVA = register("baklava", new Item(newSettings()));

    static Item.Settings newSettings() {
        return new Item.Settings().group(Main.GROUP);
    }

    public static void init() {

    }

    protected static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, Main.id(name),item);
    }
}
