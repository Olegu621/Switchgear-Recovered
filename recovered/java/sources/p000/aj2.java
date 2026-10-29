            package p000;

            import android.util.Rational;
            import android.util.Size;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class aj2 {

                /* JADX INFO: renamed from: a */
                public final int f311a;

                /* JADX INFO: renamed from: b */
                public final int f312b;

                /* JADX INFO: renamed from: c */
                public final Rational f313c;

                /* JADX INFO: renamed from: d */
                public final boolean f314d;

                public aj2(InterfaceC2469xp interfaceC2469xp, Rational rational) {
/* 8 */             this.f311a = interfaceC2469xp.mo309a();
/* 14 */            this.f312b = interfaceC2469xp.mo312d();
/* 16 */            this.f313c = rational;
/* 18 */            boolean z = true;
/* 19 */            if (rational != null && rational.getNumerator() < rational.getDenominator()) {
/* 32 */                z = false;
                    }
/* 33 */            this.f314d = z;
                }

                /* JADX INFO: renamed from: a */
                public final Size m296a(jw0 jw0Var) {
/* 1 */             int iM5923s = jw0Var.m5923s();
/* 12 */            Size size = (Size) jw0Var.mo7023b(jw0.f12523u, null);
/* 14 */            if (size != null) {
/* 29 */                int iM9783u = xe2.m9783u(xe2.m9763G(iM5923s), this.f311a, 1 == this.f312b);
/* 35 */                if (iM9783u == 90 || iM9783u == 270) {
/* 51 */                    return new Size(size.getHeight(), size.getWidth());
                        }
                    }
/* 55 */            return size;
                }
            }
