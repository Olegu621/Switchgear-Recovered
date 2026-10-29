            package p000;

            import com.usercentrics.sdk.p009v2.settings.data.TCF2Settings;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageTCF;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kk2 extends d10 {

                /* JADX INFO: renamed from: a */
                public qk2 f12857a;

                /* JADX INFO: renamed from: b */
                public TCF2Settings f12858b;

                /* JADX INFO: renamed from: c */
                public StorageTCF f12859c;

                /* JADX INFO: renamed from: d */
                public wp0 f12860d;

                /* JADX INFO: renamed from: e */
                public /* synthetic */ Object f12861e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ qk2 f12862f;

                /* JADX INFO: renamed from: i */
                public int f12863i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public kk2(qk2 qk2Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f12862f = qk2Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws C0900f0 {
/* 1 */             this.f12861e = obj;
/* 8 */             this.f12863i |= Integer.MIN_VALUE;
/* 13 */            Object objM7931n = this.f12862f.m7931n(null, null, this);
                    return objM7931n == z10.f19902a ? objM7931n : new o42(objM7931n);
                }
            }
