            package p000;

            import android.view.View;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class g53 implements j53 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean f8476a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f8477b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f8478c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ gr0 f8479d;

                public g53(boolean z, boolean z2, boolean z3, gr0 gr0Var) {
/* 4 */             this.f8476a = z;
/* 6 */             this.f8477b = z2;
/* 8 */             this.f8478c = z3;
/* 10 */            this.f8479d = gr0Var;
                }

                @Override // p000.j53
                /* JADX INFO: renamed from: p */
                public final m83 mo3876p(View view, m83 m83Var, k53 k53Var) {
/* 3 */             if (this.f8476a) {
/* 12 */                k53Var.f12608d = m83Var.m6621a() + k53Var.f12608d;
                    }
/* 14 */            boolean zM6036J = kb1.m6036J(view);
/* 20 */            if (this.f8477b) {
/* 22 */                if (zM6036J) {
/* 31 */                    k53Var.f12607c = m83Var.m6622b() + k53Var.f12607c;
                        } else {
/* 41 */                    k53Var.f12605a = m83Var.m6622b() + k53Var.f12605a;
                        }
                    }
/* 45 */            if (this.f8478c) {
/* 47 */                if (zM6036J) {
/* 56 */                    k53Var.f12605a = m83Var.m6623c() + k53Var.f12605a;
                        } else {
/* 66 */                    k53Var.f12607c = m83Var.m6623c() + k53Var.f12607c;
                        }
                    }
/* 68 */            int i = k53Var.f12605a;
/* 70 */            int i2 = k53Var.f12606b;
/* 72 */            int i3 = k53Var.f12607c;
/* 74 */            int i4 = k53Var.f12608d;
/* 76 */            WeakHashMap weakHashMap = e33.f7494a;
/* 78 */            view.setPaddingRelative(i, i2, i3, i4);
/* 83 */            this.f8479d.mo3876p(view, m83Var, k53Var);
/* 86 */            return m83Var;
                }
            }
