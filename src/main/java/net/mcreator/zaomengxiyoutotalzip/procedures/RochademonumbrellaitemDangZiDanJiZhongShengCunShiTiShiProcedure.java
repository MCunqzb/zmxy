package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;
import java.util.Collection;

public class RochademonumbrellaitemDangZiDanJiZhongShengCunShiTiShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure RochademonumbrellaitemDangZiDanJiZhongShengCunShiTiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!(entity instanceof PlayerEntity))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WITHER, (int) ((new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.WITHER)
									return effect.getDuration();
							}
						}
						return 0;
					}
				}.check(entity)) + 100), (int) ((new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.WITHER)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity)) + 2)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) ((new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.POISON)
									return effect.getDuration();
							}
						}
						return 0;
					}
				}.check(entity)) + 100), (int) ((new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.POISON)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity)) + 2)));
			entity.attackEntityFrom(DamageSource.MAGIC, (float) 20);
		}
	}
}
