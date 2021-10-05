package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.Score;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.item.XuehaixiehuangItem;
import net.mcreator.zaomengxiyoutotalzip.item.JiuhuanchangzhangItem;
import net.mcreator.zaomengxiyoutotalzip.item.DdishaquanzhangItem;
import net.mcreator.zaomengxiyoutotalzip.item.BolangguItem;
import net.mcreator.zaomengxiyoutotalzip.item.BaihuzahngItem;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;
import java.util.HashMap;

public class TangsengweaponhuilanProcedure {
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
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure Tangsengweaponhuilan!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ZaomengxiyouModVariables.PlayerVariables())).choice) == 2)) {
			if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == DdishaquanzhangItem.block)
					|| (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == DdishaquanzhangItem.block))) {
				entity.getPersistentData().putDouble("hl", ((entity.getPersistentData().getDouble("hl")) + 1));
				if ((((entity.getPersistentData().getDouble("hl")) - 40) >= 0)) {
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
					}.getScore("MP")) < ((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mpglobal))) {
						{
							Entity _ent = entity;
							if (_ent instanceof PlayerEntity) {
								Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
								ScoreObjective _so = _sc.getObjective("MP");
								if (_so == null) {
									_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"),
											ScoreCriteria.RenderType.INTEGER);
								}
								Score _scr = _sc.getOrCreateScore(((PlayerEntity) _ent).getScoreboardName(), _so);
								_scr.setScorePoints((int) ((new Object() {
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
								}.getScore("MP")) + 2));
							}
						}
						entity.getPersistentData().putDouble("hl", 0);
					} else {
						{
							Entity _ent = entity;
							if (_ent instanceof PlayerEntity) {
								Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
								ScoreObjective _so = _sc.getObjective("MP");
								if (_so == null) {
									_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"),
											ScoreCriteria.RenderType.INTEGER);
								}
								Score _scr = _sc.getOrCreateScore(((PlayerEntity) _ent).getScoreboardName(), _so);
								_scr.setScorePoints((int) ((new Object() {
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
								}.getScore("MP")) + 0));
							}
						}
						entity.getPersistentData().putDouble("hl", 0);
					}
				}
			}
			if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == BaihuzahngItem.block)
					|| (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == BaihuzahngItem.block))) {
				entity.getPersistentData().putDouble("hl", ((entity.getPersistentData().getDouble("hl")) + 1));
				if ((((entity.getPersistentData().getDouble("hl")) - 40) >= 0)) {
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
					}.getScore("MP")) < ((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mpglobal))) {
						{
							Entity _ent = entity;
							if (_ent instanceof PlayerEntity) {
								Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
								ScoreObjective _so = _sc.getObjective("MP");
								if (_so == null) {
									_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"),
											ScoreCriteria.RenderType.INTEGER);
								}
								Score _scr = _sc.getOrCreateScore(((PlayerEntity) _ent).getScoreboardName(), _so);
								_scr.setScorePoints((int) ((new Object() {
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
								}.getScore("MP")) + 4));
							}
						}
						entity.getPersistentData().putDouble("hl", 0);
					} else {
						{
							Entity _ent = entity;
							if (_ent instanceof PlayerEntity) {
								Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
								ScoreObjective _so = _sc.getObjective("MP");
								if (_so == null) {
									_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"),
											ScoreCriteria.RenderType.INTEGER);
								}
								Score _scr = _sc.getOrCreateScore(((PlayerEntity) _ent).getScoreboardName(), _so);
								_scr.setScorePoints((int) ((new Object() {
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
								}.getScore("MP")) + 0));
							}
						}
						entity.getPersistentData().putDouble("hl", 0);
					}
				}
			}
			if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == XuehaixiehuangItem.block)
					|| (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == XuehaixiehuangItem.block))) {
				entity.getPersistentData().putDouble("hl", ((entity.getPersistentData().getDouble("hl")) + 1));
				if ((((entity.getPersistentData().getDouble("hl")) - 40) >= 0)) {
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
					}.getScore("MP")) < ((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mpglobal))) {
						{
							Entity _ent = entity;
							if (_ent instanceof PlayerEntity) {
								Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
								ScoreObjective _so = _sc.getObjective("MP");
								if (_so == null) {
									_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"),
											ScoreCriteria.RenderType.INTEGER);
								}
								Score _scr = _sc.getOrCreateScore(((PlayerEntity) _ent).getScoreboardName(), _so);
								_scr.setScorePoints((int) ((new Object() {
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
								}.getScore("MP")) + 6));
							}
						}
						entity.getPersistentData().putDouble("hl", 0);
					} else {
						{
							Entity _ent = entity;
							if (_ent instanceof PlayerEntity) {
								Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
								ScoreObjective _so = _sc.getObjective("MP");
								if (_so == null) {
									_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"),
											ScoreCriteria.RenderType.INTEGER);
								}
								Score _scr = _sc.getOrCreateScore(((PlayerEntity) _ent).getScoreboardName(), _so);
								_scr.setScorePoints((int) ((new Object() {
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
								}.getScore("MP")) + 0));
							}
						}
						entity.getPersistentData().putDouble("hl", 0);
					}
				}
			}
			if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == JiuhuanchangzhangItem.block)
					|| (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == JiuhuanchangzhangItem.block))) {
				entity.getPersistentData().putDouble("hl", ((entity.getPersistentData().getDouble("hl")) + 1));
				if ((((entity.getPersistentData().getDouble("hl")) - 40) >= 0)) {
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
					}.getScore("MP")) < ((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mpglobal))) {
						{
							Entity _ent = entity;
							if (_ent instanceof PlayerEntity) {
								Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
								ScoreObjective _so = _sc.getObjective("MP");
								if (_so == null) {
									_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"),
											ScoreCriteria.RenderType.INTEGER);
								}
								Score _scr = _sc.getOrCreateScore(((PlayerEntity) _ent).getScoreboardName(), _so);
								_scr.setScorePoints((int) ((new Object() {
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
								}.getScore("MP")) + 8));
							}
						}
						entity.getPersistentData().putDouble("hl", 0);
					} else {
						{
							Entity _ent = entity;
							if (_ent instanceof PlayerEntity) {
								Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
								ScoreObjective _so = _sc.getObjective("MP");
								if (_so == null) {
									_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"),
											ScoreCriteria.RenderType.INTEGER);
								}
								Score _scr = _sc.getOrCreateScore(((PlayerEntity) _ent).getScoreboardName(), _so);
								_scr.setScorePoints((int) ((new Object() {
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
								}.getScore("MP")) + 0));
							}
						}
						entity.getPersistentData().putDouble("hl", 0);
					}
				}
			}
			if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == BolangguItem.block)
					|| (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == BolangguItem.block))) {
				entity.getPersistentData().putDouble("hl", ((entity.getPersistentData().getDouble("hl")) + 1));
				if ((((entity.getPersistentData().getDouble("hl")) - 40) >= 0)) {
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
					}.getScore("MP")) < ((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mpglobal))) {
						{
							Entity _ent = entity;
							if (_ent instanceof PlayerEntity) {
								Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
								ScoreObjective _so = _sc.getObjective("MP");
								if (_so == null) {
									_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"),
											ScoreCriteria.RenderType.INTEGER);
								}
								Score _scr = _sc.getOrCreateScore(((PlayerEntity) _ent).getScoreboardName(), _so);
								_scr.setScorePoints((int) ((new Object() {
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
								}.getScore("MP")) + 12));
							}
						}
						entity.getPersistentData().putDouble("hl", 0);
					} else {
						{
							Entity _ent = entity;
							if (_ent instanceof PlayerEntity) {
								Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
								ScoreObjective _so = _sc.getObjective("MP");
								if (_so == null) {
									_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"),
											ScoreCriteria.RenderType.INTEGER);
								}
								Score _scr = _sc.getOrCreateScore(((PlayerEntity) _ent).getScoreboardName(), _so);
								_scr.setScorePoints((int) ((new Object() {
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
								}.getScore("MP")) + 0));
							}
						}
						entity.getPersistentData().putDouble("hl", 0);
					}
				}
			}
		}
	}
}
