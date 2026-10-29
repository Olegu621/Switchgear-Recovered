            package com.google.android.gms.measurement.internal;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import com.google.android.gms.internal.measurement.zzql;
            import p000.bb3;
            import p000.bj3;
            import p000.ij3;
            import p000.uh3;
            import p000.vg3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzw extends BroadcastReceiver {

                /* JADX INFO: renamed from: a */
                public final ij3 f4265a;

                public zzw(ij3 ij3Var) {
/* 4 */             this.f4265a = ij3Var;
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
/* 1 */             ij3 ij3Var = this.f4265a;
/* 3 */             if (intent == null) {
/* 5 */                 uh3 uh3Var = ij3Var.f9655f;
/* 7 */                 ij3.m4555l(uh3Var);
/* 14 */                uh3Var.f17541w.m8510a("App receiver called with null intent");
/* 17 */                return;
                    }
/* 18 */            String action = intent.getAction();
/* 22 */            if (action == null) {
/* 24 */                uh3 uh3Var2 = ij3Var.f9655f;
/* 26 */                ij3.m4555l(uh3Var2);
/* 33 */                uh3Var2.f17541w.m8510a("App receiver called with null action");
/* 36 */                return;
                    }
/* 37 */            int iHashCode = action.hashCode();
/* 44 */            if (iHashCode != -1928239649) {
/* 49 */                if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
/* 60 */                    uh3 uh3Var3 = ij3Var.f9655f;
/* 62 */                    ij3.m4555l(uh3Var3);
/* 69 */                    uh3Var3.f17534Y.m8510a("[sgtm] App Receiver notified batches are available");
/* 72 */                    bj3 bj3Var = ij3Var.f9659i;
/* 74 */                    ij3.m4555l(bj3Var);
/* 84 */                    bj3Var.m1370I(new bb3(this, 12));
/* 87 */                    return;
                        }
                    } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
/* 96 */                zzql.zza();
/* 108 */               if (ij3Var.f9651d.m7406J(null, vg3.f18096Q0)) {
/* 111 */                   uh3 uh3Var4 = ij3Var.f9655f;
/* 113 */                   ij3.m4555l(uh3Var4);
/* 120 */                   uh3Var4.f17534Y.m8510a("App receiver notified triggers are available");
/* 123 */                   bj3 bj3Var2 = ij3Var.f9659i;
/* 125 */                   ij3.m4555l(bj3Var2);
/* 135 */                   bj3Var2.m1370I(new bb3(ij3Var, 13));
/* 138 */                   return;
                        }
/* 110 */               return;
                    }
/* 139 */           uh3 uh3Var5 = ij3Var.f9655f;
/* 141 */           ij3.m4555l(uh3Var5);
/* 148 */           uh3Var5.f17541w.m8510a("App receiver called with unknown action");
                }
            }
