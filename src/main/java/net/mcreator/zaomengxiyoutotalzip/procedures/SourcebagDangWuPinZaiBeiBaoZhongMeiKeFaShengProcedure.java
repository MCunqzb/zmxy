package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.item.Sourcelv1Item;
import net.mcreator.zaomengxiyoutotalzip.item.SourcebigItem;
import net.mcreator.zaomengxiyoutotalzip.item.Source64Item;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;

public class SourcebagDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure SourcebagDangWuPinZaiBeiBaoZhongMeiKeFaSheng!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure SourcebagDangWuPinZaiBeiBaoZhongMeiKeFaSheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((entity.getPersistentData().getBoolean("sourcebag")) == (true))) {
			{
				AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
				entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
				if (_iitemhandlerref.get() != null) {
					for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
						ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
						if ((((itemstackiterator).getItem() == Sourcelv1Item.block) && ((entity instanceof PlayerEntity)
								? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(Sourcelv1Item.block))
								: false))) {
							if (entity instanceof PlayerEntity) {
								ItemStack _stktoremove = new ItemStack(Sourcelv1Item.block);
								((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(),
										(int) (((itemstackiterator)).getCount()), ((PlayerEntity) entity).container.func_234641_j_());
							}
							{
								double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ZaomengxiyouModVariables.PlayerVariables())).Sources) + ((((itemstackiterator)).getCount()) * 1));
								entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Sources = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
						if ((((itemstackiterator).getItem() == SourcebigItem.block) && ((entity instanceof PlayerEntity)
								? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(SourcebigItem.block))
								: false))) {
							if (entity instanceof PlayerEntity) {
								ItemStack _stktoremove = new ItemStack(SourcebigItem.block);
								((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(),
										(int) (((itemstackiterator)).getCount()), ((PlayerEntity) entity).container.func_234641_j_());
							}
							{
								double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ZaomengxiyouModVariables.PlayerVariables())).Sources) + ((((itemstackiterator)).getCount()) * 8));
								entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Sources = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
						if ((((itemstackiterator).getItem() == Source64Item.block) && ((entity instanceof PlayerEntity)
								? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(Source64Item.block))
								: false))) {
							if (entity instanceof PlayerEntity) {
								ItemStack _stktoremove = new ItemStack(Source64Item.block);
								((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(),
										(int) (((itemstackiterator)).getCount()), ((PlayerEntity) entity).container.func_234641_j_());
							}
							{
								double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ZaomengxiyouModVariables.PlayerVariables())).Sources)
										+ ((((itemstackiterator)).getCount()) * 64));
								entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Sources = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				}
			}
		}
	}
}
