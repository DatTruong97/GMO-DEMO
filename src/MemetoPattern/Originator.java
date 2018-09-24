package MemetoPattern;

public class Originator {
    private String fileName;
    private StringBuilder content;

    public Originator(String fileName){
        this.fileName=fileName;
        this.content=new StringBuilder();
    }

    public StringBuilder getContent() {
        return content;
    }

    public void write(String string){
        content.append(string);
    }

    public Memeto save(){
        return new Memeto(this.fileName,this.content);
    }

    public void undoToLastSave(Object object){
        Memeto memeto=(Memeto)object;
        this.fileName=memeto.fileName;
        this.content=memeto.content;
    }

    public class Memeto{
        private String fileName;
        private StringBuilder content;

        public Memeto(String fileName,StringBuilder content){
            this.fileName=fileName;
            this.content=new StringBuilder(content);
        }
    }
}
