package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.Score;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.item.Hx6Item;
import net.mcreator.zaomengxiyoutotalzip.item.Hx5Item;
import net.mcreator.zaomengxiyoutotalzip.item.Hx4Item;
import net.mcreator.zaomengxiyoutotalzip.item.Hx3Item;
import net.mcreator.zaomengxiyoutotalzip.item.Hx2Item;
import net.mcreator.zaomengxiyoutotalzip.item.HuilanItem;
import net.mcreator.zaomengxiyoutotalzip.item.Hl5Item;
import net.mcreator.zaomengxiyoutotalzip.item.Hl4Item;
import net.mcreator.zaomengxiyoutotalzip.item.Hl3Item;
import net.mcreator.zaomengxiyoutotalzip.item.Hl2Item;
import net.mcreator.zaomengxiyoutotalzip.item.Guanzhiyonghenglv1Item;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;

public class BeidongzhuItemInInventoryTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure BeidongzhuItemInInventoryTick!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency itemstack for procedure BeidongzhuItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (10), (itemstack))).getItem() == HuilanItem.boots)) {
			entity.getPersistentData().putDouble("showtime", ((entity.getPersistentData().getDouble("showtime")) + 1));
			if ((((entity.getPersistentData().getDouble("showtime")) % 40) == 0)) {
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
				}.getScore("MP")) <= (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mpglobal) - 2))) {
					{
						Entity _ent = entity;
						if (_ent instanceof PlayerEntity) {
							Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
							ScoreObjective _so = _sc.getObjective("MP");
							if (_so == null) {
								_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"), ScoreCriteria.RenderType.INTEGER);
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
				} else {
					{
						Entity _ent = entity;
						if (_ent instanceof PlayerEntity) {
							Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
							ScoreObjective _so = _sc.getObjective("MP");
							if (_so == null) {
								_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"), ScoreCriteria.RenderType.INTEGER);
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
				}
			} else if (((entity.getPersistentData().getDouble("showtime")) > 41)) {
				entity.getPersistentData().putDouble("showtime", 0);
				entity.getPersistentData().putDouble("showtime", 0);
			}
		}
		if ((((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (11), (itemstack))).getItem() == Guanzhiyonghenglv1Item.block)
				&& (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) > 1))) {
			entity.getPersistentData().putDouble("health", ((entity.getPersistentData().getDouble("health")) + 1));
			if ((((entity.getPersistentData().getDouble("health")) % 100) == 0)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).setHealth((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) + 1));
			} else if (((entity.getPersistentData().getDouble("health")) > 101)) {
				entity.getPersistentData().putDouble("health", 0);
				entity.getPersistentData().putDouble("health", 0);
			}
		}
		if ((((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (11), (itemstack))).getItem() == Hx2Item.block)
				&& (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) > 1))) {
			entity.getPersistentData().putDouble("health", ((entity.getPersistentData().getDouble("health")) + 1));
			if ((((entity.getPersistentData().getDouble("health")) % 80) == 0)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).setHealth((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) + 1));
			} else if (((entity.getPersistentData().getDouble("health")) > 81)) {
				entity.getPersistentData().putDouble("health", 0);
				entity.getPersistentData().putDouble("health", 0);
			}
		}
		if ((((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (11), (itemstack))).getItem() == Hx3Item.block)
				&& (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) > 1))) {
			entity.getPersistentData().putDouble("health", ((entity.getPersistentData().getDouble("health")) + 1));
			if ((((entity.getPersistentData().getDouble("health")) % 100) == 0)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).setHealth((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) + 2));
			} else if (((entity.getPersistentData().getDouble("health")) > 101)) {
				entity.getPersistentData().putDouble("health", 0);
				entity.getPersistentData().putDouble("health", 0);
			}
		}
		if ((((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (11), (itemstack))).getItem() == Hx4Item.block)
				&& (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) > 1))) {
			entity.getPersistentData().putDouble("health", ((entity.getPersistentData().getDouble("health")) + 1));
			if ((((entity.getPersistentData().getDouble("health")) % 100) == 0)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).setHealth((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) + 3));
			} else if (((entity.getPersistentData().getDouble("health")) > 101)) {
				entity.getPersistentData().putDouble("health", 0);
				entity.getPersistentData().putDouble("health", 0);
			}
		}
		if ((((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (11), (itemstack))).getItem() == Hx5Item.block)
				&& (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) > 1))) {
			entity.getPersistentData().putDouble("health", ((entity.getPersistentData().getDouble("health")) + 1));
			if ((((entity.getPersistentData().getDouble("health")) % 100) == 0)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).setHealth((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) + 4));
			} else if (((entity.getPersistentData().getDouble("health")) > 101)) {
				entity.getPersistentData().putDouble("health", 0);
				entity.getPersistentData().putDouble("health", 0);
			}
		}
		if ((((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (11), (itemstack))).getItem() == Hx6Item.block)
				&& (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) > 1))) {
			entity.getPersistentData().putDouble("health", ((entity.getPersistentData().getDouble("health")) + 1));
			if ((((entity.getPersistentData().getDouble("health")) % 101) == 0)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).setHealth((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) + 5));
			} else if (((entity.getPersistentData().getDouble("health")) > 110)) {
				entity.getPersistentData().putDouble("health", 0);
				entity.getPersistentData().putDouble("health", 0);
			}
		}
		if (((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (10), (itemstack))).getItem() == Hl2Item.block)) {
			entity.getPersistentData().putDouble("showtime", ((entity.getPersistentData().getDouble("showtime")) + 1));
			if ((((entity.getPersistentData().getDouble("showtime")) % 40) == 0)) {
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
				}.getScore("MP")) <= (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mpglobal) - 2))) {
					{
						Entity _ent = entity;
						if (_ent instanceof PlayerEntity) {
							Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
							ScoreObjective _so = _sc.getObjective("MP");
							if (_so == null) {
								_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"), ScoreCriteria.RenderType.INTEGER);
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
				} else {
					{
						Entity _ent = entity;
						if (_ent instanceof PlayerEntity) {
							Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
							ScoreObjective _so = _sc.getObjective("MP");
							if (_so == null) {
								_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"), ScoreCriteria.RenderType.INTEGER);
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
				}
			} else if (((entity.getPersistentData().getDouble("showtime")) > 41)) {
				entity.getPersistentData().putDouble("showtime", 0);
				entity.getPersistentData().putDouble("showtime", 0);
			}
		}
		if (((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (10), (itemstack))).getItem() == Hl3Item.block)) {
			entity.getPersistentData().putDouble("showtime", ((entity.getPersistentData().getDouble("showtime")) + 1));
			if ((((entity.getPersistentData().getDouble("showtime")) % 40) == 0)) {
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
				}.getScore("MP")) <= (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mpglobal) - 2))) {
					{
						Entity _ent = entity;
						if (_ent instanceof PlayerEntity) {
							Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
							ScoreObjective _so = _sc.getObjective("MP");
							if (_so == null) {
								_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"), ScoreCriteria.RenderType.INTEGER);
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
				} else {
					{
						Entity _ent = entity;
						if (_ent instanceof PlayerEntity) {
							Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
							ScoreObjective _so = _sc.getObjective("MP");
							if (_so == null) {
								_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"), ScoreCriteria.RenderType.INTEGER);
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
				}
			} else if (((entity.getPersistentData().getDouble("showtime")) > 41)) {
				entity.getPersistentData().putDouble("showtime", 0);
				entity.getPersistentData().putDouble("showtime", 0);
			}
		}
		if (((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (10), (itemstack))).getItem() == Hl4Item.block)) {
			entity.getPersistentData().putDouble("showtime", ((entity.getPersistentData().getDouble("showtime")) + 1));
			if ((((entity.getPersistentData().getDouble("showtime")) % 40) == 0)) {
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
				}.getScore("MP")) <= (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mpglobal) - 2))) {
					{
						Entity _ent = entity;
						if (_ent instanceof PlayerEntity) {
							Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
							ScoreObjective _so = _sc.getObjective("MP");
							if (_so == null) {
								_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"), ScoreCriteria.RenderType.INTEGER);
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
				} else {
					{
						Entity _ent = entity;
						if (_ent instanceof PlayerEntity) {
							Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
							ScoreObjective _so = _sc.getObjective("MP");
							if (_so == null) {
								_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"), ScoreCriteria.RenderType.INTEGER);
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
				}
			} else if (((entity.getPersistentData().getDouble("showtime")) > 41)) {
				entity.getPersistentData().putDouble("showtime", 0);
				entity.getPersistentData().putDouble("showtime", 0);
			}
		}
		if (((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (10), (itemstack))).getItem() == Hl5Item.block)) {
			entity.getPersistentData().putDouble("showtime", ((entity.getPersistentData().getDouble("showtime")) + 1));
			if ((((entity.getPersistentData().getDouble("showtime")) % 40) == 0)) {
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
				}.getScore("MP")) <= (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mpglobal) - 2))) {
					{
						Entity _ent = entity;
						if (_ent instanceof PlayerEntity) {
							Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
							ScoreObjective _so = _sc.getObjective("MP");
							if (_so == null) {
								_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"), ScoreCriteria.RenderType.INTEGER);
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
							}.getScore("MP")) + 10));
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (_ent instanceof PlayerEntity) {
							Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
							ScoreObjective _so = _sc.getObjective("MP");
							if (_so == null) {
								_so = _sc.addObjective("MP", ScoreCriteria.DUMMY, new StringTextComponent("MP"), ScoreCriteria.RenderType.INTEGER);
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
				}
			} else if (((entity.getPersistentData().getDouble("showtime")) > 41)) {
				entity.getPersistentData().putDouble("showtime", 0);
				entity.getPersistentData().putDouble("showtime", 0);
			}
		}
	}
}
