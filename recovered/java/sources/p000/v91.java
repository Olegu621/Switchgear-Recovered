            package p000;

            import io.sentry.util.AbstractC1703b;
            import java.util.concurrent.atomic.AtomicLongFieldUpdater;
            import java.util.concurrent.atomic.AtomicReferenceArray;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class v91 {
                private volatile /* synthetic */ Object _next$volatile;
                private volatile /* synthetic */ long _state$volatile;

                /* JADX INFO: renamed from: a */
                public final int f17922a;

                /* JADX INFO: renamed from: b */
                public final boolean f17923b;

                /* JADX INFO: renamed from: c */
                public final int f17924c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ AtomicReferenceArray f17925d;

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f17918e = AtomicReferenceFieldUpdater.newUpdater(v91.class, Object.class, "_next$volatile");

                /* JADX INFO: renamed from: h */
                public static final /* synthetic */ long f17921h = AbstractC1703b.f11726a.objectFieldOffset(v91.class.getDeclaredField("_next$volatile"));

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ AtomicLongFieldUpdater f17919f = AtomicLongFieldUpdater.newUpdater(v91.class, "_state$volatile");

                /* JADX INFO: renamed from: g */
                public static final C2131r4 f17920g = new C2131r4("REMOVE_FROZEN", 8);

                public v91(int i, boolean z) {
/* 4 */             this.f17922a = i;
/* 6 */             this.f17923b = z;
/* 8 */             int i2 = i - 1;
/* 10 */            this.f17924c = i2;
/* 17 */            this.f17925d = new AtomicReferenceArray(i);
/* 24 */            if (i2 > 1073741823) {
/* 36 */                f42.m3656l("Check failed.");
/* 40 */                throw null;
                    }
/* 28 */            if ((i & i2) == 0) {
/* 30 */                return;
                    }
/* 31 */            f42.m3656l("Check failed.");
/* 35 */            throw null;
                }

                /* JADX INFO: renamed from: a */
                public final int m9233a(Object obj) {
                    while (true) {
/* 1 */                 AtomicLongFieldUpdater atomicLongFieldUpdater = f17919f;
/* 3 */                 long j = atomicLongFieldUpdater.get(this);
/* 14 */                if ((3458764513820540928L & j) != 0) {
                            return (2305843009213693952L & j) != 0 ? 2 : 1;
                        }
/* 29 */                int i = (int) (1073741823 & j);
/* 39 */                int i2 = (int) ((1152921503533105152L & j) >> 30);
/* 42 */                int i3 = this.f17924c;
/* 47 */                if (((i2 + 2) & i3) == (i & i3)) {
/* 80 */                    return 1;
                        }
/* 50 */                boolean z = this.f17923b;
/* 55 */                AtomicReferenceArray atomicReferenceArray = this.f17925d;
/* 57 */                if (z || atomicReferenceArray.get(i2 & i3) == null) {
/* 97 */                    v91 v91Var = this;
/* 102 */                   if (f17919f.compareAndSet(v91Var, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
/* 106 */                       atomicReferenceArray.set(i2 & i3, obj);
/* 109 */                       v91 v91VarM9236d = v91Var;
/* 119 */                       while ((atomicLongFieldUpdater.get(v91VarM9236d) & 1152921504606846976L) != 0) {
/* 121 */                           v91VarM9236d = v91VarM9236d.m9236d();
/* 125 */                           AtomicReferenceArray atomicReferenceArray2 = v91VarM9236d.f17925d;
/* 129 */                           int i4 = v91VarM9236d.f17924c & i2;
/* 130 */                           Object obj2 = atomicReferenceArray2.get(i4);
/* 136 */                           if ((obj2 instanceof u91) && ((u91) obj2).f17427a == i2) {
/* 144 */                               atomicReferenceArray2.set(i4, obj);
                                    } else {
/* 148 */                               v91VarM9236d = null;
                                    }
/* 149 */                           if (v91VarM9236d == null) {
/* 151 */                               return 0;
                                    }
                                }
/* 151 */                       return 0;
                            }
/* 153 */                   this = v91Var;
                        } else {
/* 69 */                    int i5 = this.f17922a;
/* 71 */                    if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
/* 80 */                        return 1;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final v91 m9234b(long j) {
                    v91 v91Var;
                    while (true) {
/* 3 */                 f17918e.getClass();
/* 6 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */                 long j2 = f17921h;
/* 14 */                v91 v91Var2 = (v91) unsafe.getObjectVolatile(this, j2);
/* 16 */                if (v91Var2 != null) {
/* 18 */                    return v91Var2;
                        }
/* 27 */                v91 v91Var3 = new v91(this.f17922a * 2, this.f17923b);
/* 34 */                int i = (int) (1073741823 & j);
/* 44 */                int i2 = (int) ((1152921503533105152L & j) >> 30);
                        while (true) {
/* 45 */                    int i3 = this.f17924c;
/* 47 */                    int i4 = i & i3;
/* 50 */                    if (i4 == (i3 & i2)) {
                                break;
                            }
/* 54 */                    Object u91Var = this.f17925d.get(i4);
/* 58 */                    if (u91Var == null) {
/* 62 */                        u91Var = new u91(i);
                            }
/* 70 */                    v91Var3.f17925d.set(v91Var3.f17924c & i, u91Var);
/* 73 */                    i++;
                        }
/* 84 */                f17919f.set(v91Var3, (-1152921504606846977L) & j);
                        while (true) {
/* 87 */                    Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 92 */                    v91Var = this;
/* 97 */                    if (unsafe2.compareAndSwapObject(v91Var, f17921h, (Object) null, v91Var3) || unsafe2.getObjectVolatile(v91Var, j2) != null) {
                                break;
                            }
/* 108 */                   this = v91Var;
                        }
/* 106 */               this = v91Var;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final boolean m9235c() {
                    while (true) {
/* 1 */                 AtomicLongFieldUpdater atomicLongFieldUpdater = f17919f;
/* 3 */                 long j = atomicLongFieldUpdater.get(this);
/* 16 */                if ((j & 2305843009213693952L) != 0) {
/* 15 */                    return true;
                        }
/* 24 */                if ((1152921504606846976L & j) != 0) {
/* 26 */                    return false;
                        }
/* 29 */                v91 v91Var = this;
/* 34 */                if (atomicLongFieldUpdater.compareAndSet(v91Var, j, 2305843009213693952L | j)) {
/* 15 */                    return true;
                        }
/* 37 */                this = v91Var;
                    }
                }

                /* JADX INFO: renamed from: d */
                public final v91 m9236d() {
                    long j;
                    v91 v91Var;
                    while (true) {
/* 1 */                 AtomicLongFieldUpdater atomicLongFieldUpdater = f17919f;
/* 3 */                 j = atomicLongFieldUpdater.get(this);
/* 15 */                if ((j & 1152921504606846976L) != 0) {
/* 17 */                    v91Var = this;
                            break;
                        }
/* 19 */                long j2 = 1152921504606846976L | j;
/* 20 */                v91Var = this;
/* 25 */                if (atomicLongFieldUpdater.compareAndSet(v91Var, j, j2)) {
/* 27 */                    j = j2;
                            break;
                        }
/* 33 */                this = v91Var;
                    }
/* 28 */            return v91Var.m9234b(j);
                }

                /* JADX INFO: renamed from: e */
                public final Object m9237e() {
/* 1 */             v91 v91VarM9236d = this;
                    while (true) {
/* 3 */                 AtomicLongFieldUpdater atomicLongFieldUpdater = f17919f;
/* 5 */                 long j = atomicLongFieldUpdater.get(v91VarM9236d);
/* 17 */                if ((j & 1152921504606846976L) != 0) {
/* 19 */                    return f17920g;
                        }
/* 27 */                int i = (int) (j & 1073741823);
/* 38 */                int i2 = v91VarM9236d.f17924c;
/* 41 */                int i3 = i & i2;
/* 44 */                if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
/* 47 */                    AtomicReferenceArray atomicReferenceArray = v91VarM9236d.f17925d;
/* 49 */                    Object obj = atomicReferenceArray.get(i3);
/* 53 */                    boolean z = v91VarM9236d.f17923b;
/* 55 */                    if (obj == null) {
/* 57 */                        if (z) {
                                }
                            } else if (!(obj instanceof u91)) {
/* 72 */                        long j2 = (i + 1) & 1073741823;
/* 97 */                        if (f17919f.compareAndSet(v91VarM9236d, j, (j & (-1073741824)) | j2)) {
/* 99 */                            atomicReferenceArray.set(i3, null);
/* 87 */                            return obj;
                                }
/* 103 */                       v91VarM9236d = this;
/* 105 */                       if (z) {
                                    while (true) {
/* 107 */                               long j3 = atomicLongFieldUpdater.get(v91VarM9236d);
/* 113 */                               int i4 = (int) (j3 & 1073741823);
/* 118 */                               if ((j3 & 1152921504606846976L) != 0) {
/* 120 */                                   v91VarM9236d = v91VarM9236d.m9236d();
                                        } else {
/* 132 */                                   v91 v91Var = v91VarM9236d;
/* 140 */                                   if (f17919f.compareAndSet(v91Var, j3, (j3 & (-1073741824)) | j2)) {
/* 147 */                                       v91Var.f17925d.set(i4 & v91Var.f17924c, null);
/* 150 */                                       v91VarM9236d = null;
                                            } else {
/* 154 */                                       v91VarM9236d = v91Var;
                                            }
                                        }
/* 151 */                               if (v91VarM9236d == null) {
/* 87 */                                    return obj;
                                        }
                                    }
                                }
                            }
                        }
/* 43 */                return null;
                    }
                }
            }
