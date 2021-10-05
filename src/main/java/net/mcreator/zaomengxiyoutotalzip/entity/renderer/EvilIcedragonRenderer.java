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

import net.mcreator.zaomengxiyoutotalzip.entity.EvilIcedragonEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class EvilIcedragonRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(EvilIcedragonEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbinglongbo(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/evilicedragon.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelbinglongbo extends EntityModel<Entity> {
		private final ModelRenderer tooth;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer bone;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		public Modelbinglongbo() {
			textureWidth = 64;
			textureHeight = 64;
			tooth = new ModelRenderer(this);
			tooth.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 3.0F);
			tooth.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
			cube_r1.setTextureOffset(0, 62).addBox(-4.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 62).addBox(-4.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 62).addBox(-4.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 62).addBox(-4.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 62).addBox(-4.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 62).addBox(-4.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 62).addBox(-4.0F, -2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 62).addBox(-4.0F, -2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(48, 56).addBox(-4.0F, -1.0F, -9.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r1.setTextureOffset(48, 56).addBox(-4.0F, -1.0F, -9.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -1.0F, 3.0F);
			tooth.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.1309F, -0.1745F, 0.0F);
			cube_r2.setTextureOffset(0, 62).addBox(-4.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r2.setTextureOffset(0, 62).addBox(-4.0F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r2.setTextureOffset(0, 62).addBox(-4.0F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r2.setTextureOffset(0, 62).addBox(-4.0F, -4.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r2.setTextureOffset(48, 56).addBox(-4.0F, -5.0F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -1.0F, 3.0F);
			tooth.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.1309F, 0.1745F, 0.0F);
			cube_r3.setTextureOffset(0, 62).addBox(3.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r3.setTextureOffset(0, 62).addBox(3.0F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r3.setTextureOffset(0, 62).addBox(3.0F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r3.setTextureOffset(0, 62).addBox(3.0F, -4.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r3.setTextureOffset(48, 56).addBox(3.0F, -5.0F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 3.0F);
			tooth.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.1745F, 0.0F);
			cube_r4.setTextureOffset(0, 62).addBox(3.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r4.setTextureOffset(0, 62).addBox(3.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r4.setTextureOffset(0, 62).addBox(3.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r4.setTextureOffset(0, 62).addBox(3.0F, -2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r4.setTextureOffset(48, 56).addBox(3.0F, -1.0F, -9.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone.setTextureOffset(32, 0).addBox(-4.0F, -6.0F, 0.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(3.0F, -1.0F, 8.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, 8.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(3.0F, -3.0F, 8.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-4.0F, -3.0F, 8.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(3.0F, -5.0F, 8.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, 8.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-0.4081F, -4.0F, -5.6642F);
			bone.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(22, 28).addBox(-1.5919F, -1.0F, 6.6642F, 4.0F, 4.0F, 10.0F, 0.0F, false);
			cube_r5.setTextureOffset(22, 28).addBox(-1.5919F, -3.0F, 0.6642F, 4.0F, 2.0F, 16.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-0.4081F, -4.0F, -5.6642F);
			bone.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.5236F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(22, 28).addBox(-3.5919F, 1.0F, 12.6642F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r6.setTextureOffset(22, 28).addBox(3.4081F, 1.0F, 12.6642F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r6.setTextureOffset(22, 28).addBox(-3.5919F, 0.0F, 8.6642F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r6.setTextureOffset(22, 28).addBox(2.4081F, 0.0F, 8.6642F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			tooth.render(matrixStack, buffer, packedLight, packedOverlay);
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
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
