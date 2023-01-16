package com.movies.acmeflix.configuration;

import com.opencsv.CSVWriter;
import org.h2.tools.*;
import org.h2.command.dml.Call;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Configuration
@EnableScheduling
public class BackgroundTasksConfig {
    //You should create a recurring task to back up all database content in the format of your choice.
    private static final Logger  LOG = LoggerFactory.getLogger(BackgroundTasksConfig.class);
    @Scheduled(initialDelay = 5,fixedRate=20,timeUnit = TimeUnit.SECONDS)
    public void backupdatabase(){
        List<String>table = new ArrayList<>();
        table.add("ACCOUNTS");
        table.add("PROFILES");
        table.add("MOVIES");
        table.add("EPISODES");
        table.add("SEASONS");
        table.add("SERIES");
        table.add("CREW_MEMBERS");

        File file = new File("C:/Users/stef6/IdeaProjects/regenpf2022/acmeflix/MyCSV.txt");
        try {
            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile);
            Statement stmt = DriverManager.getConnection("jdbc:h2:file:~/acmeflix","sa","sa").createStatement();
            for(int i=0; i<table.size();i++){
                ResultSet rs = stmt.executeQuery ("SELECT * FROM "+table.get(i)+"");
                ResultSetMetaData rsmd = rs.getMetaData();
                int column_count = rsmd.getColumnCount();
                writer.writeNext(new String[]{"--------------------------" + table.get(i) + "-----------------"});
                while (rs.next()){
                    String[] data = new String[column_count];
                    for (int j=0;j<column_count;j++)
                    {
                        data[j] = rs.getString(j+1);
                    }

                    writer.writeNext(data);
                }

            }

            LOG.info("Doing backup....", LocalDate.now());
            writer.close();




        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }




    //@Autowired
}
