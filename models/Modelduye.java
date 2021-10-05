// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelduye extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modelduye() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(24, 0).addBox(-5.0F, -14.0F, -8.0F, 11.0F, 11.0F, 9.0F, 0.0F, false);
		bb_main.setTextureOffset(40, 20).addBox(-4.0F, -13.0F, 1.0F, 9.0F, 9.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(22, 23).addBox(-3.0F, -12.0F, -10.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(46, 32).addBox(-3.0F, -12.0F, 4.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(36, 43).addBox(-2.0F, -11.0F, -11.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(48, 41).addBox(-2.0F, -11.0F, 6.0F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(54, 49).addBox(0.0F, -5.0F, 7.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(54, 54).addBox(-6.0F, -11.0F, 5.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(54, 59).addBox(4.0F, -9.0F, 6.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
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