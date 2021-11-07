package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.zaomengxiyoutotalzip.potion.OnFirePotionEffect;
import net.mcreator.zaomengxiyoutotalzip.item.FivepotionItem;
import net.mcreator.zaomengxiyoutotalzip.entity.ArgillaceousshieldEntity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class FivePotionBeastFireDangShiTiGengXinKeShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure FivePotionBeastFireDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure FivePotionBeastFireDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure FivePotionBeastFireDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure FivePotionBeastFireDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure FivePotionBeastFireDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		entity.getPersistentData().putDouble("timetick", ((entity.getPersistentData().getDouble("timetick")) + 1));
		if ((((Entity) world
				.getEntitiesWithinAABB(MonsterEntity.class,
						new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
			entity.setInvulnerable((true));
			if ((((entity.getPersistentData().getDouble("timetick")) >= 600) && ((entity.getPersistentData().getDouble("timetick")) < 602))) {
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if ((entityiterator instanceof MonsterEntity)) {
							entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) ((entity.getPersistentData().getDouble("level")) * 2));
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d((entityiterator.getPosX()), (entityiterator.getPosY()),
												(entityiterator.getPosZ())), Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""),
												((World) world).getServer(), null).withFeedbackDisabled(),
										"summon minecraft:fireball ~ ~10 ~ {Motion:[0.0,-4.0,0.0],direction:[0.0,-4.0,0.0],ExplosionPower:2}");
							}
							if (entityiterator instanceof LivingEntity)
								((LivingEntity) entityiterator)
										.addPotionEffect(new EffectInstance(OnFirePotionEffect.potion, (int) 282, (int) 8, (false), (false)));
						}
						if ((entityiterator instanceof ArgillaceousshieldEntity.CustomEntity)) {
							if (entityiterator instanceof LivingEntity)
								((LivingEntity) entityiterator)
										.addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 10, (int) 4, (false), (false)));
						}
						entity.getPersistentData().putDouble("timetick", 0);
					}
				}
			}
		}
		if ((((entity.getPersistentData().getDouble("timetick")) % 100) == 0)) {
			if (entity instanceof LivingEntity) {
				Entity _ent = entity;
				if (!_ent.world.isRemote()) {
					FivepotionItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 0, (int) 0);
				}
			}
		}
		if ((((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null) == null)) {
			if (!entity.world.isRemote())
				entity.remove();
		} else {
			if ((((entity.getPersistentData().getDouble("timetick")) % 20) < 2)) {
				entity.setMotion(
						(((((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null).getPosX()) - ((entity.getPosX()) + 0))
								* 0.1),
						(((((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null).getPosY())
								- ((entity.getPosY()) + (-1))) * 0.1),
						(((((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null).getPosZ()) - ((entity.getPosZ()) + 0))
								* 0.1));
			} else {
				entity.setMotion(
						(((((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null).getPosX()) - ((entity.getPosX()) + 1.5))
								* 0.1),
						(((((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null).getPosY())
								- ((entity.getPosY()) + (-2.5))) * 0.1),
						(((((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null).getPosZ()) - ((entity.getPosZ()) + 1.5))
								* 0.1));
			}
		}
	}
}
