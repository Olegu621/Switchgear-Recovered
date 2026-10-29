            package com.supercell.titan;

            import android.content.Context;
            import android.util.Log;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.gms.tasks.Tasks;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.C0204c5;
            import p000.C1922mc;
            import p000.C1951n4;
            import p000.he3;
            import p000.hm3;
            import p000.jd3;
            import p000.my0;
            import p000.pi3;
            import p000.qc3;
            import p000.qf3;
            import p000.wq3;
            import p000.yg3;
            import p000.yr3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AppUpdater {

                /* JADX INFO: renamed from: a */
                public static yg3 f5707a;

                /* JADX INFO: renamed from: b */
                public static C1922mc f5708b;

                /* JADX INFO: renamed from: a */
                public static boolean m2720a() {
/* 7 */             String keyValue = GameApp.getInstance().getKeyValue("LAST_APPUPDATE_REQUESTED");
/* 16 */            if (!keyValue.isEmpty()) {
                        try {
/* 33 */                    if (System.currentTimeMillis() - Long.parseLong(keyValue) <= 86400000) {
/* 36 */                        return false;
                            }
                        } catch (NumberFormatException e) {
/* 60 */                    AbstractC1245n0.m4891s("AppUpdater", "APP_UPDATE_REQUESTED_TIME (" + keyValue + ") is in invalid format", e);
/* 15 */                    return true;
                        }
                    }
/* 15 */            return true;
                }

                public static void checkUpdate(GameApp gameApp) {
                    pi3 pi3Var;
                    Task task;
/* 1 */             Context applicationContext = gameApp.getApplicationContext();
                    synchronized (he3.class) {
                        try {
/* 10 */                    if (he3.f9033a == null) {
/* 14 */                        Context applicationContext2 = applicationContext.getApplicationContext();
/* 18 */                        if (applicationContext2 != null) {
/* 20 */                            applicationContext = applicationContext2;
                                }
/* 29 */                        he3.f9033a = new pi3(new qf3(applicationContext));
                            }
/* 36 */                    pi3Var = he3.f9033a;
                        } catch (Throwable th) {
/* 176 */                   throw th;
                        }
                    }
/* 47 */            yg3 yg3Var = (yg3) ((jd3) pi3Var.f15137a).zza();
/* 49 */            f5707a = yg3Var;
/* 56 */            f5708b = new C1922mc();
/* 58 */            wq3 wq3Var = yg3Var.f19605a;
/* 62 */            String packageName = yg3Var.f19607c.getPackageName();
/* 66 */            yr3 yr3Var = wq3Var.f18753a;
/* 68 */            if (yr3Var == null) {
/* 70 */                C0204c5 c0204c5 = wq3.f18751e;
/* 78 */                Object[] objArr = {-9};
/* 91 */                if (Log.isLoggable("PlayCore", 6)) {
/* 99 */                    AbstractC1245n0.m4876d("PlayCore", C0204c5.m1527d(c0204c5.f2720b, "onError(%d)", objArr));
                        } else {
/* 103 */                   c0204c5.getClass();
                        }
/* 111 */               task = Tasks.forException(new my0(-9));
                    } else {
/* 124 */               wq3.f18751e.m1530c("requestUpdateInfo(%s)", packageName);
/* 129 */               TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 148 */               yr3Var.m10177a().post(new hm3(yr3Var, taskCompletionSource, taskCompletionSource, new hm3(wq3Var, taskCompletionSource, packageName, taskCompletionSource), 2));
/* 151 */               task = taskCompletionSource.getTask();
                    }
/* 162 */           task.addOnSuccessListener(new qc3(gameApp, 9));
/* 171 */           task.addOnFailureListener(new C1951n4(7));
                }
            }
