            package p000;

            import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xb2 extends d10 {

                /* JADX INFO: renamed from: a */
                public yb2 f19015a;

                /* JADX INFO: renamed from: b */
                public SettingsInitializationParameters f19016b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f19017c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ yb2 f19018d;

                /* JADX INFO: renamed from: e */
                public int f19019e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public xb2(yb2 yb2Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f19018d = yb2Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f19017c = obj;
/* 8 */             this.f19019e |= Integer.MIN_VALUE;
/* 13 */            Object objM10139a = this.f19018d.m10139a(null, this);
                    return objM10139a == z10.f19902a ? objM10139a : new o42(objM10139a);
                }
            }
