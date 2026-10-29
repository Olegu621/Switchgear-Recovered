            package com.google.android.gms.common.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.api.Scope;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zax extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zax> CREATOR = new ub3(12);

                /* JADX INFO: renamed from: a */
                public final int f3535a;

                /* JADX INFO: renamed from: b */
                public final int f3536b;

                /* JADX INFO: renamed from: c */
                public final int f3537c;

                /* JADX INFO: renamed from: d */
                public final Scope[] f3538d;

                public zax(int i, int i2, int i3, Scope[] scopeArr) {
/* 4 */             this.f3535a = i;
/* 6 */             this.f3536b = i2;
/* 8 */             this.f3537c = i3;
/* 10 */            this.f3538d = scopeArr;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3535a);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f3536b);
/* 27 */            w11.m9420b0(parcel, 3, 4);
/* 32 */            parcel.writeInt(this.f3537c);
/* 37 */            w11.m9413W(parcel, 4, this.f3538d, i);
/* 40 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
