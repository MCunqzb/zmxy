package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class TestfxDangYouJianDianJiKongQiShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure TestfxDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure TestfxDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure TestfxDangYouJianDianJiKongQiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		IWorld world = (IWorld) dependencies.get("world");
		double w = 0;
		double x = 0;
		double i = 0;
		double z = 0;
		while ((w <= 720)) {
			if ((((entity.getPersistentData().getDouble("time")) % 2) == 0)) {
				x = (double) ((entity.getPosX()) + ((entity.getPersistentData().getDouble("time")) * ((entity.getHorizontalFacing()).getXOffset())));
				z = (double) ((entity.getPosZ()) + ((entity.getPersistentData().getDouble("time")) * ((entity.getHorizontalFacing()).getZOffset())));
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.HAPPY_VILLAGER, ((2 * Math.sin(w)) + x), (y + 0.2), (((-2) * Math.cos(w)) + z),
						(int) 1, 0, 0, 0, 0);
			}
			w = (double) (w + 1);
			if ((w > 720)) {
				w = (double) (w - 720);
				break;
			}
		}
		entity.getPersistentData().putDouble("time", ((entity.getPersistentData().getDouble("time")) + 1));
		if (((entity.getPersistentData().getDouble("time")) > 20)) {
			entity.getPersistentData().putDouble("time", 0);
		}
	}
}
