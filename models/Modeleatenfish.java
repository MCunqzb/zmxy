// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeleatenfish extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer upmouse;
	private final ModelRenderer cube_r1;
	private final ModelRenderer downmouse;
	private final ModelRenderer rightFin;
	private final ModelRenderer leftFin;
	private final ModelRenderer tailfin;

	public Modeleatenfish() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(-0.5F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-0.5F, -5.0F, 1.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(12, 1).addBox(-0.5F, -4.0F, -3.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(20, 3).addBox(0.5F, -9.0F, -2.9992F, 0.0F, 4.0F, 6.0F, 0.0F, false);

		upmouse = new ModelRenderer(this);
		upmouse.setRotationPoint(0.0F, 21.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.5F, 1.0F, 1.0F);
		upmouse.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(10, 9).addBox(-0.5F, -3.2948F, -5.7705F, 2.0F, 3.0F, 6.0F, 0.0F, false);

		downmouse = new ModelRenderer(this);
		downmouse.setRotationPoint(0.0F, 24.0F, -3.0F);
		downmouse.setTextureOffset(0, 9).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		rightFin = new ModelRenderer(this);
		rightFin.setRotationPoint(-0.5F, 24.0F, 0.0F);
		setRotationAngle(rightFin, 0.0F, 0.6109F, 0.0F);
		rightFin.setTextureOffset(2, 16).addBox(-2.4096F, -2.0F, -0.2868F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		leftFin = new ModelRenderer(this);
		leftFin.setRotationPoint(0.5F, 24.0F, 0.0F);
		setRotationAngle(leftFin, 0.0F, -0.6109F, 0.0F);
		leftFin.setTextureOffset(2, 21).addBox(0.4096F, -2.0F, -0.2868F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		tailfin = new ModelRenderer(this);
		tailfin.setRotationPoint(0.0F, 24.0F, 5.0F);
		tailfin.setTextureOffset(24, -4).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		upmouse.render(matrixStack, buffer, packedLight, packedOverlay);
		downmouse.render(matrixStack, buffer, packedLight, packedOverlay);
		rightFin.render(matrixStack, buffer, packedLight, packedOverlay);
		leftFin.render(matrixStack, buffer, packedLight, packedOverlay);
		tailfin.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.upmouse.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.tailfin.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.rightFin.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftFin.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.downmouse.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}