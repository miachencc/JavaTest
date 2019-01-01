package com.test;

import Beans.Result;
import Beans.issues;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import static com.test.TestLogin.GetIssue;

public class ParseResult {

    public static void main(String[] args) {
        String result = GetIssue();
        Gson gson = new Gson();
        Result ResultBean = gson.fromJson(result, Result.class);
        System.out.println("问题总数 = "+ResultBean.getTotal());

        List<issues> issues = ResultBean.getIssues();
        Iterator<issues> issuesIterator = issues.iterator();
        while (issuesIterator.hasNext()) {
            issues issues1 = issuesIterator.next();
            String BugInfo = issues1.toString();
            outFile(BugInfo);
            //System.out.println("Bug信息为= " + issues1.toString());
            //System.out.println("-----------------");
        }
    }
    public static void outFile(String s) {

        File file = new File("D:\\GIT\\JavaTest\\JavaTest\\miaEclipse\\test\\BugInfo.txt");

        try (FileOutputStream fop = new FileOutputStream(file,true)) {

            // if file doesn't exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            // get the content in bytes
            byte[] contentInBytes = s.getBytes();

            fop.write(contentInBytes);
            fop.write("\r\n".getBytes());
            fop.flush();
            fop.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}