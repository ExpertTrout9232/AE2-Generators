
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ae2generators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ae2generators.block.WindGeneratorBlock;
import net.mcreator.ae2generators.block.SolarPanelBlock;
import net.mcreator.ae2generators.block.SolarGeneratorBlock;
import net.mcreator.ae2generators.block.LightningGeneratorBlock;
import net.mcreator.ae2generators.block.HeatGeneratorBlock;
import net.mcreator.ae2generators.Ae2GeneratorsMod;

public class Ae2GeneratorsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Ae2GeneratorsMod.MODID);
	public static final RegistryObject<Block> SOLAR_GENERATOR = REGISTRY.register("solar_generator", () -> new SolarGeneratorBlock());
	public static final RegistryObject<Block> SOLAR_PANEL = REGISTRY.register("solar_panel", () -> new SolarPanelBlock());
	public static final RegistryObject<Block> LIGHTNING_GENERATOR = REGISTRY.register("lightning_generator", () -> new LightningGeneratorBlock());
	public static final RegistryObject<Block> HEAT_GENERATOR = REGISTRY.register("heat_generator", () -> new HeatGeneratorBlock());
	public static final RegistryObject<Block> WIND_GENERATOR = REGISTRY.register("wind_generator", () -> new WindGeneratorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
