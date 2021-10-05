package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class BloodDemonShellXiongJiaShiJianMeiYouXiKeProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure BloodDemonShellXiongJiaShiJianMeiYouXiKe!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("timetick", ((entity.getPersistentData().getDouble("timetick")) + 1));
		if (((entity.getPersistentData().getDouble("timetick")) >= 200)) {
			entity.getPersistentData().putDouble("timetick", 1);
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).heal((float) (0.05 * ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)));
		}
	}
}
