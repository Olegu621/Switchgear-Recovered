            package com.google.android.gms.measurement.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.tc3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzaf extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzaf> CREATOR = new tc3(25);

                /* JADX INFO: renamed from: a */
                public final long f4192a;

                /* JADX INFO: renamed from: b */
                public final int f4193b;

                /* JADX INFO: renamed from: c */
                public final long f4194c;

                public zzaf(int i, long j, long j2) {
/* 4 */             this.f4192a = j;
/* 6 */             this.f4193b = i;
/* 8 */             this.f4194c = j2;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 10 */            w11.m9420b0(parcel, 1, 8);
/* 15 */            parcel.writeLong(this.f4192a);
/* 20 */            w11.m9420b0(parcel, 2, 4);
/* 25 */            parcel.writeInt(this.f4193b);
/* 29 */            w11.m9420b0(parcel, 3, 8);
/* 34 */            parcel.writeLong(this.f4194c);
/* 37 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
