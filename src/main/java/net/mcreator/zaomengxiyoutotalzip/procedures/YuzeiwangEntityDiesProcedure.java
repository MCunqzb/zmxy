package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.Score;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class YuzeiwangEntityDiesProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure YuzeiwangEntityDies!");
			return;
		}
		if (dependencies.get("imediatesourceentity") == null) {
			if (!dependencies.containsKey("imediatesourceentity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency imediatesourceentity for procedure YuzeiwangEntityDies!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency sourceentity for procedure YuzeiwangEntityDies!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity imediatesourceentity = (Entity) dependencies.get("imediatesourceentity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (DiethjudgeProcedure.executeProcedure(ImmutableMap.of("imediatesourceentity", imediatesourceentity, "sourceentity", sourceentity))) {
			{
				Entity _ent = ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null);
				if (_ent instanceof PlayerEntity) {
					Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
					ScoreObjective _so = _sc.getObjective("killmob");
					if (_so == null) {
						_so = _sc.addObjective("killmob", ScoreCriteria.DUMMY, new StringTextComponent("killmob"), ScoreCriteria.RenderType.INTEGER);
					}
					Score _scr = _sc.getOrCreateScore(((PlayerEntity) _ent).getScoreboardName(), _so);
					_scr.setScorePoints((int) ((new Object() {
						public int getScore(String score) {
							if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof PlayerEntity) {
								Scoreboard _sc = ((PlayerEntity) ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null))
										.getWorldScoreboard();
								ScoreObjective _so = _sc.getObjective(score);
								if (_so != null) {
									Score _scr = _sc.getOrCreateScore(
											((PlayerEntity) ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null))
													.getScoreboardName(),
											_so);
									return _scr.getScorePoints();
								}
							}
							return 0;
						}
					}.getScore("killmob")) + 15));
				}
			}
			{
				double _setval = (double) (((sourceentity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) + 5);
				sourceentity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.mp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}
