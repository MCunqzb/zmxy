package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;
import net.minecraft.entity.LivingEntity;


public class DirtthornZiDanFeiXingGanShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("imediatesourceentity") == null) {
			if (!dependencies.containsKey("imediatesourceentity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency imediatesourceentity for procedure DirtthornZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure DirtthornZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure DirtthornZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure DirtthornZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure DirtthornZiDanFeiXingGanShi!");
			return;
		}
		Entity imediatesourceentity = (Entity) dependencies.get("imediatesourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double ai = 0;
		double bi = 0;
		double ci = 0;
		imediatesourceentity.setNoGravity((true));
		if (((Entity) world
				.getEntitiesWithinAABB(MonsterEntity.class,
						new AxisAlignedBB(x - (100 / 2d), y - (100 / 2d), z - (100 / 2d), x + (100 / 2d), y + (100 / 2d), z + (100 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null ){
		ai = (double) ((((Entity) world
				.getEntitiesWithinAABB(MonsterEntity.class,
						new AxisAlignedBB(x - (100 / 2d), y - (100 / 2d), z - (100 / 2d), x + (100 / 2d), y + (100 / 2d), z + (100 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosX()) - (imediatesourceentity.getPosX()));
		bi = (double) (((((Entity) world
				.getEntitiesWithinAABB(MonsterEntity.class,
						new AxisAlignedBB(x - (100 / 2d), y - (100 / 2d), z - (100 / 2d), x + (100 / 2d), y + (100 / 2d), z + (100 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosY()) + 1) - (imediatesourceentity.getPosY()));
		ci = (double) ((((Entity) world
				.getEntitiesWithinAABB(MonsterEntity.class,
						new AxisAlignedBB(x - (100 / 2d), y - (100 / 2d), z - (100 / 2d), x + (100 / 2d), y + (100 / 2d), z + (100 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosZ()) - (imediatesourceentity.getPosZ()));
		imediatesourceentity.getPersistentData().putDouble("dirtthron", ((imediatesourceentity.getPersistentData().getDouble("dirtthron")) + 1));
		if ((((imediatesourceentity.getPersistentData().getDouble("dirtthron")) >= 1)
				&& ((imediatesourceentity.getPersistentData().getDouble("dirtthron")) < 15))) {
			imediatesourceentity.setMotion(0, 0.2, 0);
		}
		if ((((imediatesourceentity.getPersistentData().getDouble("dirtthron")) >= 15)
				&& ((imediatesourceentity.getPersistentData().getDouble("dirtthron")) < 30))) {
			if ((((Entity) world
					.getEntitiesWithinAABB(MonsterEntity.class,
							new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
				imediatesourceentity.setMotion((ai * 0.25), (bi * 0.25), (ci * 0.25));
			} else {
				imediatesourceentity.setMotion(0, (2), 0);
			}
		}
		if ((((imediatesourceentity.getPersistentData().getDouble("dirtthron")) >= 30)
				&& ((imediatesourceentity.getPersistentData().getDouble("dirtthron")) < 40))) {
			imediatesourceentity.setMotion(((imediatesourceentity.getMotion().getX()) * 1.2), ((imediatesourceentity.getMotion().getY()) * 1.2),
					((imediatesourceentity.getMotion().getZ()) * 1.2));
		}
		if ((((imediatesourceentity.getPersistentData().getDouble("dirtthron")) >= 75)
				&& ((imediatesourceentity.getPersistentData().getDouble("dirtthron")) < 77))) {
			imediatesourceentity.getPersistentData().putDouble("dirtthron", 0);
			if (!imediatesourceentity.world.isRemote())
				imediatesourceentity.remove();
				}
			}
		}
	}
