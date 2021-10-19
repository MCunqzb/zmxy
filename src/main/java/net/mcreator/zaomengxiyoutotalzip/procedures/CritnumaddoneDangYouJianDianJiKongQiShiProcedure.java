package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class CritnumaddoneDangYouJianDianJiKongQiShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure CritnumaddoneDangYouJianDianJiKongQiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("Crit_num", ((entity.getPersistentData().getDouble("Crit_num")) + 1));
		if ((((entity.getPersistentData().getDouble("Crit_num")) >= 101) && ((entity.getPersistentData().getDouble("Crit_num")) < 102))) {
			entity.getPersistentData().putDouble("Crit_num", 0);
		}
	}
}
