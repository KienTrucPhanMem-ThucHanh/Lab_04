package org.example;

import jdepend.xmlui.JDepend;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        PrintWriter out = new PrintWriter(new FileOutputStream("result.xml"));
        JDepend jDepend = new JDepend(out);
        jDepend.addDirectory("E:\\HK2_Nam4\\Kien_Truc_Phan_Mem\\Thuc_Hanh\\Library-Assistant");
        jDepend.analyze();
    }
}