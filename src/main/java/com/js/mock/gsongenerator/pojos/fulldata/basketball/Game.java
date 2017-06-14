
package com.js.mock.gsongenerator.pojos.fulldata.basketball;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.text.SimpleDateFormat;

public class Game {

    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("game_class")
    @Expose
    private String gameClass;
    @SerializedName("game_type")
    @Expose
    private String gameType;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("event_time")
    @Expose
    private String eventTime;
    @SerializedName("source_updatetime")
    @Expose
    private String sourceUpdatetime;
    @SerializedName("live")
    @Expose
    private String live;
    @SerializedName("information")
    @Expose
    private Information information;
    @SerializedName("score")
    @Expose
    private Score score;
    @SerializedName("handicap")
    @Expose
    private Handicap handicap;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Game() {
    }

    /**
     * 
     * @param information
     * @param sourceUpdatetime
     * @param gameType
     * @param source
     * @param status
     * @param gameClass
     * @param score
     * @param handicap
     * @param eventTime
     * @param live
     */
    public Game(String source, String gameClass, String gameType, Integer status, String eventTime, String sourceUpdatetime, String live, Information information, Score score, Handicap handicap) {
        super();
        this.source = source;
        this.gameClass = gameClass;
        this.gameType = gameType;
        this.status = status;
        this.eventTime = eventTime;
        this.sourceUpdatetime = sourceUpdatetime;
        this.live = live;
        this.information = information;
        this.score = score;
        this.handicap = handicap;
    }

    private String generateOdds(String text,String onesSecond) {
        if (text != null) {
            text = text.substring(0, text.length() - 1) + onesSecond;
        } else {
            text = "";
        }
        return text;
    }
    public void updateOdds(String onesSecond) {
//        game.getHandicap().getZf().getA().getHome().getLine();
//        game.getHandicap().getZf().getA().getHome().getOdds();
//        game.getHandicap().getZf().getA().getAway().getLine();
//        game.getHandicap().getZf().getA().getAway().getOdds();
//        game.getHandicap().getZfTw().getHome().getLine();
//        game.getHandicap().getZfTw().getHome().getOdds();
//        game.getHandicap().getZfTw().getAway().getLine();
//        game.getHandicap().getZfTw().getAway().getOdds();
//        game.getHandicap().getDs().getA().getLine();
//        game.getHandicap().getDs().getA().getOver();
//        game.getHandicap().getDs().getA().getUnder();
//        game.getHandicap().getDsTw().getLine();
//        game.getHandicap().getDsTw().getOver();
//        game.getHandicap().getDsTw().getUnder();
//        game.getHandicap().getDe().getHome();
//        game.getHandicap().getDe().getAway();
        String odd = "";
        odd = handicap.getZf().getA().getHome().getLine();
        handicap.getZf().getA().getHome().setLine(generateOdds(odd,onesSecond));
        odd = handicap.getZf().getA().getHome().getOdds();
        handicap.getZf().getA().getHome().setOdds(generateOdds(odd,onesSecond));
        odd = handicap.getZf().getA().getAway().getLine();
        handicap.getZf().getA().getAway().setLine(generateOdds(odd,onesSecond));
        odd = handicap.getZf().getA().getAway().getOdds();
        handicap.getZf().getA().getAway().setOdds(generateOdds(odd,onesSecond));
        odd = handicap.getZfTw().getHome().getLine();
        handicap.getZfTw().getHome().setLine(generateOdds(odd,onesSecond));
        odd = handicap.getZfTw().getHome().getOdds();
        handicap.getZfTw().getHome().setOdds(generateOdds(odd,onesSecond));
        odd = handicap.getZfTw().getAway().getLine();
        handicap.getZfTw().getAway().setLine(generateOdds(odd,onesSecond));
        odd = handicap.getZfTw().getAway().getOdds();
        handicap.getZfTw().getAway().setOdds(generateOdds(odd,onesSecond));
        odd = handicap.getDs().getA().getLine();
        handicap.getDs().getA().setLine(generateOdds(odd,onesSecond));
        odd = handicap.getDs().getA().getOver();
        handicap.getDs().getA().setOver(generateOdds(odd,onesSecond));
        odd = handicap.getDs().getA().getUnder();
        handicap.getDs().getA().setUnder(generateOdds(odd,onesSecond));
        odd = handicap.getDsTw().getLine();
        handicap.getDsTw().setLine(generateOdds(odd,onesSecond));
        odd = handicap.getDsTw().getOver();
        handicap.getDsTw().setOver(generateOdds(odd,onesSecond));
        odd = handicap.getDsTw().getUnder();
        handicap.getDsTw().setUnder(generateOdds(odd,onesSecond));
        odd = handicap.getDe().getHome();
        handicap.getDe().setHome(generateOdds(odd,onesSecond));
        odd = handicap.getDe().getAway();
        handicap.getDe().setAway(generateOdds(odd,onesSecond));
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getGameClass() {
        return gameClass;
    }

    public void setGameClass(String gameClass) {
        this.gameClass = gameClass;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getSourceUpdatetime() {
        return sourceUpdatetime;
    }

    public void setSourceUpdatetime(String sourceUpdatetime) {
        this.sourceUpdatetime = sourceUpdatetime;
    }

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Handicap getHandicap() {
        return handicap;
    }

    public void setHandicap(Handicap handicap) {
        this.handicap = handicap;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(source).append(gameClass).append(gameType).append(status).append(eventTime).append(sourceUpdatetime).append(live).append(information).append(score).append(handicap).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Game) == false) {
            return false;
        }
        Game rhs = ((Game) other);
        return new EqualsBuilder().append(source, rhs.source).append(gameClass, rhs.gameClass).append(gameType, rhs.gameType).append(status, rhs.status).append(eventTime, rhs.eventTime).append(sourceUpdatetime, rhs.sourceUpdatetime).append(live, rhs.live).append(information, rhs.information).append(score, rhs.score).append(handicap, rhs.handicap).isEquals();
    }

}
