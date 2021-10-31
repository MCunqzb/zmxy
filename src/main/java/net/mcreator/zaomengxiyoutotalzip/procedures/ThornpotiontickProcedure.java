package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.World;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.potion.ThornsPotionPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.entity.SoilballEntity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class ThornpotiontickProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityAttacked(LivingHurtEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				double amount = event.getAmount();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("amount", amount);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("sourceentity", sourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure Thornpotiontick!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency sourceentity for procedure Thornpotiontick!");
			return;
		}
		if (dependencies.get("amount") == null) {
			if (!dependencies.containsKey("amount"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency amount for procedure Thornpotiontick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double amount = dependencies.get("amount") instanceof Integer ? (int) dependencies.get("amount") : (double) dependencies.get("amount");
		if (/*dependencies.get("sourceentity") != null &&*/ dependencies.get("sourceentity") instanceof LivingEntity ) {
		if (((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == ThornsPotionPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) && (!(entity instanceof SoilballEntity.CustomEntity)))) {
			sourceentity.attackEntityFrom(DamageSource.GENERIC, (float) ((amount) * (0.1 * (new Object() {
				int check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == ThornsPotionPotionEffect.potion)
								return effect.getAmplifier();
						}
					}
					return 0;
				}
			}.check(entity)))));
		}
	}
}
}