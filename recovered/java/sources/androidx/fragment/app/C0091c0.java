            package androidx.fragment.app;

            import android.view.ViewGroup;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Objects;
            import kotlin.collections.CollectionsKt;
            import p000.AbstractC0886en;
            import p000.wf2;
            
            /* JADX INFO: renamed from: androidx.fragment.app.c0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0091c0 {

                /* JADX INFO: renamed from: a */
                public int f1408a;

                /* JADX INFO: renamed from: b */
                public int f1409b;

                /* JADX INFO: renamed from: c */
                public final Fragment f1410c;

                /* JADX INFO: renamed from: d */
                public final ArrayList f1411d;

                /* JADX INFO: renamed from: e */
                public boolean f1412e;

                /* JADX INFO: renamed from: f */
                public boolean f1413f;

                /* JADX INFO: renamed from: g */
                public boolean f1414g;

                /* JADX INFO: renamed from: h */
                public boolean f1415h;

                /* JADX INFO: renamed from: i */
                public boolean f1416i;

                /* JADX INFO: renamed from: j */
                public final ArrayList f1417j;

                /* JADX INFO: renamed from: k */
                public final ArrayList f1418k;

                /* JADX INFO: renamed from: l */
                public final C0113y f1419l;

                public C0091c0(int i, int i2, C0113y c0113y) {
/* 2 */             if (i == 0 || i2 == 0) {
/* 51 */                throw null;
                    }
/* 6 */             Fragment fragment = c0113y.f1526c;
/* 8 */             fragment.getClass();
/* 11 */            if (i == 0 || i2 == 0) {
/* 49 */                throw null;
                    }
/* 15 */            fragment.getClass();
/* 21 */            this.f1408a = i;
/* 23 */            this.f1409b = i2;
/* 25 */            this.f1410c = fragment;
/* 32 */            this.f1411d = new ArrayList();
/* 35 */            this.f1416i = true;
/* 39 */            ArrayList arrayList = new ArrayList();
/* 42 */            this.f1417j = arrayList;
/* 44 */            this.f1418k = arrayList;
/* 46 */            this.f1419l = c0113y;
                }

                /* JADX INFO: renamed from: a */
                public final void m643a(ViewGroup viewGroup) {
/* 1 */             viewGroup.getClass();
/* 5 */             this.f1415h = false;
/* 9 */             if (this.f1412e) {
/* 62 */                return;
                    }
/* 13 */            this.f1412e = true;
/* 21 */            if (this.f1417j.isEmpty()) {
/* 23 */                m644b();
/* 26 */                return;
                    }
/* 41 */            for (wf2 wf2Var : CollectionsKt.m6192K(this.f1418k)) {
/* 49 */                wf2Var.getClass();
/* 54 */                if (!wf2Var.f18607b) {
/* 56 */                    wf2Var.mo641b(viewGroup);
                        }
/* 59 */                wf2Var.f18607b = true;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m644b() {
/* 2 */             this.f1415h = false;
/* 6 */             if (!this.f1413f) {
/* 14 */                if (AbstractC0111w.m674K(2)) {
/* 16 */                    toString();
                        }
/* 20 */                this.f1413f = true;
/* 24 */                Iterator it = this.f1411d.iterator();
/* 32 */                while (it.hasNext()) {
/* 40 */                    ((Runnable) it.next()).run();
                        }
                    }
/* 46 */            this.f1410c.mTransitioning = false;
/* 50 */            this.f1419l.m741i();
                }

                /* JADX INFO: renamed from: c */
                public final void m645c(wf2 wf2Var) {
/* 1 */             wf2Var.getClass();
/* 4 */             ArrayList arrayList = this.f1417j;
/* 10 */            if (arrayList.remove(wf2Var) && arrayList.isEmpty()) {
/* 18 */                m644b();
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m646d(int i, int i2) {
/* 2 */             if (i == 0 || i2 == 0) {
/* 74 */                throw null;
                    }
/* 6 */             int iM3520y = AbstractC0886en.m3520y(i2);
/* 10 */            Fragment fragment = this.f1410c;
/* 14 */            if (iM3520y == 0) {
/* 60 */                if (this.f1408a != 1) {
/* 66 */                    if (AbstractC0111w.m674K(2)) {
/* 68 */                        Objects.toString(fragment);
                            }
/* 71 */                    this.f1408a = i;
/* 73 */                    return;
                        }
/* 73 */                return;
                    }
/* 16 */            if (iM3520y != 1) {
/* 18 */                if (iM3520y != 2) {
/* 73 */                    return;
                        }
/* 25 */                if (AbstractC0111w.m674K(2)) {
/* 27 */                    Objects.toString(fragment);
                        }
/* 30 */                this.f1408a = 1;
/* 33 */                this.f1409b = 3;
/* 35 */                this.f1416i = true;
/* 37 */                return;
                    }
/* 40 */            if (this.f1408a == 1) {
/* 46 */                if (AbstractC0111w.m674K(2)) {
/* 48 */                    Objects.toString(fragment);
                        }
/* 51 */                this.f1408a = 2;
/* 53 */                this.f1409b = 2;
/* 55 */                this.f1416i = true;
                    }
                }

                public final String toString() {
                    String str;
/* 13 */            StringBuilder sbM3513q = AbstractC0886en.m3513q("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
/* 17 */            int i = this.f1408a;
/* 19 */            String str2 = "null";
/* 24 */            if (i == 1) {
/* 44 */                str = "REMOVED";
                    } else if (i == 2) {
/* 41 */                str = "VISIBLE";
                    } else if (i != 3) {
/* 35 */                str = i != 4 ? "null" : "INVISIBLE";
                    } else {
/* 38 */                str = "GONE";
                    }
/* 46 */            sbM3513q.append(str);
/* 51 */            sbM3513q.append(" lifecycleImpact = ");
/* 54 */            int i2 = this.f1409b;
/* 56 */            if (i2 == 1) {
/* 69 */                str2 = "NONE";
                    } else if (i2 == 2) {
/* 66 */                str2 = "ADDING";
                    } else if (i2 == 3) {
/* 63 */                str2 = "REMOVING";
                    }
/* 71 */            sbM3513q.append(str2);
/* 76 */            sbM3513q.append(" fragment = ");
/* 81 */            sbM3513q.append(this.f1410c);
/* 86 */            sbM3513q.append('}');
/* 89 */            return sbM3513q.toString();
                }
            }
