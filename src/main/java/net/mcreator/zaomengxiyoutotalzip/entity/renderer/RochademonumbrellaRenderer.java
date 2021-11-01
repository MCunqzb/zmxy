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

import net.mcreator.zaomengxiyoutotalzip.entity.RochademonumbrellaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RochademonumbrellaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RochademonumbrellaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelRocha_demon_umbrella(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/rocha_demon_umbrella.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelRocha_demon_umbrella extends EntityModel<Entity> {
		private final ModelRenderer Rochademonumbrella;
		private final ModelRenderer bone;
		private final ModelRenderer hexadecagonwen;
		private final ModelRenderer c8_r1;
		private final ModelRenderer c6_r1;
		private final ModelRenderer c5_r1;
		private final ModelRenderer c1_r1;
		private final ModelRenderer hexadecagon1;
		private final ModelRenderer a8_r1;
		private final ModelRenderer a6_r1;
		private final ModelRenderer a5_r1;
		private final ModelRenderer a1_r1;
		private final ModelRenderer hexadecagon2;
		private final ModelRenderer z8_r1;
		private final ModelRenderer z6_r1;
		private final ModelRenderer z5_r1;
		private final ModelRenderer z1_r1;
		public ModelRocha_demon_umbrella() {
			textureWidth = 64;
			textureHeight = 32;
			Rochademonumbrella = new ModelRenderer(this);
			Rochademonumbrella.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, 0.0F);
			Rochademonumbrella.addChild(bone);
			bone.setTextureOffset(52, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(48, 26).addBox(-1.5F, -22.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(60, 0).addBox(-0.5F, -26.0F, -0.5F, 1.0F, 27.0F, 1.0F, 0.0F, false);
			hexadecagonwen = new ModelRenderer(this);
			hexadecagonwen.setRotationPoint(0.0F, 5.0F, 0.0F);
			hexadecagonwen.setTextureOffset(0, 0).addBox(-0.5967F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
			hexadecagonwen.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -0.5967F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			c8_r1 = new ModelRenderer(this);
			c8_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagonwen.addChild(c8_r1);
			setRotationAngle(c8_r1, 0.0F, -0.3927F, 0.0F);
			c8_r1.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -0.5967F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			c8_r1.setTextureOffset(0, 0).addBox(-0.5967F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
			c6_r1 = new ModelRenderer(this);
			c6_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagonwen.addChild(c6_r1);
			setRotationAngle(c6_r1, 0.0F, 0.3927F, 0.0F);
			c6_r1.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -0.5967F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			c6_r1.setTextureOffset(0, 0).addBox(-0.5967F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
			c5_r1 = new ModelRenderer(this);
			c5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagonwen.addChild(c5_r1);
			setRotationAngle(c5_r1, 0.0F, -0.7854F, 0.0F);
			c5_r1.setTextureOffset(0, 0).addBox(-0.5967F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
			c1_r1 = new ModelRenderer(this);
			c1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagonwen.addChild(c1_r1);
			setRotationAngle(c1_r1, 0.0F, 0.7854F, 0.0F);
			c1_r1.setTextureOffset(0, 0).addBox(-0.5967F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
			hexadecagon1 = new ModelRenderer(this);
			hexadecagon1.setRotationPoint(0.0F, 7.0F, 0.0F);
			hexadecagon1.setTextureOffset(0, 0).addBox(-0.9946F, -1.5F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);
			hexadecagon1.setTextureOffset(0, 0).addBox(-5.0F, -1.5F, -0.9946F, 10.0F, 3.0F, 1.0F, 0.0F, false);
			a8_r1 = new ModelRenderer(this);
			a8_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon1.addChild(a8_r1);
			setRotationAngle(a8_r1, 0.0F, -0.3927F, 0.0F);
			a8_r1.setTextureOffset(0, 0).addBox(-5.0F, -1.5F, -0.9946F, 10.0F, 3.0F, 1.0F, 0.0F, false);
			a8_r1.setTextureOffset(0, 0).addBox(-0.9946F, -1.5F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);
			a6_r1 = new ModelRenderer(this);
			a6_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon1.addChild(a6_r1);
			setRotationAngle(a6_r1, 0.0F, 0.3927F, 0.0F);
			a6_r1.setTextureOffset(0, 0).addBox(-5.0F, -1.5F, -0.9946F, 10.0F, 3.0F, 1.0F, 0.0F, false);
			a6_r1.setTextureOffset(0, 0).addBox(-0.9946F, -1.5F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);
			a5_r1 = new ModelRenderer(this);
			a5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon1.addChild(a5_r1);
			setRotationAngle(a5_r1, 0.0F, -0.7854F, 0.0F);
			a5_r1.setTextureOffset(0, 0).addBox(-0.9946F, -1.5F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);
			a1_r1 = new ModelRenderer(this);
			a1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon1.addChild(a1_r1);
			setRotationAngle(a1_r1, 0.0F, 0.7854F, 0.0F);
			a1_r1.setTextureOffset(0, 0).addBox(-0.9946F, -1.5F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);
			hexadecagon2 = new ModelRenderer(this);
			hexadecagon2.setRotationPoint(0.0F, 9.0F, 0.0F);
			hexadecagon2.setTextureOffset(0, 3).addBox(-2.7848F, -0.5F, -14.0F, 5.0F, 1.0F, 28.0F, 0.0F, false);
			hexadecagon2.setTextureOffset(0, 15).addBox(-14.0F, -0.5F, -2.7848F, 28.0F, 1.0F, 5.0F, 0.0F, false);
			z8_r1 = new ModelRenderer(this);
			z8_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon2.addChild(z8_r1);
			setRotationAngle(z8_r1, 0.0F, -0.3927F, 0.0F);
			z8_r1.setTextureOffset(0, 15).addBox(-14.0F, -0.5F, -2.7848F, 28.0F, 1.0F, 5.0F, 0.0F, false);
			z8_r1.setTextureOffset(0, 3).addBox(-2.7848F, -0.5F, -14.0F, 5.0F, 1.0F, 28.0F, 0.0F, false);
			z6_r1 = new ModelRenderer(this);
			z6_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon2.addChild(z6_r1);
			setRotationAngle(z6_r1, 0.0F, 0.3927F, 0.0F);
			z6_r1.setTextureOffset(0, 15).addBox(-14.0F, -0.5F, -2.7848F, 28.0F, 1.0F, 5.0F, 0.0F, false);
			z6_r1.setTextureOffset(0, 3).addBox(-2.7848F, -0.5F, -14.0F, 5.0F, 1.0F, 28.0F, 0.0F, false);
			z5_r1 = new ModelRenderer(this);
			z5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon2.addChild(z5_r1);
			setRotationAngle(z5_r1, 0.0F, -0.7854F, 0.0F);
			z5_r1.setTextureOffset(0, 3).addBox(-2.7848F, -0.5F, -14.0F, 5.0F, 1.0F, 28.0F, 0.0F, false);
			z1_r1 = new ModelRenderer(this);
			z1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon2.addChild(z1_r1);
			setRotationAngle(z1_r1, 0.0F, 0.7854F, 0.0F);
			z1_r1.setTextureOffset(0, 3).addBox(-2.7848F, -0.5F, -14.0F, 5.0F, 1.0F, 28.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Rochademonumbrella.render(matrixStack, buffer, packedLight, packedOverlay);
			hexadecagonwen.render(matrixStack, buffer, packedLight, packedOverlay);
			hexadecagon1.render(matrixStack, buffer, packedLight, packedOverlay);
			hexadecagon2.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Rochademonumbrella.rotateAngleY = f2 / 20.f;
			this.hexadecagon1.rotateAngleY = f2 / 20.f;
			this.hexadecagonwen.rotateAngleY = f2 / 20.f;
			this.hexadecagon2.rotateAngleY = f2;
		}
	}
}
