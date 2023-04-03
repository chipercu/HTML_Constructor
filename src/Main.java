import tags.Button;
import tags.parameters.Parameters;
import tags.Table;

import java.io.*;


public class Main implements Parameters {

    public static void main(String[] args) {

        new Main().print();

    }


    public void print(){

        Table t2 = new Table(2, 20);
        t2.setParams(height(32), width(t2.getCols() * 9 + 20), border(1), " style=\"border-spacing:0\"");
        t2.row(0).setHeight(16);
        t2.row(1).setHeight(32);
        final Button button = new Button("Test", simpleAction("action"), 8, 32, "qwer.img", "wqer1");
        for (int i = 0; i < t2.row(0).getColumns().size(); i++) {
            if (i%2 == 0){
                button.setValue("BUTTON" + (i + 1));
                t2.row(1).col(i).insert(button.build());
            }

        }
        int lvl = 6;
        for (int i = 0; i < 19; i += 2 ) {
            if (i < lvl * 2){
                if (i == 0){
                    t2.row(0).col(i).setParams(" style=\"background-color: red;\"");
                    t2.row(0).col(i + 1).setParams(width(1), " style=\"background-color: black;\"");
                }
                t2.row(0).col(i).setParams( " style=\"background-color: red;\"");
                t2.row(0).col(i + 1).setParams(width(1) , " style=\"background-color: black;\"");
            }else {
                t2.row(0).col(i).setParams(" style=\"background-color: green;\"");
                t2.row(0).col(i + 1).setParams(width(1), " style=\"background-color: black;\"");
            }
        }
        StringBuilder html = new StringBuilder();

        try {
            Reader  reader = new FileReader("index.html");
            BufferedReader buffReader = new BufferedReader(reader);
            while (buffReader.ready()) {
                html.append(buffReader.readLine());
            }
            reader.close();
            buffReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        final String replace = html.toString().replace("%content%", t2.build());

        FileWriter file;
        try {
            file = new FileWriter("index2.html");
            file.write(replace);
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String build() {
        return null;
    }
}