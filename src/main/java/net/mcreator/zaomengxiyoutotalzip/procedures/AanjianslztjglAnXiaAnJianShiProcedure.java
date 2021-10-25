package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Score;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.particle.SlzParticle;
import net.mcreator.zaomengxiyoutotalzip.particle.EggreliveParticle;
import net.mcreator.zaomengxiyoutotalzip.entity.MoundEntity;
import net.mcreator.zaomengxiyoutotalzip.entity.ArgillaceousshieldEntity;
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

public class AanjianslztjglAnXiaAnJianShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure AanjianslztjglAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure AanjianslztjglAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure AanjianslztjglAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure AanjianslztjglAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure AanjianslztjglAnXiaAnJianShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			BugstatementProcedure.executeProcedure($_dependencies);
		}
		if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ZaomengxiyouModVariables.PlayerVariables())).choice) == 1)) {
			if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) >= 5)) {
				{
					List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (4.8 / 2d), y - (4.8 / 2d), z - (4.8 / 2d), x + (4.8 / 2d), y + (4.8 / 2d), z + (4.8 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (((!(entityiterator instanceof ItemEntity)) && (!(entityiterator instanceof PlayerEntity)))) {
							entityiterator.setMotion((((entityiterator.getPosX()) - (entity.getPosX())) * 0.2), 0.8,
									(((entityiterator.getPosZ()) - (entity.getPosZ())) * 0.2));
							entityiterator.attackEntityFrom(DamageSource.MAGIC,
									(float) ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1) / 10)
											+ ((new Object() {
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
											}.getScore("level_xiyou")) / 4)));
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
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u84DD\u91CF\u4E0D\u8DB35\u70B9"), (false));
				}
			}
		} else if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ZaomengxiyouModVariables.PlayerVariables())).choice) == 2)) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zaomengxiyou:tjgl")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zaomengxiyou:tjgl")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
			world.addParticle(EggreliveParticle.particle, x, (y + 2.2), z, 0, 0, 0);
			if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ZaomengxiyouModVariables.PlayerVariables())).choice) == 2)) {
				if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) < 30)) {
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7b\u84DD\u91CF\u4E0D\u8DB3"), (false));
					}
				} else if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) >= 30)) {
					{
						double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) - 0);
						entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.mp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (((new Object() {
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
					}.getScore("level_xiyou")) >= 21)) {
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if ((!(entityiterator instanceof MobEntity))) {
									if (entityiterator instanceof LivingEntity)
										((LivingEntity) entityiterator)
												.heal((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) * 0.17));
								}
							}
						}
					} else if ((((new Object() {
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
					}.getScore("level_xiyou")) < 21) && ((new Object() {
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
					}.getScore("level_xiyou")) >= 14))) {
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if ((!(entityiterator instanceof MobEntity))) {
									if (entityiterator instanceof LivingEntity)
										((LivingEntity) entityiterator)
												.heal((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) * 0.14));
								}
							}
						}
					} else if ((((new Object() {
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
					}.getScore("level_xiyou")) < 14) && ((new Object() {
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
					}.getScore("level_xiyou")) >= 7))) {
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if ((!(entityiterator instanceof ArgillaceousshieldEntity.CustomEntity))) {
									if (entityiterator instanceof LivingEntity)
										((LivingEntity) entityiterator)
												.heal((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) * 0.11));
								}
							}
						}
					} else {
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if ((!(entityiterator instanceof MobEntity))) {
									if (entityiterator instanceof LivingEntity)
										((LivingEntity) entityiterator)
												.heal((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) * 0.08));
								}
							}
						}
					}
				}
			} else {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u804C\u4E1A\u4E0D\u662F\u5510\u50E7\uFF01"), (false));
				}
			}
		}
		if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ZaomengxiyouModVariables.PlayerVariables())).choice) == 3)) {
			if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) >= 5)) {
				{
					double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) - 5);
					entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.mp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zaomengxiyou:suishipo")),
							SoundCategory.PLAYERS, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zaomengxiyou:suishipo")),
							SoundCategory.PLAYERS, (float) 1, (float) 1, false);
				}
				if ((!(((Entity) world
						.getEntitiesWithinAABB(MoundEntity.CustomEntity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null))) {
					if ((entity.isOnGround())) {
						entity.rotationYaw = (float) ((entity.rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entity.rotationPitch = (float) (10);
						entity.setMotion(0, 0.2, 0);
						Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new MoundEntity.CustomEntity(MoundEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(
										(x + (0.2 * ((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f)
														.add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10, entity.getLook(1f).z * 10),
												RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()) - x))),
										y,
										(z + (0.2 * ((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
														entity.getLook(1f).z * 10),
												RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()) - z))),
										(float) (entity.rotationYaw), (float) ((new Object() {
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
										}.getScore("level_xiyou")) + (15 / (new Object() {
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
										}.getScore("level_xiyou")))));
								entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
								entityToSpawn.setRotationYawHead((float) (entity.rotationYaw));
								entityToSpawn.setMotion(0, 0, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
						}, 300, TimeUnit.MILLISECONDS);
					} else {
						entity.setMotion(0, (-20), 0);
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new MoundEntity.CustomEntity(MoundEntity.entity, (World) world);
							entityToSpawn
									.setLocationAndAngles(
											(x + (0.3
													* ((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
															entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
																	entity.getLook(1f).z * 10),
															RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos()
															.getX()) - x))),
											y, (z
													+ (0.3 * ((entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 10,
																			entity.getLook(1f).y * 10, entity.getLook(1f).z * 10),
																	RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getZ()) - z))),
											(float) (entity.rotationYaw), (float) ((new Object() {
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
											}.getScore("level_xiyou")) + 10));
							entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
							entityToSpawn.setRotationYawHead((float) (entity.rotationYaw));
							entityToSpawn.setMotion(0, (-100), 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						entity.fallDistance = (float) (0);
					}
				}
			} else {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((new TranslationTextComponent("mp.low").getString())), (false));
				}
			}
		}
	}
}
