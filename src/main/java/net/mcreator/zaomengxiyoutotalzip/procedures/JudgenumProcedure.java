package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.LivingEntity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;
import java.util.HashMap;

public class JudgenumProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityJump(LivingEvent.LivingJumpEvent event) {
			LivingEntity entity = event.getEntityLiving();
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			World world = entity.world;
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
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure Judgenum!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure Judgenum!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure Judgenum!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure Judgenum!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
				&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("zaomengxiyou:huaguoshan")))
				|| ((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
						&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
								.equals(new ResourceLocation("zaomengxiyou:shuiliandong")))
						|| ((world.func_241828_r().getRegistry(Registry.BIOME_KEY)
								.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
								&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
										.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
										.equals(new ResourceLocation("zaomengxiyou:taohuayuan")))
								|| ((world.func_241828_r().getRegistry(Registry.BIOME_KEY)
										.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
										&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
												.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
												.equals(new ResourceLocation("zaomengxiyou:bianfuku")))
										|| ((world.func_241828_r().getRegistry(Registry.BIOME_KEY)
												.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
												&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
														.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
														.equals(new ResourceLocation("zaomengxiyou:shishituoling")))
												|| ((world.func_241828_r().getRegistry(Registry.BIOME_KEY)
														.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
														&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
																.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
																.equals(new ResourceLocation("zaomengxiyou:pengmowangzhixue")))
														|| ((world.func_241828_r().getRegistry(Registry.BIOME_KEY)
																.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
																&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
																		.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
																		.equals(new ResourceLocation("zaomengxiyou:donghailonggong")))
																|| ((world.func_241828_r().getRegistry(Registry.BIOME_KEY)
																		.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
																		&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
																				.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
																				.equals(new ResourceLocation("zaomengxiyou:qiantan")))
																		|| ((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(
																				world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
																				&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
																						.getKey(world
																								.getBiome(new BlockPos((int) x, (int) y, (int) z)))
																						.equals(new ResourceLocation(
																								"zaomengxiyou:donghaijiaomowang")))
																				|| ((world.func_241828_r().getRegistry(Registry.BIOME_KEY)
																						.getKey(world.getBiome(
																								new BlockPos((int) x, (int) y, (int) z))) != null
																						&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
																								.getKey(world.getBiome(
																										new BlockPos((int) x, (int) y, (int) z)))
																								.equals(new ResourceLocation(
																										"zaomengxiyou:shazhiwoliu")))
																						|| (world.func_241828_r().getRegistry(Registry.BIOME_KEY)
																								.getKey(world.getBiome(new BlockPos((int) x, (int) y,
																										(int) z))) != null
																								&& world.func_241828_r()
																										.getRegistry(Registry.BIOME_KEY)
																										.getKey(world.getBiome(new BlockPos((int) x,
																												(int) y, (int) z)))
																										.equals(new ResourceLocation(
																												"zaomengxiyou:niumogu")))))))))))))) {
			ZaomengxiyouModVariables.MapVariables.get(world).world_num = (double) 1;
			ZaomengxiyouModVariables.MapVariables.get(world).syncData(world);
		} else if (((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
				&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("zaomengxiyou:ghost")))
				|| ((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
						&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
								.equals(new ResourceLocation("zaomengxiyou:underghost")))
						|| ((world.func_241828_r().getRegistry(Registry.BIOME_KEY)
								.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
								&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
										.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
										.equals(new ResourceLocation("zaomengxiyou:bone_secret_realm")))
								|| ((world.func_241828_r().getRegistry(Registry.BIOME_KEY)
										.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
										&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
												.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
												.equals(new ResourceLocation("zaomengxiyou:wangchuanriverbiomes")))
										|| (world.func_241828_r().getRegistry(Registry.BIOME_KEY)
												.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
												&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
														.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
														.equals(new ResourceLocation("zaomengxiyou:underghostpalace")))))))) {
			ZaomengxiyouModVariables.MapVariables.get(world).world_num = (double) 2;
			ZaomengxiyouModVariables.MapVariables.get(world).syncData(world);
		} else {
			ZaomengxiyouModVariables.MapVariables.get(world).world_num = (double) 0;
			ZaomengxiyouModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
