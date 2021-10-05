// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelguci2 extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public Modelguci2() {
		textureWidth = 32;
		textureHeight = 32;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 26.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-1.0F, -20.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 13).addBox(-0.5F, -32.0F, -0.5F, 1.0F, 12.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(10, 26).addBox(-10.0F, -7.0F, -0.6F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 17).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, -3.1416F, 1.3963F, 3.1416F);
		cube_r1.setTextureOffset(10, 26).addBox(-10.0F, -8.6F, -0.6F, 20.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.setTextureOffset(8, 0).addBox(-5.0F, -7.0F, -6.0F, 0.0F, 7.0F, 12.0F, 0.0F, false);
		cube_r2.setTextureOffset(8, 0).addBox(5.0F, -7.0F, -6.0F, 0.0F, 7.0F, 12.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.48F);
		cube_r3.setTextureOffset(8, 0).addBox(0.0F, -7.0F, -6.0F, 0.0F, 7.0F, 12.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.48F);
		cube_r4.setTextureOffset(8, 0).addBox(0.0F, -7.0F, -6.0F, 0.0F, 7.0F, 12.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 1.0036F, 0.0F);
		cube_r5.setTextureOffset(10, 30).addBox(-10.0F, -5.0F, 0.0F, 20.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, -3.1416F, 1.0908F, 3.1416F);
		cube_r6.setTextureOffset(10, 28).addBox(-7.0F, -3.0F, 0.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
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