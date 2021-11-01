package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.entity.WhitefrostmirrorEntity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class WhitefrostmirrorDangShiTiGengXinKeShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure WhitefrostmirrorDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure WhitefrostmirrorDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure WhitefrostmirrorDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure WhitefrostmirrorDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure WhitefrostmirrorDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double i = 0;
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 60, (int) 5, (false), (false)));
		if (((entity.getPersistentData().getDouble("timetick")) <= 299)) {
			entity.getPersistentData().putDouble("timetick", ((entity.getPersistentData().getDouble("timetick")) + 1));
			if (((((entity.getPersistentData().getDouble("timetick")) % 20) == 0) && (((Entity) world
					.getEntitiesWithinAABB(MonsterEntity.class,
							new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null))) {
				entity.getPersistentData().putBoolean("skill", (false));
				entity.getPersistentData().putDouble("health",
						((entity.getPersistentData().getDouble("health")) + ((entity.getPersistentData().getDouble("level")) * 0.15)));
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
						if (((entityiterator instanceof MonsterEntity) && (!(entityiterator instanceof WhitefrostmirrorEntity.CustomEntity)))) {
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.FALLING_LAVA, x, y, z, (int) 5, 0.2, 0.2, 0.2, 0.5);
							}
							entityiterator.attackEntityFrom(DamageSource.MAGIC, (float) ((entity.getPersistentData().getDouble("level")) * 0.6));
						}
					}
				}
			}
		}
		if (((entity.getPersistentData().getDouble("timetick")) >= 300)) {
			entity.getPersistentData().putBoolean("skill", (true));
			if ((((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null) == null)) {
				{
					Entity _ent = entity;
					_ent.setPositionAndUpdate(x, (y + 2), z);
					if (_ent instanceof ServerPlayerEntity) {
						((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, (y + 2), z, _ent.rotationYaw, _ent.rotationPitch,
								Collections.emptySet());
					}
				}
			} else {
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
			}
		}
	}
}
