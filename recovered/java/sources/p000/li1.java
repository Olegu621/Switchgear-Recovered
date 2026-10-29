            package p000;

            import android.media.ImageReader;
            import android.util.LongSparseArray;
            import android.view.Surface;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class li1 implements ow0, bm0 {

                /* JADX INFO: renamed from: U */
                public final LongSparseArray f13300U;

                /* JADX INFO: renamed from: V */
                public int f13301V;

                /* JADX INFO: renamed from: W */
                public final ArrayList f13302W;

                /* JADX INFO: renamed from: X */
                public final ArrayList f13303X;

                /* JADX INFO: renamed from: a */
                public final Object f13304a;

                /* JADX INFO: renamed from: b */
                public final ki1 f13305b;

                /* JADX INFO: renamed from: c */
                public int f13306c;

                /* JADX INFO: renamed from: d */
                public final C2357x6 f13307d;

                /* JADX INFO: renamed from: e */
                public boolean f13308e;

                /* JADX INFO: renamed from: f */
                public final C1822k8 f13309f;

                /* JADX INFO: renamed from: i */
                public nw0 f13310i;

                /* JADX INFO: renamed from: v */
                public Executor f13311v;

                /* JADX INFO: renamed from: w */
                public final LongSparseArray f13312w;

                public li1(int i, int i2, int i3, int i4) {
/* 7 */             C1822k8 c1822k8 = new C1822k8(ImageReader.newInstance(i, i2, i3, i4));
/* 18 */            this.f13304a = new Object();
/* 26 */            this.f13305b = new ki1(this, 0);
/* 29 */            this.f13306c = 0;
/* 38 */            this.f13307d = new C2357x6(this, 8);
/* 40 */            this.f13308e = false;
/* 47 */            this.f13312w = new LongSparseArray();
/* 54 */            this.f13300U = new LongSparseArray();
/* 61 */            this.f13303X = new ArrayList();
/* 63 */            this.f13309f = c1822k8;
/* 65 */            this.f13301V = 0;
/* 76 */            this.f13302W = new ArrayList(mo3812g());
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: a */
                public final int mo3809a() {
                    int iMo3809a;
                    synchronized (this.f13304a) {
/* 6 */                 iMo3809a = this.f13309f.mo3809a();
                    }
/* 11 */            return iMo3809a;
                }

                @Override // p000.ow0
                public final mw0 acquireLatestImage() {
                    synchronized (this.f13304a) {
                        try {
/* 10 */                    if (this.f13302W.isEmpty()) {
/* 12 */                        return null;
                            }
/* 25 */                    if (this.f13301V >= this.f13302W.size()) {
/* 123 */                       throw new IllegalStateException("Maximum image number reached.");
                            }
/* 29 */                    ArrayList arrayList = new ArrayList();
/* 41 */                    for (int i = 0; i < this.f13302W.size() - 1; i++) {
/* 55 */                        if (!this.f13303X.contains(this.f13302W.get(i))) {
/* 65 */                            arrayList.add((mw0) this.f13302W.get(i));
                                }
                            }
/* 71 */                    Iterator it = arrayList.iterator();
/* 79 */                    while (it.hasNext()) {
/* 87 */                        ((mw0) it.next()).close();
                            }
/* 93 */                    int size = this.f13302W.size();
/* 99 */                    ArrayList arrayList2 = this.f13302W;
/* 101 */                   this.f13301V = size;
/* 107 */                   mw0 mw0Var = (mw0) arrayList2.get(size - 1);
/* 111 */                   this.f13303X.add(mw0Var);
/* 115 */                   return mw0Var;
                        } catch (Throwable th) {
/* 125 */                   throw th;
                        }
                    }
                }

                @Override // p000.bm0
                /* JADX INFO: renamed from: b */
                public final void mo1394b(cm0 cm0Var) {
                    synchronized (this.f13304a) {
/* 4 */                 m6454c(cm0Var);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m6454c(cm0 cm0Var) {
                    synchronized (this.f13304a) {
                        try {
/* 6 */                     int iIndexOf = this.f13302W.indexOf(cm0Var);
/* 10 */                    if (iIndexOf >= 0) {
/* 14 */                        this.f13302W.remove(iIndexOf);
/* 17 */                        int i = this.f13301V;
/* 19 */                        if (iIndexOf <= i) {
/* 23 */                            this.f13301V = i - 1;
                                }
                            }
/* 30 */                    this.f13303X.remove(cm0Var);
/* 35 */                    if (this.f13306c > 0) {
/* 39 */                        m6456i(this.f13309f);
                            }
                        } catch (Throwable th) {
/* 45 */                    throw th;
                        }
                    }
                }

                @Override // p000.ow0
                public final void close() {
                    synchronized (this.f13304a) {
                        try {
/* 6 */                     if (this.f13308e) {
/* 9 */                         return;
                            }
/* 19 */                    Iterator it = new ArrayList(this.f13302W).iterator();
/* 27 */                    while (it.hasNext()) {
/* 35 */                        ((mw0) it.next()).close();
                            }
/* 41 */                    this.f13302W.clear();
/* 46 */                    this.f13309f.close();
/* 50 */                    this.f13308e = true;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: d */
                public final void mo3810d() {
                    synchronized (this.f13304a) {
/* 6 */                 this.f13309f.mo3810d();
/* 10 */                this.f13310i = null;
/* 12 */                this.f13311v = null;
/* 15 */                this.f13306c = 0;
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m6455e(wb2 wb2Var) {
                    nw0 nw0Var;
                    Executor executor;
                    synchronized (this.f13304a) {
                        try {
/* 14 */                    if (this.f13302W.size() < mo3812g()) {
/* 16 */                        wb2Var.m1725c(this);
/* 21 */                        this.f13302W.add(wb2Var);
/* 24 */                        nw0Var = this.f13310i;
/* 26 */                        executor = this.f13311v;
                            } else {
/* 33 */                        hu0.m4312F0("TAG");
/* 36 */                        wb2Var.close();
/* 39 */                        nw0Var = null;
/* 40 */                        executor = null;
                            }
                        } catch (Throwable th) {
/* 61 */                    throw th;
                        }
                    }
/* 42 */            if (nw0Var != null) {
/* 44 */                if (executor != null) {
/* 52 */                    executor.execute(new ji1(0, this, nw0Var));
                        } else {
/* 56 */                    nw0Var.mo6871f(this);
                        }
                    }
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: f */
                public final void mo3811f(nw0 nw0Var, Executor executor) {
                    synchronized (this.f13304a) {
/* 4 */                 nw0Var.getClass();
/* 7 */                 this.f13310i = nw0Var;
/* 9 */                 executor.getClass();
/* 12 */                this.f13311v = executor;
/* 18 */                this.f13309f.mo3811f(this.f13307d, executor);
                    }
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: g */
                public final int mo3812g() {
                    int iMo3812g;
                    synchronized (this.f13304a) {
/* 6 */                 iMo3812g = this.f13309f.mo3812g();
                    }
/* 11 */            return iMo3812g;
                }

                @Override // p000.ow0
                public final int getHeight() {
                    int height;
                    synchronized (this.f13304a) {
/* 6 */                 height = this.f13309f.getHeight();
                    }
/* 11 */            return height;
                }

                @Override // p000.ow0
                public final Surface getSurface() {
                    Surface surface;
                    synchronized (this.f13304a) {
/* 6 */                 surface = this.f13309f.getSurface();
                    }
/* 11 */            return surface;
                }

                @Override // p000.ow0
                public final int getWidth() {
                    int width;
                    synchronized (this.f13304a) {
/* 6 */                 width = this.f13309f.getWidth();
                    }
/* 11 */            return width;
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: h */
                public final mw0 mo3813h() {
                    synchronized (this.f13304a) {
                        try {
/* 10 */                    if (this.f13302W.isEmpty()) {
/* 12 */                        return null;
                            }
/* 25 */                    if (this.f13301V >= this.f13302W.size()) {
/* 55 */                        throw new IllegalStateException("Maximum image number reached.");
                            }
/* 27 */                    ArrayList arrayList = this.f13302W;
/* 29 */                    int i = this.f13301V;
/* 33 */                    this.f13301V = i + 1;
/* 39 */                    mw0 mw0Var = (mw0) arrayList.get(i);
/* 43 */                    this.f13303X.add(mw0Var);
/* 47 */                    return mw0Var;
                        } catch (Throwable th) {
/* 57 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: i */
                public final void m6456i(ow0 ow0Var) {
                    mw0 mw0VarMo3813h;
                    synchronized (this.f13304a) {
                        try {
/* 6 */                     if (this.f13308e) {
/* 9 */                         return;
                            }
/* 24 */                    int size = this.f13300U.size() + this.f13302W.size();
/* 29 */                    if (size >= ow0Var.mo3812g()) {
/* 33 */                        hu0.m4312F0("MetadataImageReader");
/* 37 */                        return;
                            }
/* 87 */                    do {
                                try {
/* 38 */                            mw0VarMo3813h = ow0Var.mo3813h();
/* 42 */                            if (mw0VarMo3813h != null) {
/* 48 */                                this.f13306c--;
/* 50 */                                size++;
/* 62 */                                this.f13300U.put(mw0VarMo3813h.mo1727x0().mo4037b(), mw0VarMo3813h);
/* 65 */                                m6457j();
                                    }
                                } catch (IllegalStateException unused) {
/* 73 */                            hu0.m4312F0("MetadataImageReader");
/* 76 */                            mw0VarMo3813h = null;
                                }
/* 77 */                        if (mw0VarMo3813h == null || this.f13306c <= 0) {
                                    break;
                                }
/* 87 */                    } while (size < ow0Var.mo3812g());
                        } catch (Throwable th) {
/* 93 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: j */
                public final void m6457j() {
                    synchronized (this.f13304a) {
                        try {
/* 12 */                    for (int size = this.f13312w.size() - 1; size >= 0; size--) {
/* 20 */                        gw0 gw0Var = (gw0) this.f13312w.valueAt(size);
/* 22 */                        long jMo4037b = gw0Var.mo4037b();
/* 32 */                        mw0 mw0Var = (mw0) this.f13300U.get(jMo4037b);
/* 34 */                        if (mw0Var != null) {
/* 38 */                            this.f13300U.remove(jMo4037b);
/* 43 */                            this.f13312w.removeAt(size);
/* 52 */                            m6455e(new wb2(mw0Var, null, gw0Var));
                                }
                            }
/* 61 */                    m6458k();
                        } catch (Throwable th) {
/* 67 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: k */
                public final void m6458k() {
                    synchronized (this.f13304a) {
                        try {
/* 10 */                    if (this.f13300U.size() != 0 && this.f13312w.size() != 0) {
/* 24 */                        long jKeyAt = this.f13300U.keyAt(0);
/* 28 */                        Long lValueOf = Long.valueOf(jKeyAt);
/* 34 */                        long jKeyAt2 = this.f13312w.keyAt(0);
/* 48 */                        de3.m3024f(!Long.valueOf(jKeyAt2).equals(lValueOf));
/* 53 */                        if (jKeyAt2 > jKeyAt) {
/* 63 */                            for (int size = this.f13300U.size() - 1; size >= 0; size--) {
/* 73 */                                if (this.f13300U.keyAt(size) < jKeyAt2) {
/* 83 */                                    ((mw0) this.f13300U.valueAt(size)).close();
/* 88 */                                    this.f13300U.removeAt(size);
                                        }
                                    }
                                } else {
/* 105 */                           for (int size2 = this.f13312w.size() - 1; size2 >= 0; size2--) {
/* 115 */                               if (this.f13312w.keyAt(size2) < jKeyAt) {
/* 119 */                                   this.f13312w.removeAt(size2);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
/* 130 */                   throw th;
                        }
                    }
                }
            }
