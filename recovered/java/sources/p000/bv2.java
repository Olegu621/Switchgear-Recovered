            package p000;

            import com.usercentrics.sdk.p008ui.components.UCImageView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bv2 extends d10 {

                /* JADX INFO: renamed from: a */
                public UCImageView f2617a;

                /* JADX INFO: renamed from: b */
                public String f2618b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f2619c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ UCImageView f2620d;

                /* JADX INFO: renamed from: e */
                public int f2621e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public bv2(UCImageView uCImageView, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f2620d = uCImageView;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f2619c = obj;
/* 8 */             this.f2621e |= Integer.MIN_VALUE;
/* 13 */            return UCImageView.m2792f(this.f2620d, null, null, this);
                }
            }
