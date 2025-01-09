package org.example.exam09_01_25;

public interface ITeam {
    // Returns the mascot of this team.
    public String getMascot();
    // Adds a runner to this relay team with the given time in seconds.
// Throws an IllegalArgumentException if the runner is already on the team
// or if time is negative
    public void addRunner(String runner, double time);
    // Substitutes newRunner for oldRunner on the relay team with newTime
// Throws an IllegalArgumentException if oldRunner is not on the team or
// if newRunner is already on this team, or if newTime is negative.
    public void substituteRunner(String oldRunner, String newRunner, double newTime);
    // Returns the name of the runner on this team that is the fastest (shortest time).
// If two runners are tied for fastest, this method should return the name that
// is alphabetically first.
// Throws an IllegalStateException if there are no runners on this team.
    public String getFastestRunner();
    // Returns the average running time across all runners on the team,
// or 0.0 if there are no runners.
    public double getAverageTime();
    // Returns true if this team has a faster average time than the given other team,
// and false otherwise.
    public boolean hasFasterAverage(ITeam other);
    // Returns a string representation of this team. The format should be
// as follows:
// <team mascot>’s average time: <average time> s
// Eg, for the Cheetahs with an average time of 52.0 seconds,
// the resulting toString would look like:
// Cheetahs’s average time: 52.0 s
// You do not need to round the resulting average
    public String toString();
}