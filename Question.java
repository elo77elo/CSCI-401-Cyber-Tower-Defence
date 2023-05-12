class Question {
    public String question;
    public char answer;
    public String[] selection;

    public Question(String question, String[] selection, char answer){
    	this.selection = new String[]{"","","",""};
    	setQuestion(question);
    	setSelection(selection);
    	setAnswer(answer);
    }

	public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String q) {
        this.question = q;
    }

    public char getAnswer() {
        return this.answer;
    }

    public void setAnswer(char a) {
        this.answer = a;
    }

    public String[] getSelection() {
        return this.selection;
    }

    public void setSelection(String[] s) {
        
        for(int i = 0; i <s.length; i++){
            this.selection[i] = s[i];
        }
    }
    
    public String toText() {
    	String ret = "";
    	ret += this.question;
    	for(String s : this.selection) {
    		ret += "\n" + s;
    	}
    	return ret;
    }
}

