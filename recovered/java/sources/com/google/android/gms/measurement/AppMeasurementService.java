            package com.google.android.gms.measurement;

            import android.app.Service;
            import android.app.job.JobParameters;
            import android.content.Intent;
            import android.os.IBinder;
            import android.os.PowerManager;
            import android.util.SparseArray;
            import androidx.legacy.content.WakefulBroadcastReceiver;
            import com.google.android.gms.measurement.internal.zzjc;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.ac3;
            import p000.ij3;
            import p000.mp3;
            import p000.pl3;
            import p000.uh3;
            import p000.vl3;
            import p000.vn3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AppMeasurementService extends Service implements vn3 {

                /* JADX INFO: renamed from: a */
                public ac3 f4189a;

                @Override // p000.vn3
                /* JADX INFO: renamed from: a */
                public final void mo2158a(Intent intent) {
/* 1 */             SparseArray sparseArray = WakefulBroadcastReceiver.f1533a;
/* 8 */             int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
/* 12 */            if (intExtra == 0) {
/* 14 */                return;
                    }
/* 15 */            SparseArray sparseArray2 = WakefulBroadcastReceiver.f1533a;
                    synchronized (sparseArray2) {
                        try {
/* 22 */                    PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
/* 24 */                    if (wakeLock != null) {
/* 26 */                        wakeLock.release();
/* 29 */                        sparseArray2.remove(intExtra);
                            } else {
/* 50 */                        AbstractC1245n0.m4889q("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                            }
                        } catch (Throwable th) {
/* 56 */                    throw th;
                        }
                    }
                }

                @Override // p000.vn3
                /* JADX INFO: renamed from: b */
                public final void mo2159b(JobParameters jobParameters) {
/* 6 */             throw new UnsupportedOperationException();
                }

                /* JADX INFO: renamed from: c */
                public final ac3 m2161c() {
/* 3 */             if (this.f4189a == null) {
/* 12 */                this.f4189a = new ac3(this, 8);
                    }
/* 14 */            return this.f4189a;
                }

                @Override // android.app.Service
                public final IBinder onBind(Intent intent) {
/* 1 */             ac3 ac3VarM2161c = m2161c();
/* 5 */             ac3VarM2161c.getClass();
/* 11 */            if (intent == null) {
/* 15 */                AbstractC1245n0.m4876d("FA", "onBind called with null intent");
/* 10 */                return null;
                    }
/* 19 */            String action = intent.getAction();
/* 29 */            if ("com.google.android.gms.measurement.START".equals(action)) {
/* 41 */                return new zzjc(mp3.m6723B((Service) ac3VarM2161c.f184b));
                    }
/* 55 */            AbstractC1245n0.m4889q("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
/* 10 */            return null;
                }

                @Override // android.app.Service
                public final void onCreate() {
/* 1 */             super.onCreate();
/* 22 */            ((Service) m2161c().f184b).getClass().getSimpleName().concat(" is starting up.");
                }

                @Override // android.app.Service
                public final void onDestroy() {
/* 19 */            ((Service) m2161c().f184b).getClass().getSimpleName().concat(" is shutting down.");
/* 22 */            super.onDestroy();
                }

                @Override // android.app.Service
                public final void onRebind(Intent intent) {
/* 1 */             m2161c();
/* 4 */             if (intent == null) {
/* 10 */                AbstractC1245n0.m4876d("FA", "onRebind called with null intent");
                    } else {
/* 24 */                "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
                    }
                }

                @Override // android.app.Service
                public final int onStartCommand(Intent intent, int i, int i2) {
/* 1 */             ac3 ac3VarM2161c = m2161c();
/* 5 */             if (intent == null) {
/* 7 */                 ac3VarM2161c.getClass();
/* 14 */                AbstractC1245n0.m4889q("FA", "AppMeasurementService started with null intent");
/* 76 */                return 2;
                    }
/* 20 */            Service service = (Service) ac3VarM2161c.f184b;
/* 27 */            uh3 uh3Var = ij3.m4556r(service, null, null).f9655f;
/* 29 */            ij3.m4555l(uh3Var);
/* 32 */            String action = intent.getAction();
/* 44 */            uh3Var.f17534Y.m8512c(Integer.valueOf(i2), "Local AppMeasurementService called. startId, action", action);
/* 53 */            if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
/* 76 */                return 2;
                    }
/* 57 */            vl3 vl3Var = new vl3(ac3VarM2161c, i2, uh3Var, intent);
/* 60 */            mp3 mp3VarM6723B = mp3.m6723B(service);
/* 73 */            mp3VarM6723B.mo4558b().m1370I(new pl3(ac3VarM2161c, mp3VarM6723B, vl3Var));
/* 76 */            return 2;
                }

                @Override // android.app.Service
                public final boolean onUnbind(Intent intent) {
/* 1 */             m2161c();
/* 4 */             if (intent == null) {
/* 10 */                AbstractC1245n0.m4876d("FA", "onUnbind called with null intent");
/* 27 */                return true;
                    }
/* 24 */            "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
/* 27 */            return true;
                }

                @Override // p000.vn3
                public final boolean zza(int i) {
/* 1 */             return stopSelfResult(i);
                }
            }
