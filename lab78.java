package home;
import java.util.ArrayList;
import java.io.*;
public class lab78 {
    public static void main(String[] args) {
        ArrayList<String> FIO = new ArrayList<String>();
        String[] fio = new String[7];
        FIO.add("Путрин Никита Андреевич");
        FIO.add("Филеевна Дарья Амбросовна");
        FIO.add("Кушорева Нина Владимировна");
        FIO.add("Пастухов Евгений Альбертович");
        FIO.add(1,"Уткин Федор Евгеньевич");
        FIO.add("Пушкин Николай Филолович");
        System.out.println(FIO.get(1));
        FIO.remove("Пушкин Николай Филолович");
        for(int i = 0;i<FIO.size();i++)System.out.println(FIO.get(i));
        System.out.println("////////////////////////");
        Object[] fiol = FIO.toArray();
        for(Object count : fiol){

            System.out.println(count);
        }
        System.out.println("////////////////////////");
        try{
            FileWriter writer = new FileWriter("C:\\Users\\МАКС\\IdeaProjects\\myhom\\src\\home\\spisok.txt", true);

            // запись всей строки
            writer.append("\n");
            writer.append("Надо ");
            String text = "Носки, подарки, шуба жене";
            writer.write(text);
            // запись по символам
            writer.append('.');
            writer.append('\n');
            writer.append("Вроде все.");
            writer.append("\n");
            writer.write("А да, не забыть курицу.");




            writer.flush();
            FileReader reader = new FileReader("C:\\Users\\МАКС\\IdeaProjects\\myhom\\src\\home\\spisok.txt");
            System.out.println("////////////////////////");
            // читаемпосимвольно
            int c;
            while((c=reader.read())!=-1){

                //System.out.print(" c= "+c);// Если добавить данну строчку мы увидим Unicode символов
                System.out.print((char)c);

            }

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());


        }

    }
}