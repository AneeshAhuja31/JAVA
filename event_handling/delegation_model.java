import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

public class delegation_model {
    public void search(){
        System.out.println("Searching...");
    }
    public void sort(){
        System.out.println("Sorting...");
    }
    public static void main(String[] args) {
        delegation_model app = new delegation_model();
        GUI gui = new GUI(app);
    }
}

class Command implements ActionListener{
    static final int SEARCH = 0;
    static final int SORT = 1;
    int id;
    delegation_model app;

    public Command(int id,delegation_model app){
        this.id = id;
        this.app = app;
    }
    public void actionPerformed(ActionEvent e){
        switch (id) {
            case SEARCH:
                app.search();
                break;
            
            case SORT:
                app.sort();
                break;
        
            default:
                break;
        }
    }
}
class GUI {
    public GUI(delegation_model app){
        Frame f = new Frame();
        f.setLayout(new FlowLayout());

        Command searchCmd = new Command(Command.SEARCH, app);
        Command sortCmd = new Command(Command.SORT, app);

        Button b;
        f.add(b=new Button("Search"));
        b.addActionListener(searchCmd); //since it extends actionlistener
        f.add(b=new Button("Sort"));
        b.addActionListener(sortCmd); //since it extend actionlistener

        List l = new List(2,false);
        f.add(new List());
        l.add("Alphabetical");
        l.add("Chronological");
        l.addActionListener(sortCmd);
        f.pack();
        f.setVisible(true);
    }
}
