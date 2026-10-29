            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class GeolocationPermissionShowPromptResponse {
                boolean allow;
                private String origin;
                boolean retain;

                public GeolocationPermissionShowPromptResponse(String str, boolean z, boolean z2) {
/* 4 */             this.origin = str;
/* 6 */             this.allow = z;
/* 8 */             this.retain = z2;
                }

                public static GeolocationPermissionShowPromptResponse fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 39 */            return new GeolocationPermissionShowPromptResponse((String) map.get(FirebaseAnalytics.Param.ORIGIN), ((Boolean) map.get("allow")).booleanValue(), ((Boolean) map.get("retain")).booleanValue());
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            GeolocationPermissionShowPromptResponse geolocationPermissionShowPromptResponse = (GeolocationPermissionShowPromptResponse) obj;
/* 25 */            if (this.allow == geolocationPermissionShowPromptResponse.allow && this.retain == geolocationPermissionShowPromptResponse.retain) {
/* 39 */                return this.origin.equals(geolocationPermissionShowPromptResponse.origin);
                    }
/* 5 */             return false;
                }

                public String getOrigin() {
/* 1 */             return this.origin;
                }

                public int hashCode() {
/* 16 */            return (((this.origin.hashCode() * 31) + (this.allow ? 1 : 0)) * 31) + (this.retain ? 1 : 0);
                }

                public boolean isAllow() {
/* 1 */             return this.allow;
                }

                public boolean isRetain() {
/* 1 */             return this.retain;
                }

                public void setAllow(boolean z) {
/* 1 */             this.allow = z;
                }

                public void setOrigin(String str) {
/* 1 */             this.origin = str;
                }

                public void setRetain(boolean z) {
/* 1 */             this.retain = z;
                }

                public String toString() {
/* 38 */            return "GeolocationPermissionShowPromptResponse{origin='" + this.origin + "', allow=" + this.allow + ", retain=" + this.retain + '}';
                }
            }
