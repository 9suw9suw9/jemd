
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jemd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.jemd.item.WhisperingWoodsItem;
import net.mcreator.jemd.item.UnionItem;
import net.mcreator.jemd.item.SoullessItem;
import net.mcreator.jemd.item.ShriekerItem;
import net.mcreator.jemd.item.SakuraValleyItem;
import net.mcreator.jemd.item.OchreItem;
import net.mcreator.jemd.item.NoEscapeItem;
import net.mcreator.jemd.item.NightFallItem;
import net.mcreator.jemd.item.DistortedEyesItem;
import net.mcreator.jemd.item.DiamondcaveItem;
import net.mcreator.jemd.item.CrabRaveItem;
import net.mcreator.jemd.item.BreezeItem;
import net.mcreator.jemd.JemdMod;

public class JemdModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JemdMod.MODID);
	public static final RegistryObject<Item> BLOK = block(JemdModBlocks.BLOK);
	public static final RegistryObject<Item> NO_ESCAPE = REGISTRY.register("no_escape", () -> new NoEscapeItem());
	public static final RegistryObject<Item> DIAMONDCAVE = REGISTRY.register("diamondcave", () -> new DiamondcaveItem());
	public static final RegistryObject<Item> SOULLESS = REGISTRY.register("soulless", () -> new SoullessItem());
	public static final RegistryObject<Item> BREEZE = REGISTRY.register("breeze", () -> new BreezeItem());
	public static final RegistryObject<Item> DISTORTED_EYES = REGISTRY.register("distorted_eyes", () -> new DistortedEyesItem());
	public static final RegistryObject<Item> SAKURA_VALLEY = REGISTRY.register("sakura_valley", () -> new SakuraValleyItem());
	public static final RegistryObject<Item> SHRIEKER = REGISTRY.register("shrieker", () -> new ShriekerItem());
	public static final RegistryObject<Item> WHISPERING_WOODS = REGISTRY.register("whispering_woods", () -> new WhisperingWoodsItem());
	public static final RegistryObject<Item> NIGHT_FALL = REGISTRY.register("night_fall", () -> new NightFallItem());
	public static final RegistryObject<Item> OCHRE = REGISTRY.register("ochre", () -> new OchreItem());
	public static final RegistryObject<Item> UNION = REGISTRY.register("union", () -> new UnionItem());
	public static final RegistryObject<Item> CRAB_RAVE = REGISTRY.register("crab_rave", () -> new CrabRaveItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
