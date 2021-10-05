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

import net.mcreator.zaomengxiyoutotalzip.entity.Nmw3Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class Nmw3Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Nmw3Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelnmw3(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/shape_725.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelnmw3 extends EntityModel<Entity> {
		private final ModelRenderer righthand;
		private final ModelRenderer lefthand;
		private final ModelRenderer body;
		public Modelnmw3() {
			textureWidth = 444;
			textureHeight = 444;
			righthand = new ModelRenderer(this);
			righthand.setRotationPoint(0.0F, 24.0F, 0.0F);
			righthand.setTextureOffset(239, 364).addBox(34.0F, -75.0F, -1.0F, 75.0F, 46.0F, 0.0F, 0.0F, false);
			lefthand = new ModelRenderer(this);
			lefthand.setRotationPoint(0.0F, 24.0F, 0.0F);
			lefthand.setTextureOffset(44, 365).addBox(-104.0F, -66.0F, -1.0F, 73.0F, 46.0F, 0.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(0, 243).addBox(-111.0F, -108.0F, 0.0F, 222.0F, 111.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(166, 136).addBox(-39.0F, -103.0F, -0.4F, 83.0F, 91.0F, 0.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			righthand.render(matrixStack, buffer, packedLight, packedOverlay);
			lefthand.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.lefthand.rotateAngleY = f4 / (180F / (float) Math.PI);
			this.righthand.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.body.rotateAngleY = f4 / (180F / (float) Math.PI);
		}
	}
}
