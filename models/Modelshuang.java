// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelshuang extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1_r1;
	private final ModelRenderer bone2;

	public Modelshuang() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 18.0F, 0.0F);

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(0.0F, 4.0F, 0.0F);
		bone.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, 0.0F, -0.7854F, 0.0F);
		cube_r1_r1.setTextureOffset(20, 8).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 18.0F, 0.0F);
		bone2.setTextureOffset(16, 0).addBox(-2.0F, 2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.cube_r1_r1.rotateAngleX = f2;
		this.bone2.rotateAngleZ = f2;
		this.bone.rotateAngleX = f2;
	}
}