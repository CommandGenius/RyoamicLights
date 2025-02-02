/*
 * Copyright © 2020~2024 LambdAurora <email@lambdaurora.dev>
 * Copyright © 2024 ThinkingStudio
 *
 * This file is part of RyoamicLights.
 *
 * Licensed under the MIT license. For more information,
 * see the LICENSE file.
 */

package org.thinkingstudio.ryoamiclights.mixin.lightsource;

import net.minecraft.entity.decoration.BlockAttachedEntity;
import org.thinkingstudio.ryoamiclights.DynamicLightSource;
import org.thinkingstudio.ryoamiclights.RyoamicLights;
import org.thinkingstudio.ryoamiclights.api.DynamicLightHandlers;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.decoration.AbstractDecorationEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractDecorationEntity.class)
public abstract class AbstractDecorationEntityMixin extends Entity implements DynamicLightSource {
	public AbstractDecorationEntityMixin(EntityType<?> type, World world) {
		super(type, world);
	}

//	@Inject(method = "tick", at = @At("TAIL"))
//	private void onTick(CallbackInfo ci) {
//		// We do not want to update the entity on the server.
//		if (this.getWorld().isClient()) {
//			if (this.isRemoved()) {
//				this.ryoamicLights$setDynamicLightEnabled(false);
//			} else {
//				if (!RyoamicLights.get().config.getEntitiesLightSource().get() || !DynamicLightHandlers.canLightUp(this))
//					this.ryoamicLights$resetDynamicLight();
//				else
//					this.ryoamicLights$dynamicLightTick();
//				RyoamicLights.updateTracking(this);
//			}
//		}
//	}
}
