            package p000;

            import com.google.android.gms.internal.measurement.zzc;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ri3 extends ua1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ vi3 f16085a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ri3(vi3 vi3Var) {
/* 5 */             super(20);
/* 1 */             this.f16085a = vi3Var;
                }

                @Override // p000.ua1
                public final Object create(Object obj) throws Throwable {
/* 1 */             String str = (String) obj;
/* 3 */             kb1.m6058k(str);
/* 6 */             vi3 vi3Var = this.f16085a;
/* 8 */             vi3Var.m9593A();
/* 11 */            kb1.m6058k(str);
/* 16 */            ae3 ae3Var = vi3Var.f15676b.f13913c;
/* 18 */            mp3.m6728S(ae3Var);
/* 21 */            ac1 ac1VarM227H0 = ae3Var.m227H0(str);
/* 25 */            if (ac1VarM227H0 == null) {
/* 27 */                return null;
                    }
/* 33 */            uh3 uh3Var = ((ij3) vi3Var.f16749a).f9655f;
/* 35 */            ij3.m4555l(uh3Var);
/* 42 */            uh3Var.f17534Y.m8511b(str, "Populate EES config from database on cache miss. appId");
/* 53 */            vi3Var.m9284H(str, vi3Var.m9285I(str, (byte[]) ac1VarM227H0.f177b));
/* 66 */            return (zzc) vi3Var.f18206U.snapshot().get(str);
                }
            }
