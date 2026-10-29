            package com.supercell.titan;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            
            /* JADX INFO: renamed from: com.supercell.titan.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0794a extends BroadcastReceiver {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ BatteryMonitor f5979a;

                public C0794a(BatteryMonitor batteryMonitor) {
/* 1 */             this.f5979a = batteryMonitor;
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
/* 7 */             this.f5979a.m2724b(BatteryMonitor.m2723a(intent));
                }
            }
