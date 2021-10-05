package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.entity.WaterfallEntity;
import net.mcreator.zaomengxiyoutotalzip.entity.WaterboomcircleEntity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class WaterfallDangShiTiGengXinKeShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure WaterfallDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure WaterfallDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure WaterfallDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure WaterfallDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure WaterfallDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double w = 0;
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
				if (((!(entityiterator instanceof PlayerEntity)) && ((!(entityiterator instanceof WaterfallEntity.CustomEntity))
						&& ((!(entityiterator instanceof ItemEntity)) && (!(entityiterator instanceof WaterboomcircleEntity.CustomEntity)))))) {
					entityiterator.attackEntityFrom(DamageSource.GENERIC,
							(float) ((Math.sqrt((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) / 2))
									* (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) / 2)) + 20));
				}
			}
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (6 / 2d), (y + 5) - (6 / 2d), z - (6 / 2d), x + (6 / 2d), (y + 5) + (6 / 2d), z + (6 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, (y + 5), z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (((!(entityiterator instanceof PlayerEntity)) && ((!(entityiterator instanceof WaterfallEntity.CustomEntity))
						&& ((!(entityiterator instanceof ItemEntity)) && (!(entityiterator instanceof WaterboomcircleEntity.CustomEntity)))))) {
					entityiterator.attackEntityFrom(DamageSource.GENERIC,
							(float) ((Math.sqrt((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) / 2))
									* (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) / 2)) + 20));
				}
			}
		}
		entity.getPersistentData().putDouble("smb2", ((entity.getPersistentData().getDouble("smb2")) + 1));
		if (((entity.getPersistentData().getDouble("smb2")) > 10)) {
			entity.getPersistentData().putDouble("smb2", 1);
			{
				boolean _setval = (boolean) (false);
				entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.waterboomnum = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!entity.world.isRemote())
				entity.remove();
		}
		entity.getPersistentData().putDouble("r", ((entity.getPersistentData().getDouble("r")) + 0.5));
		if ((((entity.getPersistentData().getDouble("r")) % 1) == 0)) {
			while ((w <= 720)) {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.RAIN,
							(((entity.getPersistentData().getDouble("r")) * Math.sin(w)) + (entity.getPosX())), (y + 0.2),
							(((entity.getPersistentData().getDouble("r")) * Math.cos(w)) + (entity.getPosZ())), (int) 2, 0.2, 0.2, 0.2, 0.1);
				}
				w = (double) (w + 1);
				if ((w > 720)) {
					w = (double) 0;
					break;
				}
			}
		}
		if (((entity.getPersistentData().getDouble("r")) > 4)) {
			entity.getPersistentData().putDouble("r", 0);
		}
	}
}
