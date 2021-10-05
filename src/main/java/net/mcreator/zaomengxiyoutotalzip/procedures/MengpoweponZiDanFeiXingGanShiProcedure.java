package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.zaomengxiyoutotalzip.entity.MengpoEntity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class MengpoweponZiDanFeiXingGanShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure MengpoweponZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("imediatesourceentity") == null) {
			if (!dependencies.containsKey("imediatesourceentity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency imediatesourceentity for procedure MengpoweponZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure MengpoweponZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure MengpoweponZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure MengpoweponZiDanFeiXingGanShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure MengpoweponZiDanFeiXingGanShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity imediatesourceentity = (Entity) dependencies.get("imediatesourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double ni = 0;
		double just1 = 0;
		ni = (double) 0.9;
		just1 = (double) 1;
		imediatesourceentity.setNoGravity((true));
		imediatesourceentity.getPersistentData().putDouble("timetick", ((imediatesourceentity.getPersistentData().getDouble("timetick")) + 1));
		if (((imediatesourceentity.getPersistentData().getDouble("timetick")) <= 5)) {
			imediatesourceentity.getPersistentData().putDouble("vx", (imediatesourceentity.getMotion().getX()));
			imediatesourceentity.getPersistentData().putDouble("vy", (imediatesourceentity.getMotion().getY()));
			imediatesourceentity.getPersistentData().putDouble("vz", (imediatesourceentity.getMotion().getZ()));
		} else {
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((entity instanceof MengpoEntity.CustomEntity)) {
						if ((entityiterator instanceof PlayerEntity)) {
							entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 9);
							if (!imediatesourceentity.world.isRemote())
								imediatesourceentity.remove();
						}
					} else {
						if ((entityiterator instanceof MonsterEntity)) {
							entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 50);
							if (!imediatesourceentity.world.isRemote())
								imediatesourceentity.remove();
						}
					}
				}
			}
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, x, y, z, (int) 2, 0.2, 0.2, 0.2, 0.1);
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, (int) 2, 0.2, 0.2, 0.2, 0.1);
		}
		if (((imediatesourceentity.getPersistentData().getDouble("timetick")) > 200)) {
			imediatesourceentity.getPersistentData().putDouble("timetick", (-1));
			if (!imediatesourceentity.world.isRemote())
				imediatesourceentity.remove();
		}
		if (((((world.getBlockState(new BlockPos((int) (imediatesourceentity.getPosX()), (int) ((imediatesourceentity.getPosY()) + 0.5),
				(int) (imediatesourceentity.getPosZ())))).getBlock() == Blocks.AIR)
				&& ((world.getBlockState(new BlockPos((int) (imediatesourceentity.getPosX()), (int) ((imediatesourceentity.getPosY()) - 0.5),
						(int) (imediatesourceentity.getPosZ())))).getBlock() == Blocks.AIR)) == (false))) {
			imediatesourceentity.setMotion(((1 * ni) * (imediatesourceentity.getPersistentData().getDouble("vx"))),
					(((-1) * ni) * (imediatesourceentity.getPersistentData().getDouble("vy"))),
					((1 * ni) * (imediatesourceentity.getPersistentData().getDouble("vz"))));
		} else if (((((world.getBlockState(new BlockPos((int) (imediatesourceentity.getPosX()), (int) (imediatesourceentity.getPosY()),
				(int) ((imediatesourceentity.getPosZ()) - 0.5)))).getBlock() == Blocks.AIR)
				&& ((world.getBlockState(new BlockPos((int) (imediatesourceentity.getPosX()), (int) (imediatesourceentity.getPosY()),
						(int) ((imediatesourceentity.getPosZ()) + 0.5)))).getBlock() == Blocks.AIR)) == (false))) {
			imediatesourceentity.setMotion(((1 * ni) * (imediatesourceentity.getPersistentData().getDouble("vx"))),
					((1 * ni) * (imediatesourceentity.getPersistentData().getDouble("vy"))),
					(((-1) * ni) * (imediatesourceentity.getPersistentData().getDouble("vz"))));
		} else if (((((world.getBlockState(new BlockPos((int) ((imediatesourceentity.getPosX()) - 0.5), (int) (imediatesourceentity.getPosY()),
				(int) (imediatesourceentity.getPosZ())))).getBlock() == Blocks.AIR)
				&& ((world.getBlockState(new BlockPos((int) ((imediatesourceentity.getPosX()) + 0.5), (int) (imediatesourceentity.getPosY()),
						(int) (imediatesourceentity.getPosZ())))).getBlock() == Blocks.AIR)) == (false))) {
			imediatesourceentity.setMotion((((-1) * ni) * (imediatesourceentity.getPersistentData().getDouble("vx"))),
					((1 * ni) * (imediatesourceentity.getPersistentData().getDouble("vy"))),
					((1 * ni) * (imediatesourceentity.getPersistentData().getDouble("vz"))));
		}
		if ((entity instanceof MengpoEntity.CustomEntity)) {
			if (((Math.pow(((imediatesourceentity.getPosX()) - (entity.getPosX())), 2)
					+ (Math.pow(((imediatesourceentity.getPosY()) - (entity.getPosY())), 2)
							+ Math.pow(((imediatesourceentity.getPosZ()) - (entity.getPosZ())), 2))) >= 80)) {
				imediatesourceentity.setMotion(((1.5 - (3 * Math.random())) * (imediatesourceentity.getPersistentData().getDouble("vx"))),
						((1.5 - (3 * Math.random())) * (imediatesourceentity.getPersistentData().getDouble("vy"))),
						((1.5 - (3 * Math.random())) * (imediatesourceentity.getPersistentData().getDouble("vz"))));
			}
		}
	}
}
