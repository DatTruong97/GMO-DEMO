package MemetoPattern;

public class Originator {
    private StringBuilder content;

    public Originator(){
        this.content=new StringBuilder();
    }

    public StringBuilder getContent() {
        return content;
    }

    public void write(String string){
        content.append(string);
    }

    public Memeto save(){

        return new Memeto(this.content);
    }

    public void undoToLastSave(Object object){
        Memeto memeto=(Memeto)object;

        this.content=memeto.content;
    }

    public class Memeto{
        private StringBuilder content;

        public Memeto(StringBuilder content){

            this.content=new StringBuilder(content);
        }
    }
}
