            package com.google.android.gms.measurement.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.cl3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzog extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzog> CREATOR = new cl3(16);

                /* JADX INFO: renamed from: a */
                public final String f4215a;

                /* JADX INFO: renamed from: b */
                public final long f4216b;

                /* JADX INFO: renamed from: c */
                public final int f4217c;

                public zzog(String str, long j, int i) {
/* 4 */             this.f4215a = str;
/* 6 */             this.f4216b = j;
/* 8 */             this.f4217c = i;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f4215a, false);
/* 17 */            w11.m9420b0(parcel, 2, 8);
/* 22 */            parcel.writeLong(this.f4216b);
/* 27 */            w11.m9420b0(parcel, 3, 4);
/* 32 */            parcel.writeInt(this.f4217c);
/* 35 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
