package com.hongghe.patternexample.observer;

import com.hongghe.patternexample.observer.generic.GHobbits;
import com.hongghe.patternexample.observer.generic.GWeather;
import com.hongghe.patternexample.observer.generic.Race;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/17
 */
@Slf4j
public class Demo {

    /**
     * Program entry point
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        Weather weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

        // Generic observer inspired by Java Generics and Collection by Naftalin & Wadler
        log.info("--Running generic version--");
        GWeather gWeather = new GWeather();
        //gWeather.addObserver(new Race());
        gWeather.addObserver(new GHobbits());

        gWeather.timePasses();
        gWeather.timePasses();
        gWeather.timePasses();
        gWeather.timePasses();
    }
}
