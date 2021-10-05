package net.mcreator.zaomengxiyoutotalzip.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.zaomengxiyoutotalzip.entity.XxuanbingEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class XxuanbingRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(XxuanbingEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelxuanbing(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/xuanbing.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelxuanbing extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer bone2;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer cube_r14;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer bone3;
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		private final ModelRenderer cube_r19;
		public Modelxuanbing() {
			textureWidth = 64;
			textureHeight = 64;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 18.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(22, 20).addBox(-1.0F, -9.0F, 3.0F, 3.0F, 9.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.1309F, 0.7854F, 0.0F);
			cube_r2.setTextureOffset(22, 20).addBox(-2.0F, -9.0F, -4.0F, 3.0F, 9.0F, 1.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.1309F, -0.7854F, 0.0F);
			cube_r3.setTextureOffset(22, 20).addBox(-2.0F, -9.0F, -4.0F, 3.0F, 9.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(22, 20).addBox(-2.0F, -9.0F, -4.0F, 3.0F, 9.0F, 1.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.1309F, 0.7854F, 0.0F);
			cube_r5.setTextureOffset(22, 20).addBox(-1.0F, -9.0F, 3.0F, 3.0F, 9.0F, 1.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.1309F, -1.5708F, 0.0F);
			cube_r6.setTextureOffset(22, 20).addBox(-1.0F, -9.0F, 3.0F, 3.0F, 9.0F, 1.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.1309F, -0.7854F, 0.0F);
			cube_r7.setTextureOffset(22, 20).addBox(-1.0F, -9.0F, 3.0F, 3.0F, 9.0F, 1.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r8);
			setRotationAngle(cube_r8, -0.1309F, -1.5708F, 0.0F);
			cube_r8.setTextureOffset(22, 20).addBox(-2.0F, -9.0F, -4.0F, 3.0F, 9.0F, 1.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 8.0F, 0.0F);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, 2.0F, 0.0F);
			bone2.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(24, 16).addBox(-1.0F, -6.0F, 2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, 2.0F, 0.0F);
			bone2.addChild(cube_r10);
			setRotationAngle(cube_r10, -0.3054F, 0.7854F, 0.0F);
			cube_r10.setTextureOffset(24, 16).addBox(-1.0F, -6.0F, -3.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, 2.0F, 0.0F);
			bone2.addChild(cube_r11);
			setRotationAngle(cube_r11, -0.3054F, -0.7854F, 0.0F);
			cube_r11.setTextureOffset(24, 16).addBox(-1.0F, -6.0F, -3.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(0.0F, 2.0F, 0.0F);
			bone2.addChild(cube_r12);
			setRotationAngle(cube_r12, -0.3054F, 0.0F, 0.0F);
			cube_r12.setTextureOffset(24, 16).addBox(-1.0F, -6.0F, -3.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(0.0F, 2.0F, 0.0F);
			bone2.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.3054F, 0.7854F, 0.0F);
			cube_r13.setTextureOffset(24, 16).addBox(-1.0F, -6.0F, 2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(0.0F, 2.0F, 0.0F);
			bone2.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.3054F, -1.5708F, 0.0F);
			cube_r14.setTextureOffset(24, 16).addBox(-1.0F, -6.0F, 2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(0.0F, 2.0F, 0.0F);
			bone2.addChild(cube_r15);
			setRotationAngle(cube_r15, 0.3054F, -0.7854F, 0.0F);
			cube_r15.setTextureOffset(24, 16).addBox(-1.0F, -6.0F, 2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(0.0F, 2.0F, 0.0F);
			bone2.addChild(cube_r16);
			setRotationAngle(cube_r16, -0.3054F, -1.5708F, 0.0F);
			cube_r16.setTextureOffset(24, 16).addBox(-1.0F, -6.0F, -3.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone3.setTextureOffset(23, 37).addBox(-2.0F, -7.0F, -5.0F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(23, 37).addBox(-2.0F, -7.0F, 4.0F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone3.addChild(cube_r17);
			setRotationAngle(cube_r17, 0.0F, -1.5708F, 0.0F);
			cube_r17.setTextureOffset(23, 37).addBox(-2.0F, -7.0F, -5.0F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			cube_r17.setTextureOffset(23, 37).addBox(-2.0F, -7.0F, 4.0F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone3.addChild(cube_r18);
			setRotationAngle(cube_r18, 0.0F, -0.7854F, 0.0F);
			cube_r18.setTextureOffset(23, 37).addBox(-2.0F, -7.0F, -5.0F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			cube_r18.setTextureOffset(23, 37).addBox(-2.0F, -7.0F, 4.0F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone3.addChild(cube_r19);
			setRotationAngle(cube_r19, 0.0F, 0.7854F, 0.0F);
			cube_r19.setTextureOffset(23, 37).addBox(-2.0F, -7.0F, -5.0F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			cube_r19.setTextureOffset(23, 37).addBox(-2.0F, -7.0F, 4.0F, 4.0F, 7.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
			bone2.render(matrixStack, buffer, packedLight, packedOverlay);
			bone3.render(matrixStack, buffer, packedLight, packedOverlay);
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
