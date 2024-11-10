package com.strikebyte.bca.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import com.strikebyte.bca.worldgen.BCAPools;
import net.minecraft.world.level.levelgen.feature.VillageFeature;
import net.minecraft.world.level.levelgen.feature.StructurePool;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(MinecraftServer.class)
public class VillageFeatureMixin {
	@Inject(at = @At("HEAD"), method = "loadLevel")
	private void init(CallbackInfo info) {
		// This code is injected into the start of MinecraftServer.loadLevel()V
	}
}

@Mixin(VillageFeature.class)
public class VillageFeatureMixin {

	@Shadow
	private List<StructurePool> pools; // Shadowing the original pools list

	@Overwrite
	public List<StructurePool> getVillagePools() {
		// Return your custom pools instead of the default
		return BCAPools.getCustomPools();
	}
}