            package com.google.android.gms.auth.api.accounttransfer;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.dr3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class DeviceMetaData extends AbstractSafeParcelable {
                public static final Parcelable.Creator<DeviceMetaData> CREATOR = new dr3(24);

                /* JADX INFO: renamed from: a */
                public final int f3244a;

                /* JADX INFO: renamed from: b */
                public final boolean f3245b;

                /* JADX INFO: renamed from: c */
                public final long f3246c;

                /* JADX INFO: renamed from: d */
                public final boolean f3247d;

                public DeviceMetaData(int i, boolean z, long j, boolean z2) {
/* 4 */             this.f3244a = i;
/* 6 */             this.f3245b = z;
/* 8 */             this.f3246c = j;
/* 10 */            this.f3247d = z2;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3244a);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f3245b ? 1 : 0);
/* 29 */            w11.m9420b0(parcel, 3, 8);
/* 34 */            parcel.writeLong(this.f3246c);
/* 37 */            w11.m9420b0(parcel, 4, 4);
/* 42 */            parcel.writeInt(this.f3247d ? 1 : 0);
/* 45 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
