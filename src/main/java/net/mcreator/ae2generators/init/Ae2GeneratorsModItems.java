
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ae2generators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ae2generators.Ae2GeneratorsMod;

public class Ae2GeneratorsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Ae2GeneratorsMod.MODID);
	public static final RegistryObject<Item> SOLAR_GENERATOR = block(Ae2GeneratorsModBlocks.SOLAR_GENERATOR);
	public static final RegistryObject<Item> SOLAR_PANEL = block(Ae2GeneratorsModBlocks.SOLAR_PANEL);
	public static final RegistryObject<Item> LIGHTNING_GENERATOR = block(Ae2GeneratorsModBlocks.LIGHTNING_GENERATOR);
	public static final RegistryObject<Item> HEAT_GENERATOR = block(Ae2GeneratorsModBlocks.HEAT_GENERATOR);
	public static final RegistryObject<Item> WIND_GENERATOR = block(Ae2GeneratorsModBlocks.WIND_GENERATOR);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
