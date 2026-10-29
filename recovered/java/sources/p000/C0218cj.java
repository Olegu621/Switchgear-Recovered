            package p000;

            import android.content.Context;
            import com.google.android.gms.internal.play_billing.zze;
            
            /* JADX INFO: renamed from: cj */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0218cj {

                /* JADX INFO: renamed from: a */
                public final Object f2931a;

                /* JADX INFO: renamed from: b */
                public volatile Object f2932b;

                /* JADX INFO: renamed from: c */
                public volatile Object f2933c;

                public /* synthetic */ C0218cj(Object obj) {
/* 1 */             this.f2931a = obj;
                }

                /* JADX INFO: renamed from: a */
                public C0882ej m1696a() {
/* 5 */             if (((Context) this.f2931a) == null) {
/* 96 */                C1951n4.m6859j("Please provide a valid Context.");
/* 99 */                return null;
                    }
/* 11 */            if (((tz1) this.f2933c) == null) {
/* 89 */                C1951n4.m6859j("Please provide a valid listener for purchases updates.");
/* 92 */                return null;
                    }
/* 17 */            if (((ec0) this.f2932b) == null) {
/* 82 */                C1951n4.m6859j("Pending purchases for one-time products must be supported.");
/* 85 */                return null;
                    }
/* 23 */            ((ec0) this.f2932b).getClass();
/* 28 */            tz1 tz1Var = (tz1) this.f2933c;
/* 32 */            ec0 ec0Var = (ec0) this.f2932b;
/* 36 */            Context context = (Context) this.f2931a;
/* 38 */            if (tz1Var == null) {
                        return m1697b() ? new gf3(ec0Var, context) : new C0882ej(ec0Var, context);
                    }
/* 42 */            tz1 tz1Var2 = (tz1) this.f2933c;
                    return m1697b() ? new gf3(ec0Var, context, tz1Var2) : new C0882ej(ec0Var, context, tz1Var2);
                }

                /* JADX INFO: renamed from: b */
                public boolean m1697b() {
/* 3 */             Context context = (Context) this.f2931a;
                    try {
/* 24 */                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
                    } catch (Exception e) {
/* 34 */                zze.zzm("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
/* 5 */                 return false;
                    }
                }
            }
