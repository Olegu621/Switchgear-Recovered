            package com.google.android.gms.common.data;

            import android.database.CursorIndexOutOfBoundsException;
            import android.database.CursorWindow;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.Closeable;
            import java.util.ArrayList;
            import java.util.HashMap;
            import p000.C1951n4;
            import p000.kb1;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class DataHolder extends AbstractSafeParcelable implements Closeable {
                public static final Parcelable.Creator<DataHolder> CREATOR = new ub3(0);

                /* JADX INFO: renamed from: a */
                public final int f3463a;

                /* JADX INFO: renamed from: b */
                public final String[] f3464b;

                /* JADX INFO: renamed from: c */
                public Bundle f3465c;

                /* JADX INFO: renamed from: d */
                public final CursorWindow[] f3466d;

                /* JADX INFO: renamed from: e */
                public final int f3467e;

                /* JADX INFO: renamed from: f */
                public final Bundle f3468f;

                /* JADX INFO: renamed from: i */
                public int[] f3469i;

                /* JADX INFO: renamed from: v */
                public int f3470v;

                /* JADX INFO: renamed from: w */
                public boolean f3471w = false;

                static {
/* 11 */            new ArrayList();
/* 16 */            new HashMap();
                }

                public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
/* 7 */             this.f3463a = i;
/* 9 */             this.f3464b = strArr;
/* 11 */            this.f3466d = cursorWindowArr;
/* 13 */            this.f3467e = i2;
/* 15 */            this.f3468f = bundle;
                }

                /* JADX INFO: renamed from: D1 */
                public final boolean m2012D1(int i, int i2, String str) {
/* 1 */             m2017I1(i, str);
                    return this.f3466d[i2].getLong(i, this.f3465c.getInt(str)) == 1;
                }

                /* JADX INFO: renamed from: E1 */
                public final int m2013E1(int i, int i2, String str) {
/* 1 */             m2017I1(i, str);
/* 14 */            return this.f3466d[i2].getInt(i, this.f3465c.getInt(str));
                }

                /* JADX INFO: renamed from: F1 */
                public final long m2014F1(int i, int i2, String str) {
/* 1 */             m2017I1(i, str);
/* 14 */            return this.f3466d[i2].getLong(i, this.f3465c.getInt(str));
                }

                /* JADX INFO: renamed from: G1 */
                public final String m2015G1(int i, int i2, String str) {
/* 1 */             m2017I1(i, str);
/* 14 */            return this.f3466d[i2].getString(i, this.f3465c.getInt(str));
                }

                /* JADX INFO: renamed from: H1 */
                public final int m2016H1(int i) {
                    int length;
/* 1 */             int i2 = 0;
/* 11 */            kb1.m6065r(i >= 0 && i < this.f3470v);
                    while (true) {
/* 14 */                int[] iArr = this.f3469i;
/* 16 */                length = iArr.length;
/* 17 */                if (i2 >= length) {
                            break;
                        }
/* 21 */                if (i < iArr[i2]) {
/* 23 */                    i2--;
                            break;
                        }
/* 26 */                i2++;
                    }
                    return i2 == length ? i2 - 1 : i2;
                }

                /* JADX INFO: renamed from: I1 */
                public final void m2017I1(int i, String str) {
                    boolean z;
/* 1 */             Bundle bundle = this.f3465c;
/* 3 */             if (bundle == null || !bundle.containsKey(str)) {
/* 51 */                C1951n4.m6859j("No such column: ".concat(String.valueOf(str)));
/* 54 */                return;
                    }
                    synchronized (this) {
/* 12 */                z = this.f3471w;
                    }
/* 15 */            if (z) {
/* 34 */                C1951n4.m6859j("Buffer is closed.");
                    } else if (i < 0 || i >= this.f3470v) {
/* 31 */                throw new CursorIndexOutOfBoundsException(i, this.f3470v);
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    synchronized (this) {
                        try {
/* 4 */                     if (!this.f3471w) {
/* 7 */                         this.f3471w = true;
/* 9 */                         int i = 0;
                                while (true) {
/* 10 */                            CursorWindow[] cursorWindowArr = this.f3466d;
/* 13 */                            if (i >= cursorWindowArr.length) {
                                        break;
                                    }
/* 17 */                            cursorWindowArr[i].close();
/* 20 */                            i++;
                                }
                            }
                        } catch (Throwable th) {
/* 28 */                    throw th;
                        }
                    }
                }

                public final void finalize() throws Throwable {
                    boolean z;
                    try {
/* 6 */                 if (this.f3466d.length > 0) {
                            synchronized (this) {
/* 9 */                         z = this.f3471w;
                            }
/* 12 */                    if (!z) {
/* 14 */                        close();
/* 40 */                        AbstractC1245n0.m4876d("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
                            }
                        }
/* 49 */                super.finalize();
                    } catch (Throwable th) {
/* 53 */                super.finalize();
/* 56 */                throw th;
                    }
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9411U(parcel, 1, this.f3464b, false);
/* 17 */            w11.m9413W(parcel, 2, this.f3466d, i);
/* 22 */            w11.m9420b0(parcel, 3, 4);
/* 27 */            parcel.writeInt(this.f3467e);
/* 32 */            w11.m9402L(parcel, 4, this.f3468f, false);
/* 37 */            w11.m9420b0(parcel, 1000, 4);
/* 42 */            parcel.writeInt(this.f3463a);
/* 45 */            w11.m9428f0(iM9422c0, parcel);
/* 50 */            if ((i & 1) != 0) {
/* 52 */                close();
                    }
                }
            }
