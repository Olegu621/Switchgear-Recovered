            package p000;

            import java.util.Map;
            
            /* JADX INFO: renamed from: hd */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0987hd extends kx0 {

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f9014d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f9015e;

                public /* synthetic */ C0987hd(Object obj, int i) {
/* 1 */             this.f9014d = i;
/* 3 */             this.f9015e = obj;
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: b */
                public final void mo4166b() {
/* 1 */             int i = this.f9014d;
/* 3 */             Object obj = this.f9015e;
                    switch (i) {
                        case 0:
/* 16 */                    ((C1024id) obj).clear();
                            break;
                        default:
/* 10 */                    ((C1827kd) obj).clear();
                            break;
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: c */
                public final Object mo4167c(int i, int i2) {
/* 1 */             int i3 = this.f9014d;
/* 3 */             Object obj = this.f9015e;
                    switch (i3) {
                        case 0:
/* 22 */                    return ((C1024id) obj).f13212b[(i << 1) + i2];
                        default:
/* 12 */                    return ((C1827kd) obj).f12693b[i];
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: d */
                public final Map mo4168d() {
                    switch (this.f9014d) {
                        case 0:
/* 16 */                    return (C1024id) this.f9015e;
                        default:
/* 13 */                    throw new UnsupportedOperationException("not a map");
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: e */
                public final int mo4169e() {
/* 1 */             int i = this.f9014d;
/* 3 */             Object obj = this.f9015e;
                    switch (i) {
                        case 0:
/* 15 */                    return ((C1024id) obj).f13213c;
                        default:
/* 10 */                    return ((C1827kd) obj).f12694c;
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: f */
                public final int mo4170f(Object obj) {
/* 1 */             int i = this.f9014d;
/* 3 */             Object obj2 = this.f9015e;
                    switch (i) {
                        case 0:
/* 28 */                    return ((C1024id) obj2).m6425e(obj);
                        default:
/* 8 */                     C1827kd c1827kd = (C1827kd) obj2;
                            return obj == null ? c1827kd.m6093d() : c1827kd.m6092c(obj.hashCode(), obj);
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: g */
                public final int mo4171g(Object obj) {
/* 1 */             int i = this.f9014d;
/* 3 */             Object obj2 = this.f9015e;
                    switch (i) {
                        case 0:
/* 28 */                    return ((C1024id) obj2).m6427g(obj);
                        default:
/* 8 */                     C1827kd c1827kd = (C1827kd) obj2;
                            return obj == null ? c1827kd.m6093d() : c1827kd.m6092c(obj.hashCode(), obj);
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: h */
                public final void mo4172h(Object obj, Object obj2) {
/* 1 */             int i = this.f9014d;
/* 3 */             Object obj3 = this.f9015e;
                    switch (i) {
                        case 0:
/* 16 */                    ((C1024id) obj3).put(obj, obj2);
                            break;
                        default:
/* 10 */                    ((C1827kd) obj3).add(obj);
                            break;
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: i */
                public final void mo4173i(int i) {
/* 1 */             int i2 = this.f9014d;
/* 3 */             Object obj = this.f9015e;
                    switch (i2) {
                        case 0:
/* 16 */                    ((C1024id) obj).m6429i(i);
                            break;
                        default:
/* 10 */                    ((C1827kd) obj).m6094e(i);
                            break;
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: j */
                public final Object mo4174j(int i, Object obj) {
                    switch (this.f9014d) {
                        case 0:
/* 20 */                    int i2 = (i << 1) + 1;
/* 22 */                    Object[] objArr = ((C1024id) this.f9015e).f13212b;
/* 24 */                    Object obj2 = objArr[i2];
/* 26 */                    objArr[i2] = obj;
/* 28 */                    return obj2;
                        default:
/* 13 */                    throw new UnsupportedOperationException("not a map");
                    }
                }
            }
