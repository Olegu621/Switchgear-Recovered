            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class cf0 implements Runnable, Comparable, e90 {
                private volatile Object _heap;

                /* JADX INFO: renamed from: a */
                public long f2872a;

                /* JADX INFO: renamed from: b */
                public int f2873b = -1;

                public cf0(long j) {
/* 4 */             this.f2872a = j;
                }

                /* JADX INFO: renamed from: a */
                public final int m1650a(long j, df0 df0Var, ef0 ef0Var) {
                    synchronized (this) {
/* 6 */                 if (this._heap == he3.f9034b) {
/* 9 */                     return 2;
                        }
                        synchronized (df0Var) {
                            try {
/* 12 */                        cf0[] cf0VarArr = df0Var.f7816a;
/* 20 */                        cf0 cf0Var = cf0VarArr != null ? cf0VarArr[0] : null;
/* 33 */                        if (ef0.f7665w.get(ef0Var) != 0) {
/* 27 */                            return 1;
                                }
/* 42 */                        if (cf0Var == null) {
/* 44 */                            df0Var.f7156c = j;
                                } else {
/* 49 */                            long j2 = cf0Var.f2872a;
/* 55 */                            if (j2 - j < 0) {
/* 58 */                                j = j2;
                                    }
/* 65 */                            if (j - df0Var.f7156c > 0) {
/* 67 */                                df0Var.f7156c = j;
                                    }
                                }
/* 69 */                        long j3 = this.f2872a;
/* 71 */                        long j4 = df0Var.f7156c;
/* 76 */                        if (j3 - j4 < 0) {
/* 78 */                            this.f2872a = j4;
                                }
/* 80 */                        df0Var.m3531a(this);
/* 14 */                        return 0;
                            } catch (Throwable th) {
/* 87 */                        throw th;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m1651c(df0 df0Var) {
/* 5 */             if (this._heap != he3.f9034b) {
/* 7 */                 this._heap = df0Var;
                    } else {
/* 12 */                C1951n4.m6859j("Failed requirement.");
                    }
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 7 */             long j = this.f2872a - ((cf0) obj).f2872a;
/* 12 */            if (j > 0) {
/* 14 */                return 1;
                    }
                    return j < 0 ? -1 : 0;
                }

                @Override // p000.e90
                public final void dispose() {
                    synchronized (this) {
                        try {
/* 2 */                     Object obj = this._heap;
/* 4 */                     C2131r4 c2131r4 = he3.f9034b;
/* 6 */                     if (obj == c2131r4) {
/* 9 */                         return;
                            }
/* 20 */                    df0 df0Var = obj instanceof df0 ? (df0) obj : null;
/* 21 */                    if (df0Var != null) {
                                synchronized (df0Var) {
/* 24 */                            Object obj2 = this._heap;
/* 33 */                            if ((obj2 instanceof eo2 ? (eo2) obj2 : null) != null) {
/* 38 */                                df0Var.m3532b(this.f2873b);
                                    }
                                }
                            }
/* 46 */                    this._heap = c2131r4;
                        } catch (Throwable th) {
/* 51 */                    throw th;
                        }
                    }
                }

                public String toString() {
/* 18 */            return "Delayed[nanos=" + this.f2872a + ']';
                }
            }
