// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelTian_Sha_ancient_sword extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public ModelTian_Sha_ancient_sword() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 18.0F, 3.0F);
		setRotationAngle(bone, -1.5708F, 0.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 4).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(9, 0).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 19).addBox(-1.5F, -1.0F, -0.1F, 3.0F, 7.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(0, 12).addBox(-1.5F, -1.0F, 0.1F, 3.0F, 7.0F, 0.0F, 0.0F, true);
		bone.setTextureOffset(6, 4).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 12.0F, 0.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3927F);
		cube_r1.setTextureOffset(0, 8).addBox(-1.0F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.0F, 0.0F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3927F);
		cube_r2.setTextureOffset(0, 8).addBox(0.0F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}