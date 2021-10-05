// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelzombieinxiyou extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;

	public Modelzombieinxiyou() {
		textureWidth = 80;
		textureHeight = 80;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(32, 0).addBox(-6.0F, -13.0F, -6.0F, 12.0F, 5.0F, 11.0F, 0.0F, false);
		head.setTextureOffset(0, 17).addBox(-1.5F, -16.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(13, 8).addBox(0.0F, -16.0F, 3.0F, 0.0F, 17.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(43, 38).addBox(-2.0F, -9.0F, -6.1F, 4.0F, 9.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(51, 43).addBox(-3.0F, -7.1F, -4.1F, 6.0F, 1.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(51, 44).addBox(3.1F, -7.1F, -4.1F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(51, 44).addBox(-4.1F, -7.1F, -4.1F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(51, 43).addBox(-3.0F, -3.9F, -4.1F, 6.0F, 1.0F, 0.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 6.0F, 0.0F);
		body.setTextureOffset(29, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(64, 16).addBox(-4.0F, -6.0F, -2.1F, 8.0F, 23.0F, 0.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(4.0F, 2.0F, 0.0F);
		leftarm.setTextureOffset(0, 33).addBox(0.0F, -2.0F, -9.0F, 4.0F, 4.0F, 12.0F, 0.0F, false);
		leftarm.setTextureOffset(32, 46).addBox(0.0F, -0.5F, -12.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		leftarm.setTextureOffset(32, 46).addBox(1.0F, -0.3F, -13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(50, 16).addBox(-1.0F, 0.0F, -11.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		leftarm.setTextureOffset(57, 16).addBox(3.0F, 0.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-4.0F, 2.0F, 0.0F);
		rightarm.setTextureOffset(0, 49).addBox(-4.0F, -2.0F, -9.0F, 4.0F, 4.0F, 12.0F, 0.0F, false);
		rightarm.setTextureOffset(32, 46).addBox(-3.0F, -0.5F, -12.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		rightarm.setTextureOffset(50, 16).addBox(0.0F, 0.0F, -11.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		rightarm.setTextureOffset(57, 16).addBox(-4.0F, 0.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(32, 46).addBox(-2.0F, -0.3F, -13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(3.0F, 13.0F, 0.0F);
		leftleg.setTextureOffset(64, 64).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rightleg.setTextureOffset(48, 64).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}