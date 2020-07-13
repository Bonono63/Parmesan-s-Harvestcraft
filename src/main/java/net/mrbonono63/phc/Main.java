package net.mrbonono63.phc;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.mrbonono63.phc.registry.PItems;

public class Main implements ModInitializer {

	public static final String MOD_ID = "phc";

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}

	public static final ItemGroup GROUP = FabricItemGroupBuilder.build(id("group"), () -> new ItemStack(PItems.PARMESAN));

	@Override
	public void onInitialize() {

		PItems.init();
	}
}
