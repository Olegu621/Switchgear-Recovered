            package com.google.android.gms.measurement.internal;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.cl3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzol extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzol> CREATOR = new cl3(17);

                /* JADX INFO: renamed from: a */
                public final long f4218a;

                /* JADX INFO: renamed from: b */
                public byte[] f4219b;

                /* JADX INFO: renamed from: c */
                public final String f4220c;

                /* JADX INFO: renamed from: d */
                public final Bundle f4221d;

                /* JADX INFO: renamed from: e */
                public final int f4222e;

                /* JADX INFO: renamed from: f */
                public final long f4223f;

                /* JADX INFO: renamed from: i */
                public String f4224i;

                public zzol(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
/* 4 */             this.f4218a = j;
/* 6 */             this.f4219b = bArr;
/* 8 */             this.f4220c = str;
/* 10 */            this.f4221d = bundle;
/* 12 */            this.f4222e = i;
/* 14 */            this.f4223f = j2;
/* 16 */            this.f4224i = str2;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 10 */            w11.m9420b0(parcel, 1, 8);
/* 15 */            parcel.writeLong(this.f4218a);
/* 22 */            w11.m9403M(parcel, 2, this.f4219b, false);
/* 28 */            w11.m9410T(parcel, 3, this.f4220c, false);
/* 34 */            w11.m9402L(parcel, 4, this.f4221d, false);
/* 38 */            w11.m9420b0(parcel, 5, 4);
/* 43 */            parcel.writeInt(this.f4222e);
/* 47 */            w11.m9420b0(parcel, 6, 8);
/* 52 */            parcel.writeLong(this.f4223f);
/* 58 */            w11.m9410T(parcel, 7, this.f4224i, false);
/* 61 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
