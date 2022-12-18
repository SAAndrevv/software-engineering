package ru.saandrew;

public class RuTubeVideoLoader implements VideoLoader {

    @Override
    public boolean load(String videoName) {
        boolean isDownload = false;

        try {
            isDownload = download(videoName);
        } catch (InterruptedException e) {
            System.out.println("Download exception");
        }

        if (isDownload) {
            System.out.println("Video playing");
        }

        return isDownload;
    }

    private boolean download(String videoName) throws InterruptedException {
        System.out.println(videoName + " downloading...");
        Thread.sleep(5000);
        System.out.println("Download is ready");

        return true;
    }
}
