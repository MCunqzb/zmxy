// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelmound extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public Modelmound() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-8.0F, -3.0F, -8.0F, 16.0F, 3.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(0, 20).addBox(-6.0F, -14.0F, -5.5F, 12.0F, 11.0F, 13.0F, 0.0F, false);
		bone.setTextureOffset(0, 44).addBox(-5.0F, -23.0F, -4.0F, 10.0F, 9.0F, 11.0F, 0.0F, false);
		bone.setTextureOffset(37, 24).addBox(-2.0F, -26.0F, -0.5F, 4.0F, 3.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(48, 0).addBox(-1.0F, -29.0F, -0.5F, 2.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.0F, -23.0F, 3.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3054F);
		cube_r1.setTextureOffset(42, 48).addBox(-1.0F, -9.0F, -4.0F, 1.0F, 9.0F, 7.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.0F, -23.0F, 3.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3054F);
		cube_r2.setTextureOffset(42, 48).addBox(0.0F, -9.0F, -4.0F, 1.0F, 9.0F, 7.0F, 0.0F, false);
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