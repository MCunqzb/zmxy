package net.mcreator.zaomengxiyoutotalzip.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.zaomengxiyoutotalzip.entity.YamaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class YamaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(YamaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelYama(), 0.7f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/yama.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelYama extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer crown;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer body;
		private final ModelRenderer leftarm;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer rightarm;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer leg;
		public ModelYama() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -14.0F, 0.0F);
			head.setTextureOffset(88, 0).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(79, 4).addBox(-3.0F, -12.0F, -1.0F, 6.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 101).addBox(-6.0F, 0.0F, -5.0F, 11.0F, 5.0F, 0.0F, 0.0F, false);
			crown = new ModelRenderer(this);
			crown.setRotationPoint(0.0F, -25.0F, -1.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 3.0F);
			crown.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(94, 3).addBox(0.0F, -10.0F, -3.0F, 0.0F, 30.0F, 17.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -9.9144F, -1.3053F);
			crown.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.3491F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(119, 4).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 5.0F, 0.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			crown.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(124, 0).addBox(-1.0F, -10.0F, 0.0F, 2.0F, 10.0F, 0.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-9.0F, -14.0F, -4.0F, 18.0F, 22.0F, 9.0F, 0.0F, false);
			body.setTextureOffset(54, 15).addBox(-7.0F, -6.0F, -7.0F, 14.0F, 14.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(58, 66).addBox(-3.0F, 5.0F, -9.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(8.0F, -10.0F, 0.0F);
			leftarm.setTextureOffset(98, 51).addBox(1.0F, -3.0F, -3.0F, 6.0F, 18.0F, 7.0F, 0.0F, false);
			leftarm.setTextureOffset(98, 78).addBox(1.0F, 15.0F, -3.0F, 6.0F, 7.0F, 7.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			leftarm.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.7418F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(67, 35).addBox(1.0F, -15.0F, 2.0F, 1.0F, 15.0F, 2.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			leftarm.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(60, 35).addBox(1.0F, -23.0F, 2.0F, 1.0F, 23.0F, 2.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			leftarm.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, 0.1745F);
			cube_r6.setTextureOffset(0, 73).addBox(0.0F, -2.3F, -5.0F, 9.0F, 1.0F, 11.0F, 0.0F, false);
			cube_r6.setTextureOffset(0, 59).addBox(0.0F, -4.5F, -5.0F, 10.0F, 1.0F, 11.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-7.0F, -10.0F, 0.0F);
			rightarm.setTextureOffset(98, 51).addBox(-8.0F, -3.0F, -3.0F, 6.0F, 18.0F, 7.0F, 0.0F, false);
			rightarm.setTextureOffset(98, 78).addBox(-8.0F, 15.0F, -3.0F, 6.0F, 7.0F, 7.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-4.0F, 0.0F, 0.0F);
			rightarm.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(60, 35).addBox(1.0F, -23.0F, 2.0F, 1.0F, 23.0F, 2.0F, 0.0F, false);
			cube_r7.setTextureOffset(58, 79).addBox(1.9F, 7.0F, -12.0F, 0.0F, 14.0F, 35.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-4.0F, 0.0F, 0.0F);
			rightarm.addChild(cube_r8);
			setRotationAngle(cube_r8, -0.7418F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(67, 35).addBox(1.0F, -15.0F, 2.0F, 1.0F, 15.0F, 2.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-2.0F, 0.0F, 0.0F);
			rightarm.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.0F, -0.1745F);
			cube_r9.setTextureOffset(0, 59).addBox(-9.0F, -4.5F, -5.0F, 10.0F, 1.0F, 11.0F, 0.0F, false);
			cube_r9.setTextureOffset(0, 73).addBox(-8.0F, -2.3F, -5.0F, 9.0F, 1.0F, 11.0F, 0.0F, false);
			leg = new ModelRenderer(this);
			leg.setRotationPoint(0.0F, 8.0F, 0.0F);
			leg.setTextureOffset(4, 31).addBox(-8.0F, 0.0F, -6.0F, 16.0F, 16.0F, 11.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			crown.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.crown.rotateAngleY = f3 / (180F / (float) Math.PI);
		}
	}
}
