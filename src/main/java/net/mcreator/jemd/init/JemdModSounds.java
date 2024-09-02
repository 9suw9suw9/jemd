
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jemd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.jemd.JemdMod;

public class JemdModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, JemdMod.MODID);
	public static final RegistryObject<SoundEvent> DIAMOND_CAVE = REGISTRY.register("diamond_cave", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jemd", "diamond_cave")));
	public static final RegistryObject<SoundEvent> SOULLESS = REGISTRY.register("soulless", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jemd", "soulless")));
	public static final RegistryObject<SoundEvent> NO_ESCAPE = REGISTRY.register("no_escape", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jemd", "no_escape")));
	public static final RegistryObject<SoundEvent> BREEZE = REGISTRY.register("breeze", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jemd", "breeze")));
	public static final RegistryObject<SoundEvent> DISTORTED_EYES = REGISTRY.register("distorted_eyes", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jemd", "distorted_eyes")));
	public static final RegistryObject<SoundEvent> SAKURAVALLEY = REGISTRY.register("sakuravalley", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jemd", "sakuravalley")));
	public static final RegistryObject<SoundEvent> SHRIEKER = REGISTRY.register("shrieker", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jemd", "shrieker")));
	public static final RegistryObject<SoundEvent> WHISPERING_WOODS = REGISTRY.register("whispering_woods", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jemd", "whispering_woods")));
	public static final RegistryObject<SoundEvent> NIGHTFALL = REGISTRY.register("nightfall", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jemd", "nightfall")));
	public static final RegistryObject<SoundEvent> OCHRE = REGISTRY.register("ochre", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jemd", "ochre")));
	public static final RegistryObject<SoundEvent> UNION = REGISTRY.register("union", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jemd", "union")));
}
