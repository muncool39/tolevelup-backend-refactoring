package com.fours.tolevelup.batch.mission.daily;


import com.fours.tolevelup.model.entity.MissionLog;
import com.fours.tolevelup.model.entity.User;
import com.fours.tolevelup.service.MissionLogAssignService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DailyMissionProcessor implements ItemProcessor<User, List<MissionLog>> {

    private final MissionLogAssignService missionLogAssignService;

    @Override
    public List<MissionLog> process(User user) {
        return missionLogAssignService.assignDailyMissions(user);
    }
}
