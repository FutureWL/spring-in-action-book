package com.springaction;

import org.springframework.stereotype.Component;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-04-08:17:40
 * @version 1.0
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
