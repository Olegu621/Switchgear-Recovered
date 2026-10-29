            package p000;

            import com.usercentrics.sdk.services.deviceStorage.models.StorageTCF;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lk2 extends d10 {

                /* JADX INFO: renamed from: a */
                public qk2 f13360a;

                /* JADX INFO: renamed from: b */
                public String f13361b;

                /* JADX INFO: renamed from: c */
                public StorageTCF f13362c;

                /* JADX INFO: renamed from: d */
                public /* synthetic */ Object f13363d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ qk2 f13364e;

                /* JADX INFO: renamed from: f */
                public int f13365f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public lk2(qk2 qk2Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f13364e = qk2Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f13363d = obj;
/* 8 */             this.f13365f |= Integer.MIN_VALUE;
/* 13 */            Object objM7932o = this.f13364e.m7932o(null, this);
                    return objM7932o == z10.f19902a ? objM7932o : new o42(objM7932o);
                }
            }
