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

import net.mcreator.zaomengxiyoutotalzip.entity.ArgillaceousshieldEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ArgillaceousshieldRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ArgillaceousshieldEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelArgillaceous_shield(), 1f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/argillaceous_shield.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.1
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelArgillaceous_shield extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		public ModelArgillaceous_shield() {
			textureWidth = 48;
			textureHeight = 24;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, -4.0F, 0.0F);
			addBoxHelper(bone, 0, 0, -5.0F, 24.0F, -8.0F, 11, 11, 1, 0.0F, false);
			addBoxHelper(bone, 24, 0, -6.0F, 23.0F, -8.5F, 1, 12, 2, 0.0F, false);
			addBoxHelper(bone, 24, 0, 6.0F, 23.0F, -8.5F, 1, 12, 2, 0.0F, true);
			addBoxHelper(bone, 0, 12, -5.0F, 23.0F, -8.5F, 11, 1, 2, 0.0F, false);
			addBoxHelper(bone, 0, 15, -5.0F, 35.0F, -8.0F, 11, 1, 1, 0.0F, false);
			addBoxHelper(bone, 0, 18, -4.0F, 36.0F, -8.0F, 9, 1, 1, 0.0F, false);
			addBoxHelper(bone, 0, 20, -3.0F, 37.0F, -8.0F, 7, 1, 1, 0.0F, false);
			addBoxHelper(bone, 0, 22, -2.0F, 38.0F, -8.0F, 5, 1, 1, 0.0F, false);
			addBoxHelper(bone, 40, 0, -1.0F, 39.0F, -8.0F, 3, 1, 1, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-5.7279F, 35.0F, -7.5F);
			bone.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
			addBoxHelper(cube_r1, 38, 13, 8.0F, -9.0F, -1.0F, 1, 9, 2, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-6.0F, 35.0F, -7.5F);
			bone.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
			addBoxHelper(cube_r2, 38, 13, 0.0F, 0.0F, -1.0F, 1, 9, 2, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			bone.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.bone.rotateAngleY = f2;
		}
	}
	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta) {
		addBoxHelper(renderer, texU, texV, x, y, z, dx, dy, dz, delta, renderer.mirror);
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta,
			boolean mirror) {
		renderer.mirror = mirror;
		renderer.addBox("", x, y, z, dx, dy, dz, delta, texU, texV);
	}
}
