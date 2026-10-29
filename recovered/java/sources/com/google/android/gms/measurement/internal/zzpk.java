            package com.google.android.gms.measurement.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.C1951n4;
            import p000.cl3;
            import p000.kb1;
            import p000.rp3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 69 */    public final class zzpk extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzpk> CREATOR = new cl3(24);

                /* JADX INFO: renamed from: a */
                public final int f4227a;

                /* JADX INFO: renamed from: b */
                public final String f4228b;

                /* JADX INFO: renamed from: c */
                public final long f4229c;

                /* JADX INFO: renamed from: d */
                public final Long f4230d;

                /* JADX INFO: renamed from: e */
                public final String f4231e;

                /* JADX INFO: renamed from: f */
                public final String f4232f;

                /* JADX INFO: renamed from: i */
                public final Double f4233i;

                public zzpk(long j, Object obj, String str, String str2) {
/* 4 */             kb1.m6058k(str);
/* 8 */             this.f4227a = 2;
/* 10 */            this.f4228b = str;
/* 12 */            this.f4229c = j;
/* 14 */            this.f4232f = str2;
/* 17 */            if (obj == null) {
/* 19 */                this.f4230d = null;
/* 21 */                this.f4233i = null;
/* 23 */                this.f4231e = null;
/* 25 */                return;
                    }
/* 28 */            if (obj instanceof Long) {
/* 32 */                this.f4230d = (Long) obj;
/* 34 */                this.f4233i = null;
/* 36 */                this.f4231e = null;
                    } else if (obj instanceof String) {
/* 43 */                this.f4230d = null;
/* 45 */                this.f4233i = null;
/* 49 */                this.f4231e = (String) obj;
                    } else {
/* 54 */                if (!(obj instanceof Double)) {
/* 67 */                    C1951n4.m6859j("User attribute given of un-supported type");
/* 70 */                    throw null;
                        }
/* 56 */                this.f4230d = null;
/* 60 */                this.f4233i = (Double) obj;
/* 62 */                this.f4231e = null;
                    }
                }

                /* JADX INFO: renamed from: D1 */
                public final Object m2197D1() {
/* 1 */             Long l = this.f4230d;
/* 3 */             if (l != null) {
/* 5 */                 return l;
                    }
/* 6 */             Double d = this.f4233i;
/* 8 */             if (d != null) {
/* 10 */                return d;
                    }
/* 11 */            String str = this.f4231e;
/* 13 */            if (str != null) {
/* 15 */                return str;
                    }
/* 16 */            return null;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             cl3.m1723b(this, parcel);
                }

/* 70 */        public zzpk(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
/* 72 */            this.f4227a = i;
                    this.f4228b = str;
                    this.f4229c = j;
                    this.f4230d = l;
/* 73 */            this.f4233i = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
                    this.f4231e = str2;
                    this.f4232f = str3;
                }

/* 73 */        public zzpk(rp3 rp3Var) {
/* 74 */            this(rp3Var.f16227d, rp3Var.f16228e, rp3Var.f16226c, rp3Var.f16225b);
                }
            }
