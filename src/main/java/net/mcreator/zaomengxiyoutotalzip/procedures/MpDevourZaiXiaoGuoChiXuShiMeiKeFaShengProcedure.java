package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class MpDevourZaiXiaoGuoChiXuShiMeiKeFaShengProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure MpDevourZaiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp)
					- Math.abs((20 * ((entity.getMotion().getX()) + ((entity.getMotion().getY()) + (entity.getMotion().getZ()))))));
			entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.mp = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
