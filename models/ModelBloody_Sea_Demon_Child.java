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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay);
		bone3.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.bone3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.bone2.rotateAngleY = f3 / (180F / (float) Math.PI);
	}
}