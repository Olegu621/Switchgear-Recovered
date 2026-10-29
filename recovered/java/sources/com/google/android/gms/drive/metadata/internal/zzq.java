            package com.google.android.gms.drive.metadata.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.cl3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzq extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzq> CREATOR = new cl3(27);

                /* JADX INFO: renamed from: a */
                public final String f3687a;

                /* JADX INFO: renamed from: b */
                public final long f3688b;

                /* JADX INFO: renamed from: c */
                public final int f3689c;

                public zzq(String str, long j, int i) {
/* 4 */             this.f3687a = str;
/* 6 */             this.f3688b = j;
/* 8 */             this.f3689c = i;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 2, this.f3687a, false);
/* 17 */            w11.m9420b0(parcel, 3, 8);
/* 22 */            parcel.writeLong(this.f3688b);
/* 26 */            w11.m9420b0(parcel, 4, 4);
/* 31 */            parcel.writeInt(this.f3689c);
/* 34 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
