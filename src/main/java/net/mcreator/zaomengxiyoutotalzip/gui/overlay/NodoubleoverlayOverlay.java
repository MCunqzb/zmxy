
package net.mcreator.zaomengxiyoutotalzip.gui.overlay;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.zaomengxiyoutotalzip.procedures.JudgenodoubleProcedure;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

import com.google.common.collect.ImmutableMap;

@ZaomengxiyouModElements.ModElement.Tag
public class NodoubleoverlayOverlay extends ZaomengxiyouModElements.ModElement {
	public NodoubleoverlayOverlay(ZaomengxiyouModElements instance) {
		super(instance, 832);
	}

	@Override
	public void initElements() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void eventHandler(RenderGameOverlayEvent event) {
		if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int posX = (event.getWindow().getScaledWidth()) / 2;
			int posY = (event.getWindow().getScaledHeight()) / 2;
			PlayerEntity entity = Minecraft.getInstance().player;
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			double sh = 0;
				sh = (int) (entity.getPersistentData().getDouble("shine"))/2;
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 0.3F);
			RenderSystem.disableAlphaTest();
			if (JudgenodoubleProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/fireanger.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -151, posY +80, (int)(sh*48), 0, 48, 48, 384, 48);
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/no_double2.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -144, posY + 86, 0, 0, 34, 34, 34, 34);
			}
			RenderSystem.depthMask(true);
			RenderSystem.enableDepthTest();
			RenderSystem.enableAlphaTest();
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
}
