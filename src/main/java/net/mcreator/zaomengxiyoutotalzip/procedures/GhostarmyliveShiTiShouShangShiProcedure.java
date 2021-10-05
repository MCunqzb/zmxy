package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class GhostarmyliveShiTiShouShangShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure GhostarmyliveShiTiShouShangShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		((LivingEntity) entity).getAttribute(Attributes.KNOCKBACK_RESISTANCE).setBaseValue(1);
	}
}
