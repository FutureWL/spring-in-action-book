package com.springinaction.knights;

/**
 * 功能描述：少女抢救骑士
 *
 * @author weilai create by 2019-04-08:16:42
 * @version 1.0
 */
public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }

}
