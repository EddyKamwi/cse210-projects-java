import java.util.Date;

class Journal {
    private Date _date = new Date();
    private String _prompt;
    private String _promptAns;

    public Journal(String prompt,String answer){
        this._prompt = prompt;
        this._promptAns = answer;
    }
    public String GetJournalDisplay(){
        String entery = "Date :"+this._date.toString()+" - Prompt: "+ this._prompt+"\n"+this._promptAns;
        return entery;
    }
}
