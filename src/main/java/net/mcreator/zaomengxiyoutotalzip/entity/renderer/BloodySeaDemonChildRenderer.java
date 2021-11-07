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

import net.mcreator.zaomengxiyoutotalzip.entity.BloodySeaDemonChildEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BloodySeaDemonChildRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BloodySeaDemonChildEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBloody_Sea_Demon_Child(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/bloody_sea_demon_child.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBloody_Sea_Demon_Child extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		private final ModelRenderer cube_r1;
		private final ModelRenderer bone3;
		private final ModelRenderer cube_r2;
		public ModelBloody_Sea_Demon_Child() {
			textureWidth = 32;
			textureHeight = 32;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, -3.3571F, -0.5F);
			bone.setTextureOffset(0, 0).addBox(-0.5F, 1.3571F, 0.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(24, 0).addBox(-2.5F, 2.0F, -1.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(24, 0).addBox(1.5F, 2.0F, -1.0F, 1.0F, 7.0F, 3.0F, 0.0F, true);
			bone.setTextureOffset(24, 10).addBox(-1.5F, 3.0F, -1.0F, 3.0F, 6.0F, 1.0F, 0.1F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, -5.5F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone2.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(20, 20).addBox(-2.5F, -1.5F, 1.0F, 5.0F, 5.0F, 0.0F, 0.3F, false);
			cube_r1.setTextureOffset(9, 15).addBox(-2.5F, -1.5F, -4.0F, 0.0F, 5.0F, 5.0F, 0.1F, false);
			cube_r1.setTextureOffset(9, 15).addBox(2.5F, -1.5F, -4.0F, 0.0F, 5.0F, 5.0F, 0.1F, true);
			cube_r1.setTextureOffset(4, 10).addBox(-2.5F, 3.5F, -4.0F, 5.0F, 1.0F, 5.0F, 0.31F, false);
			cube_r1.setTextureOffset(3, 26).addBox(-2.5F, -2.25F, -4.25F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r1.setTextureOffset(4, 0).addBox(-2.5F, -1.5F, -4.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 0.0F, 0.5F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone3.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 17).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 7.0F, 1.0F, 0.0F, false);
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
			this.bone3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.bone2.rotateAngleY = f3 / (180F / (float) Math.PI);
		}
	}
}
