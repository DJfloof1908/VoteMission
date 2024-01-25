package com.kryeit.votemission.listener;

import com.kryeit.votemission.missions_types.VoteMission;
import com.kryeit.votemission.offlines.Offlines;
import com.kryeit.votifier.model.Vote;
import com.kryeit.votifier.model.VotifierEvent;

public class OnVote implements VotifierEvent {

	@Override
	public void onVoteReceived(Vote vote) {
		VoteMission.handleVote(Offlines.getUUIDbyName(vote.getUsername()));
	}
}
