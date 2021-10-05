// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelguiwa extends EntityModel<Entity> {
	private final ModelRenderer mainbody;
	private final ModelRenderer win;

	public Modelguiwa() {
		textureWidth = 48;
		textureHeight = 48;

		mainbody = new ModelRenderer(this);
		mainbody.setRotationPoint(0.0F, -34.0F, 0.0F);
		mainbody.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		mainbody.setTextureOffset(8, 16).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		mainbody.setTextureOffset(16, 16).addBox(-0.5F, -7.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		win = new ModelRenderer(this);
		win.setRotationPoint(0.0F, -41.0F, 0.0F);
		win.setTextureOffset(0, 32).addBox(-8.0F, 0.0F, -8.0F, 16.0F, 0.0F, 16.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		mainbody.render(matrixStack, buffer, packedLight, packedOverlay);
		win.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.win.rotateAngleY = f2;
		this.mainbody.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.mainbody.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}