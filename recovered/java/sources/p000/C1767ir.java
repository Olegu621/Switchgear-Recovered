            package p000;

            import android.util.ArrayMap;
            import android.view.Surface;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: renamed from: ir */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 107 */   public final class C1767ir implements ow0 {

                /* JADX INFO: renamed from: a */
                public int f11908a;

                /* JADX INFO: renamed from: b */
                public boolean f11909b;

                /* JADX INFO: renamed from: c */
                public final Object f11910c;

                /* JADX INFO: renamed from: d */
                public Object f11911d;

                /* JADX INFO: renamed from: e */
                public final Object f11912e;

                /* JADX INFO: renamed from: f */
                public Object f11913f;

                /* JADX INFO: renamed from: i */
                public Object f11914i;

                public C1767ir(C1803jr c1803jr) {
/* 6 */             HashSet hashSet = new HashSet();
/* 9 */             this.f11910c = hashSet;
/* 15 */            this.f11911d = uk1.m9034j();
/* 18 */            this.f11908a = -1;
/* 22 */            ArrayList arrayList = new ArrayList();
/* 25 */            this.f11912e = arrayList;
/* 28 */            this.f11909b = false;
/* 34 */            this.f11913f = cl1.m1721a();
/* 38 */            hashSet.addAll(c1803jr.f12441a);
/* 47 */            this.f11911d = uk1.m9035m(c1803jr.f12442b);
/* 51 */            this.f11908a = c1803jr.f12443c;
/* 55 */            arrayList.addAll(c1803jr.f12444d);
/* 60 */            this.f11909b = c1803jr.f12445e;
/* 62 */            nm2 nm2Var = c1803jr.f12446f;
/* 66 */            ArrayMap arrayMap = new ArrayMap();
/* 83 */            for (String str : nm2Var.f14383a.keySet()) {
/* 97 */                arrayMap.put(str, nm2Var.f14383a.get(str));
                    }
/* 106 */           this.f11913f = new cl1(arrayMap);
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: a */
                public int mo3809a() {
                    int iMo3809a;
                    synchronized (this.f11910c) {
/* 8 */                 iMo3809a = ((ow0) this.f11911d).mo3809a();
                    }
/* 13 */            return iMo3809a;
                }

                @Override // p000.ow0
                public mw0 acquireLatestImage() {
                    vv0 vv0Var;
                    synchronized (this.f11910c) {
/* 8 */                 mw0 mw0VarAcquireLatestImage = ((ow0) this.f11911d).acquireLatestImage();
/* 12 */                if (mw0VarAcquireLatestImage != null) {
/* 18 */                    this.f11908a++;
/* 22 */                    vv0Var = new vv0(mw0VarAcquireLatestImage);
/* 29 */                    vv0Var.m1725c((uv0) this.f11914i);
                        } else {
/* 33 */                    vv0Var = null;
                        }
                    }
/* 35 */            return vv0Var;
                }

                /* JADX INFO: renamed from: b */
                public void m5543b(Collection collection) {
/* 1 */             Iterator it = collection.iterator();
/* 9 */             while (it.hasNext()) {
/* 17 */                m5544c((AbstractC1934mo) it.next());
                    }
                }

                /* JADX INFO: renamed from: c */
                public void m5544c(AbstractC1934mo abstractC1934mo) {
/* 3 */             ArrayList arrayList = (ArrayList) this.f11912e;
/* 9 */             if (arrayList.contains(abstractC1934mo)) {
/* 11 */                return;
                    }
/* 12 */            arrayList.add(abstractC1934mo);
                }

                @Override // p000.ow0
                public void close() {
                    synchronized (this.f11910c) {
                        try {
/* 6 */                     Surface surface = (Surface) this.f11912e;
/* 8 */                     if (surface != null) {
/* 10 */                        surface.release();
                            }
/* 20 */                    ((ow0) this.f11911d).close();
                        } catch (Throwable th) {
/* 26 */                    throw th;
                        }
                    }
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: d */
                public void mo3810d() {
                    synchronized (this.f11910c) {
/* 8 */                 ((ow0) this.f11911d).mo3810d();
                    }
                }

                /* JADX INFO: renamed from: e */
                public void m5545e(InterfaceC2235ty interfaceC2235ty) {
/* 13 */            for (C1888lf c1888lf : interfaceC2235ty.mo7024c()) {
/* 23 */                uk1 uk1Var = (uk1) this.f11911d;
/* 25 */                uk1Var.getClass();
                        try {
/* 28 */                    uk1Var.mo7025e(c1888lf);
                        } catch (IllegalArgumentException unused) {
                        }
/* 43 */                ((uk1) this.f11911d).m9036o(c1888lf, interfaceC2235ty.mo7029i(c1888lf), interfaceC2235ty.mo7025e(c1888lf));
                    }
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: f */
                public void mo3811f(nw0 nw0Var, Executor executor) {
                    synchronized (this.f11910c) {
/* 15 */                ((ow0) this.f11911d).mo3811f(new C2076pn(13, this, nw0Var), executor);
                    }
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: g */
                public int mo3812g() {
                    int iMo3812g;
                    synchronized (this.f11910c) {
/* 8 */                 iMo3812g = ((ow0) this.f11911d).mo3812g();
                    }
/* 13 */            return iMo3812g;
                }

                @Override // p000.ow0
                public int getHeight() {
                    int height;
                    synchronized (this.f11910c) {
/* 8 */                 height = ((ow0) this.f11911d).getHeight();
                    }
/* 13 */            return height;
                }

                @Override // p000.ow0
                public Surface getSurface() {
                    Surface surface;
                    synchronized (this.f11910c) {
/* 8 */                 surface = ((ow0) this.f11911d).getSurface();
                    }
/* 13 */            return surface;
                }

                @Override // p000.ow0
                public int getWidth() {
                    int width;
                    synchronized (this.f11910c) {
/* 8 */                 width = ((ow0) this.f11911d).getWidth();
                    }
/* 13 */            return width;
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: h */
                public mw0 mo3813h() {
                    vv0 vv0Var;
                    synchronized (this.f11910c) {
/* 8 */                 mw0 mw0VarMo3813h = ((ow0) this.f11911d).mo3813h();
/* 12 */                if (mw0VarMo3813h != null) {
/* 18 */                    this.f11908a++;
/* 22 */                    vv0Var = new vv0(mw0VarMo3813h);
/* 29 */                    vv0Var.m1725c((uv0) this.f11914i);
                        } else {
/* 33 */                    vv0Var = null;
                        }
                    }
/* 35 */            return vv0Var;
                }

                /* JADX INFO: renamed from: i */
                public C1803jr m5546i() {
/* 9 */             ArrayList arrayList = new ArrayList((HashSet) this.f11910c);
/* 16 */            nq1 nq1VarM7021d = nq1.m7021d((uk1) this.f11911d);
/* 20 */            int i = this.f11908a;
/* 28 */            ArrayList arrayList2 = new ArrayList((ArrayList) this.f11912e);
/* 31 */            boolean z = this.f11909b;
/* 35 */            cl1 cl1Var = (cl1) this.f11913f;
/* 37 */            nm2 nm2Var = nm2.f14382b;
/* 41 */            ArrayMap arrayMap = new ArrayMap();
/* 58 */            for (String str : cl1Var.f14383a.keySet()) {
/* 72 */                arrayMap.put(str, cl1Var.f14383a.get(str));
                    }
/* 86 */            return new C1803jr(arrayList, nq1VarM7021d, i, arrayList2, z, new nm2(arrayMap), (InterfaceC2188so) this.f11914i);
                }

                /* JADX INFO: renamed from: j */
                public void m5547j() {
                    synchronized (this.f11910c) {
                        try {
/* 5 */                     this.f11909b = true;
/* 11 */                    ((ow0) this.f11911d).mo3810d();
/* 16 */                    if (this.f11908a == 0) {
/* 18 */                        close();
                            }
                        } catch (Throwable th) {
/* 27 */                    throw th;
                        }
                    }
                }

/* 108 */       public C1767ir() {
/* 110 */           this.f11910c = new HashSet();
/* 111 */           this.f11911d = uk1.m9034j();
/* 112 */           this.f11908a = -1;
/* 113 */           this.f11912e = new ArrayList();
/* 114 */           this.f11909b = false;
/* 115 */           this.f11913f = cl1.m1721a();
                }

/* 115 */       public C1767ir(ow0 ow0Var) {
/* 117 */           this.f11910c = new Object();
/* 118 */           this.f11908a = 0;
/* 119 */           this.f11909b = false;
/* 120 */           this.f11914i = new uv0(this, 1);
/* 121 */           this.f11911d = ow0Var;
/* 122 */           this.f11912e = ow0Var.getSurface();
                }
            }
