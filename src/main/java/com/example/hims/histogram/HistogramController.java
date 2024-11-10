package com.hims.histogram;

import com.hims.Database;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HistogramController {

    @GetMapping("/api/histogram")
    public List<HistogramData> getHistogramData() {
        List<HistogramData> data = new ArrayList<>();
        String query = "SELECT date, count FROM histogram_table";

        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String date = resultSet.getString("date");
                int count = resultSet.getInt("count");
                data.add(new HistogramData(date, count));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public static class HistogramData {
        private String date;
        private int count;

        public HistogramData(String date, int count) {
            this.date = date;
            this.count = count;
        }

        public String getDate() {
            return date;
        }

        public int getCount() {
            return count;
        }
    }
}
