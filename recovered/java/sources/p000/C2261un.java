            package p000;

            import android.os.SystemClock;
            import io.sentry.android.core.anr.C1172f;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: renamed from: un */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 102 */   public final class C2261un {

                /* JADX INFO: renamed from: a */
                public final long f17600a;

                /* JADX INFO: renamed from: b */
                public long f17601b;

                /* JADX INFO: renamed from: c */
                public final Object f17602c;

                public C2261un(List list) {
/* 13 */            this.f17602c = new ArrayList(list.size());
/* 15 */            Iterator it = list.iterator();
/* 23 */            while (it.hasNext()) {
/* 29 */                C1172f c1172f = (C1172f) it.next();
/* 31 */                if (c1172f != null) {
/* 37 */                    ((ArrayList) this.f17602c).add(c1172f);
                        }
                    }
/* 45 */            Collections.sort((ArrayList) this.f17602c);
/* 56 */            if (((ArrayList) this.f17602c).isEmpty()) {
/* 99 */                this.f17600a = 0L;
/* 101 */               this.f17601b = 0L;
                    } else {
/* 71 */                this.f17600a = ((C1172f) ((ArrayList) this.f17602c).get(0)).f9962b;
/* 75 */                ArrayList arrayList = (ArrayList) this.f17602c;
/* 94 */                this.f17601b = ((C1172f) arrayList.get(arrayList.size() - 1)).f9962b + 10000;
                    }
                }

                /* JADX INFO: renamed from: a */
                public int m9042a() {
/* 9 */             if (!((C2337wn) this.f17602c).m9588c()) {
/* 11 */                return 700;
                    }
/* 14 */            long jUptimeMillis = SystemClock.uptimeMillis();
/* 24 */            if (this.f17601b == -1) {
/* 26 */                this.f17601b = jUptimeMillis;
                    }
/* 30 */            long j = jUptimeMillis - this.f17601b;
/* 36 */            if (j <= 120000) {
/* 38 */                return 1000;
                    }
                    return j <= 300000 ? 2000 : 4000;
                }

                /* JADX INFO: renamed from: b */
                public int m9043b() {
/* 5 */             boolean zM9588c = ((C2337wn) this.f17602c).m9588c();
/* 11 */            long j = this.f17600a;
/* 13 */            if (zM9588c) {
/* 33 */                if (j > 0) {
/* 36 */                    return Math.min((int) j, 1800000);
                        }
/* 30 */                return 1800000;
                    }
/* 19 */            if (j > 0) {
/* 22 */                return Math.min((int) j, 10000);
                    }
/* 17 */            return 10000;
                }

/* 103 */       public C2261un(long j, long j2, Date date) {
/* 105 */           this.f17600a = j;
/* 106 */           this.f17601b = j2;
/* 107 */           this.f17602c = date;
                }

/* 107 */       public C2261un(C2337wn c2337wn, long j) {
                    this.f17602c = c2337wn;
/* 109 */           this.f17601b = -1L;
/* 110 */           this.f17600a = j;
                }
            }
