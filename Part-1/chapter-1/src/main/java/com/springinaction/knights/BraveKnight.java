package com.springinaction.knights;

/**
 * 功能描述：勇敢的骑士
 *
 * @author weilai create by 2019-04-08:16:49
 * @version 1.0
 */
public class BraveKnight implements Knight {

    private Quest quest;
    private Minstrel minstrel;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    @Override
    public void embarkOnQuest() {
        minstrel.singBeforeStream();
        quest.embark();
        minstrel.singAfterQuest();
    }

}
