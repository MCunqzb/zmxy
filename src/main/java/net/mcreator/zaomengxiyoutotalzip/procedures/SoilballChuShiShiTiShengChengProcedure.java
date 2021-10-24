package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.potion.ThornsPotionPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class SoilballChuShiShiTiShengChengProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure SoilballChuShiShiTiShengCheng!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency sourceentity for procedure SoilballChuShiShiTiShengCheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(ThornsPotionPotionEffect.potion, (int) 60, (int) 10, (false), (false)));
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(ThornsPotionPotionEffect.potion, (int) 60, (int) 10, (false), (false)));
		if (((entity.getPersistentData().getBoolean("sit")) == (false))) {
			sourceentity.startRiding(entity);
			entity.getPersistentData().putBoolean("sit", (true));
		}
	}
}
