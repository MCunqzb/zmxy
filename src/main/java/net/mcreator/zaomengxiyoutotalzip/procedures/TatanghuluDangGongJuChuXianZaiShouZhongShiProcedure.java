package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.Score;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class TatanghuluDangGongJuChuXianZaiShouZhongShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure TatanghuluDangGongJuChuXianZaiShouZhongShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure TatanghuluDangGongJuChuXianZaiShouZhongShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		entity.getPersistentData().putDouble("thl", ((entity.getPersistentData().getDouble("thl")) + 1));
		if ((((entity.getPersistentData().getDouble("thl")) > 200) && ((entity.getPersistentData().getDouble("thl")) < 202))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 2, (false), (false)));
			entity.getPersistentData().putDouble("thl", 0);
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
		}.getScore("MP")) < ((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mpglobal))) {
			if ((((entity.getPersistentData().getDouble("thl")) % 40) == 0)) {
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
						}.getScore("MP")) + 12));
					}
				}
			}
		}
		if ((Math.random() < 0.012)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 2, (int) 5, (false), (false)));
		}
		if ((ZaomengxiyouModVariables.MapVariables.get(world).world_num > 1)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(
						new StringTextComponent("\u00A7c\u6709\u80A1\u529B\u91CF\u5F71\u54CD\u4F60\u62FF\u8D77\u6B66\u5668"), (true));
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 20, (int) 4, (false), (false)));
		}
	}
}
