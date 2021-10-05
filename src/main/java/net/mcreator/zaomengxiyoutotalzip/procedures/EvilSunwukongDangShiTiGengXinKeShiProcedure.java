package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Score;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.potion.OnFirePotionEffect;
import net.mcreator.zaomengxiyoutotalzip.particle.SlzParticle;
import net.mcreator.zaomengxiyoutotalzip.particle.LyfbdeliziParticle;
import net.mcreator.zaomengxiyoutotalzip.entity.EvilSunwukongEntity;
import net.mcreator.zaomengxiyoutotalzip.entity.Baigujing1Entity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Comparator;

public class EvilSunwukongDangShiTiGengXinKeShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure EvilSunwukongDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure EvilSunwukongDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure EvilSunwukongDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure EvilSunwukongDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure EvilSunwukongDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60, (int) 1, (false), (false)));
		entity.getPersistentData().putDouble("timetick", ((entity.getPersistentData().getDouble("timetick")) + 1));
		if ((((entity.getPersistentData().getDouble("timetick")) >= 100) && ((entity.getPersistentData().getDouble("timetick")) < 102))) {
			if ((Math.random() < 0.7)) {
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (9 / 2d), y - (9 / 2d), z - (9 / 2d), x + (9 / 2d), y + (9 / 2d), z + (9 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (((!(entityiterator instanceof EvilSunwukongEntity.CustomEntity)) && (!(entityiterator instanceof ItemEntity)))) {
							if (entityiterator instanceof LivingEntity)
								((LivingEntity) entityiterator)
										.addPotionEffect(new EffectInstance(OnFirePotionEffect.potion, (int) 200, (int) 1, (false), (false)));
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 20, (int) 100));
							if (world instanceof World && !world.isRemote()) {
								((World) world)
										.playSound(null, new BlockPos((int) x, (int) y, (int) z),
												(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
														.getValue(new ResourceLocation("zaomengxiyou:lyfb")),
												SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("zaomengxiyou:lyfb")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
							for (int index0 = 0; index0 < (int) (5); index0++) {
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(LyfbdeliziParticle.particle, (x + (Math.random() * 5)), (y + 0.2),
											(z + (Math.random() * 5)), (int) 1, 2, 2, 2, 0.01);
								}
							}
							entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) (10 + ((new Object() {
								public int getScore(String score) {
									if (entity instanceof PlayerEntity) {
										Scoreboard _sc = ((PlayerEntity) entity).getWorldScoreboard();
										ScoreObjective _so = _sc.getObjective(score);
										if (_so != null) {
											Score _scr = _sc.getOrCreateScore(((PlayerEntity) entity).getScoreboardName(), _so);
											return _scr.getScorePoints();
										}
									}
									return 0;
								}
							}.getScore("level_xiyou")) * 1.5)));
							entityiterator.setMotion((((entityiterator.getPosX()) - (entity.getPosX())) * 0.4), 0.05,
									(((entityiterator.getPosZ()) - (entity.getPosZ())) * 0.4));
							entity.rotationYaw = (float) (((entity.rotationYaw) + 180));
							entity.setRenderYawOffset(entity.rotationYaw);
							entity.prevRotationYaw = entity.rotationYaw;
							if (entity instanceof LivingEntity) {
								((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
								((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
								((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
							}
							entity.rotationPitch = (float) (0);
							Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
								entity.rotationYaw = (float) (((entity.rotationYaw) + 180));
								entity.setRenderYawOffset(entity.rotationYaw);
								entity.prevRotationYaw = entity.rotationYaw;
								if (entity instanceof LivingEntity) {
									((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
									((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
									((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
								}
								entity.rotationPitch = (float) (0);
							}, 500, TimeUnit.MILLISECONDS);
						}
					}
				}
			}
		}
		if ((((entity.getPersistentData().getDouble("timetick")) >= 200) && ((entity.getPersistentData().getDouble("timetick")) > 201))) {
			if ((Math.random() < 0.7)) {
				{
					List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (4.8 / 2d), y - (4.8 / 2d), z - (4.8 / 2d), x + (4.8 / 2d), y + (4.8 / 2d), z + (4.8 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (((!(entityiterator instanceof ItemEntity)) && (!(entityiterator instanceof EvilSunwukongEntity.CustomEntity)))) {
							if (entityiterator instanceof LivingEntity)
								((LivingEntity) entityiterator)
										.addPotionEffect(new EffectInstance(OnFirePotionEffect.potion, (int) 200, (int) 2, (false), (false)));
							entityiterator.setMotion((((entityiterator.getPosX()) - (entity.getPosX())) * 0.2), 0.8,
									(((entityiterator.getPosZ()) - (entity.getPosZ())) * 0.2));
							entityiterator.attackEntityFrom(DamageSource.MAGIC, (float) 20);
						}
					}
				}
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(SlzParticle.particle, x, y, z, (int) 10, 3, 3, 3, 0.2);
				}
				{
					double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) - 5);
					entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.mp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					FireslashboomProcedure.executeProcedure($_dependencies);
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zaomengxiyou:firedemon")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zaomengxiyou:firedemon")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				entity.setNoGravity((true));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60, (int) 8, (false), (false)));
				entity.setMotion(0, 0.6, 0);
				{
					List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (10 / 2d), (y + 4) - (10 / 2d), z - (10 / 2d), x + (10 / 2d), (y + 4) + (10 / 2d), z + (10 / 2d)),
							null).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, (y + 4), z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (((!(entityiterator instanceof ItemEntity)) && (!(entityiterator instanceof EvilSunwukongEntity.CustomEntity)))) {
							if (entityiterator instanceof LivingEntity)
								((LivingEntity) entityiterator)
										.addPotionEffect(new EffectInstance(OnFirePotionEffect.potion, (int) 200, (int) 2, (false), (false)));
							entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 18);
							entityiterator.setMotion(0, 0.8, 0);
						}
					}
				}
				Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
					entity.setNoGravity((false));
					entity.fallDistance = (float) (200);
					entity.setMotion(0, (-10), 0);
					{
						List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (4 / 2d), (y + 0.2) - (4 / 2d), z - (4 / 2d), x + (4 / 2d), (y + 0.2) + (4 / 2d), z + (4 / 2d)),
								null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, (y + 0.2), z)).collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (((!(entityiterator instanceof EvilSunwukongEntity.CustomEntity))
									&& (!(entityiterator instanceof Baigujing1Entity.CustomEntity)))) {
								entityiterator.attackEntityFrom(DamageSource.MAGIC, (float) 27);
							}
						}
					}
					if (world instanceof World && !((World) world).isRemote) {
						((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 0, Explosion.Mode.BREAK);
					}
				}, 1500, TimeUnit.MILLISECONDS);
			}
			entity.getPersistentData().putDouble("timetick", 0);
		}
	}
}
