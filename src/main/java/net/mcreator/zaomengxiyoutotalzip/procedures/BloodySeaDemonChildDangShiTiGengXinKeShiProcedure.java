package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class BloodySeaDemonChildDangShiTiGengXinKeShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure BloodySeaDemonChildDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure BloodySeaDemonChildDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure BloodySeaDemonChildDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure BloodySeaDemonChildDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure BloodySeaDemonChildDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		entity.getPersistentData().putDouble("timetick", ((entity.getPersistentData().getDouble("timetick")) + 1));
		if ((((entity.getPersistentData().getDouble("timetick")) >= 170) && ((entity.getPersistentData().getDouble("timetick")) < 171))) {
			if (!entity.world.isRemote())
				entity.remove();
			entity.getPersistentData().putDouble("timetick", 0);
		}
		if (((entity.getPersistentData().getDouble("timetick")) >= 10)) {
			if ((((Entity) world
					.getEntitiesWithinAABB(MonsterEntity.class,
							new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) == null)) {
				{
					Entity _ent = entity;
					_ent.setPositionAndUpdate((((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null).getPosX()),
							(((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null).getPosY()),
							(((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null).getPosZ()));
					if (_ent instanceof ServerPlayerEntity) {
						((ServerPlayerEntity) _ent).connection.setPlayerLocation(
								(((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null).getPosX()),
								(((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null).getPosY()),
								(((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null).getPosZ()), _ent.rotationYaw,
								_ent.rotationPitch, Collections.emptySet());
					}
				}
			} else {
				if ((((entity.getPersistentData().getDouble("timetick")) % 20) == 0)) {
					entity.setMotion((((((Entity) world
							.getEntitiesWithinAABB(MonsterEntity.class,
									new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosX()) - (entity.getPosX())) * 0.2), 1.2,
							(((((Entity) world.getEntitiesWithinAABB(MonsterEntity.class,
									new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosZ()) - (entity.getPosZ())) * 0.2));
				} else {
					entity.setMotion((((((Entity) world
							.getEntitiesWithinAABB(MonsterEntity.class,
									new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosX()) - (entity.getPosX())) * 0.2),
							((((((Entity) world.getEntitiesWithinAABB(MonsterEntity.class,
									new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosY()) + 0.5) - (entity.getPosY())) * 0.2),
							(((((Entity) world.getEntitiesWithinAABB(MonsterEntity.class,
									new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosZ()) - (entity.getPosZ())) * 0.2));
				}
			}
			if ((((entity.getPersistentData().getDouble("timetick")) % 11) == 0)) {
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (3 / 2d), y - (3 / 2d), z - (3 / 2d), x + (3 / 2d), y + (3 / 2d), z + (3 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if ((entityiterator instanceof MonsterEntity)) {
							entityiterator.attackEntityFrom(DamageSource.MAGIC, (float) (entity.getPersistentData().getDouble("level")));
							entityiterator.setMotion((0.5 - Math.random()), 0.2, (0.5 - Math.random()));
						}
					}
				}
			}
		}
	}
}
