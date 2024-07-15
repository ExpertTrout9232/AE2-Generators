
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ae2generators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.ae2generators.block.entity.SolarGeneratorBlockEntity;
import net.mcreator.ae2generators.block.entity.LightningGeneratorBlockEntity;
import net.mcreator.ae2generators.block.entity.HeatGeneratorBlockEntity;
import net.mcreator.ae2generators.Ae2GeneratorsMod;

public class Ae2GeneratorsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Ae2GeneratorsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SOLAR_GENERATOR = register("solar_generator", Ae2GeneratorsModBlocks.SOLAR_GENERATOR, SolarGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LIGHTNING_GENERATOR = register("lightning_generator", Ae2GeneratorsModBlocks.LIGHTNING_GENERATOR, LightningGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HEAT_GENERATOR = register("heat_generator", Ae2GeneratorsModBlocks.HEAT_GENERATOR, HeatGeneratorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
