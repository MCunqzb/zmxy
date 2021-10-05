// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelbaiwuchang extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leftleg;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm2;

	public Modelbaiwuchang() {
		textureWidth = 80;
		textureHeight = 80;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-3.0F, -8.0F, -4.0F, 6.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(52, 45).addBox(-3.0F, -18.0F, -4.0F, 6.0F, 10.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(58, 28).addBox(3.0F, -14.0F, -4.0F, 3.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 61).addBox(-6.0F, -14.0F, -4.0F, 3.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(29, 0).addBox(-5.0F, -9.0F, -4.1F, 10.0F, 23.0F, 0.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 2.0F, 0.0F);
		body.setTextureOffset(0, 17).addBox(-4.0F, -1.0F, -2.0F, 8.0F, 13.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 34).addBox(-4.0F, -1.0F, -2.1F, 8.0F, 23.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(25, 30).addBox(4.1F, 0.0F, -2.0F, 0.0F, 22.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(17, 30).addBox(-4.1F, 0.0F, -2.0F, 0.0F, 22.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(33, 34).addBox(-4.0F, -1.0F, 2.1F, 8.0F, 23.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(64, 5).addBox(-8.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(64, 0).addBox(4.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 21.0F, 0.0F);
		leftleg.setTextureOffset(56, 66).addBox(-4.0F, -7.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(6.0F, 4.0F, 0.0F);
		leftarm.setTextureOffset(64, 11).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 55).addBox(-1.0F, 9.0F, -16.0F, 1.0F, 1.0F, 24.0F, 0.0F, false);
		leftarm.setTextureOffset(36, 57).addBox(-0.5F, 8.0F, -21.0F, 0.0F, 7.0F, 8.0F, 0.0F, false);

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(-6.0F, 4.0F, 0.0F);
		rightarm2.setTextureOffset(64, 11).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm2.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.rightarm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}