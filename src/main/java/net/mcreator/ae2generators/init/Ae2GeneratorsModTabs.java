
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ae2generators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.ae2generators.Ae2GeneratorsMod;

public class Ae2GeneratorsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Ae2GeneratorsMod.MODID);
	public static final RegistryObject<CreativeModeTab> AE_2_GENERATORS = REGISTRY.register("ae_2_generators",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ae2_generators.ae_2_generators")).icon(() -> new ItemStack(Ae2GeneratorsModBlocks.SOLAR_GENERATOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(Ae2GeneratorsModBlocks.SOLAR_GENERATOR.get().asItem());
				tabData.accept(Ae2GeneratorsModBlocks.SOLAR_PANEL.get().asItem());
				tabData.accept(Ae2GeneratorsModBlocks.LIGHTNING_GENERATOR.get().asItem());
				tabData.accept(Ae2GeneratorsModBlocks.HEAT_GENERATOR.get().asItem());
			})

					.build());
}
