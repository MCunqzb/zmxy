package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class MengpoChuShiShiTiShengChengProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure MengpoChuShiShiTiShengCheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putBoolean("evilsunwukong", (true));
		entity.getPersistentData().putBoolean("eviltangseng", (true));
	}
}
