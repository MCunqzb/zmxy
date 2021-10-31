package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class RochademonumbrellaitemZiDanFeiXingGanShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("imediatesourceentity") == null) {
			if (!dependencies.containsKey("imediatesourceentity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency imediatesourceentity for procedure RochademonumbrellaitemZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure RochademonumbrellaitemZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure RochademonumbrellaitemZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure RochademonumbrellaitemZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure RochademonumbrellaitemZiDanFeiXingGanShi!");
			return;
		}
		Entity imediatesourceentity = (Entity) dependencies.get("imediatesourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		imediatesourceentity.setNoGravity((true));
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.PORTAL, x, y, z, (int) 5, 0.1, 0.1, 1, 0.1);
		}
		imediatesourceentity.getPersistentData().putDouble("timetick", ((imediatesourceentity.getPersistentData().getDouble("timetick")) + 1));
		if ((((imediatesourceentity.getPersistentData().getDouble("timetick")) >= 100)
				&& ((imediatesourceentity.getPersistentData().getDouble("timetick")) < 101))) {
			imediatesourceentity.getPersistentData().putDouble("timetick", 0);
			if (!imediatesourceentity.world.isRemote())
				imediatesourceentity.remove();
		}
	}
}
