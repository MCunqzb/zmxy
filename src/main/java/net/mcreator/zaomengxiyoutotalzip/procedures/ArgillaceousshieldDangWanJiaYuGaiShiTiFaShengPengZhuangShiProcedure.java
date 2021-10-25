package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class ArgillaceousshieldDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER
						.warn("Failed to load dependency entity for procedure ArgillaceousshieldDangWanJiaYuGaiShiTiFaShengPengZhuangShi!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				ZaomengxiyouMod.LOGGER
						.warn("Failed to load dependency sourceentity for procedure ArgillaceousshieldDangWanJiaYuGaiShiTiFaShengPengZhuangShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((entity.getPersistentData().getBoolean("sit")) == (false))) {
			entity.startRiding(sourceentity);
			entity.getPersistentData().putBoolean("sit", (true));
			entity.getPersistentData().putDouble("level",
					((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getMaxHealth() : -1));
		}
	}
}
