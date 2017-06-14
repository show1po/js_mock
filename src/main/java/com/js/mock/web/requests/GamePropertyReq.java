package com.js.mock.web.requests;

/**
 * Created by root on 2017/3/30.
 */
public class GamePropertyReq {
    private int delaySecond;
    private int games;
    private boolean isRandom;
    private int handicapId;
    private String handicapSource;
    private String hadicapGameClass;
    private String handicapGameType;
    private int hadicapStatus;

    public int getDelaySecond() {
        return delaySecond;
    }

    public void setDelaySecond(int delaySecond) {
        this.delaySecond = delaySecond;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public boolean isRandom() {
        return isRandom;
    }

    public void setRandom(boolean random) {
        isRandom = random;
    }

    public int getHandicapId() {
        return handicapId;
    }

    public void setHandicapId(int handicapId) {
        this.handicapId = handicapId;
    }

    public String getHandicapSource() {
        return handicapSource;
    }

    public void setHandicapSource(String handicapSource) {
        this.handicapSource = handicapSource;
    }

    public String getHadicapGameClass() {
        return hadicapGameClass;
    }

    public void setHadicapGameClass(String hadicapGameClass) {
        this.hadicapGameClass = hadicapGameClass;
    }

    public String getHandicapGameType() {
        return handicapGameType;
    }

    public void setHandicapGameType(String handicapGameType) {
        this.handicapGameType = handicapGameType;
    }

    public int getHadicapStatus() {
        return hadicapStatus;
    }

    public void setHadicapStatus(int hadicapStatus) {
        this.hadicapStatus = hadicapStatus;
    }
}
