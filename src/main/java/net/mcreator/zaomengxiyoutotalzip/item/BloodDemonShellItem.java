
package net.mcreator.zaomengxiyoutotalzip.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.zaomengxiyoutotalzip.itemgroup.ZaomengxiyouItemGroup;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import java.util.List;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@ZaomengxiyouModElements.ModElement.Tag
public class BloodDemonShellItem extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:blood_demon_shell_helmet")
	public static final Item helmet = null;
	@ObjectHolder("zaomengxiyou:blood_demon_shell_chestplate")
	public static final Item body = null;
	@ObjectHolder("zaomengxiyou:blood_demon_shell_leggings")
	public static final Item legs = null;
	@ObjectHolder("zaomengxiyou:blood_demon_shell_boots")
	public static final Item boots = null;
	public BloodDemonShellItem(ZaomengxiyouModElements instance) {
		super(instance, 956);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 0;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 19}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "blood_demon_shell";
			}

			@Override
			public float getToughness() {
				return 3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.03f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ZaomengxiyouItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedHead = new ModelBlood_demon_shell().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent(
						"\u00A79\u5728\u8840\u6C60\u91CC\u6D78\u6CE1\u6570\u8F7D\u800C\u51FA\uFF0C\u575A\u5982\u78D0\u77F3\uFF0C\u56FA\u82E5\u91D1\u6C64\u3002"));
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "zaomengxiyou:textures/blood_demon_shell.png";
			}
		}.setRegistryName("blood_demon_shell_helmet"));
	}
	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBlood_demon_shell extends EntityModel<Entity> {
		private final ModelRenderer Head;
		public ModelBlood_demon_shell() {
			textureWidth = 64;
			textureHeight = 32;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 16).addBox(-1.0F, -8.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 18).addBox(-2.0F, -9.0F, -6.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 23).addBox(-4.0F, -9.0F, 5.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(8, 12).addBox(-3.0F, -2.0F, 5.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(12, 25).addBox(-3.0F, -10.0F, -6.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(17, 17).addBox(-2.0F, -10.5F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(17, 17).addBox(-2.0F, -10.5F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(27, 17).addBox(-2.0F, -10.5F, 0.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(27, 17).addBox(-2.0F, -10.5F, 3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(30, 22).addBox(-3.0F, -8.5F, 5.4F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(16, 20).addBox(-3.0F, -5.5F, 5.4F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(36, 25).addBox(-4.0F, -10.0F, 0.0F, 8.0F, 1.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
