
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jemd.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.jemd.JemdMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JemdModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JemdMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(JemdModBlocks.BLOK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(JemdModItems.NO_ESCAPE.get());
			tabData.accept(JemdModItems.DIAMONDCAVE.get());
			tabData.accept(JemdModItems.SOULLESS.get());
			tabData.accept(JemdModItems.BREEZE.get());
			tabData.accept(JemdModItems.DISTORTED_EYES.get());
			tabData.accept(JemdModItems.SAKURA_VALLEY.get());
			tabData.accept(JemdModItems.SHRIEKER.get());
			tabData.accept(JemdModItems.WHISPERING_WOODS.get());
			tabData.accept(JemdModItems.NIGHT_FALL.get());
			tabData.accept(JemdModItems.OCHRE.get());
			tabData.accept(JemdModItems.UNION.get());
			tabData.accept(JemdModItems.CRAB_RAVE.get());
		}
	}
}
