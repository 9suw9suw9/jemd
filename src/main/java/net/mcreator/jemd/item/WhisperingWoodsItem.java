
package net.mcreator.jemd.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class WhisperingWoodsItem extends RecordItem {
	public WhisperingWoodsItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jemd:whispering_woods")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2780);
	}
}
