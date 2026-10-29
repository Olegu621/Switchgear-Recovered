            package p000;

            import android.os.Bundle;
            import com.google.android.gms.internal.play_billing.zzad;
            import com.google.android.gms.internal.play_billing.zze;
            import org.json.JSONException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qe3 extends zzad {

                /* JADX INFO: renamed from: a */
                public final C2076pn f15506a;

                /* JADX INFO: renamed from: b */
                public final jf3 f15507b;

                /* JADX INFO: renamed from: c */
                public final int f15508c;

                public /* synthetic */ qe3(C2076pn c2076pn, we2 we2Var, int i) {
/* 4 */             this.f15506a = c2076pn;
/* 6 */             this.f15507b = we2Var;
/* 8 */             this.f15508c = i;
                }

                @Override // com.google.android.gms.internal.play_billing.zzae
                public final void zza(Bundle bundle) {
/* 2 */             int i = this.f15508c;
/* 6 */             jf3 jf3Var = this.f15507b;
/* 8 */             C2076pn c2076pn = this.f15506a;
/* 10 */            if (bundle == null) {
/* 12 */                C1833kj c1833kj = kf3.f12730h;
/* 22 */                ((we2) jf3Var).m9570u(if3.m4524b(63, 13, c1833kj), i);
/* 25 */                c2076pn.m7497g(c1833kj, null);
/* 28 */                return;
                    }
/* 31 */            int iZzb = zze.zzb(bundle, "BillingClient");
/* 35 */            String strZzh = zze.zzh(bundle, "BillingClient");
/* 39 */            C1795jj c1795jjM6120a = C1833kj.m6120a();
/* 43 */            c1795jjM6120a.f12324a = iZzb;
/* 45 */            c1795jjM6120a.f12325b = strZzh;
/* 47 */            if (iZzb != 0) {
/* 63 */                zze.zzl("BillingClient", "getBillingConfig() failed. Response code: " + iZzb);
/* 66 */                C1833kj c1833kjM5841a = c1795jjM6120a.m5841a();
/* 78 */                ((we2) jf3Var).m9570u(if3.m4524b(23, 13, c1833kjM5841a), i);
/* 81 */                c2076pn.m7497g(c1833kjM5841a, null);
/* 84 */                return;
                    }
/* 91 */            if (!bundle.containsKey("BILLING_CONFIG")) {
/* 95 */                zze.zzl("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
/* 99 */                c1795jjM6120a.f12324a = 6;
/* 101 */               C1833kj c1833kjM5841a2 = c1795jjM6120a.m5841a();
/* 113 */               ((we2) jf3Var).m9570u(if3.m4524b(64, 13, c1833kjM5841a2), i);
/* 116 */               c2076pn.m7497g(c1833kjM5841a2, null);
/* 119 */               return;
                    }
                    try {
/* 133 */               c2076pn.m7497g(c1795jjM6120a.m5841a(), new C0956gj(bundle.getString("BILLING_CONFIG")));
                    } catch (JSONException e) {
/* 140 */               zze.zzm("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e);
/* 143 */               C1833kj c1833kj2 = kf3.f12730h;
/* 153 */               ((we2) jf3Var).m9570u(if3.m4524b(65, 13, c1833kj2), i);
/* 156 */               c2076pn.m7497g(c1833kj2, null);
                    }
                }
            }
