package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.potion.FrozenPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.entity.WaterboomcircleEntity;
import net.mcreator.zaomengxiyoutotalzip.entity.EvilwaterfallEntity;
import net.mcreator.zaomengxiyoutotalzip.entity.EvilTangsengEntity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class EvilwaterfallDangShiTiGengXinKeShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure EvilwaterfallDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure EvilwaterfallDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure EvilwaterfallDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure EvilwaterfallDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure EvilwaterfallDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double wi = 0;
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
				if (((!(entityiterator instanceof EvilTangsengEntity.CustomEntity))
						&& ((!(entityiterator instanceof EvilwaterfallEntity.CustomEntity)) && ((!(entityiterator instanceof ItemEntity))
								&& (!(entityiterator instanceof WaterboomcircleEntity.CustomEntity)))))) {
					if (entityiterator instanceof LivingEntity)
						((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(FrozenPotionEffect.potion, (int) 60, (int) 1));
					entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 70);
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
				if (((!(entityiterator instanceof EvilTangsengEntity.CustomEntity))
						&& ((!(entityiterator instanceof EvilwaterfallEntity.CustomEntity)) && ((!(entityiterator instanceof ItemEntity))
								&& (!(entityiterator instanceof WaterboomcircleEntity.CustomEntity)))))) {
					entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 70);
				}
			}
		}
		entity.getPersistentData().putDouble("smb2", ((entity.getPersistentData().getDouble("smb2")) + 1));
		if (((entity.getPersistentData().getDouble("smb2")) > 10)) {
			entity.getPersistentData().putDouble("smb2", 1);
			if (!entity.world.isRemote())
				entity.remove();
			if (!((Entity) world
					.getEntitiesWithinAABB(WaterboomcircleEntity.CustomEntity.class,
							new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).world.isRemote())
				((Entity) world
						.getEntitiesWithinAABB(WaterboomcircleEntity.CustomEntity.class,
								new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).remove();
		}
		entity.getPersistentData().putDouble("r", ((entity.getPersistentData().getDouble("r")) + 0.5));
		if ((((entity.getPersistentData().getDouble("r")) % 1) == 0)) {
			while ((wi <= 720)) {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.PORTAL,
							(((entity.getPersistentData().getDouble("r")) * Math.sin(wi)) + (entity.getPosX())), (y + 0.2),
							(((entity.getPersistentData().getDouble("r")) * Math.cos(wi)) + (entity.getPosZ())), (int) 2, 0.2, 0.2, 0.2, 0.1);
				}
				wi = (double) (wi + 1);
				if ((wi > 720)) {
					wi = (double) 0;
					break;
				}
			}
		}
		if (((entity.getPersistentData().getDouble("r")) > 4)) {
			entity.getPersistentData().putDouble("r", 0);
		}
	}
}
