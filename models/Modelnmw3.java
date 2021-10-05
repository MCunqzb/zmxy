// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelnmw3 extends EntityModel<Entity> {
	private final ModelRenderer righthand;
	private final ModelRenderer lefthand;
	private final ModelRenderer body;

	public Modelnmw3() {
		textureWidth = 444;
		textureHeight = 444;

		righthand = new ModelRenderer(this);
		righthand.setRotationPoint(0.0F, 24.0F, 0.0F);
		righthand.setTextureOffset(239, 364).addBox(34.0F, -75.0F, -1.0F, 75.0F, 46.0F, 0.0F, 0.0F, false);

		lefthand = new ModelRenderer(this);
		lefthand.setRotationPoint(0.0F, 24.0F, 0.0F);
		lefthand.setTextureOffset(44, 365).addBox(-104.0F, -66.0F, -1.0F, 73.0F, 46.0F, 0.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 243).addBox(-111.0F, -108.0F, 0.0F, 222.0F, 111.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(166, 136).addBox(-39.0F, -103.0F, -0.4F, 83.0F, 91.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		righthand.render(matrixStack, buffer, packedLight, packedOverlay);
		lefthand.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.lefthand.rotateAngleY = f4 / (180F / (float) Math.PI);
		this.righthand.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.body.rotateAngleY = f4 / (180F / (float) Math.PI);
	}
}