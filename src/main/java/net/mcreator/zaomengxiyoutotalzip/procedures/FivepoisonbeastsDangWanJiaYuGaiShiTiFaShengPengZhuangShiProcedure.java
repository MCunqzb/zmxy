package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Score;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class FivepoisonbeastsDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER
						.warn("Failed to load dependency entity for procedure FivepoisonbeastsDangWanJiaYuGaiShiTiFaShengPengZhuangShi!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				ZaomengxiyouMod.LOGGER
						.warn("Failed to load dependency sourceentity for procedure FivepoisonbeastsDangWanJiaYuGaiShiTiFaShengPengZhuangShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
			((TameableEntity) entity).setTamed(true);
			((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
		}
		entity.getPersistentData().putDouble("level", (new Object() {
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
		}.getScore("level_xiyou")));
	}
}
