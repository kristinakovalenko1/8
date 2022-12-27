import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Comparator;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "internalName",
        "title",
        "metacriticLink",
        "dealID",
        "storeID",
        "gameID",
        "salePrice",
        "normalPrice",
        "isOnSale",
        "savings",
        "metacriticScore",
        "steamRatingText",
        "steamRatingPercent",
        "steamRatingCount",
        "steamAppID",
        "releaseDate",
        "lastChange",
        "dealRating",
        "thumb"
})

public class Game {

    @JsonProperty("internalName")
    private String internalName;
    @JsonProperty("title")
    private String title;
    @JsonProperty("metacriticLink")
    private String metacriticLink;
    @JsonProperty("dealID")
    private String dealID;
    @JsonProperty("storeID")
    private Integer storeID;
    @JsonProperty("gameID")
    private Integer gameID;
    @JsonProperty("salePrice")
    private Double salePrice;
    @JsonProperty("normalPrice")
    private Double normalPrice;
    @JsonProperty("isOnSale")
    private Integer isOnSale;
    @JsonProperty("savings")
    private Double savings;
    @JsonProperty("metacriticScore")
    private Integer metacriticScore;
    @JsonProperty("steamRatingText")
    private String steamRatingText;
    @JsonProperty("steamRatingPercent")
    private Integer steamRatingPercent;
    @JsonProperty("steamRatingCount")
    private Integer steamRatingCount;
    @JsonProperty("steamAppID")
    private Integer steamAppID;
    @JsonProperty("releaseDate")
    private Integer releaseDate;
    @JsonProperty("lastChange")
    private Integer lastChange;
    @JsonProperty("dealRating")
    private Double dealRating;
    @JsonProperty("thumb")
    private String thumb;

    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMetacriticLink() {
        return metacriticLink;
    }

    public void setMetacriticLink(String metacriticLink) {
        this.metacriticLink = metacriticLink;
    }

    public String getDealID() {
        return dealID;
    }

    public void setDealID(String dealID) {
        this.dealID = dealID;
    }

    public Integer getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {

        this.storeID = Integer.parseInt(storeID);
    }

    public Integer getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {

        this.gameID = Integer.parseInt(gameID);
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = Double.parseDouble(salePrice);
    }

    public Double getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(String normalPrice) {

        this.normalPrice = Double.parseDouble(normalPrice);
    }

    public Integer getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(String isOnSale) {

        this.isOnSale = Integer.parseInt(isOnSale);
    }

    public Double getSavings() {
        return savings;
    }

    public void setSavings(String savings) {

        this.savings = Double.parseDouble(savings);
    }

    public Integer getMetacriticScore() {
        return metacriticScore;
    }

    public void setMetacriticScore(String metacriticScore) {

        this.metacriticScore = Integer.parseInt(metacriticScore);
    }

    public String getSteamRatingText() {
        return steamRatingText;
    }

    public void setSteamRatingText(String steamRatingText) {
        this.steamRatingText = steamRatingText;
    }

    public Integer getSteamRatingPercent() {
        return steamRatingPercent;
    }

    public void setSteamRatingPercent(String steamRatingPercent) {

        this.steamRatingPercent = Integer.parseInt(steamRatingPercent);
    }

    public Integer getSteamRatingCount() {
        return steamRatingCount;
    }

    public void setSteamRatingCount(String steamRatingCount) {

        this.steamRatingCount = Integer.parseInt(steamRatingCount);
    }

    public Integer getSteamAppID() {
        return steamAppID;
    }

    public void setSteamAppID(String steamAppID) {

        this.steamAppID = Integer.parseInt(steamAppID);
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getLastChange() {
        return lastChange;
    }

    public void setLastChange(Integer lastChange) {
        this.lastChange = lastChange;
    }

    public Double getDealRating() {
        return dealRating;
    }

    public void setDealRating(String dealRating) {

        this.dealRating = Double.parseDouble(dealRating);
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }


    @Override
    public String toString() {
        return "Game {" +
                "Internal name = '" + internalName + '\'' +
                ", Title = '" + title + '\'' +
                ", Metacritic link = '" + metacriticLink + '\'' +
                ", Deal ID = '" + dealID + '\'' +
                ", Store ID = '" + storeID + '\'' +
                ", Game ID = '" + gameID + '\'' +
                ", Sale price = '" + salePrice + '\'' +
                ", Normal price = '" + normalPrice + '\'' +
                ", Is on sale = '" + isOnSale + '\'' +
                ", Savings = '" + savings + '\'' +
                ", Metacritic score = '" + metacriticScore + '\'' +
                ", Steam rating text = '" + steamRatingText + '\'' +
                ", Steam rating percent = '" + steamRatingPercent + '\'' +
                ", Steam rating count = '" + steamRatingCount + '\'' +
                ", Steam app ID = '" + steamAppID + '\'' +
                ", Release date = " + releaseDate +
                ", Last change = " + lastChange +
                ", Deal rating = '" + dealRating + '\'' +
                ", Thumb = '" + thumb + '\'' +
                "}\n";
    }

    public static Comparator<Game> byTitleAsc = Comparator.comparing(o -> o.title);
    public static Comparator<Game> byTitleDesc = (o1, o2) -> o2.title.compareTo(o1.title);
    public static Comparator<Game> byReleaseDateAsc = (o1, o2) -> o1.releaseDate > o2.releaseDate ? 1 : o1.releaseDate < o2.releaseDate ? -1 : 0;
    public static Comparator<Game> byReleaseDateDesc = (o1, o2) -> o1.releaseDate < o2.releaseDate ? 1 : o1.releaseDate > o2.releaseDate ? -1 : 0;
}