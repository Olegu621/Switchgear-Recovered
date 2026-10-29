            package com.google.android.gms.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzh extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzh> CREATOR = new tf3(22);

                /* JADX INFO: renamed from: a */
                public final long f3731a;

                /* JADX INFO: renamed from: b */
                public final long f3732b;

                public zzh(long j, long j2) {
/* 4 */             this.f3731a = j;
/* 6 */             this.f3732b = j2;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 10 */            w11.m9420b0(parcel, 2, 8);
/* 15 */            parcel.writeLong(this.f3731a);
/* 19 */            w11.m9420b0(parcel, 3, 8);
/* 24 */            parcel.writeLong(this.f3732b);
/* 27 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
