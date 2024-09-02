
package net.mcreator.jemd.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class NoEscapeItem extends RecordItem {
	public NoEscapeItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jemd:no_escape")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2960);
	}
}
