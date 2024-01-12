/*
 * Copyright © 2021 LambdAurora <email@lambdaurora.dev>
 *
 * This file is part of LambDynamicLights.
 *
 * Licensed under the MIT license. For more information,
 * see the LICENSE file.
 */

package org.thinkingstudio.ryoamiclights.gui;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.GuiGraphics;
import org.thinkingstudio.obsidianui.background.Background;
import org.thinkingstudio.obsidianui.background.DirtTexturedBackground;
import org.thinkingstudio.obsidianui.widget.SpruceWidget;

public class InnerBackground implements Background {

	@Override
	public void render(GuiGraphics graphics, SpruceWidget widget, int vOffset, int mouseX, int mouseY, float delta) {
		if (MinecraftClient.getInstance().world != null) {
			graphics.fillGradient(widget.getX(), widget.getY(),
					widget.getX() + widget.getWidth(), widget.getY() + widget.getHeight(),
					0xc0060606, 0xd0060606);
		} else {
			DirtTexturedBackground.DARKENED.render(graphics, widget, vOffset, mouseX, mouseY, delta);
		}
	}
}
