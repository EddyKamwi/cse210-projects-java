class Video {
    private String _name;
    private Integer _lengthInSeconds;
    private String _description;

    public Video(String name, String description, Integer seconds) {
        _name = name;
        _description = description;
        _lengthInSeconds = seconds;
    }
    public void GetVideoDetails() {
        System.out.println(_name+"\n"+
        _description+"\n("+
        _lengthInSeconds+") Seconds");
    }
}
