package com.springinaction.knights;

import java.io.PrintStream;

/**
 * 功能描述：杀死勇者斗恶龙
 *
 * @author weilai create by 2019-04-08:16:58
 * @version 1.0
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
