package com.example.dean.coffeebreak.Workers;

/**
 * Worker class than transmits coordinates to the back end on fixed intervals.
 * Created upon login. Terminates upon logging out or killing the app.
 *
 * Should go to sleep on app close and back up running on resume
 */

public class LocationTransmitter implements Runnable {

    @Override
    public void run() {
        //Get lat, lon -> send them to firebase every 10 seconds

    }
}
