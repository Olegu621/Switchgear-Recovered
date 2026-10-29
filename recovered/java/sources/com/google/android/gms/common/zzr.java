            package com.google.android.gms.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.dr3;
            import p000.k50;
            import p000.mn0;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzr extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzr> CREATOR = new dr3(1);

                /* JADX INFO: renamed from: a */
                public final boolean f3622a;

                /* JADX INFO: renamed from: b */
                public final String f3623b;

                /* JADX INFO: renamed from: c */
                public final int f3624c;

                /* JADX INFO: renamed from: d */
                public final int f3625d;

                /* JADX INFO: renamed from: e */
                public final long f3626e;

                public zzr(boolean z, String str, int i, int i2, long j) {
/* 4 */             this.f3622a = z;
/* 6 */             this.f3623b = str;
/* 14 */            this.f3624c = mn0.m6684H(i) - 1;
/* 22 */            this.f3625d = k50.m5963Q(i2) - 1;
/* 24 */            this.f3626e = j;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3622a ? 1 : 0);
/* 21 */            w11.m9410T(parcel, 2, this.f3623b, false);
/* 25 */            w11.m9420b0(parcel, 3, 4);
/* 30 */            parcel.writeInt(this.f3624c);
/* 33 */            w11.m9420b0(parcel, 4, 4);
/* 38 */            parcel.writeInt(this.f3625d);
/* 44 */            w11.m9420b0(parcel, 5, 8);
/* 49 */            parcel.writeLong(this.f3626e);
/* 52 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
