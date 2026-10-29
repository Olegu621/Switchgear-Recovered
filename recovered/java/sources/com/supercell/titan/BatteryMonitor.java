            package com.supercell.titan;

            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class BatteryMonitor {

                /* JADX INFO: renamed from: a */
                public final Context f5726a;

                /* JADX INFO: renamed from: b */
                public final long f5727b;

                /* JADX INFO: renamed from: c */
                public C0794a f5728c;

                /* JADX INFO: renamed from: d */
                public boolean f5729d = false;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class Snapshot {
                    public final boolean charging;
                    public final int level;

                    public Snapshot(int i, boolean z) {
/* 4 */                 this.level = i;
/* 6 */                 this.charging = z;
                    }
                }

                public BatteryMonitor(Context context, long j) {
/* 11 */            this.f5726a = context.getApplicationContext();
/* 13 */            this.f5727b = j;
                }

                /* JADX INFO: renamed from: a */
                public static Snapshot m2723a(Intent intent) {
/* 3 */             int iRound = -1;
/* 4 */             int intExtra = intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
/* 10 */            int intExtra2 = intent.getIntExtra("scale", -1);
/* 16 */            int intExtra3 = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
/* 20 */            if (intExtra >= 0 && intExtra2 > 0) {
/* 30 */                iRound = Math.round((intExtra * 100.0f) / intExtra2);
                    }
/* 46 */            return new Snapshot(iRound, intExtra3 == 2 || intExtra3 == 5);
                }

                private static native void updateBatteryInfo(long j, int i, boolean z);

                /* JADX INFO: renamed from: b */
                public final void m2724b(Snapshot snapshot) {
/* 7 */             updateBatteryInfo(this.f5727b, snapshot.level, snapshot.charging);
                }

                public Snapshot getOnce() {
/* 11 */            Intent intentRegisterReceiver = this.f5726a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    return intentRegisterReceiver != null ? m2723a(intentRegisterReceiver) : new Snapshot(-1, false);
                }

                public void start() {
/* 3 */             if (this.f5729d) {
/* 5 */                 return;
                    }
/* 7 */             this.f5729d = true;
/* 13 */            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
/* 17 */            Context context = this.f5726a;
/* 19 */            Intent intentRegisterReceiver = context.registerReceiver(null, intentFilter);
/* 23 */            if (intentRegisterReceiver != null) {
/* 29 */                m2724b(m2723a(intentRegisterReceiver));
                    }
/* 34 */            C0794a c0794a = new C0794a(this);
/* 37 */            this.f5728c = c0794a;
/* 39 */            context.registerReceiver(c0794a, intentFilter);
                }

                public void stop() {
/* 3 */             if (this.f5729d) {
/* 7 */                 this.f5729d = false;
/* 13 */                IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
/* 16 */                Context context = this.f5726a;
/* 19 */                Intent intentRegisterReceiver = context.registerReceiver(null, intentFilter);
/* 23 */                if (intentRegisterReceiver != null) {
/* 29 */                    m2724b(m2723a(intentRegisterReceiver));
                        }
/* 32 */                C0794a c0794a = this.f5728c;
/* 34 */                if (c0794a != null) {
/* 36 */                    context.unregisterReceiver(c0794a);
/* 39 */                    this.f5728c = null;
                        }
                    }
                }
            }
