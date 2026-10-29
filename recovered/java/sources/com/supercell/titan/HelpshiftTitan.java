            package com.supercell.titan;

            import android.content.Context;
            import android.content.Intent;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.HashMap;
            import p000.RunnableC2265ur;
            import p000.cp0;
            import p000.dp0;
            import p000.dq0;
            import p000.hu0;
            import p000.iu0;
            import p000.ju0;
            import p000.vc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class HelpshiftTitan {
                public static final int ORIENTATION_LANDSCAPE = 2;
                public static final int ORIENTATION_PORTRAIT = 1;
                public static final int ORIENTATION_UNSPECIFIED = 0;

                /* JADX INFO: renamed from: a */
                public static volatile int f5794a = 0;

                /* JADX INFO: renamed from: b */
                public static boolean f5795b = false;

                /* JADX INFO: renamed from: j */
                public static boolean f5803j = false;

                /* JADX INFO: renamed from: l */
                public static String f5805l = null;

                /* JADX INFO: renamed from: m */
                public static boolean f5806m = false;

                /* JADX INFO: renamed from: n */
                public static boolean f5807n = false;

                /* JADX INFO: renamed from: c */
                public static final HashMap f5796c = new HashMap();

                /* JADX INFO: renamed from: d */
                public static final HashMap f5797d = new HashMap();

                /* JADX INFO: renamed from: e */
                public static final HashMap f5798e = new HashMap();

                /* JADX INFO: renamed from: f */
                public static final HashMap f5799f = new HashMap();

                /* JADX INFO: renamed from: g */
                public static final HashMap f5800g = new HashMap();

                /* JADX INFO: renamed from: h */
                public static String[] f5801h = new String[0];

                /* JADX INFO: renamed from: i */
                public static String[] f5802i = new String[0];

                /* JADX INFO: renamed from: k */
                public static int f5804k = 2;

                /* JADX INFO: renamed from: a */
                public static HashMap m2731a() {
/* 5 */             HashMap map = new HashMap(f5797d);
/* 10 */            if (f5807n) {
/* 16 */                map.put("fullPrivacy", Boolean.TRUE);
                    }
/* 19 */            HashMap map2 = f5798e;
/* 25 */            if (!map2.isEmpty()) {
/* 29 */                HashMap map3 = new HashMap(map2);
/* 34 */                if (f5807n) {
/* 38 */                    map3.remove("country_code");
                        }
/* 43 */                map.put("customMetadata", map3);
                    }
/* 46 */            String[] strArr = f5801h;
/* 49 */            if (strArr.length > 0) {
/* 53 */                map.put("tags", strArr);
                    }
/* 58 */            HashMap map4 = new HashMap();
/* 63 */            map4.putAll(f5799f);
/* 68 */            map4.putAll(f5800g);
/* 75 */            if (map4.size() > 0) {
/* 79 */                map.put("customIssueFields", map4);
                    }
/* 82 */            String str = f5805l;
/* 84 */            if (str != null) {
/* 88 */                map.put("initialUserMessage", str);
                    }
/* 91 */            int i = f5804k;
/* 95 */            if (i == 0) {
/* 127 */               map.put("enableContactUs", "ALWAYS");
                    } else if (i == 1) {
/* 121 */               map.put("enableContactUs", "NEVER");
                    } else if (i == 2) {
/* 115 */               map.put("enableContactUs", "AFTER_VIEWING_FAQS");
                    } else if (i == 3) {
/* 109 */               map.put("enableContactUs", "AFTER_MARKING_ANSWER_UNHELPFUL");
                    }
/* 132 */           int length = f5802i.length;
/* 133 */           return map;
                }

                public static void clearMetadata() {
/* 3 */             f5797d.clear();
/* 8 */             f5798e.clear();
/* 14 */            f5801h = new String[0];
/* 18 */            f5802i = new String[0];
/* 22 */            f5799f.clear();
/* 26 */            f5805l = null;
                }

                public static void enableChat() {
                }

                public static int getNotificationCount() {
/* 1 */             return f5794a;
                }

                public static void handlePushInternal(Context context, Intent intent) {
                    try {
/* 5 */                 HashMap map = new HashMap();
/* 16 */                map.put("alert", intent.getExtras().getString("alert"));
/* 19 */                hu0.m4340k0(map);
/* 22 */                requestNotificationCount();
                    } catch (Exception unused) {
                    }
                }

                public static void handlePushNotification(String str) {
                }

                public static boolean isVisible() {
/* 1 */             return f5806m;
                }

                public static void leaveBreadcrumb(String str) {
/* 11 */            GameApp.getInstance().runOnUiThread(new iu0(str, 1));
                }

                public static void login(String str, String str2, String str3, String str4) {
/* 16 */            GameApp.getInstance().runOnUiThread(new RunnableC2265ur(str2, str, str3, str4, 1, false));
                }

                public static void onResume() {
/* 3 */             if (f5803j) {
/* 6 */                 f5803j = false;
/* 8 */                 requestNotificationCount();
                    }
                }

                public static void requestNotificationCount() {
/* 3 */             if (f5795b) {
/* 16 */                GameApp.getInstance().runOnUiThread(new vc0(3));
                    }
                }

                public static void setContactUsMode(int i) {
/* 1 */             f5804k = i;
                }

                public static void setCustomIssueField(String str, String str2, String str3) {
/* 3 */             HashMap map = new HashMap();
/* 16 */            map.put("type", (String) f5796c.get(str2));
/* 21 */            map.put(FirebaseAnalytics.Param.VALUE, str3);
/* 26 */            f5799f.put(str, map);
                }

                public static void setEnableFullPrivacy(boolean z) {
/* 1 */             f5807n = z;
                }

                public static void setInitialUserMessage(String str) {
/* 1 */             f5805l = str;
                }

                public static void setInternalCustomIssueField(String str, String str2, String str3) {
/* 3 */             HashMap map = new HashMap();
/* 16 */            map.put("type", (String) f5796c.get(str2));
/* 21 */            map.put(FirebaseAnalytics.Param.VALUE, str3);
/* 26 */            f5800g.put(str, map);
                }

                public static void setMetadata(String str, String str2) {
/* 3 */             f5798e.put(str, str2);
                }

                public static void setMetadataCallback() {
                }

                public static void setMetadataTags(String str) {
/* 3 */             String[] strArrSplit = str.split(",");
/* 7 */             f5801h = strArrSplit;
/* 10 */            if (strArrSplit.length > 0) {
/* 13 */                String str2 = strArrSplit[0];
                    }
                }

                public static void setPushNotificationToken(String str) {
/* 11 */            GameApp.getInstance().runOnUiThread(new iu0(str, 0));
                }

                public static void setSDKLanguage(String str) {
/* 11 */            GameApp.getInstance().runOnUiThread(new iu0(str, 2));
                }

                public static void setWithTagsMatching(String str) {
/* 7 */             f5802i = str.split(",");
                }

                public static void showConversation() {
/* 15 */            GameApp.getInstance().runOnView(new ju0(0, m2731a()));
                }

                public static void showFAQ() {
/* 15 */            GameApp.getInstance().runOnView(new ju0(1, m2731a()));
                }

                public static void showFAQSection(String str) {
/* 16 */            GameApp.getInstance().runOnView(new dp0(15, str, m2731a()));
                }

                public static void showSingleFAQ(String str) {
/* 16 */            GameApp.getInstance().runOnView(new cp0(14, str, m2731a()));
                }

                public static void start(String str, String str2, String str3, int i) {
/* 1 */             HashMap map = f5796c;
/* 3 */             map.clear();
/* 10 */            map.put("sl", "singleline");
/* 17 */            map.put("ml", "multiline");
/* 24 */            map.put("n", "number");
/* 31 */            map.put("dd", "dropdown");
/* 38 */            map.put("dt", "date");
/* 45 */            map.put("b", "checkbox");
/* 52 */            if (GameApp.getInstance() == null) {
/* 58 */                AbstractC1245n0.m4889q("HelpshiftTitan", "Cannot start Helpshift, GameApp instance is null");
                    } else {
/* 64 */                if (f5795b) {
/* 66 */                    return;
                        }
/* 68 */                f5795b = true;
/* 79 */                GameApp.getInstance().runOnUiThread(new dq0(str3, i, 1, str2));
                    }
                }
            }
