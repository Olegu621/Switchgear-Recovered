            package p000;

            import android.hardware.camera2.params.InputConfiguration;
            import android.util.ArrayMap;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fb2 {

                /* JADX INFO: renamed from: i */
                public static final List f8113i = Arrays.asList(1, 5, 3);

                /* JADX INFO: renamed from: a */
                public final ArrayList f8114a;

                /* JADX INFO: renamed from: b */
                public final C1926mg f8115b;

                /* JADX INFO: renamed from: c */
                public final List f8116c;

                /* JADX INFO: renamed from: d */
                public final List f8117d;

                /* JADX INFO: renamed from: e */
                public final List f8118e;

                /* JADX INFO: renamed from: f */
                public final db2 f8119f;

                /* JADX INFO: renamed from: g */
                public final C1803jr f8120g;

                /* JADX INFO: renamed from: h */
                public final InputConfiguration f8121h;

                public fb2(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C1803jr c1803jr, db2 db2Var, InputConfiguration inputConfiguration, C1926mg c1926mg) {
/* 4 */             this.f8114a = arrayList;
/* 10 */            this.f8116c = Collections.unmodifiableList(arrayList2);
/* 16 */            this.f8117d = Collections.unmodifiableList(arrayList3);
/* 22 */            this.f8118e = Collections.unmodifiableList(arrayList4);
/* 24 */            this.f8119f = db2Var;
/* 26 */            this.f8120g = c1803jr;
/* 28 */            this.f8121h = inputConfiguration;
/* 30 */            this.f8115b = c1926mg;
                }

                /* JADX INFO: renamed from: a */
                public static fb2 m3701a() {
/* 5 */             ArrayList arrayList = new ArrayList();
/* 11 */            ArrayList arrayList2 = new ArrayList(0);
/* 16 */            ArrayList arrayList3 = new ArrayList(0);
/* 22 */            ArrayList arrayList4 = new ArrayList(0);
/* 27 */            HashSet hashSet = new HashSet();
/* 30 */            uk1 uk1VarM9034j = uk1.m9034j();
/* 36 */            ArrayList arrayList5 = new ArrayList();
/* 39 */            cl1 cl1VarM1721a = cl1.m1721a();
/* 47 */            ArrayList arrayList6 = new ArrayList(hashSet);
/* 50 */            nq1 nq1VarM7021d = nq1.m7021d(uk1VarM9034j);
/* 56 */            ArrayList arrayList7 = new ArrayList(arrayList5);
/* 59 */            nm2 nm2Var = nm2.f14382b;
/* 63 */            ArrayMap arrayMap = new ArrayMap();
/* 66 */            ArrayMap arrayMap2 = cl1VarM1721a.f14383a;
/* 80 */            for (String str : arrayMap2.keySet()) {
/* 92 */                arrayMap.put(str, arrayMap2.get(str));
                    }
/* 113 */           return new fb2(arrayList, arrayList2, arrayList3, arrayList4, new C1803jr(arrayList6, nq1VarM7021d, -1, arrayList7, false, new nm2(arrayMap), null), null, null, null);
                }

                /* JADX INFO: renamed from: b */
                public final List m3702b() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 16 */            for (C1926mg c1926mg : this.f8114a) {
/* 26 */                arrayList.add(c1926mg.f13750a);
/* 31 */                Iterator it = c1926mg.f13751b.iterator();
/* 39 */                while (it.hasNext()) {
/* 47 */                    arrayList.add((d70) it.next());
                        }
                    }
/* 51 */            return Collections.unmodifiableList(arrayList);
                }
            }
