package ru.saandrew;

import java.util.ArrayList;
import java.util.List;

public class RuTubeVideoLoaderProxy implements VideoLoader {

    private static RuTubeVideoLoader videoLoader;
    private static List<String> cache = new ArrayList<>();

    @Override
    public boolean load(String videoName) {
        if (videoLoader == null) {
            videoLoader = new RuTubeVideoLoader();
        }

        boolean isDownload = false;

        if (cache.contains(videoName)) {
            System.out.println("Video playing");
        } else {
            isDownload = videoLoader.load(videoName);
            cache.add(videoName);
        }

        return isDownload;
    }
}
