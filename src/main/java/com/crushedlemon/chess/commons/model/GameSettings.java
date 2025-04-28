package com.crushedlemon.chess.commons.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class GameSettings {

    GameDuration gameDuration;
    IncrementPerMove incrementPerMove;

}
