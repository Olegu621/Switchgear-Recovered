            package p000;

            import java.util.AbstractMap;
            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ff2 implements Iterator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8187a;

                /* JADX INFO: renamed from: b */
                public int f8188b = -1;

                /* JADX INFO: renamed from: c */
                public boolean f8189c;

                /* JADX INFO: renamed from: d */
                public Iterator f8190d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ AbstractMap f8191e;

                public /* synthetic */ ff2(AbstractMap abstractMap, int i) {
/* 1 */             this.f8187a = i;
/* 3 */             this.f8191e = abstractMap;
                }

                /* JADX INFO: renamed from: a */
                public Iterator m3759a() {
/* 3 */             if (this.f8190d == null) {
/* 19 */                this.f8190d = ((df2) this.f8191e).f7162b.entrySet().iterator();
                    }
/* 21 */            return this.f8190d;
                }

                /* JADX INFO: renamed from: b */
                public Iterator m3760b() {
/* 3 */             if (this.f8190d == null) {
/* 19 */                this.f8190d = ((hq3) this.f8191e).f9204c.entrySet().iterator();
                    }
/* 21 */            return this.f8190d;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 1 */             int i = this.f8187a;
/* 3 */             AbstractMap abstractMap = this.f8191e;
                    switch (i) {
                        case 0:
/* 47 */                    df2 df2Var = (df2) abstractMap;
/* 55 */                    if (this.f8188b + 1 >= df2Var.f7161a.size()) {
                                return !df2Var.f7162b.isEmpty() && m3759a().hasNext();
                            }
/* 5 */                     return true;
                        default:
/* 13 */                    hq3 hq3Var = (hq3) abstractMap;
/* 21 */                    if (this.f8188b + 1 >= hq3Var.f9203b.size()) {
                                return !hq3Var.f9204c.isEmpty() && m3760b().hasNext();
                            }
/* 5 */                     return true;
                    }
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 1 */             int i = this.f8187a;
/* 3 */             AbstractMap abstractMap = this.f8191e;
                    switch (i) {
                        case 0:
/* 48 */                    this.f8189c = true;
/* 52 */                    int i2 = this.f8188b + 1;
/* 53 */                    this.f8188b = i2;
/* 55 */                    df2 df2Var = (df2) abstractMap;
                            return i2 < df2Var.f7161a.size() ? (Map.Entry) df2Var.f7161a.get(this.f8188b) : (Map.Entry) m3759a().next();
                        default:
/* 9 */                     this.f8189c = true;
/* 13 */                    int i3 = this.f8188b + 1;
/* 14 */                    this.f8188b = i3;
/* 16 */                    hq3 hq3Var = (hq3) abstractMap;
                            return i3 < hq3Var.f9203b.size() ? (Map.Entry) hq3Var.f9203b.get(this.f8188b) : (Map.Entry) m3760b().next();
                    }
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 1 */             int i = this.f8187a;
/* 6 */             AbstractMap abstractMap = this.f8191e;
                    switch (i) {
                        case 0:
/* 54 */                    df2 df2Var = (df2) abstractMap;
/* 58 */                    if (!this.f8189c) {
/* 95 */                        f42.m3656l("remove() was called before next()");
                            } else {
/* 60 */                        this.f8189c = false;
/* 62 */                        int i2 = df2.f7160f;
/* 64 */                        df2Var.m3049b();
/* 75 */                        if (this.f8188b >= df2Var.f7161a.size()) {
/* 91 */                            m3759a().remove();
                                } else {
/* 77 */                            int i3 = this.f8188b;
/* 81 */                            this.f8188b = i3 - 1;
/* 83 */                            df2Var.m3054h(i3);
                                }
                            }
                            break;
                        default:
/* 11 */                    hq3 hq3Var = (hq3) abstractMap;
/* 15 */                    if (!this.f8189c) {
/* 50 */                        f42.m3656l("remove() was called before next()");
                            } else {
/* 17 */                        this.f8189c = false;
/* 19 */                        hq3Var.m4270f();
/* 30 */                        if (this.f8188b >= hq3Var.f9203b.size()) {
/* 46 */                            m3760b().remove();
                                } else {
/* 32 */                            int i4 = this.f8188b;
/* 36 */                            this.f8188b = i4 - 1;
/* 38 */                            hq3Var.m4268d(i4);
                                }
                            }
                            break;
                    }
                }
            }
