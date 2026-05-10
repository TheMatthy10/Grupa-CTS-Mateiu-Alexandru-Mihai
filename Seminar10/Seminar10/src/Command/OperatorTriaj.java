package Command;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class OperatorTriaj {
    private final Stack<Command> undo;
    private final Stack<Command> redo;
    private Queue<Command> comenzi;
    private Stack<Command> istoric;

    public OperatorTriaj(){
        this.comenzi = new LinkedList<>();
        this.undo = new Stack<>();
        this.redo = new Stack<>();
    }

    public void trimiteComanda(){
        if(!this.comenzi.isEmpty()){
            Command comanda = this.comenzi.poll();
            comanda.execute();
            undo.push(comanda);
            this.redo.clear();
        }
        else{
            System.out.println("Nu mai exista comenzi");
        }

    }
    public void adaugaComanda(Command comanda){
        this.comenzi.add(comanda);
    }
    public void anuleazaComanda(){
        if(!this.undo.isEmpty()){
            Command comanda =  this.undo.pop();
            comanda.execute();
            this.redo.push(comanda);
        }
        else{
            System.out.println("Nu mai exista comenzi");
        }
    }
    public void refacereComanda(){
        if(!this.redo.isEmpty()){
            Command comanda =  this.redo.pop();
            comanda.execute();
            this.redo.push(comanda);
        }
        else{
            System.out.println("Nu mai exista comenzi");
        }
    }
}
