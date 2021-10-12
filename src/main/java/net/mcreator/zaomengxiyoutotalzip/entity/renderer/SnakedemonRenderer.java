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

import net.mcreator.zaomengxiyoutotalzip.entity.SnakedemonEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SnakedemonRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SnakedemonEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelSnake_demon(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/snake_demon.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelSnake_demon extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer body;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer foot1;
		private final ModelRenderer cube_r4;
		private final ModelRenderer foot2;
		private final ModelRenderer cube_r5;
		private final ModelRenderer foot3;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;
		private final ModelRenderer cube_r8;
		public ModelSnake_demon() {
			textureWidth = 80;
			textureHeight = 80;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, -3.0F);
			setRotationAngle(head, 0.0873F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(70, 0).addBox(4.0F, -9.0F, -1.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(70, 0).addBox(-5.0F, -9.0F, -1.0F, 1.0F, 4.0F, 4.0F, 0.0F, true);
			head.setTextureOffset(76, 8).addBox(3.7F, -7.5F, 1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(76, 8).addBox(-4.7F, -7.5F, 1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(66, 17).addBox(-3.0F, -9.0F, -3.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.5F, -9.0F, -2.0F);
			head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(70, 20).addBox(-1.0F, -3.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(76, 20).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 11.0327F, -0.765F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 2.5654F, -3.03F);
			body.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.3491F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 37).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 6.0F, 5.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -11.0327F, -4.235F);
			body.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(32, 0).addBox(-3.0F, 5.0F, 5.0F, 6.0F, 7.0F, 3.0F, 0.0F, false);
			cube_r3.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 16.0F, 5.0F, 0.0F, false);
			foot1 = new ModelRenderer(this);
			foot1.setRotationPoint(0.0F, 19.7966F, 2.9151F);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-4.0F, -1.5F, -5.0F);
			foot1.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.9599F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(0, 48).addBox(0.5F, 0.0F, 0.0F, 7.0F, 9.0F, 4.0F, 0.0F, false);
			foot2 = new ModelRenderer(this);
			foot2.setRotationPoint(0.0F, 22.4588F, 11.2874F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-4.0F, 1.0F, -6.0F);
			foot2.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(0, 61).addBox(0.5F, -4.0F, 0.0F, 7.0F, 4.0F, 12.0F, 0.0F, false);
			foot3 = new ModelRenderer(this);
			foot3.setRotationPoint(0.0F, 22.8662F, 16.6109F);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-4.0F, 2.1589F, 0.5738F);
			foot3.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(24, 54).addBox(1.0F, -2.9F, 11.0F, 6.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-4.0F, 0.1589F, 7.5738F);
			foot3.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(40, 62).addBox(0.5F, -1.9177F, -7.1477F, 7.0F, 3.0F, 11.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(4.0F, 2.0F, -2.0F);
			setRotationAngle(leftarm, 0.0873F, 0.0F, 0.0F);
			leftarm.setTextureOffset(36, 17).addBox(0.0F, -1.0F, -2.5F, 4.0F, 13.0F, 4.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-5.0F, 2.0F, -2.0F);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-3.0F, 0.0F, 0.0F);
			rightarm.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(36, 17).addBox(0.0F, -1.0F, -2.5F, 4.0F, 13.0F, 4.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			foot1.render(matrixStack, buffer, packedLight, packedOverlay);
			foot2.render(matrixStack, buffer, packedLight, packedOverlay);
			foot3.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.foot3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
