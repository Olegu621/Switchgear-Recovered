            package p000;

            import java.util.Date;
            import java.util.LinkedHashSet;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tf1 {

                /* JADX INFO: renamed from: a */
                public final Function0 f17065a;

                /* JADX INFO: renamed from: b */
                public Date f17066b;

                /* JADX INFO: renamed from: c */
                public Date f17067c;

                /* JADX INFO: renamed from: d */
                public Double f17068d;

                /* JADX INFO: renamed from: e */
                public long f17069e;

                /* JADX INFO: renamed from: f */
                public final LinkedHashSet f17070f;

                /* JADX INFO: renamed from: g */
                public y91 f17071g;

                /* JADX INFO: renamed from: h */
                public long f17072h;

                /* JADX INFO: renamed from: i */
                public long f17073i;

                /* JADX INFO: renamed from: j */
                public long f17074j;

                /* JADX INFO: renamed from: k */
                public long f17075k;

                /* JADX INFO: renamed from: l */
                public long f17076l;

                /* JADX INFO: renamed from: m */
                public int f17077m;

                /* JADX INFO: renamed from: n */
                public int f17078n;

                /* JADX INFO: renamed from: o */
                public int f17079o;

                /* JADX INFO: renamed from: p */
                public int f17080p;

                public tf1(ac1 ac1Var, Function0 function0) {
/* 4 */             this.f17065a = function0;
/* 8 */             fb0.f8059b.getClass();
/* 13 */            this.f17069e = 0L;
/* 20 */            this.f17070f = new LinkedHashSet();
/* 22 */            this.f17072h = 0L;
/* 24 */            this.f17073i = 0L;
/* 26 */            this.f17074j = 0L;
/* 28 */            this.f17075k = 0L;
/* 30 */            this.f17076l = 0L;
                }

                /* JADX INFO: renamed from: b */
                public static long m8786b(Date date, Date date2) {
/* 12 */            return mn0.m6681E(date2.getTime() - date.getTime(), ib0.MILLISECONDS);
                }

                /* JADX INFO: renamed from: a */
                public final double m8787a() {
/* 1 */             long j = this.f17073i;
/* 5 */             fb0.f8059b.getClass();
/* 14 */            if (fb0.m3687c(j, 0L) <= 0) {
/* 46 */                return 1.0d;
                    }
/* 16 */            long j2 = this.f17069e;
/* 18 */            long j3 = this.f17073i;
/* 20 */            ib0 ib0VarM3689e = fb0.m3689e(j2);
/* 24 */            ib0 ib0VarM3689e2 = fb0.m3689e(j3);
/* 32 */            if (ib0VarM3689e.compareTo(ib0VarM3689e2) < 0) {
/* 35 */                ib0VarM3689e = ib0VarM3689e2;
                    }
/* 44 */            return fb0.m3693i(j2, ib0VarM3689e) / fb0.m3693i(j3, ib0VarM3689e);
                }
            }
