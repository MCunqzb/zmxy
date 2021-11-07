package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class FivepotionZiDanFeiXingGanShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("imediatesourceentity") == null) {
			if (!dependencies.containsKey("imediatesourceentity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency imediatesourceentity for procedure FivepotionZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure FivepotionZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure FivepotionZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure FivepotionZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure FivepotionZiDanFeiXingGanShi!");
			return;
		}
		Entity imediatesourceentity = (Entity) dependencies.get("imediatesourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double ci = 0;
		imediatesourceentity.setNoGravity((true));
		if ((!(imediatesourceentity == null))) {
			imediatesourceentity.getPersistentData().putDouble("timetick", ((imediatesourceentity.getPersistentData().getDouble("timetick")) + 1));
			if ((((imediatesourceentity.getPersistentData().getDouble("timetick")) >= 0)
					&& ((imediatesourceentity.getPersistentData().getDouble("timetick")) < 50))) {
				if ((((Entity) world
						.getEntitiesWithinAABB(MonsterEntity.class,
								new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) == null)) {
					if (!imediatesourceentity.world.isRemote())
						imediatesourceentity.remove();
					imediatesourceentity.getPersistentData().putDouble("timetick", (-1));
				} else {
					imediatesourceentity.setMotion((((((Entity) world
							.getEntitiesWithinAABB(MonsterEntity.class,
									new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosX()) - (imediatesourceentity.getPosX())) * 0.25),
							((((((Entity) world.getEntitiesWithinAABB(MonsterEntity.class,
									new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosY()) + 1) - (imediatesourceentity.getPosY())) * 0.25),
							(((((Entity) world.getEntitiesWithinAABB(MonsterEntity.class,
									new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosZ()) - (imediatesourceentity.getPosZ())) * 0.25));
				}
			} else if ((((imediatesourceentity.getPersistentData().getDouble("timetick")) >= 50)
					&& ((imediatesourceentity.getPersistentData().getDouble("timetick")) < 100))) {
				imediatesourceentity.setMotion(((imediatesourceentity.getMotion().getX()) * 1.1), ((imediatesourceentity.getMotion().getY()) * 1.1),
						((imediatesourceentity.getMotion().getZ()) * 1.1));
			} else {
				if (!imediatesourceentity.world.isRemote())
					imediatesourceentity.remove();
			}
		}
	}
}
