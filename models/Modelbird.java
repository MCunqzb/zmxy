// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelbird extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer body;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer wine;
	private final ModelRenderer wine2;
	private final ModelRenderer foot;
	private final ModelRenderer foot2;

	public Modelbird() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 14.0F, -5.0F);
		head.setTextureOffset(0, 0).addBox(-2.0F, -5.0F, -3.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(14, 0).addBox(-2.0F, -3.0F, -5.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -4.0F, -1.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(42, 0).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 14.0F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -3.0F, 2.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(42, 13).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 3.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.5708F, 3.1416F, 0.0F);
		cube_r3.setTextureOffset(0, 9).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);

		wine = new ModelRenderer(this);
		wine.setRotationPoint(3.0F, 12.0F, -1.0F);
		setRotationAngle(wine, 0.0F, 0.0F, -0.829F);
		wine.setTextureOffset(24, 13).addBox(0.0F, 0.0F, -3.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);

		wine2 = new ModelRenderer(this);
		wine2.setRotationPoint(-3.0F, 12.0F, -1.0F);
		setRotationAngle(wine2, 0.0F, 0.0F, 0.829F);
		wine2.setTextureOffset(24, 13).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);

		foot = new ModelRenderer(this);
		foot.setRotationPoint(-1.0F, 17.0F, 1.0F);
		foot.setTextureOffset(35, 3).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		foot.setTextureOffset(29, 0).addBox(-2.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, 0.0F, false);

		foot2 = new ModelRenderer(this);
		foot2.setRotationPoint(1.0F, 17.0F, 1.0F);
		foot2.setTextureOffset(29, 0).addBox(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, 0.0F, false);
		foot2.setTextureOffset(35, 3).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		wine.render(matrixStack, buffer, packedLight, packedOverlay);
		wine2.render(matrixStack, buffer, packedLight, packedOverlay);
		foot.render(matrixStack, buffer, packedLight, packedOverlay);
		foot2.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.foot2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.wine2.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.cube_r1.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.cube_r1.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.wine.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.foot.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}