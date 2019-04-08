package com.springinaction.knights;

import java.io.PrintStream;

/**
 * 功能描述：歌手
 *
 * @author weilai create by 2019-04-08:17:18
 * @version 1.0
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeStream() {
        stream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight did embark on q quest!");
    }
}
