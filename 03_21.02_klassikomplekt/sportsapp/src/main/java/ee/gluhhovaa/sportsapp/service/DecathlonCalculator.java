package ee.gluhhovaa.sportsapp.service;

import org.springframework.stereotype.Service;

@Service
public class DecathlonCalculator {

    public int calculatePoints(String event, double value) {
        double A, B, C;

        switch (event.toLowerCase()) {
            case "100m":
                A = 25.4347; B = 18; C = 1.81;
                return (int) (A * Math.pow((B - value), C));

            case "400m":
                A = 1.53775; B = 82; C = 1.81;
                return (int) (A * Math.pow((B - value), C));

            case "1500m":
                A = 0.03768; B = 480; C = 1.85;
                return (int) (A * Math.pow((B - value), C));

            case "110m hurdles":
                A = 5.74352; B = 28.5; C = 1.92;
                return (int) (A * Math.pow((B - value), C));

            case "high jump":
                A = 0.8465; B = 75; C = 1.42;
                return (int) (A * Math.pow((value - B), C));

            case "pole vault":
                A = 0.2797; B = 100; C = 1.35;
                return (int) (A * Math.pow((value - B), C));

            case "long jump":
                A = 0.14354; B = 220; C = 1.40;
                return (int) (A * Math.pow((value - B), C));

            case "shot put":
                A = 51.39; B = 1.5; C = 1.05;
                return (int) (A * Math.pow((value - B), C));

            case "discus throw":
                A = 12.91; B = 4; C = 1.10;
                return (int) (A * Math.pow((value - B), C));

            case "javelin throw":
                A = 10.14; B = 7; C = 1.08;
                return (int) (A * Math.pow((value - B), C));

            default:
                return 0;
        }
    }
}
