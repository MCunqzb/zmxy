package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Score;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.entity.MoundEntity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.Map;

public class StonebrokenDangYouJianDianJiKongQiShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure StonebrokenDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency itemstack for procedure StonebrokenDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure StonebrokenDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure StonebrokenDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure StonebrokenDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure StonebrokenDangYouJianDianJiKongQiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
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
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown((itemstack).getItem(), (int) 20);
					entity.setMotion(0, 0.2, 0);
					Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new MoundEntity.CustomEntity(MoundEntity.entity, (World) world);
							entityToSpawn
									.setLocationAndAngles(
											(x + (0.2
													* ((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
															entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
																	entity.getLook(1f).z * 10),
															RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos()
															.getX()) - x))),
											y, (z
													+ (0.2 * ((entity.world
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
										(x + (0.3 * ((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
														entity.getLook(1f).z * 10),
												RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX())
												- x))),
										y,
										(z + (0.3 * ((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
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
										}.getScore("level_xiyou")) + 10));
						entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
						entityToSpawn.setRotationYawHead((float) (entity.rotationYaw));
						entityToSpawn.setMotion(0, (-100), 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					entity.fallDistance = (float) (0);
				}
			} else {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((new TranslationTextComponent("mp.low").getString())), (false));
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
