            package com.google.android.gms.drive.events;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.dr3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzt extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzt> CREATOR = new dr3(12);

                /* JADX INFO: renamed from: a */
                public final int f3674a;

                public zzt(int i) {
/* 4 */             this.f3674a = i;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 2, 4);
/* 14 */            parcel.writeInt(this.f3674a);
/* 17 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
