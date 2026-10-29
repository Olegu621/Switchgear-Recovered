            package p000;

            import android.content.Context;
            import android.view.View;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.widget.C0062b;
            
            /* JADX INFO: renamed from: d2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 47 */    public final class C0829d2 extends zg1 {

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ int f6961l = 0;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ C0062b f6962m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0829d2(C0062b c0062b, Context context, hi2 hi2Var, View view) {
/* 14 */            super(context, hi2Var, view, false, R$attr.actionOverflowMenuStyle, 0);
/* 4 */             this.f6962m = c0062b;
/* 24 */            if ((hi2Var.f9089B.f16606x & 32) != 32) {
/* 27 */                View view2 = c0062b.f738U;
/* 35 */                this.f20140e = view2 == null ? (View) c0062b.f9611v : view2;
                    }
/* 37 */            d52 d52Var = c0062b.f752i0;
/* 39 */            this.f20143h = d52Var;
/* 41 */            xg1 xg1Var = this.f20144i;
/* 43 */            if (xg1Var != null) {
/* 45 */                xg1Var.mo3431h(d52Var);
                    }
                }

                @Override // p000.zg1
                /* JADX INFO: renamed from: c */
                public final void mo2910c() {
/* 1 */             int i = this.f6961l;
/* 4 */             C0062b c0062b = this.f6962m;
                    switch (i) {
                        case 0:
/* 23 */                    c0062b.f749f0 = null;
/* 26 */                    c0062b.f753j0 = 0;
/* 28 */                    super.mo2910c();
                            break;
                        default:
/* 9 */                     jg1 jg1Var = c0062b.f9606c;
/* 11 */                    if (jg1Var != null) {
/* 14 */                        jg1Var.m5803c(true);
                            }
/* 17 */                    c0062b.f748e0 = null;
/* 19 */                    super.mo2910c();
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 48 */        public C0829d2(C0062b c0062b, Context context, jg1 jg1Var, View view) {
/* 51 */            super(context, jg1Var, view, true, R$attr.actionOverflowMenuStyle, 0);
/* 49 */            this.f6962m = c0062b;
/* 52 */            this.f20141f = 8388613;
/* 53 */            d52 d52Var = c0062b.f752i0;
/* 54 */            this.f20143h = d52Var;
/* 55 */            xg1 xg1Var = this.f20144i;
                    if (xg1Var != null) {
/* 56 */                xg1Var.mo3431h(d52Var);
                    }
                }
            }
