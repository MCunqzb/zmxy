package net.mcreator.zaomengxiyoutotalzip.procedures;



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

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

import java.util.Map;
import org.apache.logging.log4j.core.net.Priority;



@ZaomengxiyouModElements.ModElement.Tag
public class DisableheartoverlayProcedure extends ZaomengxiyouModElements.ModElement {
	public DisableheartoverlayProcedure(ZaomengxiyouModElements instance) {
		super(instance, 558);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) { }
		
	/*public void eventHandler(RenderGameOverlayEvent event) {
		int i = 0 ;
		i = (int) (entity.getPersistentData().getDouble("healrhoverlay_num"));
	}*/

	

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void eventHandler(RenderGameOverlayEvent event) {
		
		/*if ( i == 0 ){*/
				if (event.getType().equals(RenderGameOverlayEvent.ElementType.HEALTH) && event.isCancelable() )
					event.setCanceled(true);
/*if (event.getType().equals(RenderGameOverlayEvent.ElementType.ARMOR) && event.isCancelable() )
		event.setCanceled(true);*/}
	}
