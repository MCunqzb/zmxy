
package net.mcreator.zaomengxiyoutotalzip.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.zaomengxiyoutotalzip.itemgroup.ZaomengxiyouItemGroup;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import java.util.List;
import java.util.Collections;

@ZaomengxiyouModElements.ModElement.Tag
public class ImpregnatedMengpokettleBlock extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:impregnated_mengpokettle")
	public static final Block block = null;
	public ImpregnatedMengpokettleBlock(ZaomengxiyouModElements instance) {
		super(instance, 996);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ZaomengxiyouItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK)
					.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.stone.break")),
							() -> new SoundEvent(new ResourceLocation("block.slime_block.step")),
							() -> new SoundEvent(new ResourceLocation("block.stone.place")),
							() -> new SoundEvent(new ResourceLocation("entity.player.splash")),
							() -> new SoundEvent(new ResourceLocation("entity.player.splash.high_speed"))))
					.hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).slipperiness(0.8f));
			setRegistryName("impregnated_mengpokettle");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(MengpokettleBlock.block));
		}
	}
}
