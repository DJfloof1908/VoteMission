package com.kryeit.votemission;

import com.kryeit.missions.MissionTypeRegistry;

import com.kryeit.votemission.missions_types.VoteMission;

import net.fabricmc.api.DedicatedServerModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements DedicatedServerModInitializer {
	public static final String ID = "votemission";
	public static final String NAME = "Vote Mission";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitializeServer() {

		// Register the mission type
		MissionTypeRegistry.INSTANCE.register(new VoteMission());
	}
}
