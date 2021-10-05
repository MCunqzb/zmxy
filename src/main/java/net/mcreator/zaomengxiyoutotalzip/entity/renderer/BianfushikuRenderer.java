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

import net.mcreator.zaomengxiyoutotalzip.entity.BianfushikuEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BianfushikuRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BianfushikuEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbianfushiku(), 1.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/bianfushiku.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.2
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelbianfushiku extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer leftear;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer rightear;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		public Modelbianfushiku() {
			textureWidth = 512;
			textureHeight = 512;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone.setTextureOffset(6, 470).addBox(-17.0F, -13.0F, -12.0F, 34.0F, 13.0F, 24.0F, 0.0F, false);
			bone.setTextureOffset(0, 419).addBox(-15.0F, -22.0F, -11.0F, 30.0F, 9.0F, 22.0F, 0.0F, false);
			bone.setTextureOffset(7, 380).addBox(-13.0F, -31.0F, -10.0F, 26.0F, 9.0F, 20.0F, 0.0F, false);
			bone.setTextureOffset(7, 347).addBox(-11.0F, -36.0F, -9.0F, 22.0F, 5.0F, 18.0F, 0.0F, false);
			bone.setTextureOffset(400, 203).addBox(-8.0F, -39.0F, -8.0F, 16.0F, 3.0F, 16.0F, 0.0F, false);
			bone.setTextureOffset(404, 227).addBox(-7.0F, -42.0F, -7.0F, 14.0F, 3.0F, 14.0F, 0.0F, false);
			bone.setTextureOffset(332, 0).addBox(-7.0F, -43.0F, -7.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);
			bone.setTextureOffset(16, 303).addBox(-8.0F, -43.0F, -8.0F, 16.0F, 4.0F, 1.0F, 0.0F, false);
			leftear = new ModelRenderer(this);
			leftear.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(13.0F, -14.0F, 2.0F);
			leftear.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -0.2618F);
			cube_r1.setTextureOffset(341, 68).addBox(1.0F, -24.0F, -1.0F, 7.0F, 25.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(7.0F, -35.0F, 1.0F);
			leftear.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, 0.4363F);
			cube_r2.setTextureOffset(334, 46).addBox(-5.0F, -11.0F, -2.0F, 8.0F, 10.0F, 2.0F, 0.0F, false);
			rightear = new ModelRenderer(this);
			rightear.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-14.0F, -13.0F, 0.0F);
			rightear.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, 0.2618F);
			cube_r3.setTextureOffset(270, 35).addBox(-7.0F, -25.0F, 1.0F, 7.0F, 25.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-7.0F, -36.0F, 0.0F);
			rightear.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, -0.4363F);
			cube_r4.setTextureOffset(265, 7).addBox(-3.0F, -10.0F, -1.0F, 8.0F, 10.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
			leftear.render(matrixStack, buffer, packedLight, packedOverlay);
			rightear.render(matrixStack, buffer, packedLight, packedOverlay);
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
