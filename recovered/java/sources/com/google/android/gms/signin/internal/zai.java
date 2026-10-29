            package com.google.android.gms.signin.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.common.internal.zat;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zai extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zai> CREATOR = new ub3(3);

                /* JADX INFO: renamed from: a */
                public final int f4274a;

                /* JADX INFO: renamed from: b */
                public final zat f4275b;

                public zai(int i, zat zatVar) {
/* 4 */             this.f4274a = i;
/* 6 */             this.f4275b = zatVar;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f4274a);
/* 21 */            w11.m9409S(parcel, 2, this.f4275b, i, false);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
