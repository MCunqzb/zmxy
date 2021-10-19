package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.Map;

public class DoubleJumpProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure DoubleJump!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((!(entity.isOnGround())) && (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ZaomengxiyouModVariables.PlayerVariables())).jump2) == 0))) {
			entity.setMotion((entity.getMotion().getX()), 0.55, (entity.getMotion().getZ()));
			{
				double _setval = (double) 1;
				entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jump2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
				entity.fallDistance = (float) (0);
			}, 500, TimeUnit.MILLISECONDS);
		}
		if (((entity.isOnGround()) || (entity.isInWater()))) {
			{
				double _setval = (double) 0;
				entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jump2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
