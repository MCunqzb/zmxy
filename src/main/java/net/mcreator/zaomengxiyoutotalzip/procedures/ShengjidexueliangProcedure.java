package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Score;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;
import java.util.HashMap;

public class ShengjidexueliangProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure Shengjidexueliang!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure Shengjidexueliang!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure Shengjidexueliang!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure Shengjidexueliang!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure Shengjidexueliang!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((ZaomengxiyouModVariables.MapVariables.get(world).world_num < 3)) {
			if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ZaomengxiyouModVariables.PlayerVariables())).choice) == 1)) {
				if ((((new Object() {
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
				}.getScore("level_xiyou")) >= 2) && ((new Object() {
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
				}.getScore("level_xiyou")) < 8))) {
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								(("attribute @p minecraft:generic.max_health base set ") + "" + ((((new Object() {
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
								}.getScore("level_xiyou")) * 2) + 18))));
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								(("attribute @p minecraft:generic.armor base set ") + "" + ((((new Object() {
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
								}.getScore("level_xiyou")) * 0.5) + 0))));
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								(("attribute@p minecraft:generic.attack_damage base set ") + "" + ((((new Object() {
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
								}.getScore("level_xiyou")) * 0.5) + 0.5))));
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
				}.getScore("level_xiyou")) >= 8) && ((new Object() {
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
				}.getScore("level_xiyou")) < 14))) {
					for (int index0 = 0; index0 < (int) (1); index0++) {
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									(("attribute @p minecraft:generic.max_health base set ") + "" + ((((new Object() {
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
									}.getScore("level_xiyou")) * 4) + 6))));
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									(("attribute @p minecraft:generic.armor base set ") + "" + ((((new Object() {
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
									}.getScore("level_xiyou")) * 0.7) - 0.4))));
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									(("attribute @p minecraft:generic.attack_damage base set ") + "" + ((((new Object() {
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
									}.getScore("level_xiyou")) * 1) - 4))));
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
				}.getScore("level_xiyou")) >= 14) && ((new Object() {
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
				}.getScore("level_xiyou")) < 21))) {
					for (int index1 = 0; index1 < (int) (1); index1++) {
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									(("attribute @p minecraft:generic.max_health base set ") + "" + ((((new Object() {
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
									}.getScore("level_xiyou")) * 6) - 20))));
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									(("attribute @p minecraft:generic.armor base set ") + "" + ((((new Object() {
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
									}.getScore("level_xiyou")) * 0.85) - 2.8))));
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									(("attribute @p minecraft:generic.attack_damage base set ") + "" + ((((new Object() {
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
									}.getScore("level_xiyou")) * 1.3) - 5.2))));
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
				}.getScore("level_xiyou")) >= 21) && ((new Object() {
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
				}.getScore("level_xiyou")) < 28))) {
					for (int index2 = 0; index2 < (int) (1); index2++) {
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									(("attribute @p minecraft:generic.max_health base set ") + "" + ((((new Object() {
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
									}.getScore("level_xiyou")) * 8) - 48))));
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									(("attribute @p minecraft:generic.armor base set ") + "" + ((((new Object() {
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
									}.getScore("level_xiyou")) * 1) - 4))));
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									(("attribute @p minecraft:generic.attack_damage base set ") + "" + ((((new Object() {
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
									}.getScore("level_xiyou")) * 1.6) - 7.6))));
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
				}.getScore("level_xiyou")) >= 28) && ((new Object() {
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
				}.getScore("level_xiyou")) < 35))) {
					for (int index3 = 0; index3 < (int) (1); index3++) {
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									(("attribute @p minecraft:generic.max_health base set ") + "" + ((((new Object() {
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
									}.getScore("level_xiyou")) * 9) - 76))));
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									(("attribute @p minecraft:generic.armor base set ") + "" + ((((new Object() {
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
									}.getScore("level_xiyou")) * 1) - 4))));
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									(("attribute@p minecraft:generic.attack_damage base set ") + "" + ((((new Object() {
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
									}.getScore("level_xiyou")) * 1.8) - 13.2))));
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
				}.getScore("level_xiyou")) >= 35) && ((new Object() {
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
				}.getScore("level_xiyou")) < 41))) {
					for (int index4 = 0; index4 < (int) (1); index4++) {
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									(("attribute @p minecraft:generic.max_health base set ") + "" + ((((new Object() {
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
									}.getScore("level_xiyou")) * 10) - 111))));
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									(("attribute @p minecraft:generic.armor base set ") + "" + ((((new Object() {
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
									}.getScore("level_xiyou")) * 1) - 4))));
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									(("attribute @p minecraft:generic.attack_damage base set ") + "" + ((((new Object() {
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
									}.getScore("level_xiyou")) * 1.9) - 16.7))));
						}
					}
				}
			}
		}
	}
}
