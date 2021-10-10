package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class MengposoupbowlDangWuPinZaiShouShangMeiKeFaShengProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure MengposoupbowlDangWuPinZaiShouShangMeiKeFaSheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getDouble("fov")) < 350)) {
			entity.getPersistentData().putDouble("fov", ((entity.getPersistentData().getDouble("fov")) + 1));
		} else {
			entity.getPersistentData().putDouble("fov", 0);
		}
	}
}
