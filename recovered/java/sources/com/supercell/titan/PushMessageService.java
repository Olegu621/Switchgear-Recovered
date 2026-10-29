            package com.supercell.titan;

            import android.content.Context;
            import android.graphics.Color;
            import android.os.Build;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.firebase.messaging.FirebaseMessaging;
            import com.google.firebase.messaging.FirebaseMessagingService;
            import com.google.firebase.messaging.RemoteMessage;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import com.supercell.titan.zendesk.ZendeskKt;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.UUID;
            import okhttp3.HttpUrl;
            import org.json.JSONObject;
            import p000.C2216tf;
            import p000.RunnableC1784j8;
            import p000.RunnableC2495ye;
            import p000.ds0;
            import p000.jb1;
            import p000.le2;
            import p000.v00;
            import p000.vi0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PushMessageService extends FirebaseMessagingService {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ int f5887b = 0;

                public static void getToken(boolean z) {
                    FirebaseMessaging firebaseMessaging;
/* 3 */             if (!z) {
/* 89 */                GameApp.queuePushNotificationValueUpdate(-2, HttpUrl.FRAGMENT_ENCODE_SET, "Player didn't grant push notification permission");
/* 92 */                return;
                    }
                    try {
                        synchronized (FirebaseMessaging.class) {
/* 12 */                    FirebaseMessaging.getInstance(vi0.m9271c());
                        }
                        synchronized (FirebaseMessaging.class) {
/* 23 */                    firebaseMessaging = FirebaseMessaging.getInstance(vi0.m9271c());
                        }
/* 28 */                firebaseMessaging.getClass();
/* 33 */                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 45 */                firebaseMessaging.f5302f.execute(new RunnableC1784j8(24, firebaseMessaging, taskCompletionSource));
/* 59 */                taskCompletionSource.getTask().addOnCompleteListener(new ds0(23));
                    } catch (IllegalStateException e) {
/* 76 */                AbstractC1245n0.m4889q("FirebaseService", e.getMessage());
/* 82 */                GameApp.queuePushNotificationValueUpdate(-1, HttpUrl.FRAGMENT_ENCODE_SET, "Firebase not initialized");
                    }
                }

                public static boolean hasPermissionBeenRequested() {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 6 */             if (gameApp == null) {
/* 5 */                 return false;
                    }
/* 17 */            return gameApp.getSharedPreferences("titan_push_prefs", 0).getBoolean("push_permission_requested", false);
                }

                public static boolean isPermissionGranted() {
                    return Build.VERSION.SDK_INT < 33 || v00.checkSelfPermission(GameApp.getInstance(), "android.permission.POST_NOTIFICATIONS") == 0;
                }

                public static void onDestroy(GameApp gameApp) {
                }

                public static void register() {
/* 1 */             requestToken();
                }

                public static void requestPermission(RequestPermissionListener requestPermissionListener) {
/* 6 */             if (Build.VERSION.SDK_INT < 33) {
/* 63 */                requestPermissionListener.onPermissionResult(true);
/* 66 */                return;
                    }
/* 12 */            if (isPermissionGranted()) {
/* 14 */                requestPermissionListener.onPermissionResult(true);
/* 17 */                return;
                    }
/* 18 */            GameApp gameApp = GameApp.getInstance();
/* 39 */            gameApp.getSharedPreferences("titan_push_prefs", 0).edit().putBoolean("push_permission_requested", true).apply();
/* 47 */            gameApp.addActivityEventListener(new C0802i(requestPermissionListener));
/* 59 */            gameApp.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 980002);
                }

                public static void requestToken() {
/* 5 */             if (GameApp.getInstance() != null) {
/* 14 */                requestPermission(new ds0(24));
                    }
                }

                public static boolean shouldShowPermissionRationale() {
/* 6 */             if (Build.VERSION.SDK_INT < 33 || isPermissionGranted()) {
/* 5 */                 return false;
                    }
/* 21 */            return GameApp.getInstance().shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.firebase.messaging.FirebaseMessagingService
                public void onMessageReceived(RemoteMessage remoteMessage) throws Throwable {
                    String[] strArr;
                    int i;
                    String str;
                    String[] strArr2;
                    int i2;
                    String str2;
                    int i3;
                    String str3;
                    JSONObject jSONObjectOptJSONObject;
/* 7 */             remoteMessage.f5306a.getString("from");
/* 10 */            Map mapM2535D1 = remoteMessage.m2535D1();
/* 23 */            int color = 0;
/* 24 */            Class<?> cls = null;
/* 25 */            if (((le2) mapM2535D1).containsKey(FirebaseAnalytics.Param.ORIGIN) && "helpshift".equals(((le2) mapM2535D1).getOrDefault(FirebaseAnalytics.Param.ORIGIN, null))) {
/* 46 */                if (GameApp.getInstance() == null) {
/* 52 */                    AbstractC1245n0.m4889q("FirebaseService", "Cannot handle Helpshift push message, GameApp instance is null");
/* 55 */                    return;
                        }
/* 86 */                HelpshiftTitan.start(getResources().getString(R.string.helpshift_apiKey), getResources().getString(R.string.helpshift_domain), getResources().getString(R.string.helpshift_appId), 0);
/* 100 */               GameApp.getInstance().runOnUiThread(new RunnableC2495ye(mapM2535D1, 20));
/* 103 */               HelpshiftTitan.requestNotificationCount();
/* 106 */               return;
                    }
/* 121 */           if (ZendeskKt.tryConsumePushNotification(this, remoteMessage.m2535D1(), TitanApplication.isInForeground())) {
/* 168 */               return;
                    }
                    try {
/* 152 */               Object objInvoke = Class.forName("com.supercell.titan.braze.BrazeKt").getMethod("tryConsumePushNotification", Context.class, RemoteMessage.class).invoke(null, getApplicationContext(), remoteMessage);
/* 158 */               if ((objInvoke instanceof Boolean) && ((Boolean) objInvoke).booleanValue()) {
/* 168 */                   return;
                        }
                        while (true) {
/* 300 */                   if (i >= 4) {
/* 320 */                       str = null;
                                break;
                            }
/* 302 */                   String str4 = strArr[i];
/* 304 */                   if (str4 == null || str4.isEmpty()) {
/* 312 */                       str4 = null;
                            }
/* 313 */                   if (str4 != null) {
/* 315 */                       str = str4;
                                break;
                            }
/* 317 */                   i++;
                        }
                        while (true) {
/* 348 */                   if (i2 >= 4) {
/* 368 */                       str2 = null;
                                break;
                            }
/* 350 */                   String str5 = strArr2[i2];
/* 352 */                   if (str5 == null || str5.isEmpty()) {
/* 360 */                       str5 = null;
                            }
/* 361 */                   if (str5 != null) {
/* 363 */                       str2 = str5;
                                break;
                            }
/* 365 */                   i2++;
                        }
                    } catch (Throwable unused) {
                    }
/* 170 */           le2 le2Var = (le2) mapM2535D1;
/* 176 */           if (!le2Var.isEmpty()) {
/* 178 */               mapM2535D1.toString();
                    }
/* 183 */           HashMap map = new HashMap(mapM2535D1);
/* 194 */           JSONObject jSONObjectM5762v = jb1.m5762v((String) le2Var.getOrDefault("fcmV1Message", null));
/* 202 */           if (jSONObjectM5762v != null && (jSONObjectOptJSONObject = jSONObjectM5762v.optJSONObject("message")) != null) {
/* 214 */               jb1.m5760t(jSONObjectOptJSONObject.optJSONObject(SharedDataContentProvider.BASE_PATH), map);
                    }
/* 227 */           jb1.m5760t(jb1.m5762v((String) le2Var.getOrDefault(SharedDataContentProvider.BASE_PATH, null)), map);
/* 236 */           JSONObject jSONObjectM5762v2 = jb1.m5762v((String) le2Var.getOrDefault("fcmV1Message", null));
/* 247 */           JSONObject jSONObjectOptJSONObject2 = jSONObjectM5762v2 != null ? jSONObjectM5762v2.optJSONObject("message") : null;
/* 257 */           JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONObject("notification") : null;
/* 264 */           JSONObject jSONObjectM5762v3 = jb1.m5762v((String) le2Var.getOrDefault("notification", null));
/* 268 */           C2216tf c2216tfM2536E1 = remoteMessage.m2536E1();
/* 294 */           strArr = new String[]{c2216tfM2536E1 != null ? c2216tfM2536E1.f17061a : null, jb1.m5739E("title", jSONObjectOptJSONObject3), jb1.m5739E("title", jSONObjectM5762v3), (String) map.get("title")};
/* 298 */           i = 0;
/* 343 */           strArr2 = new String[]{c2216tfM2536E1 != null ? c2216tfM2536E1.f17062b : null, jb1.m5739E("body", jSONObjectOptJSONObject3), jb1.m5739E("body", jSONObjectM5762v3), (String) map.get("title")};
/* 347 */           i2 = 0;
/* 383 */           String str6 = remoteMessage.m2536E1() != null ? remoteMessage.m2536E1().f17063c : null;
/* 391 */           String str7 = (String) map.get("userId");
/* 401 */           String str8 = (String) map.get("channelId");
/* 411 */           String str9 = (String) map.get("channelName");
/* 421 */           String str10 = (String) map.get("channelDesc");
/* 431 */           String str11 = (String) map.get("imageURL");
/* 439 */           String str12 = (String) map.get("color");
/* 449 */           String str13 = (String) map.get("iconResourceName");
/* 459 */           String str14 = (String) map.get("chronosPushNotificationId");
/* 467 */           String string = (String) map.get("notificationUniqueId");
/* 475 */           String str15 = (String) map.get(FirebaseAnalytics.Param.SOURCE);
/* 477 */           if (str15 == null || str15.isEmpty()) {
/* 485 */               str15 = null;
                    }
/* 486 */           if (string == null || string.isEmpty()) {
/* 502 */               string = UUID.randomUUID().toString();
                    }
/* 495 */           String str16 = string;
/* 507 */           if (str15 == null || !str15.equalsIgnoreCase(NotificationCompat.CATEGORY_SOCIAL)) {
/* 546 */               i3 = ((str14 == null || str14.isEmpty()) ? null : str14) != null ? GameApp.NotificationSource.CHRONOS.f5787a : GameApp.NotificationSource.SERVER.f5787a;
                    } else {
/* 519 */               i3 = GameApp.NotificationSource.SOCIAL.f5787a;
                    }
/* 521 */           int i4 = i3;
/* 549 */           if (str12 != null) {
                        try {
/* 551 */                   color = Integer.parseInt(str12);
                        } catch (NumberFormatException | Exception unused2) {
                        }
                    } else if (remoteMessage.m2536E1() != null && (str3 = remoteMessage.m2536E1().f17064d) != null) {
/* 572 */               color = Color.parseColor(str3);
                    }
/* 555 */           int i5 = color;
/* 577 */           if (str2 != null && !str2.isEmpty()) {
/* 585 */               Context applicationContext = getApplicationContext();
                        try {
/* 617 */                   cls = Class.forName(getApplicationContext().getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName()).getComponent().getClassName());
                        } catch (Exception unused3) {
                        }
/* 625 */               TimeAlarm.createNotification(applicationContext, str2, str, str6, str7, str11, str8, str9, str10, str13, i5, i4, str14, str16, cls, null);
                    }
/* 636 */           GameApp.NotificationData notificationData = new GameApp.NotificationData();
                    String str17 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 641 */           if (str2 == null) {
/* 644 */               str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 645 */           notificationData.message = str2;
/* 647 */           if (str == null) {
/* 650 */               str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 651 */           notificationData.title = str;
/* 653 */           notificationData.notificationId = str16;
/* 655 */           if (str8 != null) {
/* 657 */               str17 = str8;
                    }
/* 659 */           notificationData.channelId = str17;
/* 661 */           notificationData.source = i4;
/* 663 */           notificationData.chronosEventId = str14;
/* 665 */           GameApp.trackNotificationReceivedOnly(notificationData);
/* 668 */           GameApp.addDisplayedNotificationForCancelTracking(notificationData);
                }

                @Override // com.google.firebase.messaging.FirebaseMessagingService
                public void onNewToken(String str) {
/* 4 */             GameApp.queuePushNotificationValueUpdate(0, str, HttpUrl.FRAGMENT_ENCODE_SET);
                }
            }
