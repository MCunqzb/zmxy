package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class HuoluoboFoodEatenProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure HuoluoboFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).heal((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1) * 0.2));
	}
}
