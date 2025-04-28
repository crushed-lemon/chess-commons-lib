package com.crushedlemon.chess.commons.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class GamePreferences {

    GameDuration gameDuration;
    IncrementPerMove incrementPerMove;
    PlayAs playAs;

}
