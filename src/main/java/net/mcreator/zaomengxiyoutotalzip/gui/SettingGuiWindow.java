
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

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SettingGuiWindow extends ContainerScreen<SettingGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = SettingGui.guistate;
	public SettingGuiWindow(SettingGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 256;
		this.ySize = 176;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}
	private static final ResourceLocation texture = new ResourceLocation("zaomengxiyou:textures/setting.png");
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
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/xy.png"));
		this.blit(ms, this.guiLeft + 10, this.guiTop + 66, 0, 0, 16, 16, 16, 16);
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
		this.font.drawString(ms, "" + (entity.getPersistentData().getBoolean("ui")) + "", 10, 30, -16777216);
		this.font.drawString(ms, "" + (entity.getPersistentData().getString("uii")) + "", 10, 12, -65536);
		this.font.drawString(ms, "x:", 37, 66, -65536);
		this.font.drawString(ms, "y:", 118, 66, -16770561);
		this.font.drawString(ms, "EXP Location:", 136, 9, -205);
		this.font.drawString(ms, "Absorbe Num:", 10, 120, -256);
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
		this.addButton(new Button(this.guiLeft + 10, this.guiTop + 39, 75, 20, new StringTextComponent("true/false"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(0, x, y, z));
				SettingGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 46, this.guiTop + 66, 35, 20, new StringTextComponent("+1"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(1, x, y, z));
				SettingGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 46, this.guiTop + 84, 35, 20, new StringTextComponent("+10"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(2, x, y, z));
				SettingGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 46, this.guiTop + 102, 35, 20, new StringTextComponent("+100"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(3, x, y, z));
				SettingGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 136, this.guiTop + 66, 35, 20, new StringTextComponent("+1"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(4, x, y, z));
				SettingGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 136, this.guiTop + 84, 35, 20, new StringTextComponent("+10"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(5, x, y, z));
				SettingGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 136, this.guiTop + 102, 35, 20, new StringTextComponent("+100"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(6, x, y, z));
				SettingGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 82, this.guiTop + 66, 35, 20, new StringTextComponent("-1"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(7, x, y, z));
				SettingGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 82, this.guiTop + 84, 35, 20, new StringTextComponent("-10"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(8, x, y, z));
				SettingGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 82, this.guiTop + 102, 35, 20, new StringTextComponent("-100"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(9, x, y, z));
				SettingGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 172, this.guiTop + 66, 35, 20, new StringTextComponent("-1"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(10, x, y, z));
				SettingGui.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 172, this.guiTop + 84, 35, 20, new StringTextComponent("-10"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(11, x, y, z));
				SettingGui.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 172, this.guiTop + 102, 35, 20, new StringTextComponent("-100"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(12, x, y, z));
				SettingGui.handleButtonAction(entity, 12, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 91, this.guiTop + 39, 35, 20, new StringTextComponent("reset"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(13, x, y, z));
				SettingGui.handleButtonAction(entity, 13, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 136, this.guiTop + 21, 35, 20, new StringTextComponent("X+1"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(14, x, y, z));
				SettingGui.handleButtonAction(entity, 14, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 136, this.guiTop + 39, 35, 20, new StringTextComponent("X-1"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(15, x, y, z));
				SettingGui.handleButtonAction(entity, 15, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 172, this.guiTop + 21, 27, 20, new StringTextComponent("Y+1"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(16, x, y, z));
				SettingGui.handleButtonAction(entity, 16, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 172, this.guiTop + 39, 27, 20, new StringTextComponent("Y-1"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(17, x, y, z));
				SettingGui.handleButtonAction(entity, 17, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 46, this.guiTop + 129, 35, 20, new StringTextComponent("X+1"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(18, x, y, z));
				SettingGui.handleButtonAction(entity, 18, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 82, this.guiTop + 129, 35, 20, new StringTextComponent("X-1"), e -> {
			if (true) {
				ZaomengxiyouMod.PACKET_HANDLER.sendToServer(new SettingGui.ButtonPressedMessage(19, x, y, z));
				SettingGui.handleButtonAction(entity, 19, x, y, z);
			}
		}));
	}
}
