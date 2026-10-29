            package com.quago.mobile.sdk;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Context;
            import android.os.Message;
            import java.lang.ref.WeakReference;
            import java.util.Locale;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 63 */    public class Quago {
                protected static C0740j0 LOG;
                protected static WeakReference<Activity> currActivityRef;
                protected static C0770y lifecycleCallbacks;
                protected static final C0752o0 quagoManager;

                static {
/* 1 */             Locale locale = AbstractC0743k0.f5509a;
/* 10 */            LOG = new C0740j0("Quago");
/* 17 */            quagoManager = new C0752o0();
/* 25 */            currActivityRef = new WeakReference<>(null);
                }

                public static void beginSegment(String str) {
/* 1 */             C0752o0 c0752o0 = quagoManager;
/* 8 */             if (!c0752o0.f5580a) {
/* 16 */                LOG.m2616e("beginSegment", "method called before SDK initialized!", new Object[0]);
/* 19 */                return;
                    }
/* 20 */            if (str == null || str.isEmpty()) {
/* 100 */               LOG.m2613b("beginSegment", "name is null or empty!", new Object[0]);
/* 103 */               return;
                    }
/* 31 */            if (!c0752o0.f5580a) {
/* 39 */                C0752o0.f5572H.m2616e("beginSegment", "Method called before SDK initialized!", new Object[0]);
                    } else if ("INIT".equals(str)) {
/* 57 */                C0752o0.f5572H.m2613b("beginSegment", "Can't use INIT as a name for segment!", new Object[0]);
                    } else {
/* 61 */                HandlerC0750n0 handlerC0750n0 = c0752o0.f5602w;
/* 90 */                handlerC0750n0.sendMessage(Message.obtain(handlerC0750n0, 5, new C0714a1(str, null, c0752o0.f5585f.m2551a(), c0752o0.f5598s, new C0732g1(c0752o0.f5603x))));
                    }
                }

                public static void beginTracking(String str) {
/* 1 */             C0752o0 c0752o0 = quagoManager;
/* 3 */             boolean z = c0752o0.f5580a;
/* 8 */             if (!z) {
/* 16 */                LOG.m2616e("beginTracking", "method called before SDK initialized!", new Object[0]);
                    } else if (!z) {
/* 28 */                C0752o0.f5572H.m2616e("beginTracking", "Method called before SDK initialized!", new Object[0]);
                    } else {
/* 32 */                HandlerC0750n0 handlerC0750n0 = c0752o0.f5602w;
/* 61 */                handlerC0750n0.sendMessage(Message.obtain(handlerC0750n0, 7, new C0714a1(null, str, c0752o0.f5585f.m2551a(), c0752o0.f5598s, new C0732g1(c0752o0.f5603x))));
                    }
                }

                public static void changeAppToken(String str) {
/* 1 */             C0752o0 c0752o0 = quagoManager;
/* 8 */             if (!c0752o0.f5580a) {
/* 16 */                LOG.m2616e("changeAppToken", "method called before SDK initialized!", new Object[0]);
/* 19 */                return;
                    }
/* 20 */            if (str == null || str.isEmpty()) {
/* 61 */                LOG.m2613b("changeAppToken", "newAppToken is null or empty!", new Object[0]);
                    } else if (!c0752o0.f5580a) {
/* 39 */                C0752o0.f5572H.m2616e("changeAppToken", "Method called before SDK initialized!", new Object[0]);
                    } else {
/* 43 */                HandlerC0750n0 handlerC0750n0 = c0752o0.f5602w;
/* 51 */                handlerC0750n0.sendMessage(Message.obtain(handlerC0750n0, 15, str));
                    }
                }

                public static void endSegment() {
/* 1 */             C0752o0 c0752o0 = quagoManager;
/* 3 */             boolean z = c0752o0.f5580a;
/* 8 */             if (!z) {
/* 16 */                LOG.m2616e("endSegment", "method called before SDK initialized!", new Object[0]);
                    } else if (z) {
/* 35 */                c0752o0.f5602w.sendEmptyMessage(6);
                    } else {
/* 28 */                C0752o0.f5572H.m2616e("endSegment", "Method called before SDK initialized!", new Object[0]);
                    }
                }

                public static void endTracking() {
/* 1 */             C0752o0 c0752o0 = quagoManager;
/* 3 */             boolean z = c0752o0.f5580a;
/* 8 */             if (!z) {
/* 16 */                LOG.m2616e("endTracking", "method called before SDK initialized!", new Object[0]);
                    } else if (z) {
/* 36 */                c0752o0.f5602w.sendEmptyMessage(9);
                    } else {
/* 28 */                C0752o0.f5572H.m2616e("endTracking", "Method called before SDK initialized!", new Object[0]);
                    }
                }

                public static String getSessionId() {
/* 1 */             C0752o0 c0752o0 = quagoManager;
/* 5 */             if (c0752o0.f5580a) {
/* 22 */                return c0752o0.f5586g;
                    }
/* 16 */            LOG.m2616e("getSessionId", "method called before SDK initialized!", new Object[0]);
/* 19 */            return HttpUrl.FRAGMENT_ENCODE_SET;
                }

                public static void initialize(Activity activity, QuagoSettings quagoSettings) {
/* 1 */             C0752o0 c0752o0 = quagoManager;
/* 5 */             if (c0752o0.f5580a) {
/* 7 */                 return;
                    }
/* 11 */            if (activity == null) {
/* 19 */                LOG.m2613b("initialize", "activity is null.", new Object[0]);
/* 22 */                return;
                    }
/* 23 */            if (quagoSettings == null) {
/* 31 */                LOG.m2613b("initialize", "settings is null.", new Object[0]);
/* 34 */                return;
                    }
/* 35 */            String str = quagoSettings.appToken;
/* 37 */            if (str == null || str.isEmpty()) {
/* 124 */               LOG.m2613b("initialize", "AppToken is either null or empty.", new Object[0]);
/* 127 */               return;
                    }
/* 48 */            if (c0752o0.f5580a) {
/* 56 */                LOG.m2616e("initialize", "A call to init() was made after SDK initialisation.", new Object[0]);
/* 59 */                return;
                    }
/* 60 */            Application application = activity.getApplication();
/* 64 */            if (application == null) {
/* 72 */                LOG.m2613b("initialize", "Application instance can't be obtained.", new Object[0]);
/* 75 */                return;
                    }
/* 81 */            currActivityRef = new WeakReference<>(activity);
/* 83 */            C0770y c0770y = lifecycleCallbacks;
/* 85 */            if (c0770y != null) {
/* 87 */                application.unregisterActivityLifecycleCallbacks(c0770y);
                    }
/* 92 */            C0770y c0770y2 = new C0770y(quagoSettings);
/* 95 */            lifecycleCallbacks = c0770y2;
/* 97 */            c0770y2.m2661a(activity);
/* 102 */           application.registerActivityLifecycleCallbacks(lifecycleCallbacks);
/* 107 */           AbstractC0743k0.m2620a(quagoSettings.logLevel);
/* 112 */           AbstractC0743k0.f5511c = quagoSettings.loggerCallback;
/* 114 */           c0752o0.m2644a(activity, application, quagoSettings);
                }

                public static void onPause() {
/* 1 */             C0752o0 c0752o0 = quagoManager;
/* 3 */             boolean z = c0752o0.f5580a;
/* 8 */             if (!z) {
/* 16 */                LOG.m2616e("onPause", "method called before SDK initialized!", new Object[0]);
/* 19 */                return;
                    }
/* 20 */            if (!z) {
/* 28 */                C0752o0.f5572H.m2616e("onPause", "Method called before SDK initialized!", new Object[0]);
                    } else if (c0752o0.f5600u == null) {
/* 42 */                C0752o0.f5572H.m2613b("onPause", "Application is null!", new Object[0]);
                    } else {
/* 52 */                C0752o0.f5572H.m2614c("onPause", "Called", new Object[0]);
/* 64 */                c0752o0.f5597r.m2606a(new C0766w(EnumC0727f.ON_PAUSE));
                    }
                }

                public static void onResume() {
/* 1 */             C0752o0 c0752o0 = quagoManager;
/* 8 */             if (!c0752o0.f5580a) {
/* 16 */                LOG.m2616e("onResume", "method called before SDK initialized!", new Object[0]);
/* 19 */                return;
                    }
/* 22 */            Activity activity = currActivityRef.get();
/* 28 */            if (activity == null) {
/* 102 */               return;
                    }
/* 33 */            if (!c0752o0.f5580a) {
/* 41 */                C0752o0.f5572H.m2616e("onResume", "Method called before SDK initialized!", new Object[0]);
/* 44 */                return;
                    }
/* 47 */            if (c0752o0.f5600u == null) {
/* 55 */                C0752o0.f5572H.m2613b("onResume", "Application is null!", new Object[0]);
/* 58 */                return;
                    }
/* 65 */            C0752o0.f5572H.m2614c("onResume", "Called", new Object[0]);
/* 77 */            c0752o0.f5597r.m2606a(new C0766w(EnumC0727f.ON_RESUME));
/* 80 */            c0752o0.m2643a(activity);
/* 85 */            if (c0752o0.f5578F != null) {
/* 99 */                c0752o0.f5596q.m2555a((Context) c0752o0.f5600u.get(), c0752o0.f5578F);
                    }
                }

                public static void onStop() {
/* 1 */             C0752o0 c0752o0 = quagoManager;
/* 3 */             boolean z = c0752o0.f5580a;
/* 8 */             if (!z) {
/* 16 */                LOG.m2616e("onStop", "method called before SDK initialized!", new Object[0]);
/* 19 */                return;
                    }
/* 20 */            if (!z) {
/* 28 */                C0752o0.f5572H.m2616e("onStop", "Method called before SDK initialized!", new Object[0]);
                    } else {
/* 34 */                if (c0752o0.f5600u == null) {
/* 42 */                    C0752o0.f5572H.m2613b("onStop", "Application is null!", new Object[0]);
/* 45 */                    return;
                        }
/* 52 */                C0752o0.f5572H.m2614c("onStop", "Called", new Object[0]);
/* 64 */                c0752o0.f5597r.m2606a(new C0766w(EnumC0727f.ON_STOP));
/* 71 */                c0752o0.f5596q.m2556a(new QuagoSettings.SensoryType[0]);
                    }
                }

                public static void setAdditionalId(String str) {
/* 1 */             C0752o0 c0752o0 = quagoManager;
/* 8 */             if (!c0752o0.f5580a) {
/* 16 */                LOG.m2616e("setAdditionalId", "method called before SDK initialized!", new Object[0]);
/* 19 */                return;
                    }
/* 20 */            if (str == null || str.isEmpty()) {
/* 61 */                LOG.m2613b("setAdditionalId", "matchingId is null or empty!", new Object[0]);
                    } else if (!c0752o0.f5580a) {
/* 39 */                C0752o0.f5572H.m2616e("setAdditionalId", "Method called before SDK initialized!", new Object[0]);
                    } else {
/* 43 */                HandlerC0750n0 handlerC0750n0 = c0752o0.f5602w;
/* 51 */                handlerC0750n0.sendMessage(Message.obtain(handlerC0750n0, 13, str));
                    }
                }

                public static void setKeyValues(String str, String str2) {
/* 1 */             C0752o0 c0752o0 = quagoManager;
/* 8 */             if (!c0752o0.f5580a) {
/* 16 */                LOG.m2616e("setKeyValues", "method called before SDK initialized!", new Object[0]);
/* 19 */                return;
                    }
/* 20 */            if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
/* 73 */                LOG.m2613b("setKeyValues", "key or value is null or empty!", new Object[0]);
                    } else if (!c0752o0.f5580a) {
/* 47 */                C0752o0.f5572H.m2616e("setKeyValues", "Method called before SDK initialized!", new Object[0]);
                    } else {
/* 51 */                HandlerC0750n0 handlerC0750n0 = c0752o0.f5602w;
/* 63 */                handlerC0750n0.sendMessage(Message.obtain(handlerC0750n0, 10, new String[]{str, str2}));
                    }
                }

                public static void setUserId(String str) {
/* 1 */             C0752o0 c0752o0 = quagoManager;
/* 8 */             if (!c0752o0.f5580a) {
/* 16 */                LOG.m2616e("setUserId", "method called before SDK initialized!", new Object[0]);
/* 19 */                return;
                    }
/* 20 */            if (str == null || str.isEmpty()) {
/* 61 */                LOG.m2613b("setUserId", "userId is null or empty!", new Object[0]);
                    } else if (!c0752o0.f5580a) {
/* 39 */                C0752o0.f5572H.m2616e("setUserId", "Method called before SDK initialized!", new Object[0]);
                    } else {
/* 43 */                HandlerC0750n0 handlerC0750n0 = c0752o0.f5602w;
/* 51 */                handlerC0750n0.sendMessage(Message.obtain(handlerC0750n0, 12, str));
                    }
                }

/* 64 */        public static void beginTracking() {
/* 65 */            beginTracking(null);
                }

/* 127 */       public static void initialize(Activity activity, QuagoSettings.Builder builder) {
/* 128 */           initialize(activity, builder.build());
                }
            }
