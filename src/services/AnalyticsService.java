package services;

/**
 * services.AnalyticsService.java
 * Defines the basic methods that all analytics services should have.
 *
 */
public interface AnalyticsService {
    public void trackEvent();
    public void generateReport();
}