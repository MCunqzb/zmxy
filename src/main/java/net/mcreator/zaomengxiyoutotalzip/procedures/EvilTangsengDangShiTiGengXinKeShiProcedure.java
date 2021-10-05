package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.zaomengxiyoutotalzip.particle.EggreliveParticle;
import net.mcreator.zaomengxiyoutotalzip.entity.WaterboomcircleEntity;
import net.mcreator.zaomengxiyoutotalzip.entity.EvilxuanbingEntity;
import net.mcreator.zaomengxiyoutotalzip.entity.EvilIcedragonEntity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.function.Function;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.Map;
import java.util.Comparator;

public class EvilTangsengDangShiTiGengXinKeShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure EvilTangsengDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure EvilTangsengDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure EvilTangsengDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure EvilTangsengDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure EvilTangsengDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		entity.getPersistentData().putDouble("timetick", ((entity.getPersistentData().getDouble("timetick")) + 1));
		if ((((entity.getPersistentData().getDouble("timetick")) >= 100) && ((entity.getPersistentData().getDouble("timetick")) < 101))) {
			if ((Math.random() < 0.7)) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new EvilIcedragonEntity.CustomEntity(EvilIcedragonEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, (y + 0.6), z, (float) (entity.rotationYaw), (float) (10 / 10));
					entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
					entityToSpawn.setRotationYawHead((float) (entity.rotationYaw));
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			} else {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).heal((float) 75);
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 100, (int) 3, (false), (false)));
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
			}
		}
		if ((((entity.getPersistentData().getDouble("timetick")) >= 250) && ((entity.getPersistentData().getDouble("timetick")) < 251))) {
			entity.getPersistentData().putDouble("timetick", 1);
			if ((Math.random() < 0.7)) {
				ZaomengxiyouModVariables.MapVariables.get(world).evilxuanbing = (double) 12;
				ZaomengxiyouModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 20, (int) 4, (false), (false)));
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new EvilxuanbingEntity.CustomEntity(EvilxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x + 2), y, z, (float) 270, (float) (5 / (-10)));
					entityToSpawn.setRenderYawOffset((float) 270);
					entityToSpawn.setRotationYawHead((float) 270);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new EvilxuanbingEntity.CustomEntity(EvilxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x + 2), y, (z + 1), (float) 270, (float) (5 / (-10)));
					entityToSpawn.setRenderYawOffset((float) 270);
					entityToSpawn.setRotationYawHead((float) 270);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new EvilxuanbingEntity.CustomEntity(EvilxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x + 2), y, (z - 1), (float) 270, (float) (5 / (-10)));
					entityToSpawn.setRenderYawOffset((float) 270);
					entityToSpawn.setRotationYawHead((float) 270);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new EvilxuanbingEntity.CustomEntity(EvilxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x - 2), y, (z - 1), (float) 90, (float) (5 / (-10)));
					entityToSpawn.setRenderYawOffset((float) 90);
					entityToSpawn.setRotationYawHead((float) 90);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new EvilxuanbingEntity.CustomEntity(EvilxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x - 2), y, (z + 1), (float) 90, (float) (5 / (-10)));
					entityToSpawn.setRenderYawOffset((float) 90);
					entityToSpawn.setRotationYawHead((float) 90);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new EvilxuanbingEntity.CustomEntity(EvilxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x - 2), y, z, (float) 90, (float) (5 / (-10)));
					entityToSpawn.setRenderYawOffset((float) 90);
					entityToSpawn.setRotationYawHead((float) 90);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new EvilxuanbingEntity.CustomEntity(EvilxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x + 1), y, (z - 2), (float) 180, (float) (5 / (-10)));
					entityToSpawn.setRenderYawOffset((float) 180);
					entityToSpawn.setRotationYawHead((float) 180);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new EvilxuanbingEntity.CustomEntity(EvilxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, (z - 2), (float) 180, (float) (5 / (-10)));
					entityToSpawn.setRenderYawOffset((float) 180);
					entityToSpawn.setRotationYawHead((float) 180);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new EvilxuanbingEntity.CustomEntity(EvilxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x - 1), y, (z - 2), (float) 180, (float) (5 / (-10)));
					entityToSpawn.setRenderYawOffset((float) 180);
					entityToSpawn.setRotationYawHead((float) 180);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new EvilxuanbingEntity.CustomEntity(EvilxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, (z + 2), (float) 0, (float) (5 / (-10)));
					entityToSpawn.setRenderYawOffset((float) 0);
					entityToSpawn.setRotationYawHead((float) 0);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new EvilxuanbingEntity.CustomEntity(EvilxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x - 1), y, (z + 2), (float) 0, (float) (5 / (-10)));
					entityToSpawn.setRenderYawOffset((float) 0);
					entityToSpawn.setRotationYawHead((float) 0);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new EvilxuanbingEntity.CustomEntity(EvilxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x + 1), y, (z + 2), (float) 0, (float) (5 / (-10)));
					entityToSpawn.setRenderYawOffset((float) 0);
					entityToSpawn.setRotationYawHead((float) 0);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new WaterboomcircleEntity.CustomEntity(WaterboomcircleEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, (float) (entity.rotationYaw), (float) 0);
					entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
					entityToSpawn.setRotationYawHead((float) (entity.rotationYaw));
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("block.enchantment_table.use")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("block.enchantment_table.use")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 100, (int) 0, (false), (false)));
				Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager()
								.handleCommand(new CommandSource(ICommandSource.DUMMY,
										new Vector3d((((Entity) world
												.getEntitiesWithinAABB(WaterboomcircleEntity.CustomEntity.class, new AxisAlignedBB(x - (50 / 2d),
														y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosX()),
												(((Entity) world
														.getEntitiesWithinAABB(
																WaterboomcircleEntity.CustomEntity.class, new AxisAlignedBB(x - (50 / 2d),
																		y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)),
																null)
														.stream().sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparing(
																		(Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
															}
														}.compareDistOf(x, y,
																z))
														.findFirst().orElse(null)).getPosY()),
												(((Entity) world
														.getEntitiesWithinAABB(
																WaterboomcircleEntity.CustomEntity.class, new AxisAlignedBB(x - (50 / 2d),
																		y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)),
																null)
														.stream().sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparing(
																		(Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
															}
														}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosZ())),
										Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
												.withFeedbackDisabled(),
										(("summon zaomengxiyou:evilwaterfall ~ ~ ~ {Health:") + "" + (16) + "" + ("}")));
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
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(Effects.LEVITATION);
					}
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 25, (int) 0, (false), (false)));
				}, 1500, TimeUnit.MILLISECONDS);
			}
		}
	}
}
