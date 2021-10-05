// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelwind extends EntityModel<Entity> {
	private final ModelRenderer wind1;
	private final ModelRenderer wind2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer wind3;
	private final ModelRenderer wind4;
	private final ModelRenderer wind5;

	public Modelwind() {
		textureWidth = 256;
		textureHeight = 256;

		wind1 = new ModelRenderer(this);
		wind1.setRotationPoint(0.0F, 24.0F, 0.0F);
		wind1.setTextureOffset(50, 24).addBox(-15.0F, -30.0F, -18.0F, 33.0F, 8.0F, 35.0F, 0.0F, false);

		wind2 = new ModelRenderer(this);
		wind2.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
		wind2.addChild(cube_r1);
		setRotationAngle(cube_r1, 3.1416F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(80, 74).addBox(-13.0F, 16.0F, -12.0F, 25.0F, 7.0F, 24.0F, 0.0F, false);

		wind3 = new ModelRenderer(this);
		wind3.setRotationPoint(0.0F, 30.0F, 0.0F);
		wind3.setTextureOffset(74, 108).addBox(-8.0F, -21.0F, -9.0F, 18.0F, 6.0F, 18.0F, 0.0F, false);

		wind4 = new ModelRenderer(this);
		wind4.setRotationPoint(0.0F, 34.0F, 0.0F);
		wind4.setTextureOffset(94, 203).addBox(-3.0F, -13.0F, -3.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);

		wind5 = new ModelRenderer(this);
		wind5.setRotationPoint(0.0F, -2.0F, 0.0F);
		setRotationAngle(wind5, 3.1416F, 0.0F, 0.0F);
		wind5.setTextureOffset(84, 173).addBox(-7.0F, -23.0F, -7.0F, 12.0F, 6.0F, 13.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		wind1.render(matrixStack, buffer, packedLight, packedOverlay);
		wind2.render(matrixStack, buffer, packedLight, packedOverlay);
		wind3.render(matrixStack, buffer, packedLight, packedOverlay);
		wind4.render(matrixStack, buffer, packedLight, packedOverlay);
		wind5.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.wind4.rotateAngleX = f2 / 20.f;
		this.wind5.rotateAngleY = f2 / 20.f;
		this.wind2.rotateAngleY = f2 / 20.f;
		this.wind3.rotateAngleY = f2 / 20.f;
		this.wind1.rotateAngleY = f2 / 20.f;
		this.cube_r1.rotateAngleY = f2 / 20.f;
	}
}