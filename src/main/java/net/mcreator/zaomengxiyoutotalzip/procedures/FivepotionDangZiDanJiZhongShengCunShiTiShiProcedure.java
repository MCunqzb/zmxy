package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class FivepotionDangZiDanJiZhongShengCunShiTiShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure FivepotionDangZiDanJiZhongShengCunShiTiShi!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency sourceentity for procedure FivepotionDangZiDanJiZhongShengCunShiTiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if ((entity instanceof MonsterEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) ((sourceentity.getPersistentData().getDouble("level")) * 1.8));
		}
	}
}
