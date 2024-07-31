
class Journal {
    private String _date; ;
    private String _prompt;
    private String _promptAns;

    public Journal(String prompt,String answer,String date){
        this._prompt = prompt;
        this._promptAns = answer;
        this._date = date;
    }
    public String GetJournalDisplay(){
        String entery = "Date :"+this._date.toString()+" - Prompt: "+ this._prompt+"\n"+this._promptAns;
        return entery;
    }
}
