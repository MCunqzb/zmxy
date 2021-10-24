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

import net.mcreator.zaomengxiyoutotalzip.entity.SoilballEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SoilballRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SoilballEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelSoil_ball(), 1f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/soil_ball.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelSoil_ball extends EntityModel<Entity> {
		private final ModelRenderer base;
		private final ModelRenderer cube_r1;
		private final ModelRenderer bone;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer bone2;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer bone3;
		private final ModelRenderer cube_r14;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		private final ModelRenderer cube_r19;
		private final ModelRenderer cube_r20;
		private final ModelRenderer cube_r21;
		private final ModelRenderer cube_r22;
		private final ModelRenderer cube_r23;
		private final ModelRenderer cube_r24;
		private final ModelRenderer cube_r25;
		public ModelSoil_ball() {
			textureWidth = 128;
			textureHeight = 64;
			base = new ModelRenderer(this);
			base.setRotationPoint(0.0F, 24.0F, 0.0F);
			base.setTextureOffset(0, 0).addBox(-12.0F, -4.0F, -12.0F, 24.0F, 4.0F, 24.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			base.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
			cube_r1.setTextureOffset(28, 42).addBox(-10.0F, -31.0F, -10.0F, 20.0F, 2.0F, 20.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 0).addBox(-12.0F, -4.0F, -12.0F, 24.0F, 4.0F, 24.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(8.1317F, -4.0F, 8.1317F);
			bone.addChild(cube_r2);
			setRotationAngle(cube_r2, -2.8798F, -0.7854F, 3.1416F);
			cube_r2.setTextureOffset(0, 52).addBox(-6.0F, -10.0F, -1.0F, 12.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-8.1317F, -4.0F, -8.1317F);
			bone.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.2618F, 0.7854F, 0.0F);
			cube_r3.setTextureOffset(0, 52).addBox(-6.0F, -10.0F, -1.0F, 12.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(8.1317F, -4.0F, -8.1317F);
			bone.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.2618F, -0.7854F, 0.0F);
			cube_r4.setTextureOffset(0, 52).addBox(-6.0F, -10.0F, -1.0F, 12.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-8.1317F, -4.0F, 8.1317F);
			bone.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.2618F, -0.7854F, 0.0F);
			cube_r5.setTextureOffset(0, 52).addBox(-6.0F, -10.0F, -1.0F, 12.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-5.0F, -4.0F, -10.0F);
			bone.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(0, 0).addBox(0.0F, -10.0F, -2.0F, 10.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(5.0F, -4.0F, 10.0F);
			bone.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(0, 0).addBox(-10.0F, -10.0F, 0.0F, 10.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(10.0F, -4.0F, -5.0F);
			bone.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3491F);
			cube_r8.setTextureOffset(0, 29).addBox(0.0F, -10.0F, 0.0F, 2.0F, 10.0F, 10.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-10.0F, -4.0F, -5.0F);
			bone.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.0F, -0.3491F);
			cube_r9.setTextureOffset(0, 29).addBox(-2.0F, -10.0F, 0.0F, 2.0F, 10.0F, 10.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 14.0F, 0.0F);
			bone2.setTextureOffset(0, 29).addBox(-14.0F, -13.0F, -5.0F, 2.0F, 10.0F, 10.0F, 0.0F, false);
			bone2.setTextureOffset(0, 29).addBox(12.0F, -13.0F, -5.0F, 2.0F, 10.0F, 10.0F, 0.0F, false);
			bone2.setTextureOffset(0, 0).addBox(-5.0F, -12.0F, 12.0F, 10.0F, 10.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(0, 0).addBox(-5.0F, -12.0F, -14.0F, 10.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(8.1317F, -4.0F, 8.1317F);
			bone2.addChild(cube_r10);
			setRotationAngle(cube_r10, 3.1416F, -0.7854F, 3.1416F);
			cube_r10.setTextureOffset(0, 52).addBox(-6.0F, -9.0F, -3.0F, 12.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(-8.1317F, -4.0F, -8.1317F);
			bone2.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.0F, 0.7854F, 0.0F);
			cube_r11.setTextureOffset(0, 52).addBox(-6.0F, -9.0F, -3.0F, 12.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(8.1317F, -4.0F, -8.1317F);
			bone2.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.0F, -0.7854F, 0.0F);
			cube_r12.setTextureOffset(0, 52).addBox(-6.0F, -9.0F, -3.0F, 12.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(-8.1317F, -4.0F, 8.1317F);
			bone2.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.0F, -0.7854F, 0.0F);
			cube_r13.setTextureOffset(0, 52).addBox(-6.0F, -9.0F, 1.0F, 12.0F, 10.0F, 2.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, -9.0F, 0.0F);
			setRotationAngle(bone3, 0.0F, 0.0F, -3.1416F);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(8.1317F, -4.0F, 8.1317F);
			bone3.addChild(cube_r14);
			setRotationAngle(cube_r14, -2.8798F, -0.7854F, 3.1416F);
			cube_r14.setTextureOffset(0, 52).addBox(-6.0F, -8.0F, -1.0F, 12.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(-8.1317F, -4.0F, -8.1317F);
			bone3.addChild(cube_r15);
			setRotationAngle(cube_r15, 0.2618F, 0.7854F, 0.0F);
			cube_r15.setTextureOffset(0, 52).addBox(-6.0F, -8.0F, -1.0F, 12.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(8.1317F, -4.0F, -8.1317F);
			bone3.addChild(cube_r16);
			setRotationAngle(cube_r16, 0.2618F, -0.7854F, 0.0F);
			cube_r16.setTextureOffset(0, 52).addBox(-6.0F, -8.0F, -1.0F, 12.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(-8.1317F, -4.0F, 8.1317F);
			bone3.addChild(cube_r17);
			setRotationAngle(cube_r17, -0.2618F, -0.7854F, 0.0F);
			cube_r17.setTextureOffset(0, 52).addBox(-6.0F, -8.0F, -1.0F, 12.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(-5.0F, -3.316F, -11.8794F);
			bone3.addChild(cube_r18);
			setRotationAngle(cube_r18, 1.0472F, 0.0F, 0.0F);
			cube_r18.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 10.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(-5.0F, -4.0F, -10.0F);
			bone3.addChild(cube_r19);
			setRotationAngle(cube_r19, 0.3491F, 0.0F, 0.0F);
			cube_r19.setTextureOffset(0, 0).addBox(0.0F, -10.0F, -2.0F, 10.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(5.0F, -3.316F, 11.8794F);
			bone3.addChild(cube_r20);
			setRotationAngle(cube_r20, -1.0472F, 0.0F, 0.0F);
			cube_r20.setTextureOffset(0, 0).addBox(-10.0F, 0.0F, -2.0F, 10.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r21 = new ModelRenderer(this);
			cube_r21.setRotationPoint(5.0F, -4.0F, 10.0F);
			bone3.addChild(cube_r21);
			setRotationAngle(cube_r21, -0.3491F, 0.0F, 0.0F);
			cube_r21.setTextureOffset(0, 0).addBox(-10.0F, -10.0F, 0.0F, 10.0F, 10.0F, 2.0F, 0.0F, false);
			cube_r22 = new ModelRenderer(this);
			cube_r22.setRotationPoint(11.8794F, -3.316F, -5.0F);
			bone3.addChild(cube_r22);
			setRotationAngle(cube_r22, 0.0F, 0.0F, 1.0472F);
			cube_r22.setTextureOffset(104, 30).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 10.0F, 10.0F, 0.0F, false);
			cube_r23 = new ModelRenderer(this);
			cube_r23.setRotationPoint(10.0F, -4.0F, -5.0F);
			bone3.addChild(cube_r23);
			setRotationAngle(cube_r23, 0.0F, 0.0F, 0.3491F);
			cube_r23.setTextureOffset(0, 29).addBox(0.0F, -10.0F, 0.0F, 2.0F, 10.0F, 10.0F, 0.0F, false);
			cube_r24 = new ModelRenderer(this);
			cube_r24.setRotationPoint(-10.0F, -4.0F, -5.0F);
			bone3.addChild(cube_r24);
			setRotationAngle(cube_r24, 0.0F, 0.0F, -0.3491F);
			cube_r24.setTextureOffset(0, 29).addBox(-2.0F, -10.0F, 0.0F, 2.0F, 10.0F, 10.0F, 0.0F, false);
			cube_r25 = new ModelRenderer(this);
			cube_r25.setRotationPoint(-11.8794F, -3.316F, -5.0F);
			bone3.addChild(cube_r25);
			setRotationAngle(cube_r25, 0.0F, 0.0F, -1.0472F);
			cube_r25.setTextureOffset(104, 30).addBox(0.0F, 0.0F, 0.0F, 2.0F, 10.0F, 10.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			base.render(matrixStack, buffer, packedLight, packedOverlay);
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
