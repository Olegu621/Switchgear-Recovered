            package p000;

            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class k73 {

                /* JADX INFO: renamed from: f */
                public static int f12637f;

                /* JADX INFO: renamed from: a */
                public ArrayList f12638a;

                /* JADX INFO: renamed from: b */
                public int f12639b;

                /* JADX INFO: renamed from: c */
                public int f12640c;

                /* JADX INFO: renamed from: d */
                public ArrayList f12641d;

                /* JADX INFO: renamed from: e */
                public int f12642e;

                /* JADX INFO: renamed from: a */
                public final void m6000a(ArrayList arrayList) {
/* 3 */             int size = this.f12638a.size();
/* 10 */            if (this.f12642e != -1 && size > 0) {
/* 19 */                for (int i = 0; i < arrayList.size(); i++) {
/* 25 */                    k73 k73Var = (k73) arrayList.get(i);
/* 31 */                    if (this.f12642e == k73Var.f12639b) {
/* 35 */                        m6002c(this.f12640c, k73Var);
                            }
                        }
                    }
/* 41 */            if (size == 0) {
/* 43 */                arrayList.remove(this);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final int m6001b(t71 t71Var, int i) {
                    int iM8705n;
                    int iM8705n2;
/* 1 */             ArrayList arrayList = this.f12638a;
/* 8 */             if (arrayList.size() == 0) {
/* 7 */                 return 0;
                    }
/* 19 */            a00 a00Var = (a00) ((C2569zz) arrayList.get(0)).f20416V;
/* 21 */            t71Var.m8724t();
/* 24 */            a00Var.mo1427b(t71Var, false);
/* 32 */            for (int i2 = 0; i2 < arrayList.size(); i2++) {
/* 40 */                ((C2569zz) arrayList.get(i2)).mo1427b(t71Var, false);
                    }
/* 46 */            if (i == 0 && a00Var.f4D0 > 0) {
/* 52 */                b40.m1219c(a00Var, t71Var, arrayList, 0);
                    }
/* 56 */            if (i == 1 && a00Var.f5E0 > 0) {
/* 62 */                b40.m1219c(a00Var, t71Var, arrayList, 1);
                    }
                    try {
/* 65 */                t71Var.m8720p();
                    } catch (Exception e) {
/* 70 */                e.printStackTrace();
                    }
/* 78 */            this.f12641d = new ArrayList();
/* 84 */            for (int i3 = 0; i3 < arrayList.size(); i3++) {
/* 90 */                C2569zz c2569zz = (C2569zz) arrayList.get(i3);
/* 96 */                p62 p62Var = new p62(10);
/* 101 */               new WeakReference(c2569zz);
/* 106 */               t71.m8705n(c2569zz.f20404J);
/* 111 */               t71.m8705n(c2569zz.f20405K);
/* 116 */               t71.m8705n(c2569zz.f20406L);
/* 121 */               t71.m8705n(c2569zz.f20407M);
/* 126 */               t71.m8705n(c2569zz.f20408N);
/* 131 */               this.f12641d.add(p62Var);
                    }
/* 137 */           if (i == 0) {
/* 141 */               iM8705n = t71.m8705n(a00Var.f20404J);
/* 147 */               iM8705n2 = t71.m8705n(a00Var.f20406L);
/* 151 */               t71Var.m8724t();
                    } else {
/* 158 */               iM8705n = t71.m8705n(a00Var.f20405K);
/* 164 */               iM8705n2 = t71.m8705n(a00Var.f20407M);
/* 168 */               t71Var.m8724t();
                    }
/* 154 */           return iM8705n2 - iM8705n;
                }

                /* JADX INFO: renamed from: c */
                public final void m6002c(int i, k73 k73Var) {
/* 1 */             int i2 = k73Var.f12639b;
/* 13 */            for (C2569zz c2569zz : this.f12638a) {
/* 21 */                ArrayList arrayList = k73Var.f12638a;
/* 27 */                if (!arrayList.contains(c2569zz)) {
/* 30 */                    arrayList.add(c2569zz);
                        }
/* 33 */                if (i == 0) {
/* 35 */                    c2569zz.f20458s0 = i2;
                        } else {
/* 38 */                    c2569zz.f20460t0 = i2;
                        }
                    }
/* 41 */            this.f12642e = i2;
                }

                public final String toString() {
                    String str;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             int i = this.f12640c;
/* 8 */             if (i == 0) {
/* 10 */                str = "Horizontal";
                    } else if (i == 1) {
/* 16 */                str = "Vertical";
                    } else {
/* 25 */                str = i == 2 ? "Both" : "Unknown";
                    }
/* 27 */            sb.append(str);
/* 32 */            sb.append(" [");
/* 39 */            String strM3786l = fm0.m3786l(sb, this.f12639b, "] <");
/* 53 */            for (C2569zz c2569zz : this.f12638a) {
/* 63 */                StringBuilder sbM3794t = fm0.m3794t(strM3786l, " ");
/* 69 */                sbM3794t.append(c2569zz.f20442k0);
/* 72 */                strM3786l = sbM3794t.toString();
                    }
/* 79 */            return strM3786l.concat(" >");
                }
            }
