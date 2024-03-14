package repository;

import model.Racer;

import java.net.InterfaceAddress;
import java.util.HashMap;
import java.util.Map;

public class RacerRepository {
    // structure to store your Racers
    private static Map<Integer, Racer> racerTable = new HashMap<>();
    private static Integer sequence = 1000;

    /**
     * Add racer to your DB
     * @param racer
     */
    public void addRacer(Racer racer) {
        if(racer.getId() != null){
            throw new IllegalArgumentException("Cannot create Racer with already given ID.");
        }
        racer.setId(sequence++);
        racerTable.put(racer.getId(), racer);

    }

    /**
     * Delete racer by id. If there is no element to be deleted then return false;
     * @param id
     * @return if there is element to delete -> true, if not -> false
     */
    public boolean deleteRacerById(Integer id) {
        return racerTable.remove(id) == null ? false : true;
    }
}
