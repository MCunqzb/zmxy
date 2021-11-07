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
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Score;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.entity.XxuanbingEntity;
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
import java.util.Collections;

public class AnjianlysSongKaiAnJianShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure AnjianlysSongKaiAnJianShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure AnjianlysSongKaiAnJianShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure AnjianlysSongKaiAnJianShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure AnjianlysSongKaiAnJianShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure AnjianlysSongKaiAnJianShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double l = 0;
		double i = 0;
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			BugstatementProcedure.executeProcedure($_dependencies);
		}
		if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ZaomengxiyouModVariables.PlayerVariables())).choice) == 1)) {
			if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) >= 10)) {
				entity.setMotion(
						(0.5 * ((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10, entity.getLook(1f).z * 10),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()) - (entity
										.getPosX()))),
						(3 * (entity.getMotion().getY())),
						(0.5 * ((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10, entity.getLook(1f).z * 10),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()) - (entity.getPosZ()))));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 10, (int) 10));
				{
					double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) - 10);
					entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.mp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zaomengxiyou:lys")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zaomengxiyou:lys")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
			} else if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) <= 10)) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((new TranslationTextComponent("mp.low").getString())), (false));
				}
			}
		} else if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ZaomengxiyouModVariables.PlayerVariables())).choice) == 2)) {
			ZaomengxiyouModVariables.MapVariables.get(world).xuanbing = (double) 18;
			ZaomengxiyouModVariables.MapVariables.get(world).syncData(world);
			if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) < 15)) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((new TranslationTextComponent("mp.low").getString())), (false));
				}
			} else if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) >= 15)) {
				if ((!(((Entity) world
						.getEntitiesWithinAABB(XxuanbingEntity.CustomEntity.class,
								new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null))) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 20, (int) 4, (false), (false)));
					{
						double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) - 15);
						entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.mp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + 2), y, z, (float) 270, (float) ((new Object() {
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
						}.getScore("level_xiyou")) / (-10)));
						entityToSpawn.setRenderYawOffset((float) 270);
						entityToSpawn.setRotationYawHead((float) 270);
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + 2), y, (z + 1), (float) 270, (float) ((new Object() {
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
						}.getScore("level_xiyou")) / (-10)));
						entityToSpawn.setRenderYawOffset((float) 270);
						entityToSpawn.setRotationYawHead((float) 270);
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + 2), y, (z - 1), (float) 270, (float) ((new Object() {
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
						}.getScore("level_xiyou")) / (-10)));
						entityToSpawn.setRenderYawOffset((float) 270);
						entityToSpawn.setRotationYawHead((float) 270);
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x - 2), y, (z - 1), (float) 90, (float) ((new Object() {
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
						}.getScore("level_xiyou")) / (-10)));
						entityToSpawn.setRenderYawOffset((float) 90);
						entityToSpawn.setRotationYawHead((float) 90);
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x - 2), y, (z + 1), (float) 90, (float) ((new Object() {
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
						}.getScore("level_xiyou")) / (-10)));
						entityToSpawn.setRenderYawOffset((float) 90);
						entityToSpawn.setRotationYawHead((float) 90);
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x - 2), y, z, (float) 90, (float) ((new Object() {
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
						}.getScore("level_xiyou")) / (-10)));
						entityToSpawn.setRenderYawOffset((float) 90);
						entityToSpawn.setRotationYawHead((float) 90);
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + 1), y, (z - 2), (float) 180, (float) ((new Object() {
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
						}.getScore("level_xiyou")) / (-10)));
						entityToSpawn.setRenderYawOffset((float) 180);
						entityToSpawn.setRotationYawHead((float) 180);
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, (z - 2), (float) 180, (float) ((new Object() {
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
						}.getScore("level_xiyou")) / (-10)));
						entityToSpawn.setRenderYawOffset((float) 180);
						entityToSpawn.setRotationYawHead((float) 180);
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x - 1), y, (z - 2), (float) 180, (float) ((new Object() {
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
						}.getScore("level_xiyou")) / (-10)));
						entityToSpawn.setRenderYawOffset((float) 180);
						entityToSpawn.setRotationYawHead((float) 180);
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, (z + 2), (float) 0, (float) ((new Object() {
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
						}.getScore("level_xiyou")) / (-10)));
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x - 1), y, (z + 2), (float) 0, (float) ((new Object() {
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
						}.getScore("level_xiyou")) / (-10)));
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + 1), y, (z + 2), (float) 0, (float) ((new Object() {
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
						}.getScore("level_xiyou")) / (-10)));
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
		} else if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ZaomengxiyouModVariables.PlayerVariables())).choice) == 3)) {
			if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ZaomengxiyouModVariables.PlayerVariables())).choice) == 3)) {
				if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) >= 30)) {
					{
						double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) - 30);
						entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.mp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					i = (double) 0.3;
					{
						List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if ((entityiterator instanceof MonsterEntity)) {
								entityiterator.setMotion((((entity.getPosX()) - (entityiterator.getPosX())) * i),
										((((entity.getPosY()) + 2) - (entityiterator.getPosY())) * i),
										(((entity.getPosZ()) - (entityiterator.getPosZ())) * i));
								Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
									entityiterator.setMotion(0, 0, 0);
									{
										Entity _ent = entityiterator;
										_ent.setPositionAndUpdate((entity.getPosX()), ((entity.getPosY()) + 3), (entity.getPosZ()));
										if (_ent instanceof ServerPlayerEntity) {
											((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), ((entity.getPosY()) + 3),
													(entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
										}
									}
								}, 200, TimeUnit.MILLISECONDS);
							}
						}
					}
				} else {
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((new TranslationTextComponent("mp.low").getString())),
								(false));
					}
				}
			} else {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((new TranslationTextComponent("not.professional").getString())),
							(false));
				}
			}
		}
	}
}
