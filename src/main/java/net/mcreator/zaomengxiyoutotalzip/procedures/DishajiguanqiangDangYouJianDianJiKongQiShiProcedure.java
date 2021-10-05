package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Score;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.item.Dishagun1Item;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Random;
import java.util.Map;

public class DishajiguanqiangDangYouJianDianJiKongQiShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure DishajiguanqiangDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency itemstack for procedure DishajiguanqiangDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure DishajiguanqiangDangYouJianDianJiKongQiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		IWorld world = (IWorld) dependencies.get("world");
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
						if (entity instanceof LivingEntity) {
							Entity _ent = entity;
							if (!_ent.world.isRemote()) {
								Dishagun1Item.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) (((new Object() {
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
								}.getScore("level_xiyou")) * 2) + 10), (int) 0.2);
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
								if (entity instanceof LivingEntity) {
									Entity _ent = entity;
									if (!_ent.world.isRemote()) {
										Dishagun1Item.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) (((new Object() {
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
										}.getScore("level_xiyou")) * 2) + 6), (int) 0.2);
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
										if (entity instanceof LivingEntity) {
											Entity _ent = entity;
											if (!_ent.world.isRemote()) {
												Dishagun1Item.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1,
														(float) (((new Object() {
															public int getScore(String score) {
																if (entity instanceof PlayerEntity) {
																	Scoreboard _sc = ((PlayerEntity) entity).getWorldScoreboard();
																	ScoreObjective _so = _sc.getObjective(score);
																	if (_so != null) {
																		Score _scr = _sc.getOrCreateScore(((PlayerEntity) entity).getScoreboardName(),
																				_so);
																		return _scr.getScorePoints();
																	}
																}
																return 0;
															}
														}.getScore("level_xiyou")) * 2) + 2), (int) 0.2);
											}
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 7);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 7);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 10);
				if (entity instanceof LivingEntity) {
					Entity _ent = entity;
					if (!_ent.world.isRemote()) {
						Dishagun1Item.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) (((new Object() {
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
						}.getScore("level_xiyou")) * 2) + 10), (int) 0.2);
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 10);
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown((itemstack).getItem(), (int) 80);
	}
}
