package org.services;

import java.util.ArrayList;
import java.util.List;
import org.entities.*;

public class Trainservice {
    private List<Train> trains;
    private List<Journey> journeys;

    Trainservice() {
        this.trains = new ArrayList<>();
        this.journeys = new ArrayList<>();
    }

    public void addTrain(String trainNumber, List<String> coaches, List<Integer> seats) {
        Train train = new Train(trainNumber, new ArrayList<>(coaches), new ArrayList<>(seats));
        trains.add(train);
    }

    public void addJourney(String journeyNumber, String startDate, String endDate, Train train, List<Stops> stop) {
        Journey journey = new Journey(journeyNumber, startDate, endDate, train);
        for (Stops s : stop) {
            journey.addStop(s);
        }
        journeys.add(journey);
    }

    public Journey searchJourney(Stops stop) {
        for (Journey journey : journeys) {
            for (Stops s : journey.getStops()) {
                if (s.getStationName().equals(stop.getStationName())) {
                    return journey;
                }
            }
        }
        return null;
    }
}
