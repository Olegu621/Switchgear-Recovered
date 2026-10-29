            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jq2 extends BroadcastReceiver {

                /* JADX INFO: renamed from: a */
                public kq2 f12437a;

                @Override // android.content.BroadcastReceiver
                public final synchronized void onReceive(Context context, Intent intent) {
/* 2 */             kq2 kq2Var = this.f12437a;
/* 4 */             if (kq2Var == null) {
/* 7 */                 return;
                    }
/* 12 */            if (kq2Var.m6275c()) {
/* 16 */                kq2 kq2Var2 = this.f12437a;
/* 28 */                ((iq2) kq2Var2.f12985f).f11905f.schedule(kq2Var2, 0L, TimeUnit.SECONDS);
/* 31 */                context.unregisterReceiver(this);
/* 35 */                this.f12437a = null;
                    }
                }
            }
