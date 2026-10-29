            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import com.google.firebase.messaging.FirebaseMessaging;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yj2 extends BroadcastReceiver {

                /* JADX INFO: renamed from: a */
                public zj2 f19659a;

                /* JADX INFO: renamed from: b */
                public Context f19660b;

                /* JADX INFO: renamed from: a */
                public final void m10153a() {
/* 5 */             IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
/* 8 */             zj2 zj2Var = this.f19659a;
/* 10 */            if (zj2Var != null) {
/* 14 */                Context context = zj2Var.f20204c.f5298b;
/* 16 */                this.f19660b = context;
/* 18 */                context.registerReceiver(this, intentFilter);
                    }
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
/* 1 */             zj2 zj2Var = this.f19659a;
/* 3 */             if (zj2Var != null && zj2Var.m10365a()) {
/* 13 */                zj2 zj2Var2 = this.f19659a;
/* 17 */                zj2Var2.f20204c.getClass();
/* 22 */                FirebaseMessaging.m2526b(zj2Var2, 0L);
/* 25 */                Context context2 = this.f19660b;
/* 27 */                if (context2 != null) {
/* 29 */                    context2.unregisterReceiver(this);
                        }
/* 33 */                this.f19659a = null;
                    }
                }
            }
