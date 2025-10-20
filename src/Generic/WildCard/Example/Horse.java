package Generic.WildCard.Example;

public class Horse <Rider extends Unit>{
    private Rider rider;

    public void setRider(Rider rider) {
        this.rider = rider;
    }
}
