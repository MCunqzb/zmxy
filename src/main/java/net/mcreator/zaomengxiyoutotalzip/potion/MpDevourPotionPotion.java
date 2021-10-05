
package net.mcreator.zaomengxiyoutotalzip.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.potion.Potion;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MpDevourPotionPotion {
	@ObjectHolder("zaomengxiyou:mp_devour_potion")
	public static final Potion potionType = null;
	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(MpDevourPotionEffect.potion, 3600, 0, false, true), new EffectInstance(Effects.HUNGER, 600, 1, false, false));
			setRegistryName("mp_devour_potion");
		}
	}
}
