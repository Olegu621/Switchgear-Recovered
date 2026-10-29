            package com.google.firebase.analytics.connector;

            import android.os.Bundle;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface AnalyticsConnector {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface AnalyticsConnectorHandle {
                    void registerEventNames(Set<String> set);

                    void unregister();

                    void unregisterEventNames();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface AnalyticsConnectorListener {
                    void onMessageTriggered(int i, Bundle bundle);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ConditionalUserProperty {
                    public boolean active;
                    public long creationTimestamp;
                    public String expiredEventName;
                    public Bundle expiredEventParams;
                    public String name;
                    public String origin;
                    public long timeToLive;
                    public String timedOutEventName;
                    public Bundle timedOutEventParams;
                    public String triggerEventName;
                    public long triggerTimeout;
                    public String triggeredEventName;
                    public Bundle triggeredEventParams;
                    public long triggeredTimestamp;
                    public Object value;
                }

                void clearConditionalUserProperty(String str, String str2, Bundle bundle);

                List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2);

                int getMaxUserProperties(String str);

                Map<String, Object> getUserProperties(boolean z);

                void logEvent(String str, String str2, Bundle bundle);

                AnalyticsConnectorHandle registerAnalyticsConnectorListener(String str, AnalyticsConnectorListener analyticsConnectorListener);

                void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty);

                void setUserProperty(String str, String str2, Object obj);
            }
