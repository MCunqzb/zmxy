package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
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
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.zaomengxiyoutotalzip.item.WaterDemonBlastItem;
import net.mcreator.zaomengxiyoutotalzip.item.FiredemonslashItem;
import net.mcreator.zaomengxiyoutotalzip.entity.XhzEntity;
import net.mcreator.zaomengxiyoutotalzip.entity.WaterboomcircleEntity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Comparator;

public class AnjianshuimobaohomozhanAnXiaAnJianShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure AnjianshuimobaohomozhanAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure AnjianshuimobaohomozhanAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure AnjianshuimobaohomozhanAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure AnjianshuimobaohomozhanAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure AnjianshuimobaohomozhanAnXiaAnJianShi!");
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
			if (((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(FiredemonslashItem.block))
					: false)) {
				if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) >= 100)) {
					{
						Map<String, Object> $_dependencies = new HashMap<>();
						$_dependencies.put("x", x);
						$_dependencies.put("y", y);
						$_dependencies.put("z", z);
						$_dependencies.put("world", world);
						FireslashboomProcedure.executeProcedure($_dependencies);
					}
					{
						double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) - 100);
						entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.mp = _setval;
							capability.syncPlayerVariables(entity);
						});
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
						List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(x - (10 / 2d), (y + 4) - (10 / 2d),
								z - (10 / 2d), x + (10 / 2d), (y + 4) + (10 / 2d), z + (10 / 2d)), null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, (y + 4), z)).collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (((!(entityiterator instanceof PlayerEntity)) && (!(entityiterator instanceof ItemEntity)))) {
								entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) (((new Object() {
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
								}.getScore("level_xiyou")) * 1) + 9));
								entityiterator.setMotion(0, 0.8, 0);
							}
						}
					}
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;
						public void start(IWorld world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							entity.setNoGravity((false));
							entity.fallDistance = (float) (200);
							entity.setMotion(0, (-10), 0);
							{
								List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(x - (4 / 2d),
										(y + 0.2) - (4 / 2d), z - (4 / 2d), x + (4 / 2d), (y + 0.2) + (4 / 2d), z + (4 / 2d)), null).stream()
										.sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(x, (y + 0.2), z)).collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (((!(entityiterator instanceof XhzEntity.CustomEntity)) && (!(entityiterator instanceof ItemEntity)))) {
										entityiterator.attackEntityFrom(DamageSource.MAGIC, (float) (((new Object() {
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
										}.getScore("level_xiyou")) * 2) + 10));
									}
								}
							}
							if (world instanceof World && !((World) world).isRemote) {
								((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 0, Explosion.Mode.BREAK);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 28);
				} else {
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((new TranslationTextComponent("mp.low").getString())),
								(true));
					}
				}
			} else {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((new TranslationTextComponent("no.skill").getString())),
							(true));
				}
			}
		} else if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ZaomengxiyouModVariables.PlayerVariables())).choice) == 2)) {
			if (((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(WaterDemonBlastItem.block))
					: false)) {
				if (((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) - 120) > 0)) {
					if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ZaomengxiyouModVariables.PlayerVariables())).waterboomnum) == (false))) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new WaterboomcircleEntity.CustomEntity(WaterboomcircleEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) (entity.rotationYaw), (float) 0);
							entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
							entityToSpawn.setRotationYawHead((float) (entity.rotationYaw));
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.waterboomnum = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) - 20);
							entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.mp = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
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
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private IWorld world;
							public void start(IWorld world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ZaomengxiyouModVariables.PlayerVariables())).waterboomnum) == (true))) {
									{
										boolean _setval = (boolean) (false);
										entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.waterboomnum = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 103);
					} else {
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager()
									.handleCommand(
											new CommandSource(ICommandSource.DUMMY,
													new Vector3d(
															(((Entity) world
																	.getEntitiesWithinAABB(WaterboomcircleEntity.CustomEntity.class,
																			new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d),
																					x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)),
																			null)
																	.stream().sorted(new Object() {
																		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																			return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																					.getDistanceSq(_x, _y, _z)));
																		}
																	}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosX()),
															(((Entity) world
																	.getEntitiesWithinAABB(WaterboomcircleEntity.CustomEntity.class,
																			new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d),
																					x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)),
																			null)
																	.stream().sorted(new Object() {
																		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																			return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																					.getDistanceSq(_x, _y, _z)));
																		}
																	}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosY()),
															(((Entity) world
																	.getEntitiesWithinAABB(WaterboomcircleEntity.CustomEntity.class,
																			new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d),
																					x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)),
																			null)
																	.stream().sorted(new Object() {
																		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																			return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																					.getDistanceSq(_x, _y, _z)));
																		}
																	}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosZ())),
													Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""),
													((World) world).getServer(), null).withFeedbackDisabled(),
											(("summon zaomengxiyou:waterfall ~ ~ ~ {Health:") + ""
													+ (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.orElse(new ZaomengxiyouModVariables.PlayerVariables())).level))
													+ "" + ("}")));
						}
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("entity.dragon_fireball.explode")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("entity.dragon_fireball.explode")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						{
							double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) - 100);
							entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.mp = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.waterboomnum = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).removePotionEffect(Effects.LEVITATION);
						}
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 25, (int) 0, (false), (false)));
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.waterboomnum = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else {
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7l\u00A71\u84DD\u91CF\u4E0D\u8DB3"), (true));
					}
				}
			} else {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((new TranslationTextComponent("no.skill").getString())),
							(true));
				}
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((new TranslationTextComponent("not.sunwukong").getString())),
						(true));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7l\u00A71\u804C\u4E1A\u4E0D\u662F\u5510\u50E7\u3002"),
						(true));
			}
		}
	}
}