package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.potion.HealingreductionPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.potion.DhfqxgPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;
import java.util.Collection;

public class HealingreductioneverytickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure Healingreductioneverytick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == HealingreductionPotionEffect.potion)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check(entity)) < 10)) {
			entity.getPersistentData().putDouble("saved health", ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1));
			entity.getPersistentData().putDouble("ban health", 0);
		} else {
			if ((((entity.getPersistentData().getDouble("ban health")) <= 5)
					|| (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < (entity.getPersistentData()
							.getDouble("saved health"))))) {
				entity.getPersistentData().putDouble("ban health", ((entity.getPersistentData().getDouble("ban health")) + 1));
				entity.getPersistentData().putDouble("saved health",
						Math.round(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)));
			}
		}
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) > (entity.getPersistentData().getDouble("saved health")))
				&& (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) >= 1))) {
			entity.getPersistentData().putDouble("saved health",
					Math.round(((entity.getPersistentData().getDouble("saved health")) + ((0.1 * (new Object() {
						int check(Entity _entity) {
							if (_entity instanceof LivingEntity) {
								Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
								for (EffectInstance effect : effects) {
									if (effect.getPotion() == DhfqxgPotionEffect.potion)
										return effect.getAmplifier();
								}
							}
							return 0;
						}
					}.check(entity))) * (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)
							- (entity.getPersistentData().getDouble("saved health")))))));
			entity.attackEntityFrom(DamageSource.GENERIC,
					(float) (0.5 * (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)
							- (entity.getPersistentData().getDouble("saved health")))));
		}
	}
}
