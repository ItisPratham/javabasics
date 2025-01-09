package org.example.exam09_01_25;

import java.util.Map;
import java.util.TreeMap;

public class RelayTeam implements ITeam {
    private String mascot;
    private Map<String, Double> info = new TreeMap<>();
    public RelayTeam(String mascot){
        this.mascot = mascot;
    }

    @Override
    public String getMascot() {
        return mascot;
    }

    @Override
    public void addRunner(String runner, double time) {
        if (time < 0) {
            throw new IllegalArgumentException("Time cannot be negative");
        }
        if (info.containsKey(runner)) {
            throw new IllegalArgumentException("Runner is repeated");
        }
        info.put(runner, time);
    }

    @Override
    public void substituteRunner(String oldRunner, String newRunner, double newTime) {
        if(newTime<0){
            throw new IllegalArgumentException("Time cant be negative");
        }
        if (!info.containsKey(oldRunner)) {
            throw new IllegalArgumentException("Old runner not found");
        }
        if (info.containsKey(newRunner)) {
            throw new IllegalArgumentException("New runner already exists");
        }
        info.remove(oldRunner);
        info.put(newRunner, newTime);
    }

    @Override
    public String getFastestRunner() {
        if (info.isEmpty()) {
            throw new IllegalStateException("No runners on the team");
        }
        String fr = null;
        double ft = Double.MAX_VALUE;

        for (String runner : info.keySet()) {
            double time = info.get(runner);
            if (time < ft || (time == ft && runner.compareTo(fr) < 0)) {
                ft = time;
                fr = runner;
            }
        }
        return fr;
    }

    @Override
    public double getAverageTime() {
        if (info.isEmpty()) {
            return 0.0;
        }
        double totalTime = 0;
        for (double time : info.values()) {
            totalTime += time;
        }
        return totalTime / info.size();
    }

    @Override
    public boolean hasFasterAverage(ITeam other) {
        if (other == null) {
            throw new IllegalArgumentException("Other team cannot be null");
        }
        return getAverageTime() < other.getAverageTime();
    }

    @Override
    public String toString() {
        return getMascot() + "'s average time: " + getAverageTime() + " s";
    }


    public static void main(String[] args) {
        RelayTeam r1 = new RelayTeam("Sloths");
        r1.addRunner("Simon", 40);
        r1.addRunner("Subhash", 51);
        r1.substituteRunner("Subhash", "Samira", 40);
        RelayTeam r2 = new RelayTeam("Turtles");
        r2.addRunner("Thuy", 45);
        r2.addRunner("Tanya", 55);

        System.out.println(r1.getMascot()); // Sloths
        System.out.println(r1.getFastestRunner()); // Samira
        System.out.println(r2.getAverageTime()); // 50.0
        System.out.println(r1.hasFasterAverage(r2)); // true
        System.out.println(r2.toString()); // Turtles’s average time: 50.0 s
    }
}
