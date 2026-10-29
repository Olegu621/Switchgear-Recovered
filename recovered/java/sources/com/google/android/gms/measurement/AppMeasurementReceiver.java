            package com.google.android.gms.measurement;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.os.PowerManager;
            import android.util.SparseArray;
            import androidx.legacy.content.WakefulBroadcastReceiver;
            import p000.ij3;
            import p000.pi3;
            import p000.uh3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AppMeasurementReceiver extends WakefulBroadcastReceiver {

                /* JADX INFO: renamed from: c */
                public pi3 f4188c;

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
/* 3 */             if (this.f4188c == null) {
/* 10 */                this.f4188c = new pi3(this);
                    }
/* 12 */            pi3 pi3Var = this.f4188c;
/* 14 */            pi3Var.getClass();
/* 22 */            uh3 uh3Var = ij3.m4556r(context, null, null).f9655f;
/* 24 */            ij3.m4555l(uh3Var);
/* 27 */            if (intent == null) {
/* 33 */                uh3Var.f17541w.m8510a("Receiver called with null intent");
/* 36 */                return;
                    }
/* 37 */            String action = intent.getAction();
/* 45 */            uh3Var.f17534Y.m8511b(action, "Local receiver got");
/* 54 */            if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
/* 169 */               if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
/* 175 */                   uh3Var.f17541w.m8510a("Install Referrer Broadcasts are deprecated");
/* 178 */                   return;
                        }
/* 178 */               return;
                    }
/* 63 */            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
/* 69 */            className.setAction("com.google.android.gms.measurement.UPLOAD");
/* 76 */            uh3Var.f17534Y.m8510a("Starting wakeful intent.");
/* 83 */            ((AppMeasurementReceiver) pi3Var.f15137a).getClass();
/* 88 */            SparseArray sparseArray = WakefulBroadcastReceiver.f1533a;
                    synchronized (sparseArray) {
                        try {
/* 91 */                    int i = WakefulBroadcastReceiver.f1534b;
/* 93 */                    int i2 = i + 1;
/* 95 */                    WakefulBroadcastReceiver.f1534b = i2;
/* 98 */                    if (i2 <= 0) {
/* 100 */                       WakefulBroadcastReceiver.f1534b = 1;
                            }
/* 107 */                   className.putExtra("androidx.contentpager.content.wakelockid", i);
/* 110 */                   ComponentName componentNameStartService = context.startService(className);
/* 114 */                   if (componentNameStartService == null) {
/* 117 */                       return;
                            }
/* 142 */                   PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
/* 147 */                   wakeLockNewWakeLock.setReferenceCounted(false);
/* 153 */                   wakeLockNewWakeLock.acquire(60000L);
/* 156 */                   sparseArray.put(i, wakeLockNewWakeLock);
                        } catch (Throwable th) {
/* 162 */                   throw th;
                        }
                    }
                }
            }
