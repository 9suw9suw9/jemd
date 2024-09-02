
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jemd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.jemd.block.BlokBlock;
import net.mcreator.jemd.JemdMod;

public class JemdModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JemdMod.MODID);
	public static final RegistryObject<Block> BLOK = REGISTRY.register("blok", () -> new BlokBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
