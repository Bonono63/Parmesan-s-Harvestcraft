package net.mrbonono63.phc.registry;

import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.mrbonono63.phc.Main;

public class PItems {

    /*
    * Foods
    * */

    //cheese
    public static final Item PARMESAN = register("parmesan", new Item(newSettings()));
    public static final Item BRIE = register("brie", new Item(newSettings()));
    public static final Item MOZZARELLA = register("mozzarella", new Item(newSettings()));
    public static final Item GOUDA = register("gouda", new Item(newSettings()));
    public static final Item FETA = register("feta", new Item(newSettings()));
    public static final Item PROVOLONE = register("provolone", new Item(newSettings()));
    public static final Item CHEDDAR = register("cheddar", new Item(newSettings()));
    public static final Item GOLDEN_PARMESAN = register("golden_parmesan", new Item(newSettings()));
    public static final Item QUESO_DE_MANO = register("queso_de_mano", new Item(newSettings()));

    //produce
    public static final Item ASPARAGUS = register("asparagus", new Item(newSettings()));
    public static final Item TOMATO = register("tomato", new Item(newSettings()));
    public static final Item GREEN_PEAS = register("green_peas", new Item(newSettings()));
    public static final Item BROCCOLI = register("broccoli", new Item(newSettings()));
    public static final Item ONION = register("onion", new Item(newSettings()));
    public static final Item GARLIC = register("garlic", new Item(newSettings()));
    public static final Item GINGER = register("ginger", new Item(newSettings()));
    public static final Item CUCUMBER = register("cucumber", new Item(newSettings()));
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
    public static final Item OYSTER = register("oyster", new Item(newSettings()));

    //Common ingredients
    public static final Item VINEGAR = register("vinegar", new Item(newSettings()));

    //GLOBAL
    public static final Item FLAN = register("flan", new Item(newSettings()));
    public static final Item WAFFLE_BATTER = register("waffle_batter", new Item(newSettings()));
    public static final Item PANCAKE = register("pancake", new Item(newSettings()));
    public static final Item PANCAKE_BATTER = register("pancake_batter", new Item(newSettings()));

    //EUROPE

    //French foods
    public static final Item MACARON = register("macaron", new Item(newSettings()));
    public static final Item MACAROON = register("macaroon", new Item(newSettings()));

    //Belgium foods
    public static final Item BELGIAN_WAFFLES = register("belgian_waffles", new Item(newSettings()));

    //Italian foods
    public static final Item PASTA = register("pasta", new Item(newSettings()));

    //Greek foods
    public static final Item SPANICOPIDA = register("spanicopida", new Item(newSettings()));

    //MIDDLE EAST

    public static final Item BAKLAVA = register("baklava", new Item(newSettings()));

    //NORTH AMERICA

    //American foods
    public static final Item ANCHOVIES = register("anchovies", new Item(newSettings()));
    public static final Item PICKLE = register("pickle", new Item(newSettings()));
    public static final Item OMELETTE = register("omelette", new Item(newSettings()));
    public static final Item FRIED_EGG = register("fried_egg", new Item(newSettings()));
    public static final Item STOCK = register("stock", new Item(newSettings()));
    public static final Item POTATO_CHIPS = register("potato_chips", new Item(newSettings()));
    public static final Item CHOCOLATE_BAR = register("chocolate_bar", new Item(newSettings()));
    public static final Item CHEESECAKE = register("cheesecake", new Item(newSettings()));
    public static final Item TERIYAKI_CHICKEN = register("teriyaki_chicken", new Item(newSettings()));
    public static final Item CALIFORNIA_ROLL = register("california_roll", new Item(newSettings()));
    public static final Item BURGER = register("burger", new Item(newSettings()));
    public static final Item TWINKIES = register("twinkies", new Item(newSettings()));
    public static final Item ICE_CREAM = register("ice_cream", new Item(newSettings()));
    public static final Item DONUT = register("donut", new Item(newSettings()));
    public static final Item FRIED_CHICKEN = register("fried_chicken", new Item(newSettings()));
    public static final Item WAFFLE_STICK = register("waffle_stick", new Item(newSettings()));

    //Canadian
    public static final Item POUTINE = register("poutine", new Item(newSettings()));
    public static final Item BEAVER_TAIL = register("beaver_tail", new Item(newSettings()));
    public static final Item BUTTER_TARTS = register("butter_tarts", new Item(newSettings()));
    public static final Item MAPLE_SYRUP = register("maple_syrup", new Item(newSettings()));

    //SOUTH AMERICA

    public static final Item AREPA = register("arepa", new Item(newSettings()));
    public static final Item BEEF_EMPANADA = register("empanada", new Item(newSettings()));
    public static final Item CHEESE_EMPANADA = register("cheese_empanada", new Item(newSettings()));
    public static final Item SPINACH_EMPANADA = register("spinach_empanada", new Item(newSettings()));

    //Venezuelan foods
    public static final Item CACHAPA = register("cachapa", new Item(newSettings()));
    public static final Item TEKENOS = register("tekenos", new Item(newSettings()));

    //Mexican foods
    public static final Item QUESADILLA = register("quesadilla", new Item(newSettings()));

    //ASIA

    public static final Item DUMPLING = register("dumpling", new Item(newSettings()));

    //Korean Foods
    public static final Item KIMCHI = register("kimchi", new Item(newSettings()));
    public static final Item GALBI = register("galbi", new Item(newSettings()));
    public static final Item SOONDUBU_STEW = register("soondubu_stew", new Item(newSettings()));
    public static final Item KIMCHIMARI = register("kimchimari", new Item(newSettings()));
    public static final Item BULGOGI = register("bulgogi", new Item(newSettings()));

    //Japanese foods
    public static final Item MISO_SOUP = register("miso_soup", new Item(newSettings()));
    public static final Item TERIYAKI_TROPICAL_FISH = register("teriyako_tropical_fish", new Item(newSettings()));
    public static final Item TERIYAKI_SALMON = register("teriyako_salmon", new Item(newSettings()));
    public static final Item WAGYU_BEEF = register("wagyu_beef", new Item(newSettings()));

    //Chinese foods
    public static final Item SWEET_AND_SOUR_CHICKEN = register("sweet_and_sour_chicken", new Item(newSettings()));
    public static final Item WONTON = register("wonton", new Item(newSettings()));

    //Vietnamese foods
    public static final Item SPRING_ROLL = register("spring_roll", new Item(newSettings()));

    //Thai foods
    public static final Item PAD_THAI = register("pad_thai", new Item(newSettings()));
    public static final Item MANGO_FRIED_RICE = register("mango_fried_rice", new Item(newSettings()));
    public static final Item PINEAPPLE_FRIED_RICE = register("pineapple_fried_rice", new Item(newSettings()));

    /*
    * Tools
    * */

    public static final Item SKILLET = register("skillet", new Item(newSettings()));
    public static final Item POT = register("pot", new Item(newSettings()));
    public static final Item BAKEWARE = register("bakeware", new Item(newSettings()));
    public static final Item MIXING_BOWL = register("mixing_bowl", new Item(newSettings()));
    public static final Item JUICER = register("juicer", new Item(newSettings()));
    public static final Item MORTER_AND_PESTLE = register("mortar_and_pestle", new Item(newSettings()));

    static Item.Settings newSettings() {
        return new Item.Settings().group(Main.GROUP);
    }

    public static void init() {

    }

    protected static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, Main.id(name),item);
    }
}
