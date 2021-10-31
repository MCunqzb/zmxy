
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
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.zaomengxiyoutotalzip.procedures.KingKongArmorXiongJiaShiJianMeiYouXiKeProcedure;
import net.mcreator.zaomengxiyoutotalzip.itemgroup.ZaomengxiyouItemGroup;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@ZaomengxiyouModElements.ModElement.Tag
public class KingKongArmorItem extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:king_kong_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("zaomengxiyou:king_kong_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("zaomengxiyou:king_kong_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("zaomengxiyou:king_kong_armor_boots")
	public static final Item boots = null;
	public KingKongArmorItem(ZaomengxiyouModElements instance) {
		super(instance, 1060);
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
				return new int[]{2, 10, 12, 5}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 12;
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
				return "king_kong_armor";
			}

			@Override
			public float getToughness() {
				return 1.2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(
				() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ZaomengxiyouItemGroup.tab).isImmuneToFire()) {
					@Override
					@OnlyIn(Dist.CLIENT)
					public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
						BipedModel armorModel = new BipedModel(1);
						armorModel.bipedHead = new ModelKing_Kong_armor().Head;
						armorModel.isSneak = living.isSneaking();
						armorModel.isSitting = defaultModel.isSitting;
						armorModel.isChild = living.isChild();
						return armorModel;
					}

					@Override
					public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
						super.addInformation(itemstack, world, list, flag);
						list.add(new StringTextComponent(
								"\u00A75\u5730\u72F1\u708E\u5CA9\u7ECF\u4E09\u5473\u771F\u706B\u707C\u70E7\u56DB\u5341\u4E5D\u65E5\u800C\u6210\u7684\u6218\u7532\uFF0C\u6545\u91D1\u521A\u4E0D\u706D\u3002"));
						list.add(new StringTextComponent(
								"\u00A75Hell yan rock by three flavor true fire burning forty-nine and into armor\uFF0Cso king Kong is not destroyed."));
						list.add(new StringTextComponent("\u00A75\u51CF\u4F24\uFF1A10%"));
						list.add(new StringTextComponent("\u00A75Reduction of injury\uFF1A10%."));
					}

					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "zaomengxiyou:textures/models/armor/king_kong_armor_-_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("king_kong_armor_helmet"));
		elements.items.add(
				() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ZaomengxiyouItemGroup.tab).isImmuneToFire()) {
					@Override
					@OnlyIn(Dist.CLIENT)
					public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
						BipedModel armorModel = new BipedModel(1);
						armorModel.bipedBody = new ModelKing_Kong_armor_chestplate().body2;
						armorModel.bipedLeftArm = new ModelKing_Kong_armor_chestplate().LeftArm;
						armorModel.bipedRightArm = new ModelKing_Kong_armor_chestplate().RightArm;
						armorModel.isSneak = living.isSneaking();
						armorModel.isSitting = defaultModel.isSitting;
						armorModel.isChild = living.isChild();
						return armorModel;
					}

					@Override
					public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
						super.addInformation(itemstack, world, list, flag);
						list.add(new StringTextComponent(
								"\u00A75\u5730\u72F1\u708E\u5CA9\u7ECF\u4E09\u5473\u771F\u706B\u707C\u70E7\u56DB\u5341\u4E5D\u65E5\u800C\u6210\u7684\u6218\u7532\uFF0C\u6545\u91D1\u521A\u4E0D\u706D\u3002"));
						list.add(new StringTextComponent(
								"\u00A75Hell yan rock by three flavor true fire burning forty-nine and into armor\uFF0Cso king Kong is not destroyed."));
						list.add(new StringTextComponent("\u00A75\u51CF\u4F24\uFF1A10%"));
						list.add(new StringTextComponent("\u00A75Reduction of injury\uFF1A10%."));
					}

					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "zaomengxiyou:textures/king_kong_armor_chestplate.png";
					}

					@Override
					public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
						double x = entity.getPosX();
						double y = entity.getPosY();
						double z = entity.getPosZ();
						{
							Map<String, Object> $_dependencies = new HashMap<>();
							$_dependencies.put("entity", entity);
							KingKongArmorXiongJiaShiJianMeiYouXiKeProcedure.executeProcedure($_dependencies);
						}
					}
				}.setRegistryName("king_kong_armor_chestplate"));
		elements.items.add(
				() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ZaomengxiyouItemGroup.tab).isImmuneToFire()) {
					@Override
					@OnlyIn(Dist.CLIENT)
					public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
						BipedModel armorModel = new BipedModel(1);
						armorModel.bipedLeftLeg = new ModelKing_Kong_armor().LeftLeg;
						armorModel.bipedRightLeg = new ModelKing_Kong_armor().RightLeg;
						armorModel.isSneak = living.isSneaking();
						armorModel.isSitting = defaultModel.isSitting;
						armorModel.isChild = living.isChild();
						return armorModel;
					}

					@Override
					public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
						super.addInformation(itemstack, world, list, flag);
						list.add(new StringTextComponent(
								"\u00A75\u5730\u72F1\u708E\u5CA9\u7ECF\u4E09\u5473\u771F\u706B\u707C\u70E7\u56DB\u5341\u4E5D\u65E5\u800C\u6210\u7684\u6218\u7532\uFF0C\u6545\u91D1\u521A\u4E0D\u706D\u3002"));
						list.add(new StringTextComponent(
								"\u00A75Hell yan rock by three flavor true fire burning forty-nine and into armor\uFF0Cso king Kong is not destroyed."));
						list.add(new StringTextComponent("\u00A75\u51CF\u4F24\uFF1A10%"));
						list.add(new StringTextComponent("\u00A75Reduction of injury\uFF1A10%."));
					}

					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "zaomengxiyou:textures/models/armor/king_kong_armor_-_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("king_kong_armor_leggings"));
	}
	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelKing_Kong_armor_chestplate extends EntityModel<Entity> {
		private final ModelRenderer body2;
		private final ModelRenderer pifeng;
		private final ModelRenderer RightArm;
		private final ModelRenderer cube_r7_r1;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer LeftArm;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r7_r2;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		public ModelKing_Kong_armor_chestplate() {
			textureWidth = 64;
			textureHeight = 32;
			body2 = new ModelRenderer(this);
			body2.setRotationPoint(0.0F, 1.0F, 0.0F);
			body2.setTextureOffset(16, 16).addBox(-4.0F, -1.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
			pifeng = new ModelRenderer(this);
			pifeng.setRotationPoint(0.0F, 0.0F, 3.0F);
			body2.addChild(pifeng);
			setRotationAngle(pifeng, 0.2618F, 0.0F, 0.0F);
			pifeng.setTextureOffset(32, 0).addBox(-5.0F, 0.0F, 0.0F, 10.0F, 15.0F, 0.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 1.0F, 0.0F);
			RightArm.setTextureOffset(40, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
			cube_r7_r1 = new ModelRenderer(this);
			cube_r7_r1.setRotationPoint(-2.0F, -1.5F, 0.0F);
			RightArm.addChild(cube_r7_r1);
			setRotationAngle(cube_r7_r1, -0.5672F, 0.0F, 0.0F);
			cube_r7_r1.setTextureOffset(56, 10).addBox(-1.0F, -8.5F, 1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
			RightArm.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.9599F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(56, 21).addBox(-3.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-2.0F, 1.0F, 0.0F);
			RightArm.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 1.5708F, -0.3491F);
			cube_r2.setTextureOffset(56, 21).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-2.0F, 1.0F, 0.0F);
			RightArm.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 1.5708F, -0.9599F);
			cube_r3.setTextureOffset(56, 21).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 1.0F, 0.0F);
			RightArm.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(56, 21).addBox(-3.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(40, 16).addBox(0.0F, -3.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(4.0F, 0.0F, 0.0F);
			LeftArm.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.9599F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(56, 21).addBox(-3.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(2.0F, 0.0F, 0.0F);
			LeftArm.addChild(cube_r9);
			cube_r7_r2 = new ModelRenderer(this);
			cube_r7_r2.setRotationPoint(0.0F, -2.5F, 0.0F);
			cube_r9.addChild(cube_r7_r2);
			setRotationAngle(cube_r7_r2, -0.5672F, 0.0F, 0.0F);
			cube_r7_r2.setTextureOffset(56, 10).addBox(-1.0F, -8.5F, 1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(2.0F, 0.0F, 0.0F);
			LeftArm.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, -1.5708F, 0.3491F);
			cube_r6.setTextureOffset(56, 21).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(2.0F, 0.0F, 0.0F);
			LeftArm.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, -1.5708F, 0.9599F);
			cube_r7.setTextureOffset(56, 21).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(4.0F, 0.0F, 0.0F);
			LeftArm.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(56, 21).addBox(-3.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body2.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelKing_Kong_armor extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer body2;
		private final ModelRenderer pifeng;
		private final ModelRenderer RightArm;
		private final ModelRenderer cube_r7_r1;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer LeftArm;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r7_r2;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public ModelKing_Kong_armor() {
			textureWidth = 64;
			textureHeight = 32;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.2F, false);
			body2 = new ModelRenderer(this);
			body2.setRotationPoint(0.0F, 1.0F, -3.0F);
			body2.setTextureOffset(16, 16).addBox(-4.0F, -1.0F, 1.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
			pifeng = new ModelRenderer(this);
			pifeng.setRotationPoint(0.0F, 0.0F, 6.0F);
			body2.addChild(pifeng);
			setRotationAngle(pifeng, 0.2618F, 0.0F, 0.0F);
			pifeng.setTextureOffset(0, 32).addBox(-5.0F, 0.0F, 0.0F, 10.0F, 15.0F, 0.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(40, 16).addBox(-4.0F, -3.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
			cube_r7_r1 = new ModelRenderer(this);
			cube_r7_r1.setRotationPoint(-2.0F, -2.5F, 0.0F);
			RightArm.addChild(cube_r7_r1);
			setRotationAngle(cube_r7_r1, -0.5672F, 0.0F, 0.0F);
			cube_r7_r1.setTextureOffset(56, 10).addBox(-1.0F, -8.5F, 1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			RightArm.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.9599F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(56, 21).addBox(-3.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-2.0F, 0.0F, 0.0F);
			RightArm.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 1.5708F, -0.3491F);
			cube_r2.setTextureOffset(56, 21).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-2.0F, 0.0F, 0.0F);
			RightArm.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 1.5708F, -0.9599F);
			cube_r3.setTextureOffset(56, 21).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			RightArm.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(56, 21).addBox(-3.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 3.0F, 0.0F);
			LeftArm.setTextureOffset(40, 16).addBox(0.0F, -4.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(4.0F, -1.0F, 0.0F);
			LeftArm.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.9599F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(56, 21).addBox(-3.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(2.0F, -1.0F, 0.0F);
			LeftArm.addChild(cube_r9);
			cube_r7_r2 = new ModelRenderer(this);
			cube_r7_r2.setRotationPoint(0.0F, -2.5F, 0.0F);
			cube_r9.addChild(cube_r7_r2);
			setRotationAngle(cube_r7_r2, -0.5672F, 0.0F, 0.0F);
			cube_r7_r2.setTextureOffset(56, 10).addBox(-1.0F, -8.5F, 1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(2.0F, -1.0F, 0.0F);
			LeftArm.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, -1.5708F, 0.3491F);
			cube_r6.setTextureOffset(56, 21).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(2.0F, -1.0F, 0.0F);
			LeftArm.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, -1.5708F, 0.9599F);
			cube_r7.setTextureOffset(56, 21).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(4.0F, -1.0F, 0.0F);
			LeftArm.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(56, 21).addBox(-3.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			body2.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}
