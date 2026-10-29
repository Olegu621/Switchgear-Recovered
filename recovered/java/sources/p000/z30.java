            package p000;

            import android.net.Uri;
            import com.google.android.gms.common.data.DataHolder;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class z30 {

                /* JADX INFO: renamed from: a */
                public final DataHolder f19921a;

                /* JADX INFO: renamed from: b */
                public final int f19922b;

                /* JADX INFO: renamed from: c */
                public final int f19923c;

                public z30(DataHolder dataHolder, int i) {
/* 4 */             kb1.m6061n(dataHolder);
/* 7 */             this.f19921a = dataHolder;
/* 9 */             boolean z = false;
/* 10 */            if (i >= 0 && i < dataHolder.f3470v) {
/* 16 */                z = true;
                    }
/* 17 */            kb1.m6065r(z);
/* 20 */            this.f19922b = i;
/* 26 */            this.f19923c = dataHolder.m2016H1(i);
                }

                /* JADX INFO: renamed from: a */
                public final boolean m10266a(String str) {
/* 7 */             return this.f19921a.m2012D1(this.f19922b, this.f19923c, str);
                }

                /* JADX INFO: renamed from: b */
                public final float m10267b(String str) {
/* 1 */             DataHolder dataHolder = this.f19921a;
/* 3 */             int i = this.f19922b;
/* 5 */             dataHolder.m2017I1(i, str);
/* 20 */            return dataHolder.f3466d[this.f19923c].getFloat(i, dataHolder.f3465c.getInt(str));
                }

                /* JADX INFO: renamed from: d */
                public final int m10268d(String str) {
/* 7 */             return this.f19921a.m2013E1(this.f19922b, this.f19923c, str);
                }

                /* JADX INFO: renamed from: e */
                public final long m10269e(String str) {
/* 7 */             return this.f19921a.m2014F1(this.f19922b, this.f19923c, str);
                }

                public boolean equals(Object obj) {
/* 4 */             if (obj instanceof z30) {
/* 6 */                 z30 z30Var = (z30) obj;
/* 24 */                if (de3.m3029k(Integer.valueOf(z30Var.f19922b), Integer.valueOf(this.f19922b)) && de3.m3029k(Integer.valueOf(z30Var.f19923c), Integer.valueOf(this.f19923c)) && z30Var.f19921a == this.f19921a) {
/* 50 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public int hashCode() {
/* 19 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19922b), Integer.valueOf(this.f19923c), this.f19921a});
                }

                /* JADX INFO: renamed from: j */
                public final String m10270j(String str) {
/* 7 */             return this.f19921a.m2015G1(this.f19922b, this.f19923c, str);
                }

                /* JADX INFO: renamed from: r */
                public final boolean m10271r(String str) {
/* 5 */             return this.f19921a.f3465c.containsKey(str);
                }

                /* JADX INFO: renamed from: u */
                public final boolean m10272u(String str) {
/* 1 */             DataHolder dataHolder = this.f19921a;
/* 3 */             int i = this.f19922b;
/* 5 */             dataHolder.m2017I1(i, str);
/* 20 */            return dataHolder.f3466d[this.f19923c].isNull(i, dataHolder.f3465c.getInt(str));
                }

                /* JADX INFO: renamed from: w */
                public final Uri m10273w(String str) {
/* 7 */             String strM2015G1 = this.f19921a.m2015G1(this.f19922b, this.f19923c, str);
/* 11 */            if (strM2015G1 == null) {
/* 13 */                return null;
                    }
/* 15 */            return Uri.parse(strM2015G1);
                }
            }
