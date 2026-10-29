            package com.appsflyer.deeplink;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.AFLogger;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class DeepLinkResult {
                private final DeepLink deepLink;
                private final Error error;
                private final Status status;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum Error {
                    TIMEOUT,
                    NETWORK,
                    HTTP_STATUS_CODE,
                    UNEXPECTED,
                    DEVELOPER_ERROR
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum Status {
                    FOUND,
                    NOT_FOUND,
                    ERROR
                }

                public DeepLinkResult(DeepLink deepLink, Error error) {
/* 4 */             this.deepLink = deepLink;
/* 6 */             this.error = error;
/* 8 */             if (error != null) {
/* 12 */                this.status = Status.ERROR;
                    } else if (deepLink != null) {
/* 19 */                this.status = Status.FOUND;
                    } else {
/* 24 */                this.status = Status.NOT_FOUND;
                    }
                }

                public DeepLink getDeepLink() {
/* 1 */             return this.deepLink;
                }

                public Error getError() {
/* 1 */             return this.error;
                }

                public Status getStatus() {
/* 1 */             return this.status;
                }

                public String toString() {
/* 3 */             JSONObject jSONObject = new JSONObject();
                    try {
/* 10 */                jSONObject.put("deepLink", this.deepLink);
/* 17 */                jSONObject.put("error", this.error);
/* 24 */                jSONObject.put(NotificationCompat.CATEGORY_STATUS, this.status);
                    } catch (JSONException e) {
/* 31 */                AFLogger.afErrorLogForExcManagerOnly("error while creating deep link json", e);
                    }
/* 34 */            return jSONObject.toString();
                }
            }
