package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.Score;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class JudgeShiTiSiWangShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency sourceentity for procedure JudgeShiTiSiWangShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure JudgeShiTiSiWangShi!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		IWorld world = (IWorld) dependencies.get("world");
		ZaomengxiyouModVariables.MapVariables.get(world).deathjudge = (double) 0;
		ZaomengxiyouModVariables.MapVariables.get(world).syncData(world);
		if (DiethjudgeProcedure.executeProcedure(ImmutableMap.of("sourceentity", sourceentity))) {
			{
				Entity _ent = sourceentity;
				if (_ent instanceof PlayerEntity) {
					Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
					ScoreObjective _so = _sc.getObjective("killmob");
					if (_so == null) {
						_so = _sc.addObjective("killmob", ScoreCriteria.DUMMY, new StringTextComponent("killmob"), ScoreCriteria.RenderType.INTEGER);
					}
					Score _scr = _sc.getOrCreateScore(((PlayerEntity) _ent).getScoreboardName(), _so);
					_scr.setScorePoints((int) ((new Object() {
						public int getScore(String score) {
							if (sourceentity instanceof PlayerEntity) {
								Scoreboard _sc = ((PlayerEntity) sourceentity).getWorldScoreboard();
								ScoreObjective _so = _sc.getObjective(score);
								if (_so != null) {
									Score _scr = _sc.getOrCreateScore(((PlayerEntity) sourceentity).getScoreboardName(), _so);
									return _scr.getScorePoints();
								}
							}
							return 0;
						}
					}.getScore("killmob")) + 180));
				}
			}
			{
				double _setval = (double) (((sourceentity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) + 200);
				sourceentity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.mp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}
