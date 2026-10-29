            package io.flutter.plugin.common;

            import io.sentry.C1697u2;
            import java.util.Map;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class MethodCall {
                public final Object arguments;
                public final String method;

                public MethodCall(String str, Object obj) {
/* 4 */             this.method = str;
/* 6 */             this.arguments = obj;
                }

                public <T> T argument(String str) {
/* 1 */             Object obj = this.arguments;
/* 3 */             if (obj == null) {
/* 5 */                 return null;
                    }
/* 9 */             if (obj instanceof Map) {
/* 13 */                return (T) ((Map) obj).get(str);
                    }
/* 20 */            if (obj instanceof JSONObject) {
/* 24 */                return (T) ((JSONObject) obj).opt(str);
                    }
/* 29 */            C1697u2.m5431g();
/* 32 */            return null;
                }

                public <T> T arguments() {
/* 1 */             return (T) this.arguments;
                }

                public boolean hasArgument(String str) {
/* 1 */             Object obj = this.arguments;
/* 3 */             if (obj == null) {
/* 5 */                 return false;
                    }
/* 9 */             if (obj instanceof Map) {
/* 13 */                return ((Map) obj).containsKey(str);
                    }
/* 20 */            if (obj instanceof JSONObject) {
/* 24 */                return ((JSONObject) obj).has(str);
                    }
/* 29 */            C1697u2.m5431g();
/* 32 */            return false;
                }
            }
