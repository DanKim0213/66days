package com.ssafy._66days.challenge.model.reposiotry;

import com.ssafy._66days.challenge.model.entity.Challenge;
import com.ssafy._66days.challenge.model.entity.GroupChallenge;
import com.ssafy._66days.group.model.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupChallengeRepository extends JpaRepository<GroupChallenge, Long> {
    GroupChallenge findByGroupAndChallengeAndState(Group group, Challenge challenge, String state);

    List<GroupChallenge> findByGroupAndStateIn(Group group, List<String> states);
}