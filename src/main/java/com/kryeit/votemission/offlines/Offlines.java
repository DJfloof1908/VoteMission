package com.kryeit.votemission.offlines;

import com.kryeit.MinecraftServerSupplier;

import com.mojang.authlib.GameProfile;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.UserCache;

import java.util.Optional;
import java.util.UUID;

public class Offlines {

	public static UUID getUUIDbyName(String name) {
		ServerPlayerEntity player = MinecraftServerSupplier.getServer().getPlayerManager().getPlayer(name);
		if (player != null) return player.getUuid();
		UserCache userCache = MinecraftServerSupplier.getServer().getUserCache();
		if (userCache == null) return null;
		Optional<GameProfile> gameProfile = userCache.findByName(name);
		return gameProfile.map(GameProfile::getId).orElse(null);
	}
}
