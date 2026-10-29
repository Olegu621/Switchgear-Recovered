            package p000;

            import android.webkit.JavascriptInterface;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.lang.ref.WeakReference;
            import java.util.HashMap;
            import java.util.Iterator;
            import okhttp3.HttpUrl;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ms0 {

                /* JADX INFO: renamed from: a */
                public final wc0 f13991a;

                /* JADX INFO: renamed from: b */
                public boolean f13992b;

                /* JADX INFO: renamed from: c */
                public final eq2 f13993c;

                public ms0(wc0 wc0Var, eq2 eq2Var) {
/* 4 */             this.f13991a = wc0Var;
/* 6 */             this.f13993c = eq2Var;
                }

                @JavascriptInterface
                public void getHelpcenterData() {
/* 6 */             xe2.m9775m("ChatNativeBridge", "Received event to get Aditional info of HC  from WC from webview.", null);
/* 19 */            ls0 ls0Var = (ls0) ((WeakReference) this.f13993c.f7838i).get();
/* 21 */            if (ls0Var != null) {
                        try {
/* 41 */                    String strM3589r = ((er0) ((er0) rs0.f16254y.f16260e.f11955a).f7853b).m3589r("additional_hc_data");
/* 49 */                    String str = "{}";
/* 51 */                    if (b40.m1232p(strM3589r)) {
/* 49 */                        strM3589r = "{}";
                            }
/* 58 */                    if (!b40.m1232p(strM3589r)) {
/* 61 */                        str = strM3589r;
                            }
/* 79 */                    ls0Var.m6529g("Helpshift('setHelpcenterData','" + str + "');", null);
/* 84 */                    xe2.m9775m("HSChatFragment", "Called setHelpcenterData function on webchat", null);
                        } catch (Exception e) {
/* 91 */                    xe2.m9777o("HSChatFragment", "Error with setHelpcenterData call", e);
                        }
                    }
                }

                @JavascriptInterface
                public void onRemoveAnonymousUser() {
/* 1 */             eq2 eq2Var = this.f13993c;
/* 13 */            ((ra2) eq2Var.f7832a).m8116u(new gs0(eq2Var, 3));
                }

                @JavascriptInterface
                public void onUIConfigChange(String str) {
/* 1 */             eq2 eq2Var = this.f13993c;
/* 5 */             ra2 ra2Var = (ra2) eq2Var.f7832a;
/* 9 */             int i = 0;
/* 13 */            ra2Var.m8116u(new is0(eq2Var, str, i));
/* 21 */            ra2Var.m8115t(new hs0(eq2Var, str, i));
                }

                @JavascriptInterface
                public void onWebSdkConfigLoad() {
/* 6 */             xe2.m9775m("ChatNativeBridge", "Received event when web sdk config loaded", null);
/* 11 */            if (this.f13992b) {
/* 13 */                return;
                    }
/* 15 */            this.f13992b = true;
/* 17 */            eq2 eq2Var = this.f13993c;
/* 29 */            ((ra2) eq2Var.f7832a).m8115t(new gs0(eq2Var, 5));
                }

                @JavascriptInterface
                public void onWebchatError() {
/* 6 */             xe2.m9775m("ChatNativeBridge", "Received error from webview.", null);
/* 9 */             eq2 eq2Var = this.f13993c;
/* 21 */            ((ra2) eq2Var.f7832a).m8116u(new gs0(eq2Var, 1));
/* 34 */            ((ra2) eq2Var.f7832a).m8115t(new gs0(eq2Var, 6));
                }

                @JavascriptInterface
                public void removeLocalStorage(String str) {
/* 6 */             xe2.m9775m("ChatNativeBridge", "Received event to remove data from local store from webview.", null);
/* 9 */             eq2 eq2Var = this.f13993c;
/* 21 */            ((ra2) eq2Var.f7832a).m8116u(new is0(eq2Var, str, 1));
                }

                @JavascriptInterface
                public void requestConversationMetadata(String str) {
                    JSONArray jSONArray;
/* 11 */            ls0 ls0Var = (ls0) ((WeakReference) this.f13993c.f7838i).get();
/* 13 */            if (ls0Var != null) {
                        try {
/* 17 */                    JSONObject jSONObject = new JSONObject(str);
/* 22 */                    int i = jSONObject.getInt("bclConfig");
/* 28 */                    int i2 = jSONObject.getInt("dbglConfig");
/* 34 */                    C1773iy c1773iy = rs0.f16254y.f16260e;
                            synchronized (c1773iy) {
/* 39 */                        jSONArray = new JSONArray();
                                try {
/* 46 */                            JSONArray jSONArrayM3583i = ((er0) c1773iy.f11955a).m3583i();
/* 50 */                            int length = jSONArrayM3583i.length();
/* 60 */                            for (int i3 = i < length ? length - i : 0; i3 < length; i3++) {
/* 66 */                                jSONArray.put(jSONArrayM3583i.get(i3));
                                    }
                                } catch (Exception e) {
/* 79 */                            xe2.m9777o("ConfigMangr", "Error getting breadcrumbs", e);
                                }
                            }
/* 83 */                    JSONArray jSONArrayM5616k = c1773iy.m5616k(i2);
/* 89 */                    JSONObject jSONObject2 = new JSONObject();
/* 94 */                    jSONObject2.put("bcl", jSONArray);
/* 99 */                    jSONObject2.put("dbgl", jSONArrayM5616k);
/* 129 */                   ls0Var.m6529g("Helpshift('syncConversationMetadata','" + jSONObject2.toString() + "');", null);
                        } catch (Exception e2) {
/* 140 */                   xe2.m9777o("HSChatFragment", "Error with request conversation meta call", e2);
                        }
                    }
                }

                @JavascriptInterface
                public void sdkxMigrationLogSynced(boolean z) {
/* 19 */            ((ll1) this.f13993c.f7837f).f13382a.edit().putBoolean("mig_log_synced_with_webchat", z).commit();
                }

                @JavascriptInterface
                public void sendEvent(String str) {
/* 6 */             xe2.m9775m("ChatNativeBridge", "Received event from webview.", null);
/* 9 */             wc0 wc0Var = this.f13991a;
/* 11 */            if (wc0Var == null || b40.m1232p(str)) {
/* 61 */                return;
                    }
                    try {
/* 22 */                JSONObject jSONObject = new JSONObject(str);
/* 25 */                Iterator<String> itKeys = jSONObject.keys();
/* 33 */                while (itKeys.hasNext()) {
/* 35 */                    String next = itKeys.next();
/* 51 */                    wc0Var.m9527D(next, b40.m1238v(jSONObject.optString(next, HttpUrl.FRAGMENT_ENCODE_SET)));
                        }
                    } catch (JSONException e) {
/* 58 */                xe2.m9777o("ChatNativeBridge", "Error in sending public event", e);
                    }
                }

                @JavascriptInterface
                public void sendPushTokenSyncRequestData(String str) {
/* 1 */             eq2 eq2Var = this.f13993c;
/* 13 */            ((ra2) eq2Var.f7832a).m8116u(new gs0(eq2Var, 2));
                }

                @JavascriptInterface
                public void sendUserAuthFailureEvent(String str) {
/* 3 */             wc0 wc0Var = this.f13991a;
/* 5 */             if (wc0Var == null || b40.m1232p(str)) {
/* 83 */                return;
                    }
/* 14 */            String str2 = "Authentication Failure";
                    try {
/* 18 */                JSONObject jSONObject = new JSONObject(str);
/* 25 */                if (jSONObject.has("message")) {
/* 27 */                    String string = jSONObject.getString("message");
/* 39 */                    if (!b40.m1232p(string.trim())) {
/* 42 */                        str2 = string;
                            }
                        }
                    } catch (Exception unused) {
/* 49 */                xe2.m9777o("ChatNativeBridge", "Error in reading auth failure event ", null);
                    }
/* 52 */            eq2 eq2Var = this.f13993c;
/* 64 */            ((ra2) eq2Var.f7832a).m8116u(new gs0(eq2Var, 1));
/* 77 */            ((ra2) eq2Var.f7832a).m8115t(new gs0(eq2Var, 0));
/* 80 */            wc0Var.m9526C(str2);
                }

                @JavascriptInterface
                public void setGenericSdkData(String str) {
/* 1 */             eq2 eq2Var = this.f13993c;
/* 13 */            ((ra2) eq2Var.f7832a).m8116u(new hs0(eq2Var, str, 2));
                }

                @JavascriptInterface
                public void setIssueExistsFlag(String str) {
/* 18 */            xe2.m9775m("ChatNativeBridge", "Received event to set the issue exist as -" + str, null);
/* 21 */            eq2 eq2Var = this.f13993c;
/* 33 */            ((ra2) eq2Var.f7832a).m8116u(new is0(eq2Var, str, 2));
                }

                @JavascriptInterface
                public void setLocalStorage(String str) {
/* 6 */             xe2.m9775m("ChatNativeBridge", "Received event to set data in local store from webview.", null);
/* 9 */             eq2 eq2Var = this.f13993c;
/* 21 */            ((ra2) eq2Var.f7832a).m8116u(new hs0(eq2Var, str, 1));
                }

                @JavascriptInterface
                public void setPollingStatus(String str) {
/* 1 */             eq2 eq2Var = this.f13993c;
/* 3 */             eq2Var.getClass();
                    try {
/* 28 */                ((C1969nm) eq2Var.f7834c).m7011n(Boolean.valueOf(new JSONObject(str).optBoolean("shouldPoll", false)), "should_poll");
                    } catch (Exception e) {
/* 37 */                xe2.m9777o("wbEvntHndlr", "Error getting polling status", e);
                    }
                }

                @JavascriptInterface
                public void webchatJsFileLoaded() {
                    String string;
/* 11 */            ls0 ls0Var = (ls0) ((WeakReference) this.f13993c.f7838i).get();
/* 13 */            if (ls0Var != null) {
/* 15 */                String str = ls0Var.f13473W;
/* 17 */                HashMap map = ht0.f9230a;
/* 19 */                long jCurrentTimeMillis = System.currentTimeMillis();
/* 27 */                long jLongValue = -1;
/* 29 */                if (!b40.m1232p(str)) {
/* 32 */                    HashMap map2 = ht0.f9230a;
/* 38 */                    if (map2.containsKey(str)) {
/* 50 */                        jLongValue = jCurrentTimeMillis - ((Long) map2.remove(str)).longValue();
                            }
                        }
/* 58 */                if (jLongValue > 0) {
/* 60 */                    Long lValueOf = Long.valueOf(jLongValue);
/* 66 */                    JSONObject jSONObject = new JSONObject();
                            try {
/* 73 */                        jSONObject.put(FirebaseAnalytics.Param.SOURCE, ls0Var.f13473W);
/* 82 */                        jSONObject.put("time", lValueOf.toString());
/* 85 */                        string = jSONObject.toString();
                            } catch (Exception e) {
/* 93 */                        xe2.m9777o("HSChatFragment", "Failed to calculate webchat.js loading time", e);
/* 96 */                        string = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 98 */                    ls0Var.f13471U = string;
                        }
/* 103 */               xe2.m9775m("HSChatFragment", "Webchat.js Loaded, Stopping loading timer", null);
                    }
                }

                @JavascriptInterface
                public void widgetToggle(String str) {
/* 18 */            xe2.m9775m("ChatNativeBridge", "webchat widget toggle: " + str, null);
/* 25 */            if (b40.m1232p(str) || !this.f13992b) {
/* 82 */                return;
                    }
                    try {
/* 40 */                boolean zOptBoolean = new JSONObject(str).optBoolean("visible", false);
/* 44 */                eq2 eq2Var = this.f13993c;
/* 46 */                if (zOptBoolean) {
/* 58 */                    ((ra2) eq2Var.f7832a).m8115t(new gs0(eq2Var, 5));
                        } else {
/* 72 */                    ((ra2) eq2Var.f7832a).m8115t(new gs0(eq2Var, 4));
                        }
                    } catch (JSONException e) {
/* 79 */                xe2.m9777o("ChatNativeBridge", "Error in closing the webchat", e);
                    }
                }
            }
