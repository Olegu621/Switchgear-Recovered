            package androidx.recyclerview.widget;

            import android.os.Trace;
            import android.util.SparseArray;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityManager;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.List;
            import java.util.WeakHashMap;
            import okio.Segment;
            import p000.C0193bu;
            import p000.C0875ec;
            import p000.C1771iw;
            import p000.C1951n4;
            import p000.C2164s0;
            import p000.C2201t0;
            import p000.b22;
            import p000.c22;
            import p000.e33;
            import p000.f42;
            import p000.fm0;
            import p000.j60;
            import p000.m12;
            import p000.n12;
            import p000.oq2;
            import p000.pm2;
            import p000.s12;
            import p000.s80;
            import p000.t12;
            import p000.ts0;
            import p000.y12;
            
            /* JADX INFO: renamed from: androidx.recyclerview.widget.l */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0134l {

                /* JADX INFO: renamed from: a */
                public final ArrayList f1768a;

                /* JADX INFO: renamed from: b */
                public ArrayList f1769b;

                /* JADX INFO: renamed from: c */
                public final ArrayList f1770c;

                /* JADX INFO: renamed from: d */
                public final List f1771d;

                /* JADX INFO: renamed from: e */
                public int f1772e;

                /* JADX INFO: renamed from: f */
                public int f1773f;

                /* JADX INFO: renamed from: g */
                public t12 f1774g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ RecyclerView f1775h;

                public C0134l(RecyclerView recyclerView) {
/* 4 */             this.f1775h = recyclerView;
/* 8 */             ArrayList arrayList = new ArrayList();
/* 11 */            this.f1768a = arrayList;
/* 14 */            this.f1769b = null;
/* 21 */            this.f1770c = new ArrayList();
/* 27 */            this.f1771d = Collections.unmodifiableList(arrayList);
/* 30 */            this.f1772e = 2;
/* 32 */            this.f1773f = 2;
                }

                /* JADX INFO: renamed from: a */
                public final void m1004a(AbstractC0137o abstractC0137o, boolean z) {
/* 1 */             RecyclerView.m849j(abstractC0137o);
/* 4 */             View view = abstractC0137o.f1778a;
/* 6 */             RecyclerView recyclerView = this.f1775h;
/* 8 */             c22 c22Var = recyclerView.f1634Y0;
/* 11 */            if (c22Var != null) {
/* 13 */                b22 b22Var = c22Var.f2665e;
/* 29 */                e33.m3318n(view, b22Var != null ? (C2201t0) ((WeakHashMap) b22Var.f2181f).remove(view) : null);
                    }
/* 32 */            if (z) {
/* 34 */                ArrayList arrayList = recyclerView.f1640b0;
/* 40 */                if (arrayList.size() > 0) {
/* 64 */                    throw pm2.m7486i(0, arrayList);
                        }
/* 42 */                AbstractC0129g abstractC0129g = recyclerView.f1631W;
/* 44 */                if (abstractC0129g != null) {
/* 46 */                    abstractC0129g.mo961g(abstractC0137o);
                        }
/* 51 */                if (recyclerView.f1624R0 != null) {
/* 55 */                    recyclerView.f1651f.m9565p(abstractC0137o);
                        }
                    }
/* 65 */            abstractC0137o.f1796s = null;
/* 67 */            abstractC0137o.f1795r = null;
/* 69 */            t12 t12VarM1006c = m1006c();
/* 73 */            t12VarM1006c.getClass();
/* 76 */            int i = abstractC0137o.f1783f;
/* 82 */            ArrayList arrayList2 = t12VarM1006c.m8672a(i).f16381a;
/* 98 */            if (((s12) t12VarM1006c.f16896a.get(i)).f16382b <= arrayList2.size()) {
/* 100 */               return;
                    }
/* 101 */           abstractC0137o.m1029m();
/* 104 */           arrayList2.add(abstractC0137o);
                }

                /* JADX INFO: renamed from: b */
                public final int m1005b(int i) {
/* 1 */             RecyclerView recyclerView = this.f1775h;
/* 3 */             y12 y12Var = recyclerView.f1624R0;
/* 5 */             if (i >= 0 && i < y12Var.m10082b()) {
                        return !y12Var.f19443g ? i : recyclerView.f1645d.m7686g(i, 0);
                    }
/* 32 */            StringBuilder sbM3793s = fm0.m3793s(i, "invalid position ", ". State item count is ");
/* 40 */            sbM3793s.append(y12Var.m10082b());
/* 47 */            sbM3793s.append(recyclerView.m900z());
/* 57 */            throw new IndexOutOfBoundsException(sbM3793s.toString());
                }

                /* JADX INFO: renamed from: c */
                public final t12 m1006c() {
/* 3 */             if (this.f1774g == null) {
/* 7 */                 t12 t12Var = new t12();
/* 15 */                t12Var.f16896a = new SparseArray();
/* 18 */                t12Var.f16897b = 0;
/* 20 */                this.f1774g = t12Var;
                    }
/* 22 */            return this.f1774g;
                }

                /* JADX INFO: renamed from: d */
                public final void m1007d() {
/* 1 */             ArrayList arrayList = this.f1770c;
/* 9 */             for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 11 */                m1008e(size);
                    }
/* 17 */            arrayList.clear();
/* 20 */            int[] iArr = RecyclerView.f1604k1;
/* 24 */            C1771iw c1771iw = this.f1775h.f1623Q0;
/* 28 */            int[] iArr2 = (int[]) c1771iw.f11948e;
/* 30 */            if (iArr2 != null) {
/* 33 */                Arrays.fill(iArr2, -1);
                    }
/* 37 */            c1771iw.f11947d = 0;
                }

                /* JADX INFO: renamed from: e */
                public final void m1008e(int i) {
/* 1 */             ArrayList arrayList = this.f1770c;
/* 10 */            m1004a((AbstractC0137o) arrayList.get(i), true);
/* 13 */            arrayList.remove(i);
                }

                /* JADX INFO: renamed from: f */
                public final void m1009f(View view) {
/* 1 */             AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(view);
/* 5 */             boolean zM1026j = abstractC0137oM843J.m1026j();
/* 9 */             RecyclerView recyclerView = this.f1775h;
/* 11 */            if (zM1026j) {
/* 14 */                recyclerView.removeDetachedView(view, false);
                    }
/* 21 */            if (abstractC0137oM843J.m1025i()) {
/* 25 */                abstractC0137oM843J.f1791n.m1013j(abstractC0137oM843J);
                    } else if (abstractC0137oM843J.m1032p()) {
/* 39 */                abstractC0137oM843J.f1787j &= -33;
                    }
/* 41 */            m1010g(abstractC0137oM843J);
/* 46 */            if (recyclerView.f1680z0 == null || abstractC0137oM843J.m1023g()) {
/* 59 */                return;
                    }
/* 56 */            recyclerView.f1680z0.mo5714d(abstractC0137oM843J);
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0032  */
                /* JADX WARN: Code duplicated, block: B:40:0x0078  */
                /* JADX WARN: Code duplicated, block: B:42:0x0086  */
                /* JADX WARN: Code duplicated, block: B:44:0x008d  */
                /* JADX WARN: Code duplicated, block: B:47:0x0098 A[LOOP:2: B:43:0x008b->B:47:0x0098, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:74:0x009b A[EDGE_INSN: B:74:0x009b->B:48:0x009b BREAK  A[LOOP:1: B:39:0x0076->B:46:0x0095], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:75:0x009b A[EDGE_INSN: B:75:0x009b->B:48:0x009b BREAK  A[LOOP:1: B:39:0x0076->B:46:0x0095, LOOP_LABEL: LOOP:1: B:39:0x0076->B:46:0x0095], SYNTHETIC] */
                /* JADX INFO: renamed from: g */
                public final void m1010g(AbstractC0137o abstractC0137o) {
                    boolean z;
                    boolean z2;
                    int i;
                    int i2;
                    int i3;
                    int i4;
/* 1 */             RecyclerView recyclerView = this.f1775h;
/* 3 */             C1771iw c1771iw = recyclerView.f1623Q0;
/* 5 */             boolean zM1025i = abstractC0137o.m1025i();
/* 9 */             View view = abstractC0137o.f1778a;
/* 11 */            boolean z3 = false;
/* 12 */            boolean z4 = true;
/* 13 */            if (zM1025i || view.getParent() != null) {
/* 237 */               StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
/* 244 */               sb.append(abstractC0137o.m1025i());
/* 249 */               sb.append(" isAttached:");
/* 259 */               sb.append(view.getParent() != null);
/* 266 */               sb.append(recyclerView.m900z());
/* 276 */               throw new IllegalArgumentException(sb.toString());
                    }
/* 27 */            if (abstractC0137o.m1026j()) {
/* 230 */               throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC0137o + recyclerView.m900z());
                    }
/* 33 */            if (abstractC0137o.m1031o()) {
/* 200 */               C1951n4.m6859j("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.m900z()));
/* 203 */               return;
                    }
/* 39 */            if ((abstractC0137o.f1787j & 16) == 0) {
/* 41 */                WeakHashMap weakHashMap = e33.f7494a;
/* 47 */                if (view.hasTransientState()) {
/* 49 */                    z = true;
                        } else {
/* 51 */                    z = false;
                        }
                    } else {
/* 51 */                z = false;
                    }
/* 56 */            if (abstractC0137o.m1023g()) {
/* 60 */                if (this.f1773f <= 0 || (abstractC0137o.f1787j & 526) != 0) {
/* 162 */                   z2 = false;
                        } else {
/* 69 */                    ArrayList arrayList = this.f1770c;
/* 71 */                    int size = arrayList.size();
/* 77 */                    if (size >= this.f1773f && size > 0) {
/* 81 */                        m1008e(0);
/* 84 */                        size--;
                            }
/* 86 */                    int[] iArr = RecyclerView.f1604k1;
/* 88 */                    if (size > 0) {
/* 90 */                        int i5 = abstractC0137o.f1780c;
/* 96 */                        if (((int[]) c1771iw.f11948e) != null) {
/* 100 */                           int i6 = c1771iw.f11947d * 2;
/* 102 */                           int i7 = 0;
                                    while (true) {
/* 103 */                               if (i7 >= i6) {
/* 117 */                                   i = size - 1;
/* 119 */                                   loop1: while (i >= 0) {
/* 127 */                                       i2 = ((AbstractC0137o) arrayList.get(i)).f1780c;
/* 133 */                                       if (((int[]) c1771iw.f11948e) != null) {
                                                    break;
                                                }
/* 137 */                                       i3 = c1771iw.f11947d * 2;
/* 139 */                                       i4 = 0;
                                                while (true) {
/* 140 */                                           if (i4 < i3) {
                                                        break loop1;
                                                    } else if (((int[]) c1771iw.f11948e)[i4] == i2) {
                                                        break;
                                                    } else {
/* 153 */                                               i4 += 2;
                                                    }
                                                }
/* 150 */                                       i--;
                                            }
/* 156 */                                   size = i + 1;
                                        } else if (((int[]) c1771iw.f11948e)[i7] != i5) {
/* 114 */                                   i7 += 2;
                                        }
                                    }
                                } else {
/* 117 */                           i = size - 1;
/* 119 */                           loop1: while (i >= 0) {
/* 127 */                               i2 = ((AbstractC0137o) arrayList.get(i)).f1780c;
/* 133 */                               if (((int[]) c1771iw.f11948e) != null) {
                                            break;
                                            break;
                                        }
/* 137 */                               i3 = c1771iw.f11947d * 2;
/* 139 */                               i4 = 0;
                                        while (true) {
/* 140 */                                   if (i4 < i3) {
                                                break loop1;
                                                break loop1;
                                            } else if (((int[]) c1771iw.f11948e)[i4] == i2) {
                                                break;
                                            } else {
/* 153 */                                       i4 += 2;
                                            }
                                        }
/* 150 */                               i--;
                                    }
/* 156 */                           size = i + 1;
                                }
                            }
/* 157 */                   arrayList.add(size, abstractC0137o);
/* 160 */                   z2 = true;
                        }
/* 163 */               if (z2) {
/* 170 */                   z4 = false;
                        } else {
/* 165 */                   m1004a(abstractC0137o, true);
                        }
/* 168 */               z3 = z2;
                    } else {
/* 172 */               z4 = false;
                    }
/* 175 */           recyclerView.f1651f.m9565p(abstractC0137o);
/* 178 */           if (z3 || z4 || !z) {
/* 189 */               return;
                    }
/* 185 */           abstractC0137o.f1796s = null;
/* 187 */           abstractC0137o.f1795r = null;
                }

                /* JADX INFO: renamed from: h */
                public final void m1011h(View view) {
                    n12 n12Var;
/* 1 */             AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(view);
/* 7 */             int i = abstractC0137oM843J.f1787j & 12;
/* 9 */             RecyclerView recyclerView = this.f1775h;
/* 11 */            if (i == 0 && abstractC0137oM843J.m1027k() && (n12Var = recyclerView.f1680z0) != null) {
/* 28 */                j60 j60Var = (j60) n12Var;
/* 34 */                if (abstractC0137oM843J.m1019c().isEmpty() && j60Var.f12083g && !abstractC0137oM843J.m1022f()) {
/* 49 */                    if (this.f1769b == null) {
/* 56 */                        this.f1769b = new ArrayList();
                            }
/* 58 */                    abstractC0137oM843J.f1791n = this;
/* 61 */                    abstractC0137oM843J.f1792o = true;
/* 65 */                    this.f1769b.add(abstractC0137oM843J);
/* 68 */                    return;
                        }
                    }
/* 73 */            if (abstractC0137oM843J.m1022f() && !abstractC0137oM843J.m1024h() && !recyclerView.f1631W.f1749b) {
/* 98 */                C1951n4.m6859j("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.m900z()));
/* 101 */               return;
                    }
/* 102 */           abstractC0137oM843J.f1791n = this;
/* 105 */           abstractC0137oM843J.f1792o = false;
/* 109 */           this.f1768a.add(abstractC0137oM843J);
                }

                /* JADX WARN: Code duplicated, block: B:101:0x01a5  */
                /* JADX WARN: Code duplicated, block: B:102:0x01a8  */
                /* JADX WARN: Code duplicated, block: B:110:0x01c4  */
                /* JADX WARN: Code duplicated, block: B:117:0x01dc  */
                /* JADX WARN: Code duplicated, block: B:119:0x01e6  */
                /* JADX WARN: Code duplicated, block: B:120:0x01f1  */
                /* JADX WARN: Code duplicated, block: B:122:0x01f7  */
                /* JADX WARN: Code duplicated, block: B:124:0x0202  */
                /* JADX WARN: Code duplicated, block: B:127:0x0220  */
                /* JADX WARN: Code duplicated, block: B:130:0x022b  */
                /* JADX WARN: Code duplicated, block: B:132:0x0233  */
                /* JADX WARN: Code duplicated, block: B:134:0x023d  */
                /* JADX WARN: Code duplicated, block: B:136:0x024b  */
                /* JADX WARN: Code duplicated, block: B:138:0x0257  */
                /* JADX WARN: Code duplicated, block: B:154:0x02b2  */
                /* JADX WARN: Code duplicated, block: B:165:0x02d7  */
                /* JADX WARN: Code duplicated, block: B:167:0x02df  */
                /* JADX WARN: Code duplicated, block: B:169:0x02ed  */
                /* JADX WARN: Code duplicated, block: B:171:0x02f5  */
                /* JADX WARN: Code duplicated, block: B:173:0x02fd  */
                /* JADX WARN: Code duplicated, block: B:176:0x0310 A[LOOP:4: B:172:0x02fb->B:176:0x0310, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:177:0x0313 A[EDGE_INSN: B:177:0x0313->B:178:0x0314 BREAK  A[LOOP:4: B:172:0x02fb->B:176:0x0310]] */
                /* JADX WARN: Code duplicated, block: B:179:0x0316  */
                /* JADX WARN: Code duplicated, block: B:182:0x031e  */
                /* JADX WARN: Code duplicated, block: B:184:0x0326  */
                /* JADX WARN: Code duplicated, block: B:194:0x0353 A[Catch: all -> 0x038d, TRY_LEAVE, TryCatch #0 {all -> 0x038d, blocks: (B:192:0x0340, B:194:0x0353, B:203:0x0385, B:204:0x038c), top: B:307:0x0340 }] */
                /* JADX WARN: Code duplicated, block: B:197:0x0362  */
                /* JADX WARN: Code duplicated, block: B:201:0x037b  */
                /* JADX WARN: Code duplicated, block: B:203:0x0385 A[Catch: all -> 0x038d, TRY_ENTER, TryCatch #0 {all -> 0x038d, blocks: (B:192:0x0340, B:194:0x0353, B:203:0x0385, B:204:0x038c), top: B:307:0x0340 }] */
                /* JADX WARN: Code duplicated, block: B:210:0x03c4  */
                /* JADX WARN: Code duplicated, block: B:217:0x03d6  */
                /* JADX WARN: Code duplicated, block: B:219:0x03de  */
                /* JADX WARN: Code duplicated, block: B:225:0x0401  */
                /* JADX WARN: Code duplicated, block: B:227:0x0407  */
                /* JADX WARN: Code duplicated, block: B:236:0x0431  */
                /* JADX WARN: Code duplicated, block: B:238:0x043d  */
                /* JADX WARN: Code duplicated, block: B:242:0x0448  */
                /* JADX WARN: Code duplicated, block: B:244:0x0451  */
                /* JADX WARN: Code duplicated, block: B:245:0x0454  */
                /* JADX WARN: Code duplicated, block: B:247:0x0457  */
                /* JADX WARN: Code duplicated, block: B:249:0x045d  */
                /* JADX WARN: Code duplicated, block: B:253:0x047c  */
                /* JADX WARN: Code duplicated, block: B:255:0x0480  */
                /* JADX WARN: Code duplicated, block: B:258:0x0491  */
                /* JADX WARN: Code duplicated, block: B:263:0x04b0  */
                /* JADX WARN: Code duplicated, block: B:266:0x04bd  */
                /* JADX WARN: Code duplicated, block: B:287:0x04fe  */
                /* JADX WARN: Code duplicated, block: B:290:0x0503  */
                /* JADX WARN: Code duplicated, block: B:294:0x050c  */
                /* JADX WARN: Code duplicated, block: B:295:0x0516  */
                /* JADX WARN: Code duplicated, block: B:297:0x051c  */
                /* JADX WARN: Code duplicated, block: B:298:0x0526  */
                /* JADX WARN: Code duplicated, block: B:301:0x052c A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:314:0x00bd A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:319:0x02a8 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:324:0x02d0 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:328:0x0313 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:329:0x0309 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:330:0x00ec A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:335:0x019c A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:35:0x007c A[EDGE_INSN: B:35:0x007c->B:36:0x007d BREAK  A[LOOP:0: B:14:0x0024->B:20:0x003e]] */
                /* JADX WARN: Code duplicated, block: B:42:0x0089  */
                /* JADX WARN: Code duplicated, block: B:44:0x0090  */
                /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:68:0x00f1  */
                /* JADX WARN: Code duplicated, block: B:70:0x0109  */
                /* JADX WARN: Code duplicated, block: B:72:0x010f  */
                /* JADX WARN: Code duplicated, block: B:77:0x0131  */
                /* JADX WARN: Code duplicated, block: B:80:0x013a A[EDGE_INSN: B:80:0x013a->B:98:0x019d BREAK  A[LOOP:1: B:43:0x008e->B:55:0x00ba]] */
                /* JADX WARN: Code duplicated, block: B:81:0x0149  */
                /* JADX WARN: Code duplicated, block: B:83:0x015b  */
                /* JADX WARN: Code duplicated, block: B:85:0x016f  */
                /* JADX WARN: Code duplicated, block: B:87:0x0175  */
                /* JADX WARN: Code duplicated, block: B:89:0x017c  */
                /* JADX WARN: Code duplicated, block: B:99:0x019f  */
                /* JADX WARN: Instruction removed from duplicated block: B:83:0x015b, please report this as an issue */
                /* JADX INFO: renamed from: i */
                public final AbstractC0137o m1012i(int i, long j) {
                    AbstractC0137o abstractC0137oMo960f;
                    boolean z;
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    boolean z2;
                    long j2;
                    long j3;
                    View view;
                    boolean z3;
                    int iM7686g;
                    int i2;
                    long nanoTime;
                    AbstractC0129g abstractC0129g;
                    boolean z4;
                    long nanoTime2;
                    long j4;
                    AccessibilityManager accessibilityManager;
                    boolean z5;
                    boolean z6;
                    C2201t0 c2201t0;
                    ArrayList arrayList3;
                    ViewGroup.LayoutParams layoutParams;
                    long j5;
                    ViewGroup.LayoutParams layoutParams2;
                    RecyclerView.LayoutParams layoutParams3;
                    int i3;
                    int iM7686g2;
                    int iMo957c;
                    AbstractC0129g abstractC0129g2;
                    long nanoTime3;
                    RecyclerView recyclerViewM842E;
                    long nanoTime4;
                    long j6;
                    long j7;
                    s12 s12Var;
                    AbstractC0137o abstractC0137o;
                    ArrayList arrayList4;
                    int size;
                    long jMo956b;
                    int size2;
                    int i4;
                    int size3;
                    AbstractC0137o abstractC0137o2;
                    long j8;
                    int size4;
                    int i5;
                    ArrayList arrayList5;
                    int size5;
                    int i6;
                    View view2;
                    int size6;
                    int i7;
                    AbstractC0137o abstractC0137o3;
                    AbstractC0137o abstractC0137oM843J;
                    C0875ec c0875ec;
                    C0193bu c0193bu;
                    int iIndexOfChild;
                    C0193bu c0193bu2;
                    int iIndexOfChild2;
                    int iM1434b;
                    AbstractC0137o abstractC0137oM843J2;
                    int i8;
                    boolean z7;
                    AbstractC0137o abstractC0137o4;
                    int size7;
                    int iM7686g3;
/* 5 */             RecyclerView recyclerView = this.f1775h;
/* 7 */             y12 y12Var = recyclerView.f1624R0;
/* 9 */             if (i < 0 || i >= y12Var.m10082b()) {
/* 1377 */              throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + y12Var.m10082b() + recyclerView.m900z());
                    }
/* 23 */            if (y12Var.f19443g) {
/* 25 */                ArrayList arrayList6 = this.f1769b;
/* 27 */                if (arrayList6 != null && (size7 = arrayList6.size()) != 0) {
/* 36 */                    int i9 = 0;
                            while (true) {
/* 37 */                        if (i9 >= size7) {
/* 70 */                            if (recyclerView.f1631W.f1749b && (iM7686g3 = recyclerView.f1645d.m7686g(i, 0)) > 0 && iM7686g3 < recyclerView.f1631W.mo955a()) {
/* 90 */                                long jMo956b2 = recyclerView.f1631W.mo956b(iM7686g3);
/* 94 */                                int i10 = 0;
                                        while (true) {
/* 95 */                                    if (i10 >= size7) {
/* 125 */                                       abstractC0137oMo960f = null;
                                                break;
                                            }
/* 103 */                                   AbstractC0137o abstractC0137o5 = (AbstractC0137o) this.f1769b.get(i10);
/* 109 */                                   if (!abstractC0137o5.m1032p() && abstractC0137o5.f1782e == jMo956b2) {
/* 117 */                                       abstractC0137o5.m1017a(32);
/* 120 */                                       abstractC0137oMo960f = abstractC0137o5;
                                                break;
                                            }
/* 122 */                                   i10++;
                                        }
                                    } else {
/* 125 */                               abstractC0137oMo960f = null;
                                        break;
                                    }
                                } else {
/* 45 */                            abstractC0137oMo960f = (AbstractC0137o) this.f1769b.get(i9);
/* 51 */                            if (!abstractC0137oMo960f.m1032p() && abstractC0137oMo960f.m1018b() == i) {
/* 59 */                                abstractC0137oMo960f.m1017a(32);
                                        break;
                                    }
/* 63 */                            i9++;
                                }
                            }
                        } else {
/* 125 */                   abstractC0137oMo960f = null;
                            break;
                        }
/* 126 */               if (abstractC0137oMo960f != null) {
/* 128 */                   z = true;
                        }
/* 132 */               arrayList = this.f1768a;
/* 134 */               arrayList2 = this.f1770c;
/* 136 */               if (abstractC0137oMo960f == null) {
/* 138 */                   size4 = arrayList.size();
/* 142 */                   i5 = 0;
                            while (true) {
/* 143 */                       if (i5 < size4) {
/* 194 */                           arrayList5 = (ArrayList) recyclerView.f1648e.f7615d;
/* 196 */                           size5 = arrayList5.size();
/* 200 */                           i6 = 0;
                                    while (true) {
/* 201 */                               if (i6 < size5) {
/* 237 */                                   z2 = true;
/* 239 */                                   view2 = null;
                                            break;
                                        }
/* 207 */                               view2 = (View) arrayList5.get(i6);
/* 209 */                               abstractC0137oM843J2 = RecyclerView.m843J(view2);
/* 213 */                               z2 = true;
/* 219 */                               if (abstractC0137oM843J2.m1018b() != i && !abstractC0137oM843J2.m1022f() && !abstractC0137oM843J2.m1024h()) {
                                            break;
                                        }
/* 234 */                               i6++;
                                    }
/* 240 */                           if (view2 != null) {
/* 374 */                               size6 = arrayList2.size();
/* 378 */                               i7 = 0;
                                        while (true) {
/* 379 */                                   if (i7 < size6) {
/* 413 */                                       abstractC0137oMo960f = null;
                                                break;
                                            }
/* 385 */                                   abstractC0137o3 = (AbstractC0137o) arrayList2.get(i7);
/* 391 */                                   if (abstractC0137o3.m1022f() && abstractC0137o3.m1018b() == i && !abstractC0137o3.m1020d()) {
/* 405 */                                       arrayList2.remove(i7);
/* 408 */                                       abstractC0137oMo960f = abstractC0137o3;
                                                break;
                                            }
/* 410 */                                   i7++;
                                        }
                                    } else {
/* 242 */                               abstractC0137oM843J = RecyclerView.m843J(view2);
/* 246 */                               c0875ec = recyclerView.f1648e;
/* 250 */                               c0193bu = (C0193bu) c0875ec.f7614c;
/* 260 */                               iIndexOfChild = ((RecyclerView) ((ts0) c0875ec.f7613b).f17248a).indexOfChild(view2);
/* 264 */                               if (iIndexOfChild >= 0) {
/* 370 */                                   s80.m8430k(view2, "view is not a child, cannot hide ");
/* 21 */                                    return null;
                                        }
/* 270 */                               if (c0193bu.m1436d(iIndexOfChild)) {
/* 367 */                                   throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                                        }
/* 272 */                               c0193bu.m1433a(iIndexOfChild);
/* 275 */                               c0875ec.m3376O(view2);
/* 278 */                               C0875ec c0875ec2 = recyclerView.f1648e;
/* 282 */                               c0193bu2 = (C0193bu) c0875ec2.f7614c;
/* 292 */                               iIndexOfChild2 = ((RecyclerView) ((ts0) c0875ec2.f7613b).f17248a).indexOfChild(view2);
/* 297 */                               if (iIndexOfChild2 == -1 && !c0193bu2.m1436d(iIndexOfChild2)) {
/* 312 */                                   iM1434b = iIndexOfChild2 - c0193bu2.m1434b(iIndexOfChild2);
                                        } else {
/* 306 */                                   iM1434b = -1;
                                        }
/* 313 */                               if (iM1434b != -1) {
/* 334 */                                   StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
/* 337 */                                   sb.append(abstractC0137oM843J);
/* 344 */                                   f42.m3659o(sb, recyclerView.m900z());
/* 21 */                                    return null;
                                        }
/* 317 */                               recyclerView.f1648e.m3392p(iM1434b);
/* 320 */                               m1011h(view2);
/* 325 */                               abstractC0137oM843J.m1017a(8224);
/* 328 */                               abstractC0137oMo960f = abstractC0137oM843J;
                                        break;
                                    }
                                } else {
/* 149 */                           abstractC0137o4 = (AbstractC0137o) arrayList.get(i5);
/* 155 */                           if (abstractC0137o4.m1032p() && abstractC0137o4.m1018b() == i && !abstractC0137o4.m1022f() && (y12Var.f19443g || !abstractC0137o4.m1024h())) {
/* 179 */                               abstractC0137o4.m1017a(32);
/* 182 */                               abstractC0137oMo960f = abstractC0137o4;
/* 183 */                               z2 = true;
                                        break;
                                    }
/* 187 */                           i5++;
                                }
                            }
/* 414 */                   if (abstractC0137oMo960f != null) {
/* 420 */                       if (!abstractC0137oMo960f.m1024h()) {
/* 422 */                           z7 = y12Var.f19443g;
                                } else {
/* 425 */                           i8 = abstractC0137oMo960f.f1780c;
/* 427 */                           if (i8 >= 0 || i8 >= recyclerView.f1631W.mo955a()) {
/* 544 */                               throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0137oMo960f + recyclerView.m900z());
                                    }
/* 439 */                           if (y12Var.f19443g || recyclerView.f1631W.mo957c(abstractC0137oMo960f.f1780c) == abstractC0137oMo960f.f1783f) {
/* 455 */                               AbstractC0129g abstractC0129g3 = recyclerView.f1631W;
/* 459 */                               if (!abstractC0129g3.f1749b || abstractC0137oMo960f.f1782e == abstractC0129g3.mo956b(abstractC0137oMo960f.f1780c)) {
/* 473 */                                   z7 = z2;
                                        } else {
/* 453 */                                   z7 = false;
                                        }
                                    } else {
/* 453 */                               z7 = false;
                                    }
                                }
/* 475 */                       if (z7) {
/* 515 */                           z = z2;
                                } else {
/* 478 */                           abstractC0137oMo960f.m1017a(4);
/* 485 */                           if (abstractC0137oMo960f.m1025i()) {
/* 489 */                               recyclerView.removeDetachedView(abstractC0137oMo960f.f1778a, false);
/* 494 */                               abstractC0137oMo960f.f1791n.m1013j(abstractC0137oMo960f);
                                    } else if (abstractC0137oMo960f.m1032p()) {
/* 508 */                               abstractC0137oMo960f.f1787j &= -33;
                                    }
/* 510 */                           m1010g(abstractC0137oMo960f);
/* 513 */                           abstractC0137oMo960f = null;
                                }
                            }
                        } else {
/* 545 */                   z2 = true;
                        }
/* 554 */               if (abstractC0137oMo960f == null) {
/* 558 */                   iM7686g2 = recyclerView.f1645d.m7686g(i, 0);
/* 562 */                   if (iM7686g2 >= 0) {
/* 564 */                       j2 = 3;
/* 572 */                       if (iM7686g2 < recyclerView.f1631W.mo955a()) {
/* 576 */                           iMo957c = recyclerView.f1631W.mo957c(iM7686g2);
/* 580 */                           abstractC0129g2 = recyclerView.f1631W;
/* 582 */                           j3 = 4;
/* 586 */                           if (abstractC0129g2.f1749b) {
/* 588 */                               jMo956b = abstractC0129g2.mo956b(iM7686g2);
/* 596 */                               size2 = arrayList.size() - 1;
                                        while (true) {
/* 598 */                                   if (size2 >= 0) {
/* 681 */                                       i4 = iM7686g2;
/* 687 */                                       size3 = arrayList2.size() - 1;
                                                while (true) {
/* 689 */                                           if (size3 >= 0) {
/* 695 */                                               abstractC0137o2 = (AbstractC0137o) arrayList2.get(size3);
/* 701 */                                               if (abstractC0137o2.f1782e == jMo956b || abstractC0137o2.m1020d()) {
/* 723 */                                                   size3--;
                                                        } else {
/* 711 */                                                   if (iMo957c == abstractC0137o2.f1783f) {
/* 713 */                                                       arrayList2.remove(size3);
/* 716 */                                                       abstractC0137oMo960f = abstractC0137o2;
                                                                break;
                                                            }
/* 718 */                                                   m1008e(size3);
                                                        }
                                                    }
/* 721 */                                           abstractC0137oMo960f = null;
                                                    break;
                                                }
                                            }
/* 604 */                                   AbstractC0137o abstractC0137o6 = (AbstractC0137o) arrayList.get(size2);
/* 606 */                                   i4 = iM7686g2;
/* 608 */                                   j8 = abstractC0137o6.f1782e;
/* 610 */                                   View view3 = abstractC0137o6.f1778a;
/* 614 */                                   if (j8 != jMo956b && !abstractC0137o6.m1032p()) {
/* 624 */                                       if (iMo957c == abstractC0137o6.f1783f) {
/* 626 */                                           abstractC0137o6.m1017a(32);
/* 633 */                                           if (abstractC0137o6.m1024h() && !y12Var.f19443g) {
/* 645 */                                               abstractC0137o6.f1787j = (abstractC0137o6.f1787j & (-15)) | 2;
                                                    }
/* 647 */                                           abstractC0137oMo960f = abstractC0137o6;
                                                    break;
                                                }
/* 649 */                                       arrayList.remove(size2);
/* 653 */                                       recyclerView.removeDetachedView(view3, false);
/* 656 */                                       AbstractC0137o abstractC0137oM843J3 = RecyclerView.m843J(view3);
/* 661 */                                       abstractC0137oM843J3.f1791n = null;
/* 663 */                                       abstractC0137oM843J3.f1792o = false;
/* 669 */                                       abstractC0137oM843J3.f1787j &= -33;
/* 671 */                                       m1010g(abstractC0137oM843J3);
                                            }
/* 674 */                                   size2--;
/* 676 */                                   iM7686g2 = i4;
                                        }
/* 726 */                               if (abstractC0137oMo960f != null) {
/* 730 */                                   abstractC0137oMo960f.f1780c = i4;
/* 732 */                                   z = z2;
                                        }
                                    }
/* 734 */                           if (abstractC0137oMo960f == null) {
/* 746 */                               s12Var = (s12) m1006c().f16896a.get(iMo957c);
/* 748 */                               if (s12Var != null) {
/* 788 */                                   abstractC0137o = null;
                                            break;
                                        }
/* 750 */                               arrayList4 = s12Var.f16381a;
/* 756 */                               if (arrayList4.isEmpty()) {
/* 762 */                                   size = arrayList4.size() - 1;
                                            while (true) {
/* 764 */                                       if (size >= 0) {
/* 788 */                                           abstractC0137o = null;
                                                    break;
                                                }
/* 776 */                                       if (!((AbstractC0137o) arrayList4.get(size)).m1020d()) {
/* 782 */                                           abstractC0137o = (AbstractC0137o) arrayList4.remove(size);
                                                    break;
                                                }
/* 785 */                                       size--;
                                            }
                                        } else {
/* 788 */                                   abstractC0137o = null;
                                            break;
                                        }
/* 789 */                               if (abstractC0137o != null) {
/* 791 */                                   abstractC0137o.m1029m();
/* 794 */                                   int[] iArr = RecyclerView.f1604k1;
                                        }
/* 796 */                               abstractC0137oMo960f = abstractC0137o;
                                    }
/* 797 */                           if (abstractC0137oMo960f == null) {
/* 799 */                               nanoTime3 = recyclerView.getNanoTime();
/* 805 */                               if (j != Long.MAX_VALUE) {
/* 813 */                                   j7 = this.f1774g.m8672a(iMo957c).f16383c;
/* 817 */                                   if (j7 != 0 && j7 + nanoTime3 >= j) {
/* 825 */                                       return null;
                                            }
                                        }
/* 828 */                               AbstractC0129g abstractC0129g4 = recyclerView.f1631W;
/* 830 */                               abstractC0129g4.getClass();
                                        try {
/* 835 */                                   int i11 = oq2.f14866a;
/* 837 */                                   Trace.beginSection("RV CreateView");
/* 840 */                                   abstractC0137oMo960f = abstractC0129g4.mo960f(recyclerView, iMo957c);
/* 850 */                                   if (abstractC0137oMo960f.f1778a.getParent() == null) {
/* 909 */                                       throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                            }
/* 852 */                                   abstractC0137oMo960f.f1783f = iMo957c;
/* 854 */                                   Trace.endSection();
/* 857 */                                   int[] iArr2 = RecyclerView.f1604k1;
/* 861 */                                   recyclerViewM842E = RecyclerView.m842E(abstractC0137oMo960f.f1778a);
/* 865 */                                   if (recyclerViewM842E != null) {
/* 872 */                                       abstractC0137oMo960f.f1779b = new WeakReference(recyclerViewM842E);
                                            }
/* 880 */                                   nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
/* 881 */                                   s12 s12VarM8672a = this.f1774g.m8672a(iMo957c);
/* 885 */                                   j6 = s12VarM8672a.f16383c;
/* 889 */                                   if (j6 != 0) {
/* 898 */                                       nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
                                            }
/* 899 */                                   s12VarM8672a.f16383c = nanoTime4;
                                        } catch (Throwable th) {
/* 911 */                                   int i12 = oq2.f14866a;
/* 913 */                                   Trace.endSection();
/* 916 */                                   throw th;
                                        }
                                    }
                                }
                            }
/* 964 */                   throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM7686g2 + ").state:" + y12Var.m10082b() + recyclerView.m900z());
                        }
/* 965 */               j2 = 3;
/* 967 */               j3 = 4;
/* 969 */               view = abstractC0137oMo960f.f1778a;
/* 971 */               if (z && !y12Var.f19443g) {
/* 977 */                   i3 = abstractC0137oMo960f.f1787j;
/* 981 */                   if ((i3 & Segment.SIZE) != 0) {
/* 985 */                       abstractC0137oMo960f.f1787j = i3 & (-8193);
/* 989 */                       if (y12Var.f19446j) {
/* 991 */                           n12.m6850b(abstractC0137oMo960f);
/* 994 */                           n12 n12Var = recyclerView.f1680z0;
/* 996 */                           abstractC0137oMo960f.m1019c();
/* 999 */                           n12Var.getClass();
/* 1004 */                          m12 m12Var = new m12();
/* 1007 */                          m12Var.m6588a(abstractC0137oMo960f);
/* 1010 */                          recyclerView.m870X(abstractC0137oMo960f, m12Var);
                                }
                            }
                        }
/* 1015 */              if (y12Var.f19443g || !abstractC0137oMo960f.m1021e()) {
/* 1030 */                  if (abstractC0137oMo960f.m1021e() || (abstractC0137oMo960f.f1787j & 2) != 0 || abstractC0137oMo960f.m1022f()) {
/* 1054 */                      z3 = false;
/* 1055 */                      iM7686g = recyclerView.f1645d.m7686g(i, 0);
/* 1059 */                      C2201t0 c2201t1 = null;
/* 1060 */                      abstractC0137oMo960f.f1796s = null;
/* 1062 */                      abstractC0137oMo960f.f1795r = recyclerView;
/* 1064 */                      i2 = abstractC0137oMo960f.f1783f;
/* 1066 */                      nanoTime = recyclerView.getNanoTime();
/* 1072 */                      if (j != Long.MAX_VALUE) {
/* 1080 */                          j5 = this.f1774g.m8672a(i2).f16384d;
/* 1084 */                          if (j5 != 0 || j5 + nanoTime < j) {
/* 1097 */                              abstractC0129g = recyclerView.f1631W;
/* 1099 */                              abstractC0129g.getClass();
/* 1104 */                              if (abstractC0137oMo960f.f1796s == null) {
/* 1106 */                                  z4 = z2;
                                        } else {
/* 1109 */                                  z4 = false;
                                        }
/* 1110 */                              if (z4) {
/* 1112 */                                  abstractC0137oMo960f.f1780c = iM7686g;
/* 1116 */                                  if (abstractC0129g.f1749b) {
/* 1122 */                                      abstractC0137oMo960f.f1782e = abstractC0129g.mo956b(iM7686g);
                                            }
/* 1130 */                                  abstractC0137oMo960f.f1787j = (abstractC0137oMo960f.f1787j & (-520)) | 1;
/* 1132 */                                  int i13 = oq2.f14866a;
/* 1136 */                                  Trace.beginSection("RV OnBindView");
                                        }
/* 1139 */                              abstractC0137oMo960f.f1796s = abstractC0129g;
/* 1141 */                              abstractC0137oMo960f.m1019c();
/* 1144 */                              abstractC0129g.mo959e(abstractC0137oMo960f, iM7686g);
/* 1147 */                              if (z4) {
/* 1149 */                                  arrayList3 = abstractC0137oMo960f.f1788k;
/* 1151 */                                  if (arrayList3 != null) {
/* 1153 */                                      arrayList3.clear();
                                            }
/* 1160 */                                  abstractC0137oMo960f.f1787j &= -1025;
/* 1162 */                                  layoutParams = view.getLayoutParams();
/* 1168 */                                  if (layoutParams instanceof RecyclerView.LayoutParams) {
/* 1174 */                                      ((RecyclerView.LayoutParams) layoutParams).f1683c = z2;
                                            }
/* 1176 */                                  int i14 = oq2.f14866a;
/* 1178 */                                  Trace.endSection();
                                        }
/* 1189 */                              nanoTime2 = recyclerView.getNanoTime() - nanoTime;
/* 1190 */                              s12 s12VarM8672a2 = this.f1774g.m8672a(abstractC0137oMo960f.f1783f);
/* 1194 */                              j4 = s12VarM8672a2.f16384d;
/* 1198 */                              if (j4 != 0) {
/* 1207 */                                  nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                                        }
/* 1208 */                              s12VarM8672a2.f16384d = nanoTime2;
/* 1210 */                              accessibilityManager = recyclerView.f1667o0;
/* 1212 */                              if (accessibilityManager == null && accessibilityManager.isEnabled()) {
/* 1220 */                                  WeakHashMap weakHashMap = e33.f7494a;
/* 1226 */                                  z5 = true;
/* 1227 */                                  if (view.getImportantForAccessibility() == 0) {
/* 1229 */                                      view.setImportantForAccessibility(1);
                                            }
/* 1232 */                                  c22 c22Var = recyclerView.f1634Y0;
/* 1234 */                                  if (c22Var != null) {
/* 1237 */                                      b22 b22Var = c22Var.f2665e;
/* 1239 */                                      if (b22Var != null) {
/* 1241 */                                          View.AccessibilityDelegate accessibilityDelegateM3308d = e33.m3308d(view);
/* 1245 */                                          if (accessibilityDelegateM3308d == null) {
/* 1247 */                                              c2201t0 = c2201t1;
                                                    } else if (accessibilityDelegateM3308d instanceof C2164s0) {
/* 1255 */                                              c2201t0 = ((C2164s0) accessibilityDelegateM3308d).f16369a;
                                                    } else {
/* 1260 */                                              c2201t1 = new C2201t0(accessibilityDelegateM3308d);
/* 1247 */                                              c2201t0 = c2201t1;
                                                    }
/* 1264 */                                          if (c2201t0 != null && c2201t0 != b22Var) {
/* 1272 */                                              ((WeakHashMap) b22Var.f2181f).put(view, c2201t0);
                                                    }
                                                }
/* 1275 */                                      e33.m3318n(view, b22Var);
                                            }
                                        } else {
/* 1279 */                                  z5 = true;
                                        }
/* 1282 */                              if (y12Var.f19443g) {
/* 1284 */                                  abstractC0137oMo960f.f1784g = i;
                                        }
/* 1286 */                              z6 = z5;
                                    } else {
/* 1092 */                              z6 = false;
/* 1093 */                              z5 = z2;
                                    }
                                } else {
/* 1097 */                          abstractC0129g = recyclerView.f1631W;
/* 1099 */                          abstractC0129g.getClass();
/* 1104 */                          if (abstractC0137oMo960f.f1796s == null) {
/* 1106 */                              z4 = z2;
                                    } else {
/* 1109 */                              z4 = false;
                                    }
/* 1110 */                          if (z4) {
/* 1112 */                              abstractC0137oMo960f.f1780c = iM7686g;
/* 1116 */                              if (abstractC0129g.f1749b) {
/* 1122 */                                  abstractC0137oMo960f.f1782e = abstractC0129g.mo956b(iM7686g);
                                        }
/* 1130 */                              abstractC0137oMo960f.f1787j = (abstractC0137oMo960f.f1787j & (-520)) | 1;
/* 1132 */                              int i15 = oq2.f14866a;
/* 1136 */                              Trace.beginSection("RV OnBindView");
                                    }
/* 1139 */                          abstractC0137oMo960f.f1796s = abstractC0129g;
/* 1141 */                          abstractC0137oMo960f.m1019c();
/* 1144 */                          abstractC0129g.mo959e(abstractC0137oMo960f, iM7686g);
/* 1147 */                          if (z4) {
/* 1149 */                              arrayList3 = abstractC0137oMo960f.f1788k;
/* 1151 */                              if (arrayList3 != null) {
/* 1153 */                                  arrayList3.clear();
                                        }
/* 1160 */                              abstractC0137oMo960f.f1787j &= -1025;
/* 1162 */                              layoutParams = view.getLayoutParams();
/* 1168 */                              if (layoutParams instanceof RecyclerView.LayoutParams) {
/* 1174 */                                  ((RecyclerView.LayoutParams) layoutParams).f1683c = z2;
                                        }
/* 1176 */                              int i16 = oq2.f14866a;
/* 1178 */                              Trace.endSection();
                                    }
/* 1189 */                          nanoTime2 = recyclerView.getNanoTime() - nanoTime;
/* 1190 */                          s12 s12VarM8672a3 = this.f1774g.m8672a(abstractC0137oMo960f.f1783f);
/* 1194 */                          j4 = s12VarM8672a3.f16384d;
/* 1198 */                          if (j4 != 0) {
/* 1207 */                              nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                                    }
/* 1208 */                          s12VarM8672a3.f16384d = nanoTime2;
/* 1210 */                          accessibilityManager = recyclerView.f1667o0;
/* 1212 */                          if (accessibilityManager == null) {
/* 1279 */                              z5 = true;
                                    } else {
/* 1279 */                              z5 = true;
                                    }
/* 1282 */                          if (y12Var.f19443g) {
/* 1284 */                              abstractC0137oMo960f.f1784g = i;
                                    }
/* 1286 */                          z6 = z5;
                                }
                            }
/* 1287 */                  layoutParams2 = view.getLayoutParams();
/* 1291 */                  if (layoutParams2 == null) {
/* 1297 */                      layoutParams3 = (RecyclerView.LayoutParams) recyclerView.generateDefaultLayoutParams();
/* 1299 */                      view.setLayoutParams(layoutParams3);
                            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
/* 1319 */                      layoutParams3 = (RecyclerView.LayoutParams) layoutParams2;
                            } else {
/* 1313 */                      layoutParams3 = (RecyclerView.LayoutParams) recyclerView.generateLayoutParams(layoutParams2);
/* 1315 */                      view.setLayoutParams(layoutParams3);
                            }
/* 1321 */                  layoutParams3.f1681a = abstractC0137oMo960f;
/* 1323 */                  if (z && z6) {
/* 1327 */                      z3 = z5;
                            }
/* 1328 */                  layoutParams3.f1684d = z3;
/* 1330 */                  return abstractC0137oMo960f;
                        }
/* 1023 */              abstractC0137oMo960f.f1784g = i;
/* 1046 */              z5 = z2;
/* 1048 */              z6 = false;
/* 1049 */              z3 = false;
/* 1287 */              layoutParams2 = view.getLayoutParams();
/* 1291 */              if (layoutParams2 == null) {
/* 1297 */                  layoutParams3 = (RecyclerView.LayoutParams) recyclerView.generateDefaultLayoutParams();
/* 1299 */                  view.setLayoutParams(layoutParams3);
                        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
/* 1313 */                  layoutParams3 = (RecyclerView.LayoutParams) recyclerView.generateLayoutParams(layoutParams2);
/* 1315 */                  view.setLayoutParams(layoutParams3);
                        } else {
/* 1319 */                  layoutParams3 = (RecyclerView.LayoutParams) layoutParams2;
                        }
/* 1321 */              layoutParams3.f1681a = abstractC0137oMo960f;
/* 1323 */              if (z) {
/* 1327 */                  z3 = z5;
                        }
/* 1328 */              layoutParams3.f1684d = z3;
/* 1330 */              return abstractC0137oMo960f;
                    }
/* 130 */           abstractC0137oMo960f = null;
/* 131 */           z = false;
/* 132 */           arrayList = this.f1768a;
/* 134 */           arrayList2 = this.f1770c;
/* 136 */           if (abstractC0137oMo960f == null) {
/* 138 */               size4 = arrayList.size();
/* 142 */               i5 = 0;
                        while (true) {
/* 143 */                   if (i5 < size4) {
/* 194 */                       arrayList5 = (ArrayList) recyclerView.f1648e.f7615d;
/* 196 */                       size5 = arrayList5.size();
/* 200 */                       i6 = 0;
                                while (true) {
/* 201 */                           if (i6 < size5) {
/* 237 */                               z2 = true;
/* 239 */                               view2 = null;
                                        break;
                                    }
/* 207 */                           view2 = (View) arrayList5.get(i6);
/* 209 */                           abstractC0137oM843J2 = RecyclerView.m843J(view2);
/* 213 */                           z2 = true;
/* 219 */                           if (abstractC0137oM843J2.m1018b() != i) {
                                    }
/* 234 */                           i6++;
                                }
/* 240 */                       if (view2 != null) {
/* 374 */                           size6 = arrayList2.size();
/* 378 */                           i7 = 0;
                                    while (true) {
/* 379 */                               if (i7 < size6) {
/* 413 */                                   abstractC0137oMo960f = null;
                                            break;
                                        }
/* 385 */                               abstractC0137o3 = (AbstractC0137o) arrayList2.get(i7);
/* 391 */                               if (abstractC0137o3.m1022f()) {
                                        }
/* 410 */                               i7++;
                                    }
                                } else {
/* 242 */                           abstractC0137oM843J = RecyclerView.m843J(view2);
/* 246 */                           c0875ec = recyclerView.f1648e;
/* 250 */                           c0193bu = (C0193bu) c0875ec.f7614c;
/* 260 */                           iIndexOfChild = ((RecyclerView) ((ts0) c0875ec.f7613b).f17248a).indexOfChild(view2);
/* 264 */                           if (iIndexOfChild >= 0) {
/* 370 */                               s80.m8430k(view2, "view is not a child, cannot hide ");
/* 21 */                                return null;
                                    }
/* 270 */                           if (c0193bu.m1436d(iIndexOfChild)) {
/* 367 */                               throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                                    }
/* 272 */                           c0193bu.m1433a(iIndexOfChild);
/* 275 */                           c0875ec.m3376O(view2);
/* 278 */                           C0875ec c0875ec3 = recyclerView.f1648e;
/* 282 */                           c0193bu2 = (C0193bu) c0875ec3.f7614c;
/* 292 */                           iIndexOfChild2 = ((RecyclerView) ((ts0) c0875ec3.f7613b).f17248a).indexOfChild(view2);
/* 297 */                           if (iIndexOfChild2 == -1) {
/* 306 */                               iM1434b = -1;
                                    } else {
/* 312 */                               iM1434b = iIndexOfChild2 - c0193bu2.m1434b(iIndexOfChild2);
                                    }
/* 313 */                           if (iM1434b != -1) {
/* 334 */                               StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
/* 337 */                               sb2.append(abstractC0137oM843J);
/* 344 */                               f42.m3659o(sb2, recyclerView.m900z());
/* 21 */                                return null;
                                    }
/* 317 */                           recyclerView.f1648e.m3392p(iM1434b);
/* 320 */                           m1011h(view2);
/* 325 */                           abstractC0137oM843J.m1017a(8224);
/* 328 */                           abstractC0137oMo960f = abstractC0137oM843J;
                                    break;
                                }
                            } else {
/* 149 */                       abstractC0137o4 = (AbstractC0137o) arrayList.get(i5);
/* 155 */                       if (abstractC0137o4.m1032p()) {
                                }
/* 187 */                       i5++;
                            }
                        }
/* 414 */               if (abstractC0137oMo960f != null) {
/* 420 */                   if (!abstractC0137oMo960f.m1024h()) {
/* 425 */                       i8 = abstractC0137oMo960f.f1780c;
/* 427 */                       if (i8 >= 0) {
                                }
/* 544 */                       throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0137oMo960f + recyclerView.m900z());
                            }
/* 422 */                   z7 = y12Var.f19443g;
/* 475 */                   if (z7) {
/* 478 */                       abstractC0137oMo960f.m1017a(4);
/* 485 */                       if (abstractC0137oMo960f.m1025i()) {
/* 489 */                           recyclerView.removeDetachedView(abstractC0137oMo960f.f1778a, false);
/* 494 */                           abstractC0137oMo960f.f1791n.m1013j(abstractC0137oMo960f);
                                } else if (abstractC0137oMo960f.m1032p()) {
/* 508 */                           abstractC0137oMo960f.f1787j &= -33;
                                }
/* 510 */                       m1010g(abstractC0137oMo960f);
/* 513 */                       abstractC0137oMo960f = null;
                            } else {
/* 515 */                       z = z2;
                            }
                        }
                    } else {
/* 545 */               z2 = true;
                    }
/* 554 */           if (abstractC0137oMo960f == null) {
/* 558 */               iM7686g2 = recyclerView.f1645d.m7686g(i, 0);
/* 562 */               if (iM7686g2 >= 0) {
/* 564 */                   j2 = 3;
/* 572 */                   if (iM7686g2 < recyclerView.f1631W.mo955a()) {
/* 576 */                       iMo957c = recyclerView.f1631W.mo957c(iM7686g2);
/* 580 */                       abstractC0129g2 = recyclerView.f1631W;
/* 582 */                       j3 = 4;
/* 586 */                       if (abstractC0129g2.f1749b) {
/* 588 */                           jMo956b = abstractC0129g2.mo956b(iM7686g2);
/* 596 */                           size2 = arrayList.size() - 1;
                                    while (true) {
/* 598 */                               if (size2 >= 0) {
/* 681 */                                   i4 = iM7686g2;
/* 687 */                                   size3 = arrayList2.size() - 1;
                                            while (true) {
/* 689 */                                       if (size3 >= 0) {
/* 695 */                                           abstractC0137o2 = (AbstractC0137o) arrayList2.get(size3);
/* 701 */                                           if (abstractC0137o2.f1782e == jMo956b) {
                                                    }
/* 723 */                                           size3--;
                                                }
/* 721 */                                       abstractC0137oMo960f = null;
                                                break;
                                            }
                                        }
/* 604 */                               AbstractC0137o abstractC0137o7 = (AbstractC0137o) arrayList.get(size2);
/* 606 */                               i4 = iM7686g2;
/* 608 */                               j8 = abstractC0137o7.f1782e;
/* 610 */                               View view4 = abstractC0137o7.f1778a;
/* 614 */                               if (j8 != jMo956b) {
                                        }
/* 674 */                               size2--;
/* 676 */                               iM7686g2 = i4;
                                    }
/* 726 */                           if (abstractC0137oMo960f != null) {
/* 730 */                               abstractC0137oMo960f.f1780c = i4;
/* 732 */                               z = z2;
                                    }
                                }
/* 734 */                       if (abstractC0137oMo960f == null) {
/* 746 */                           s12Var = (s12) m1006c().f16896a.get(iMo957c);
/* 748 */                           if (s12Var != null) {
/* 788 */                               abstractC0137o = null;
                                        break;
                                    }
/* 750 */                           arrayList4 = s12Var.f16381a;
/* 756 */                           if (arrayList4.isEmpty()) {
/* 788 */                               abstractC0137o = null;
                                        break;
                                    }
/* 762 */                           size = arrayList4.size() - 1;
                                    while (true) {
/* 764 */                               if (size >= 0) {
/* 788 */                                   abstractC0137o = null;
                                            break;
                                        }
/* 776 */                               if (!((AbstractC0137o) arrayList4.get(size)).m1020d()) {
/* 782 */                                   abstractC0137o = (AbstractC0137o) arrayList4.remove(size);
                                            break;
                                        }
/* 785 */                               size--;
                                    }
/* 789 */                           if (abstractC0137o != null) {
/* 791 */                               abstractC0137o.m1029m();
/* 794 */                               int[] iArr3 = RecyclerView.f1604k1;
                                    }
/* 796 */                           abstractC0137oMo960f = abstractC0137o;
                                }
/* 797 */                       if (abstractC0137oMo960f == null) {
/* 799 */                           nanoTime3 = recyclerView.getNanoTime();
/* 805 */                           if (j != Long.MAX_VALUE) {
/* 813 */                               j7 = this.f1774g.m8672a(iMo957c).f16383c;
/* 817 */                               if (j7 != 0) {
/* 825 */                                   return null;
                                        }
                                    }
/* 828 */                           AbstractC0129g abstractC0129g5 = recyclerView.f1631W;
/* 830 */                           abstractC0129g5.getClass();
/* 835 */                           int i17 = oq2.f14866a;
/* 837 */                           Trace.beginSection("RV CreateView");
/* 840 */                           abstractC0137oMo960f = abstractC0129g5.mo960f(recyclerView, iMo957c);
/* 850 */                           if (abstractC0137oMo960f.f1778a.getParent() == null) {
/* 909 */                               throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                    }
/* 852 */                           abstractC0137oMo960f.f1783f = iMo957c;
/* 854 */                           Trace.endSection();
/* 857 */                           int[] iArr4 = RecyclerView.f1604k1;
/* 861 */                           recyclerViewM842E = RecyclerView.m842E(abstractC0137oMo960f.f1778a);
/* 865 */                           if (recyclerViewM842E != null) {
/* 872 */                               abstractC0137oMo960f.f1779b = new WeakReference(recyclerViewM842E);
                                    }
/* 880 */                           nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
/* 881 */                           s12 s12VarM8672a4 = this.f1774g.m8672a(iMo957c);
/* 885 */                           j6 = s12VarM8672a4.f16383c;
/* 889 */                           if (j6 != 0) {
/* 898 */                               nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
                                    }
/* 899 */                           s12VarM8672a4.f16383c = nanoTime4;
                                }
                            }
                        }
/* 964 */               throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM7686g2 + ").state:" + y12Var.m10082b() + recyclerView.m900z());
                    }
/* 965 */           j2 = 3;
/* 967 */           j3 = 4;
/* 969 */           view = abstractC0137oMo960f.f1778a;
/* 971 */           if (z) {
/* 977 */               i3 = abstractC0137oMo960f.f1787j;
/* 981 */               if ((i3 & Segment.SIZE) != 0) {
/* 985 */                   abstractC0137oMo960f.f1787j = i3 & (-8193);
/* 989 */                   if (y12Var.f19446j) {
/* 991 */                       n12.m6850b(abstractC0137oMo960f);
/* 994 */                       n12 n12Var2 = recyclerView.f1680z0;
/* 996 */                       abstractC0137oMo960f.m1019c();
/* 999 */                       n12Var2.getClass();
/* 1004 */                      m12 m12Var2 = new m12();
/* 1007 */                      m12Var2.m6588a(abstractC0137oMo960f);
/* 1010 */                      recyclerView.m870X(abstractC0137oMo960f, m12Var2);
                            }
                        }
                    }
/* 1015 */          if (y12Var.f19443g) {
/* 1030 */              if (abstractC0137oMo960f.m1021e()) {
                        }
/* 1054 */              z3 = false;
/* 1055 */              iM7686g = recyclerView.f1645d.m7686g(i, 0);
/* 1059 */              C2201t0 c2201t2 = null;
/* 1060 */              abstractC0137oMo960f.f1796s = null;
/* 1062 */              abstractC0137oMo960f.f1795r = recyclerView;
/* 1064 */              i2 = abstractC0137oMo960f.f1783f;
/* 1066 */              nanoTime = recyclerView.getNanoTime();
/* 1072 */              if (j != Long.MAX_VALUE) {
/* 1080 */                  j5 = this.f1774g.m8672a(i2).f16384d;
/* 1084 */                  if (j5 != 0) {
/* 1097 */                      abstractC0129g = recyclerView.f1631W;
/* 1099 */                      abstractC0129g.getClass();
/* 1104 */                      if (abstractC0137oMo960f.f1796s == null) {
/* 1106 */                          z4 = z2;
                                } else {
/* 1109 */                          z4 = false;
                                }
/* 1110 */                      if (z4) {
/* 1112 */                          abstractC0137oMo960f.f1780c = iM7686g;
/* 1116 */                          if (abstractC0129g.f1749b) {
/* 1122 */                              abstractC0137oMo960f.f1782e = abstractC0129g.mo956b(iM7686g);
                                    }
/* 1130 */                          abstractC0137oMo960f.f1787j = (abstractC0137oMo960f.f1787j & (-520)) | 1;
/* 1132 */                          int i18 = oq2.f14866a;
/* 1136 */                          Trace.beginSection("RV OnBindView");
                                }
/* 1139 */                      abstractC0137oMo960f.f1796s = abstractC0129g;
/* 1141 */                      abstractC0137oMo960f.m1019c();
/* 1144 */                      abstractC0129g.mo959e(abstractC0137oMo960f, iM7686g);
/* 1147 */                      if (z4) {
/* 1149 */                          arrayList3 = abstractC0137oMo960f.f1788k;
/* 1151 */                          if (arrayList3 != null) {
/* 1153 */                              arrayList3.clear();
                                    }
/* 1160 */                          abstractC0137oMo960f.f1787j &= -1025;
/* 1162 */                          layoutParams = view.getLayoutParams();
/* 1168 */                          if (layoutParams instanceof RecyclerView.LayoutParams) {
/* 1174 */                              ((RecyclerView.LayoutParams) layoutParams).f1683c = z2;
                                    }
/* 1176 */                          int i19 = oq2.f14866a;
/* 1178 */                          Trace.endSection();
                                }
/* 1189 */                      nanoTime2 = recyclerView.getNanoTime() - nanoTime;
/* 1190 */                      s12 s12VarM8672a5 = this.f1774g.m8672a(abstractC0137oMo960f.f1783f);
/* 1194 */                      j4 = s12VarM8672a5.f16384d;
/* 1198 */                      if (j4 != 0) {
/* 1207 */                          nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                                }
/* 1208 */                      s12VarM8672a5.f16384d = nanoTime2;
/* 1210 */                      accessibilityManager = recyclerView.f1667o0;
/* 1212 */                      if (accessibilityManager == null) {
/* 1279 */                          z5 = true;
                                } else {
/* 1279 */                          z5 = true;
                                }
/* 1282 */                      if (y12Var.f19443g) {
/* 1284 */                          abstractC0137oMo960f.f1784g = i;
                                }
/* 1286 */                      z6 = z5;
                            } else {
/* 1097 */                      abstractC0129g = recyclerView.f1631W;
/* 1099 */                      abstractC0129g.getClass();
/* 1104 */                      if (abstractC0137oMo960f.f1796s == null) {
/* 1106 */                          z4 = z2;
                                } else {
/* 1109 */                          z4 = false;
                                }
/* 1110 */                      if (z4) {
/* 1112 */                          abstractC0137oMo960f.f1780c = iM7686g;
/* 1116 */                          if (abstractC0129g.f1749b) {
/* 1122 */                              abstractC0137oMo960f.f1782e = abstractC0129g.mo956b(iM7686g);
                                    }
/* 1130 */                          abstractC0137oMo960f.f1787j = (abstractC0137oMo960f.f1787j & (-520)) | 1;
/* 1132 */                          int i110 = oq2.f14866a;
/* 1136 */                          Trace.beginSection("RV OnBindView");
                                }
/* 1139 */                      abstractC0137oMo960f.f1796s = abstractC0129g;
/* 1141 */                      abstractC0137oMo960f.m1019c();
/* 1144 */                      abstractC0129g.mo959e(abstractC0137oMo960f, iM7686g);
/* 1147 */                      if (z4) {
/* 1149 */                          arrayList3 = abstractC0137oMo960f.f1788k;
/* 1151 */                          if (arrayList3 != null) {
/* 1153 */                              arrayList3.clear();
                                    }
/* 1160 */                          abstractC0137oMo960f.f1787j &= -1025;
/* 1162 */                          layoutParams = view.getLayoutParams();
/* 1168 */                          if (layoutParams instanceof RecyclerView.LayoutParams) {
/* 1174 */                              ((RecyclerView.LayoutParams) layoutParams).f1683c = z2;
                                    }
/* 1176 */                          int i111 = oq2.f14866a;
/* 1178 */                          Trace.endSection();
                                }
/* 1189 */                      nanoTime2 = recyclerView.getNanoTime() - nanoTime;
/* 1190 */                      s12 s12VarM8672a6 = this.f1774g.m8672a(abstractC0137oMo960f.f1783f);
/* 1194 */                      j4 = s12VarM8672a6.f16384d;
/* 1198 */                      if (j4 != 0) {
/* 1207 */                          nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                                }
/* 1208 */                      s12VarM8672a6.f16384d = nanoTime2;
/* 1210 */                      accessibilityManager = recyclerView.f1667o0;
/* 1212 */                      if (accessibilityManager == null) {
/* 1279 */                          z5 = true;
                                } else {
/* 1279 */                          z5 = true;
                                }
/* 1282 */                      if (y12Var.f19443g) {
/* 1284 */                          abstractC0137oMo960f.f1784g = i;
                                }
/* 1286 */                      z6 = z5;
                            }
                        } else {
/* 1097 */                  abstractC0129g = recyclerView.f1631W;
/* 1099 */                  abstractC0129g.getClass();
/* 1104 */                  if (abstractC0137oMo960f.f1796s == null) {
/* 1106 */                      z4 = z2;
                            } else {
/* 1109 */                      z4 = false;
                            }
/* 1110 */                  if (z4) {
/* 1112 */                      abstractC0137oMo960f.f1780c = iM7686g;
/* 1116 */                      if (abstractC0129g.f1749b) {
/* 1122 */                          abstractC0137oMo960f.f1782e = abstractC0129g.mo956b(iM7686g);
                                }
/* 1130 */                      abstractC0137oMo960f.f1787j = (abstractC0137oMo960f.f1787j & (-520)) | 1;
/* 1132 */                      int i112 = oq2.f14866a;
/* 1136 */                      Trace.beginSection("RV OnBindView");
                            }
/* 1139 */                  abstractC0137oMo960f.f1796s = abstractC0129g;
/* 1141 */                  abstractC0137oMo960f.m1019c();
/* 1144 */                  abstractC0129g.mo959e(abstractC0137oMo960f, iM7686g);
/* 1147 */                  if (z4) {
/* 1149 */                      arrayList3 = abstractC0137oMo960f.f1788k;
/* 1151 */                      if (arrayList3 != null) {
/* 1153 */                          arrayList3.clear();
                                }
/* 1160 */                      abstractC0137oMo960f.f1787j &= -1025;
/* 1162 */                      layoutParams = view.getLayoutParams();
/* 1168 */                      if (layoutParams instanceof RecyclerView.LayoutParams) {
/* 1174 */                          ((RecyclerView.LayoutParams) layoutParams).f1683c = z2;
                                }
/* 1176 */                      int i113 = oq2.f14866a;
/* 1178 */                      Trace.endSection();
                            }
/* 1189 */                  nanoTime2 = recyclerView.getNanoTime() - nanoTime;
/* 1190 */                  s12 s12VarM8672a7 = this.f1774g.m8672a(abstractC0137oMo960f.f1783f);
/* 1194 */                  j4 = s12VarM8672a7.f16384d;
/* 1198 */                  if (j4 != 0) {
/* 1207 */                      nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                            }
/* 1208 */                  s12VarM8672a7.f16384d = nanoTime2;
/* 1210 */                  accessibilityManager = recyclerView.f1667o0;
/* 1212 */                  if (accessibilityManager == null) {
/* 1279 */                      z5 = true;
                            } else {
/* 1279 */                      z5 = true;
                            }
/* 1282 */                  if (y12Var.f19443g) {
/* 1284 */                      abstractC0137oMo960f.f1784g = i;
                            }
/* 1286 */                  z6 = z5;
                        }
                    } else {
/* 1030 */              if (abstractC0137oMo960f.m1021e()) {
                        }
/* 1054 */              z3 = false;
/* 1055 */              iM7686g = recyclerView.f1645d.m7686g(i, 0);
/* 1059 */              C2201t0 c2201t3 = null;
/* 1060 */              abstractC0137oMo960f.f1796s = null;
/* 1062 */              abstractC0137oMo960f.f1795r = recyclerView;
/* 1064 */              i2 = abstractC0137oMo960f.f1783f;
/* 1066 */              nanoTime = recyclerView.getNanoTime();
/* 1072 */              if (j != Long.MAX_VALUE) {
/* 1080 */                  j5 = this.f1774g.m8672a(i2).f16384d;
/* 1084 */                  if (j5 != 0) {
/* 1097 */                      abstractC0129g = recyclerView.f1631W;
/* 1099 */                      abstractC0129g.getClass();
/* 1104 */                      if (abstractC0137oMo960f.f1796s == null) {
/* 1106 */                          z4 = z2;
                                } else {
/* 1109 */                          z4 = false;
                                }
/* 1110 */                      if (z4) {
/* 1112 */                          abstractC0137oMo960f.f1780c = iM7686g;
/* 1116 */                          if (abstractC0129g.f1749b) {
/* 1122 */                              abstractC0137oMo960f.f1782e = abstractC0129g.mo956b(iM7686g);
                                    }
/* 1130 */                          abstractC0137oMo960f.f1787j = (abstractC0137oMo960f.f1787j & (-520)) | 1;
/* 1132 */                          int i114 = oq2.f14866a;
/* 1136 */                          Trace.beginSection("RV OnBindView");
                                }
/* 1139 */                      abstractC0137oMo960f.f1796s = abstractC0129g;
/* 1141 */                      abstractC0137oMo960f.m1019c();
/* 1144 */                      abstractC0129g.mo959e(abstractC0137oMo960f, iM7686g);
/* 1147 */                      if (z4) {
/* 1149 */                          arrayList3 = abstractC0137oMo960f.f1788k;
/* 1151 */                          if (arrayList3 != null) {
/* 1153 */                              arrayList3.clear();
                                    }
/* 1160 */                          abstractC0137oMo960f.f1787j &= -1025;
/* 1162 */                          layoutParams = view.getLayoutParams();
/* 1168 */                          if (layoutParams instanceof RecyclerView.LayoutParams) {
/* 1174 */                              ((RecyclerView.LayoutParams) layoutParams).f1683c = z2;
                                    }
/* 1176 */                          int i115 = oq2.f14866a;
/* 1178 */                          Trace.endSection();
                                }
/* 1189 */                      nanoTime2 = recyclerView.getNanoTime() - nanoTime;
/* 1190 */                      s12 s12VarM8672a8 = this.f1774g.m8672a(abstractC0137oMo960f.f1783f);
/* 1194 */                      j4 = s12VarM8672a8.f16384d;
/* 1198 */                      if (j4 != 0) {
/* 1207 */                          nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                                }
/* 1208 */                      s12VarM8672a8.f16384d = nanoTime2;
/* 1210 */                      accessibilityManager = recyclerView.f1667o0;
/* 1212 */                      if (accessibilityManager == null) {
/* 1279 */                          z5 = true;
                                } else {
/* 1279 */                          z5 = true;
                                }
/* 1282 */                      if (y12Var.f19443g) {
/* 1284 */                          abstractC0137oMo960f.f1784g = i;
                                }
/* 1286 */                      z6 = z5;
                            } else {
/* 1097 */                      abstractC0129g = recyclerView.f1631W;
/* 1099 */                      abstractC0129g.getClass();
/* 1104 */                      if (abstractC0137oMo960f.f1796s == null) {
/* 1106 */                          z4 = z2;
                                } else {
/* 1109 */                          z4 = false;
                                }
/* 1110 */                      if (z4) {
/* 1112 */                          abstractC0137oMo960f.f1780c = iM7686g;
/* 1116 */                          if (abstractC0129g.f1749b) {
/* 1122 */                              abstractC0137oMo960f.f1782e = abstractC0129g.mo956b(iM7686g);
                                    }
/* 1130 */                          abstractC0137oMo960f.f1787j = (abstractC0137oMo960f.f1787j & (-520)) | 1;
/* 1132 */                          int i116 = oq2.f14866a;
/* 1136 */                          Trace.beginSection("RV OnBindView");
                                }
/* 1139 */                      abstractC0137oMo960f.f1796s = abstractC0129g;
/* 1141 */                      abstractC0137oMo960f.m1019c();
/* 1144 */                      abstractC0129g.mo959e(abstractC0137oMo960f, iM7686g);
/* 1147 */                      if (z4) {
/* 1149 */                          arrayList3 = abstractC0137oMo960f.f1788k;
/* 1151 */                          if (arrayList3 != null) {
/* 1153 */                              arrayList3.clear();
                                    }
/* 1160 */                          abstractC0137oMo960f.f1787j &= -1025;
/* 1162 */                          layoutParams = view.getLayoutParams();
/* 1168 */                          if (layoutParams instanceof RecyclerView.LayoutParams) {
/* 1174 */                              ((RecyclerView.LayoutParams) layoutParams).f1683c = z2;
                                    }
/* 1176 */                          int i117 = oq2.f14866a;
/* 1178 */                          Trace.endSection();
                                }
/* 1189 */                      nanoTime2 = recyclerView.getNanoTime() - nanoTime;
/* 1190 */                      s12 s12VarM8672a9 = this.f1774g.m8672a(abstractC0137oMo960f.f1783f);
/* 1194 */                      j4 = s12VarM8672a9.f16384d;
/* 1198 */                      if (j4 != 0) {
/* 1207 */                          nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                                }
/* 1208 */                      s12VarM8672a9.f16384d = nanoTime2;
/* 1210 */                      accessibilityManager = recyclerView.f1667o0;
/* 1212 */                      if (accessibilityManager == null) {
/* 1279 */                          z5 = true;
                                } else {
/* 1279 */                          z5 = true;
                                }
/* 1282 */                      if (y12Var.f19443g) {
/* 1284 */                          abstractC0137oMo960f.f1784g = i;
                                }
/* 1286 */                      z6 = z5;
                            }
                        } else {
/* 1097 */                  abstractC0129g = recyclerView.f1631W;
/* 1099 */                  abstractC0129g.getClass();
/* 1104 */                  if (abstractC0137oMo960f.f1796s == null) {
/* 1106 */                      z4 = z2;
                            } else {
/* 1109 */                      z4 = false;
                            }
/* 1110 */                  if (z4) {
/* 1112 */                      abstractC0137oMo960f.f1780c = iM7686g;
/* 1116 */                      if (abstractC0129g.f1749b) {
/* 1122 */                          abstractC0137oMo960f.f1782e = abstractC0129g.mo956b(iM7686g);
                                }
/* 1130 */                      abstractC0137oMo960f.f1787j = (abstractC0137oMo960f.f1787j & (-520)) | 1;
/* 1132 */                      int i118 = oq2.f14866a;
/* 1136 */                      Trace.beginSection("RV OnBindView");
                            }
/* 1139 */                  abstractC0137oMo960f.f1796s = abstractC0129g;
/* 1141 */                  abstractC0137oMo960f.m1019c();
/* 1144 */                  abstractC0129g.mo959e(abstractC0137oMo960f, iM7686g);
/* 1147 */                  if (z4) {
/* 1149 */                      arrayList3 = abstractC0137oMo960f.f1788k;
/* 1151 */                      if (arrayList3 != null) {
/* 1153 */                          arrayList3.clear();
                                }
/* 1160 */                      abstractC0137oMo960f.f1787j &= -1025;
/* 1162 */                      layoutParams = view.getLayoutParams();
/* 1168 */                      if (layoutParams instanceof RecyclerView.LayoutParams) {
/* 1174 */                          ((RecyclerView.LayoutParams) layoutParams).f1683c = z2;
                                }
/* 1176 */                      int i119 = oq2.f14866a;
/* 1178 */                      Trace.endSection();
                            }
/* 1189 */                  nanoTime2 = recyclerView.getNanoTime() - nanoTime;
/* 1190 */                  s12 s12VarM8672a10 = this.f1774g.m8672a(abstractC0137oMo960f.f1783f);
/* 1194 */                  j4 = s12VarM8672a10.f16384d;
/* 1198 */                  if (j4 != 0) {
/* 1207 */                      nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                            }
/* 1208 */                  s12VarM8672a10.f16384d = nanoTime2;
/* 1210 */                  accessibilityManager = recyclerView.f1667o0;
/* 1212 */                  if (accessibilityManager == null) {
/* 1279 */                      z5 = true;
                            } else {
/* 1279 */                      z5 = true;
                            }
/* 1282 */                  if (y12Var.f19443g) {
/* 1284 */                      abstractC0137oMo960f.f1784g = i;
                            }
/* 1286 */                  z6 = z5;
                        }
                    }
/* 1287 */          layoutParams2 = view.getLayoutParams();
/* 1291 */          if (layoutParams2 == null) {
/* 1297 */              layoutParams3 = (RecyclerView.LayoutParams) recyclerView.generateDefaultLayoutParams();
/* 1299 */              view.setLayoutParams(layoutParams3);
                    } else if (recyclerView.checkLayoutParams(layoutParams2)) {
/* 1313 */              layoutParams3 = (RecyclerView.LayoutParams) recyclerView.generateLayoutParams(layoutParams2);
/* 1315 */              view.setLayoutParams(layoutParams3);
                    } else {
/* 1319 */              layoutParams3 = (RecyclerView.LayoutParams) layoutParams2;
                    }
/* 1321 */          layoutParams3.f1681a = abstractC0137oMo960f;
/* 1323 */          if (z) {
/* 1327 */              z3 = z5;
                    }
/* 1328 */          layoutParams3.f1684d = z3;
/* 1330 */          return abstractC0137oMo960f;
                }

                /* JADX INFO: renamed from: j */
                public final void m1013j(AbstractC0137o abstractC0137o) {
/* 3 */             if (abstractC0137o.f1792o) {
/* 7 */                 this.f1769b.remove(abstractC0137o);
                    } else {
/* 13 */                this.f1768a.remove(abstractC0137o);
                    }
/* 17 */            abstractC0137o.f1791n = null;
/* 20 */            abstractC0137o.f1792o = false;
/* 26 */            abstractC0137o.f1787j &= -33;
                }

                /* JADX INFO: renamed from: k */
                public final void m1014k() {
/* 3 */             AbstractC0133k abstractC0133k = this.f1775h.f1637a0;
/* 14 */            this.f1773f = this.f1772e + (abstractC0133k != null ? abstractC0133k.f1753U : 0);
/* 16 */            ArrayList arrayList = this.f1770c;
/* 24 */            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f1773f; size--) {
/* 34 */                m1008e(size);
                    }
                }
            }
