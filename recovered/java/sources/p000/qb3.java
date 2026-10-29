            package p000;

            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Looper;
            import android.os.Message;
            import com.google.android.gms.internal.base.zau;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qb3 extends zau {

                /* JADX INFO: renamed from: a */
                public final Context f15482a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ pr0 f15483b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public qb3(pr0 pr0Var, Context context) {
/* 18 */            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
/* 1 */             this.f15483b = pr0Var;
/* 25 */            this.f15482a = context.getApplicationContext();
                }

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
/* 1 */             int i = message.what;
/* 4 */             if (i != 1) {
/* 22 */                AbstractC1245n0.m4889q("GoogleApiAvailability", "Don't know how to handle this message: " + i);
/* 25 */                return;
                    }
/* 26 */            int i2 = qr0.f15711a;
/* 28 */            pr0 pr0Var = this.f15483b;
/* 30 */            Context context = this.f15482a;
/* 32 */            int iM8004c = pr0Var.m8004c(context, i2);
/* 36 */            int i3 = wr0.f18787e;
/* 38 */            if (iM8004c == 1 || iM8004c == 2 || iM8004c == 3 || iM8004c == 9) {
/* 53 */                Intent intentM8003a = pr0Var.m8003a(context, "n", iM8004c);
/* 68 */                pr0Var.m7543g(context, iM8004c, intentM8003a == null ? null : PendingIntent.getActivity(context, 0, intentM8003a, 201326592));
                    }
                }
            }
