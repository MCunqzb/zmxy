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

import net.mcreator.zaomengxiyoutotalzip.entity.Baigujing2Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class Baigujing2Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Baigujing2Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbaigujing2(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/baigujing2.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelbaigujing2 extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightleg2;
		public Modelbaigujing2() {
			textureWidth = 80;
			textureHeight = 80;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(23, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(55, 0).addBox(-1.0F, -14.0F, 0.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(47, 4).addBox(-1.0F, -14.0F, 4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 48).addBox(-4.0F, -8.0F, 4.1F, 8.0F, 13.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(0, 2).addBox(-1.5F, -8.3F, -2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 4).addBox(-0.5F, -8.3F, -3.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(13, 0).addBox(-4.0F, -5.3F, -4.1F, 8.0F, 1.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(13, 3).addBox(-4.0F, -2.7F, -4.1F, 8.0F, 1.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(0, 13).addBox(-1.5F, -7.8F, -4.4F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 4.0F, 0.0F);
			body.setTextureOffset(27, 16).addBox(-4.0F, -4.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(12, 32).addBox(-2.0F, 8.0F, -2.1F, 4.0F, 9.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(31, 32).addBox(-4.0F, 6.0F, -2.1F, 8.0F, 2.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(25, 32).addBox(-1.0F, 7.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-2.0F, 0.0F, 0.0F);
			body.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, -0.2618F, 0.0F);
			cube_r2.setTextureOffset(56, 25).addBox(0.0F, -7.0F, 2.0F, 0.0F, 14.0F, 9.0F, 0.0F, true);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(2.0F, 0.0F, 0.0F);
			body.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.2618F, 0.0F);
			cube_r3.setTextureOffset(56, 25).addBox(0.0F, -7.0F, 2.0F, 0.0F, 14.0F, 9.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, -3.0F, -2.0F);
			body.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.829F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(0, 41).addBox(-4.0F, 0.2F, 0.1F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(5.0F, 1.0F, 0.0F);
			leftarm.setTextureOffset(54, 18).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftarm.setTextureOffset(54, 10).addBox(-1.0F, -3.0F, -3.0F, 7.0F, 2.0F, 6.0F, 0.0F, false);
			leftarm.setTextureOffset(67, 5).addBox(3.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			leftarm.setTextureOffset(69, 2).addBox(3.0F, 1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			leftarm.setTextureOffset(64, 72).addBox(0.0F, 10.0F, 5.1F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			leftarm.setTextureOffset(60, 62).addBox(0.0F, 10.0F, -4.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			leftarm.setTextureOffset(64, 54).addBox(0.0F, 10.0F, -11.1F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			leftarm.setTextureOffset(31, 56).addBox(0.8F, 11.0F, -6.1F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			leftarm.setTextureOffset(72, 50).addBox(-1.0F, 9.0F, -12.1F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(42, 51).addBox(-1.4F, 8.9F, -21.1F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			leftarm.setTextureOffset(38, 65).addBox(1.5F, 9.9F, -17.1F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			leftarm.setTextureOffset(20, 71).addBox(-0.3F, 11.5F, -20.1F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 68).addBox(0.0F, 4.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-5.0F, 1.0F, 0.0F);
			rightarm.setTextureOffset(7, 16).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(2.0F, 13.0F, 0.0F);
			leftleg.setTextureOffset(39, 34).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightleg2 = new ModelRenderer(this);
			rightleg2.setRotationPoint(-2.0F, 13.0F, 0.0F);
			rightleg2.setTextureOffset(23, 34).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg2.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
