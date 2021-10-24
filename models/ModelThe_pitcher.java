// Made with Blockbench 4.0.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelThe_pitcher extends EntityModel<Entity> {
	private final ModelRenderer bone4;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone;

	public ModelThe_pitcher() {
		textureWidth = 128;
		textureHeight = 64;

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone4.setTextureOffset(0, 0).addBox(-16.0F, -16.0F, -16.0F, 32.0F, 32.0F, 32.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 25.0F, 0.0F);
		bone4.addChild(bone2);
		setRotationAngle(bone2, -3.1416F, -1.5708F, 3.1416F);
		bone2.setTextureOffset(33, 0).addBox(-12.0F, -37.0F, -21.0F, 24.0F, 24.0F, 4.0F, 0.0F, false);
		bone2.setTextureOffset(33, 0).addBox(-14.0F, -39.0F, 16.0F, 28.0F, 28.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(33, 0).addBox(-14.0F, -39.0F, -18.0F, 28.0F, 28.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(33, 0).addBox(-12.0F, -37.0F, 17.0F, 24.0F, 24.0F, 4.0F, 0.0F, false);
		bone2.setTextureOffset(33, 0).addBox(-10.0F, -35.0F, -25.0F, 20.0F, 20.0F, 4.0F, 0.0F, false);
		bone2.setTextureOffset(33, 0).addBox(-10.0F, -35.0F, 21.0F, 20.0F, 20.0F, 4.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-19.0F, 6.0F, 0.0F);
		bone4.addChild(bone3);
		setRotationAngle(bone3, 0.0F, -1.5708F, 1.5708F);
		bone3.setTextureOffset(33, 0).addBox(-12.0F, -31.0F, -15.0F, 24.0F, 24.0F, 4.0F, 0.0F, false);
		bone3.setTextureOffset(33, 0).addBox(-14.0F, -33.0F, 22.0F, 28.0F, 28.0F, 2.0F, 0.0F, false);
		bone3.setTextureOffset(33, 0).addBox(-14.0F, -33.0F, -12.0F, 28.0F, 28.0F, 2.0F, 0.0F, false);
		bone3.setTextureOffset(33, 0).addBox(-12.0F, -31.0F, 23.0F, 24.0F, 24.0F, 4.0F, 0.0F, false);
		bone3.setTextureOffset(33, 0).addBox(-10.0F, -29.0F, -19.0F, 20.0F, 20.0F, 4.0F, 0.0F, false);
		bone3.setTextureOffset(33, 0).addBox(-10.0F, -29.0F, 27.0F, 20.0F, 20.0F, 4.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 25.0F, 0.0F);
		bone4.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, 0.0F);
		bone.setTextureOffset(33, 0).addBox(-12.0F, -37.0F, -21.0F, 24.0F, 24.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(33, 0).addBox(-14.0F, -39.0F, 16.0F, 28.0F, 28.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(33, 0).addBox(-14.0F, -39.0F, -18.0F, 28.0F, 28.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(33, 0).addBox(-12.0F, -37.0F, 17.0F, 24.0F, 24.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(33, 0).addBox(-10.0F, -35.0F, -25.0F, 20.0F, 20.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(33, 0).addBox(-10.0F, -35.0F, 21.0F, 20.0F, 20.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone4.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.bone4.rotateAngleX = f2;
	}
}