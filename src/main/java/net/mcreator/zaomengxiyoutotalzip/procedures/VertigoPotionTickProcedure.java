package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.potion.VertigoPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.potion.FrozenPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;
import java.util.Collection;

public class VertigoPotionTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure VertigoPotionTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double w = 0;
		double o = 0;
		if (((entity.getPersistentData().getDouble("vertigo")) <= 10)) {
			entity.getPersistentData().putDouble("vertigo", ((entity.getPersistentData().getDouble("vertigo")) + 1));
			entity.getPersistentData().putDouble("W", (entity.rotationYaw));
			entity.getPersistentData().putDouble("O", (entity.rotationPitch));
		}
		if (((entity.getPersistentData().getDouble("vertigo")) > 5)) {
			entity.setMotion(0, 0, 0);
			entity.rotationYaw = (float) ((entity.getPersistentData().getDouble("W")));
			entity.setRenderYawOffset(entity.rotationYaw);
			entity.prevRotationYaw = entity.rotationYaw;
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
				((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
				((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
			}
			entity.rotationPitch = (float) ((entity.getPersistentData().getDouble("O")));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == FrozenPotionEffect.potion)
									return effect.getDuration();
							}
						}
						return 0;
					}
				}.check(entity)), (int) 20, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == FrozenPotionEffect.potion)
									return effect.getDuration();
							}
						}
						return 0;
					}
				}.check(entity)), (int) 20, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == FrozenPotionEffect.potion)
									return effect.getDuration();
							}
						}
						return 0;
					}
				}.check(entity)), (int) 20, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 30, (int) 20, (false), (false)));
			entity.setMotionMultiplier(null, new Vector3d(0.25D, (double) 0.05F, 0.25D));
		}
		if (((new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == VertigoPotionEffect.potion)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check(entity)) <= 10)) {
			entity.getPersistentData().putDouble("vertigo", 1);
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(VertigoPotionEffect.potion);
			}
			if (entity instanceof MobEntity)
				((MobEntity) entity).setNoAI((false));
		}
		if ((entity instanceof MobEntity)) {
			if (entity instanceof MobEntity)
				((MobEntity) entity).setNoAI((true));
		}
	}
}
