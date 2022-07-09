package com.company;

import java.io.*;
public class Main {

    static public int replace(int unicode) {
        unicode = unicode == 1040 ? 65 : unicode; // Замена юникода буквы с помощью тернарного оператора
        unicode = unicode == 1072 ? 97 : unicode;
        unicode = unicode == 1077 ? 101 : unicode;
        unicode = unicode == 1086 ? 111 : unicode;
        unicode = unicode == 1045 ? 69 : unicode;
        unicode = unicode == 1054 ? 79 : unicode;
        unicode = unicode == 1058 ? 84 : unicode;
        unicode = unicode == 1056 ? 80 : unicode;
        unicode = unicode == 1088 ? 112 : unicode;
        unicode = unicode == 1089 ? 99 : unicode;
        unicode = unicode == 1057 ? 67 : unicode;
        unicode = unicode == 1053 ? 72 : unicode;
        unicode = unicode == 1052 ? 77 : unicode;
        unicode = unicode == 1042 ? 66 : unicode;
        unicode = unicode == 1050 ? 75 : unicode;
        unicode = unicode == 1061 ? 88 : unicode;
        unicode = unicode == 1093 ? 120 : unicode;
        return unicode;
    }

    public static void main(String[] args) throws IOException {
        FileWriter writer;
        BufferedReader file1;
        String absoluteFilePath = "Result.txt"; //Название файла для записис
        try {

            File file = new File(absoluteFilePath);
            file.createNewFile();

                file1 = new BufferedReader(new InputStreamReader(
                    new FileInputStream("Text.txt"), "utf8"));
                writer = new FileWriter(file);

                int c;
                while ((c = file1.read()) != -1) { // читаем посимвольно
                    c = replace(c);
                    writer.write(c); // Побуквенная запись текста в файл
                }
                writer.close();
            }
        catch(IOException ex){
                System.out.println(ex.getMessage());

            }
        }
    }
