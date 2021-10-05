
package net.mcreator.zaomengxiyoutotalzip.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SourceshopGuiWindow extends ContainerScreen<SourceshopGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public SourceshopGuiWindow(SourceshopGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 200;
		this.ySize = 200;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}
	private static final ResourceLocation texture = new ResourceLocation("zaomengxiyou:textures/sourceshop.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "" + (entity.getPersistentData().getString("hp_overlay")) + "", -89, 177, -1);
		this.font.drawString(ms, "" + (entity.getPersistentData().getBoolean("healrhoverlay")) + "", -89, 168, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 9, this.guiTop + 42, 50, 20, new StringTextComponent("¹ºÂòÁÒÑæ·ç±©"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(0, x, y, z));
				SourceshopGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -89, this.guiTop + -3, 50, 20, new StringTextComponent("¹ºÂòÔÂÖ®»Ô»Í"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(1, x, y, z));
				SourceshopGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 9, this.guiTop + 24, 50, 20, new StringTextComponent("¹ºÂòÁÒÑæÉÁ"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(2, x, y, z));
				SourceshopGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 135, this.guiTop + 24, 50, 20, new StringTextComponent("¹ºÂò±»¶¯Öé"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(3, x, y, z));
				SourceshopGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 207, this.guiTop + -3, 50, 20, new StringTextComponent("¹ºÂò¹âÖ®ÓÀºã"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(4, x, y, z));
				SourceshopGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 207, this.guiTop + 15, 50, 20, new StringTextComponent("¹ºÂò¹âÖ®ÓÀºãlv.2"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(5, x, y, z));
				SourceshopGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 207, this.guiTop + 33, 50, 20, new StringTextComponent("¹ºÂò¹âÖ®ÓÀºãlv.3"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(6, x, y, z));
				SourceshopGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 207, this.guiTop + 51, 50, 20, new StringTextComponent("¹ºÂò¹âÖ®ÓÀºãlv.4"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(7, x, y, z));
				SourceshopGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 207, this.guiTop + 69, 50, 20, new StringTextComponent("¹ºÂò¹âÖ®ÓÀºãlv.5"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(8, x, y, z));
				SourceshopGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 81, this.guiTop + 24, 50, 20, new StringTextComponent("¹ºÂò±ùÁú²¨"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(9, x, y, z));
				SourceshopGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 81, this.guiTop + 42, 50, 20, new StringTextComponent("¹ºÂòÐþ±ùÆÆ"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(10, x, y, z));
				SourceshopGui.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 81, this.guiTop + 60, 50, 20, new StringTextComponent("¹ºÂòÌì½µ¸ÊÂ¶"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(11, x, y, z));
				SourceshopGui.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -89, this.guiTop + 15, 50, 20, new StringTextComponent("¹ºÂòÔÂÖ®»Ô»Ílv2"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(12, x, y, z));
				SourceshopGui.handleButtonAction(entity, 12, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -89, this.guiTop + 33, 50, 20, new StringTextComponent("¹ºÂòÔÂÖ®»Ô»Ílv3"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(13, x, y, z));
				SourceshopGui.handleButtonAction(entity, 13, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -89, this.guiTop + 51, 50, 20, new StringTextComponent("¹ºÂòÔÂÖ®»Ô»Ílv4"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(14, x, y, z));
				SourceshopGui.handleButtonAction(entity, 14, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -89, this.guiTop + 69, 50, 20, new StringTextComponent("¹ºÂòÔÂÖ®»Ô»Ílv5"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(15, x, y, z));
				SourceshopGui.handleButtonAction(entity, 15, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -89, this.guiTop + 186, 50, 20, new StringTextComponent("on/off(no use)"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(16, x, y, z));
				SourceshopGui.handleButtonAction(entity, 16, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 9, this.guiTop + 78, 50, 20, new StringTextComponent("¹ºÂò»ðÄ§Õ¶"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(17, x, y, z));
				SourceshopGui.handleButtonAction(entity, 17, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 9, this.guiTop + 60, 50, 20, new StringTextComponent("¹ºÂòÉýÁúÕ¶"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(18, x, y, z));
				SourceshopGui.handleButtonAction(entity, 18, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 81, this.guiTop + 78, 50, 20, new StringTextComponent("¹ºÂòË®Ä§±¬"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SourceshopGui.ButtonPressedMessage(19, x, y, z));
				SourceshopGui.handleButtonAction(entity, 19, x, y, z);
			}
		}));
	}
}
