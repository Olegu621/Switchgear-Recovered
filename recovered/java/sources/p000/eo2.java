            package p000;

            import java.util.Arrays;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class eo2 {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f7815b = AtomicIntegerFieldUpdater.newUpdater(eo2.class, "_size$volatile");
                private volatile /* synthetic */ int _size$volatile;

                /* JADX INFO: renamed from: a */
                public cf0[] f7816a;

                /* JADX INFO: renamed from: a */
                public final void m3531a(cf0 cf0Var) {
/* 4 */             cf0Var.m1651c((df0) this);
/* 7 */             cf0[] cf0VarArr = this.f7816a;
/* 9 */             AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7815b;
/* 11 */            if (cf0VarArr == null) {
/* 14 */                cf0VarArr = new cf0[4];
/* 16 */                this.f7816a = cf0VarArr;
                    } else if (atomicIntegerFieldUpdater.get(this) >= cf0VarArr.length) {
/* 36 */                cf0VarArr = (cf0[]) Arrays.copyOf(cf0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
/* 38 */                this.f7816a = cf0VarArr;
                    }
/* 40 */            int i = atomicIntegerFieldUpdater.get(this);
/* 46 */            atomicIntegerFieldUpdater.set(this, i + 1);
/* 49 */            cf0VarArr[i] = cf0Var;
/* 51 */            cf0Var.f2873b = i;
/* 53 */            m3533c(i);
                }

                /* JADX WARN: Code duplicated, block: B:12:0x0045  */
                /* JADX WARN: Code duplicated, block: B:14:0x0052  */
                /* JADX WARN: Code duplicated, block: B:17:0x0063  */
                /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
                /* JADX INFO: renamed from: b */
                public final cf0 m3532b(int i) {
                    int i2;
                    int i3;
                    Object[] objArr;
                    int i4;
                    Comparable comparable;
                    Comparable comparable2;
                    Comparable comparable3;
                    Object obj;
/* 1 */             Object[] objArr2 = this.f7816a;
/* 3 */             objArr2.getClass();
/* 6 */             AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7815b;
/* 14 */            atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
/* 21 */            if (i < atomicIntegerFieldUpdater.get(this)) {
/* 27 */                m3534d(i, atomicIntegerFieldUpdater.get(this));
/* 32 */                int i5 = (i - 1) / 2;
/* 34 */                if (i > 0) {
/* 36 */                    cf0 cf0Var = objArr2[i];
/* 38 */                    cf0Var.getClass();
/* 41 */                    Object obj2 = objArr2[i5];
/* 43 */                    obj2.getClass();
/* 50 */                    if (cf0Var.compareTo(obj2) < 0) {
/* 52 */                        m3534d(i, i5);
/* 55 */                        m3533c(i5);
                            } else {
                                while (true) {
/* 59 */                            i2 = i * 2;
/* 61 */                            i3 = i2 + 1;
/* 67 */                            if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                                        break;
                                    }
/* 70 */                            objArr = this.f7816a;
/* 72 */                            objArr.getClass();
/* 75 */                            i4 = i2 + 2;
/* 81 */                            if (i4 < atomicIntegerFieldUpdater.get(this)) {
/* 83 */                                comparable3 = objArr[i4];
/* 85 */                                comparable3.getClass();
/* 88 */                                obj = objArr[i3];
/* 90 */                                obj.getClass();
/* 97 */                                if (comparable3.compareTo(obj) >= 0) {
/* 100 */                                   i4 = i3;
                                        }
                                    } else {
/* 100 */                               i4 = i3;
                                    }
/* 101 */                           comparable = objArr[i];
/* 103 */                           comparable.getClass();
/* 106 */                           comparable2 = objArr[i4];
/* 108 */                           comparable2.getClass();
/* 115 */                           if (comparable.compareTo(comparable2) <= 0) {
                                        break;
                                    }
/* 118 */                           m3534d(i, i4);
/* 121 */                           i = i4;
                                }
                            }
                        } else {
                            while (true) {
/* 59 */                        i2 = i * 2;
/* 61 */                        i3 = i2 + 1;
/* 67 */                        if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                                    break;
                                    break;
                                }
/* 70 */                        objArr = this.f7816a;
/* 72 */                        objArr.getClass();
/* 75 */                        i4 = i2 + 2;
/* 81 */                        if (i4 < atomicIntegerFieldUpdater.get(this)) {
/* 83 */                            comparable3 = objArr[i4];
/* 85 */                            comparable3.getClass();
/* 88 */                            obj = objArr[i3];
/* 90 */                            obj.getClass();
/* 97 */                            if (comparable3.compareTo(obj) >= 0) {
/* 100 */                               i4 = i3;
                                    }
                                } else {
/* 100 */                           i4 = i3;
                                }
/* 101 */                       comparable = objArr[i];
/* 103 */                       comparable.getClass();
/* 106 */                       comparable2 = objArr[i4];
/* 108 */                       comparable2.getClass();
/* 115 */                       if (comparable.compareTo(comparable2) <= 0) {
                                    break;
                                    break;
                                }
/* 118 */                       m3534d(i, i4);
/* 121 */                       i = i4;
                            }
                        }
                    }
/* 127 */           cf0 cf0Var2 = objArr2[atomicIntegerFieldUpdater.get(this)];
/* 129 */           cf0Var2.getClass();
/* 133 */           cf0Var2.m1651c(null);
/* 136 */           cf0Var2.f2873b = -1;
/* 142 */           objArr2[atomicIntegerFieldUpdater.get(this)] = null;
/* 144 */           return cf0Var2;
                }

                /* JADX INFO: renamed from: c */
                public final void m3533c(int i) {
/* 1 */             while (i > 0) {
/* 4 */                 cf0[] cf0VarArr = this.f7816a;
/* 6 */                 cf0VarArr.getClass();
/* 11 */                int i2 = (i - 1) / 2;
/* 13 */                cf0 cf0Var = cf0VarArr[i2];
/* 15 */                cf0Var.getClass();
/* 18 */                cf0 cf0Var2 = cf0VarArr[i];
/* 20 */                cf0Var2.getClass();
/* 27 */                if (cf0Var.compareTo(cf0Var2) <= 0) {
/* 29 */                    return;
                        }
/* 30 */                m3534d(i, i2);
/* 33 */                i = i2;
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m3534d(int i, int i2) {
/* 1 */             cf0[] cf0VarArr = this.f7816a;
/* 3 */             cf0VarArr.getClass();
/* 6 */             cf0 cf0Var = cf0VarArr[i2];
/* 8 */             cf0Var.getClass();
/* 11 */            cf0 cf0Var2 = cf0VarArr[i];
/* 13 */            cf0Var2.getClass();
/* 16 */            cf0VarArr[i] = cf0Var;
/* 18 */            cf0VarArr[i2] = cf0Var2;
/* 20 */            cf0Var.f2873b = i;
/* 22 */            cf0Var2.f2873b = i2;
                }
            }
