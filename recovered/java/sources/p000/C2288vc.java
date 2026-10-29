            package p000;
            
            /* JADX INFO: renamed from: vc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2288vc {

                /* JADX INFO: renamed from: s */
                public static final double[] f17959s = new double[91];

                /* JADX INFO: renamed from: a */
                public double[] f17960a;

                /* JADX INFO: renamed from: b */
                public double f17961b;

                /* JADX INFO: renamed from: c */
                public double f17962c;

                /* JADX INFO: renamed from: d */
                public double f17963d;

                /* JADX INFO: renamed from: e */
                public double f17964e;

                /* JADX INFO: renamed from: f */
                public double f17965f;

                /* JADX INFO: renamed from: g */
                public double f17966g;

                /* JADX INFO: renamed from: h */
                public double f17967h;

                /* JADX INFO: renamed from: i */
                public double f17968i;

                /* JADX INFO: renamed from: j */
                public double f17969j;

                /* JADX INFO: renamed from: k */
                public double f17970k;

                /* JADX INFO: renamed from: l */
                public double f17971l;

                /* JADX INFO: renamed from: m */
                public double f17972m;

                /* JADX INFO: renamed from: n */
                public double f17973n;

                /* JADX INFO: renamed from: o */
                public double f17974o;

                /* JADX INFO: renamed from: p */
                public double f17975p;

                /* JADX INFO: renamed from: q */
                public boolean f17976q;

                /* JADX INFO: renamed from: r */
                public boolean f17977r;

                /* JADX INFO: renamed from: a */
                public final double m9244a() {
/* 5 */             double d = this.f17969j * this.f17975p;
/* 18 */            double dHypot = this.f17973n / Math.hypot(d, (-this.f17970k) * this.f17974o);
                    return this.f17976q ? (-d) * dHypot : d * dHypot;
                }

                /* JADX INFO: renamed from: b */
                public final double m9245b() {
/* 5 */             double d = this.f17969j * this.f17975p;
/* 11 */            double d2 = (-this.f17970k) * this.f17974o;
/* 18 */            double dHypot = this.f17973n / Math.hypot(d, d2);
                    return this.f17976q ? (-d2) * dHypot : d2 * dHypot;
                }

                /* JADX INFO: renamed from: c */
                public final double m9246c(double d) {
/* 6 */             double d2 = (d - this.f17962c) * this.f17968i;
/* 7 */             double d3 = this.f17964e;
/* 13 */            return ((this.f17965f - d3) * d2) + d3;
                }

                /* JADX INFO: renamed from: d */
                public final double m9247d(double d) {
/* 6 */             double d2 = (d - this.f17962c) * this.f17968i;
/* 7 */             double d3 = this.f17966g;
/* 13 */            return ((this.f17967h - d3) * d2) + d3;
                }

                /* JADX INFO: renamed from: e */
                public final double m9248e() {
/* 8 */             return (this.f17969j * this.f17974o) + this.f17971l;
                }

                /* JADX INFO: renamed from: f */
                public final double m9249f() {
/* 8 */             return (this.f17970k * this.f17975p) + this.f17972m;
                }

                /* JADX INFO: renamed from: g */
                public final void m9250g(double d) {
/* 15 */            double d2 = (this.f17976q ? this.f17963d - d : d - this.f17962c) * this.f17968i;
/* 16 */            double d3 = 0.0d;
/* 20 */            if (d2 > 0.0d) {
/* 23 */                d3 = 1.0d;
/* 27 */                if (d2 < 1.0d) {
/* 30 */                    double[] dArr = this.f17960a;
/* 36 */                    double length = d2 * ((double) (dArr.length - 1));
/* 37 */                    int i = (int) length;
/* 40 */                    double d4 = dArr[i];
/* 48 */                    d3 = ((dArr[i + 1] - d4) * (length - ((double) i))) + d4;
                        }
                    }
/* 55 */            double d5 = d3 * 1.5707963267948966d;
/* 60 */            this.f17974o = Math.sin(d5);
/* 66 */            this.f17975p = Math.cos(d5);
                }
            }
