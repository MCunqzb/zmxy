package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class MengposoupDangShengWuWanJiaPengZhuangFangKuaiShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure MengposoupDangShengWuWanJiaPengZhuangFangKuaiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("food", ((entity.getPersistentData().getDouble("food")) + 0.1));
		if (((entity.getPersistentData().getDouble("food")) > 19)) {
			entity.getPersistentData().putDouble("food", 1);
		}
		entity.setAir((int) (0.5 * (entity.getPersistentData().getDouble("food"))));
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getFoodStats().setFoodLevel((int) (20 - (entity.getPersistentData().getDouble("food"))));
	}
}
