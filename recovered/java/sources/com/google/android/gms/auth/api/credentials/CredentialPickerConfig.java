            package com.google.android.gms.auth.api.credentials;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new ub3(14);

                /* JADX INFO: renamed from: a */
                public final int f3284a;

                /* JADX INFO: renamed from: b */
                public final boolean f3285b;

                /* JADX INFO: renamed from: c */
                public final boolean f3286c;

                /* JADX INFO: renamed from: d */
                public final int f3287d;

                public CredentialPickerConfig(int i, int i2, boolean z, boolean z2, boolean z3) {
/* 4 */             this.f3284a = i;
/* 6 */             this.f3285b = z;
/* 8 */             this.f3286c = z2;
/* 11 */            if (i < 2) {
/* 18 */                this.f3287d = true == z3 ? 3 : 1;
                    } else {
/* 21 */                this.f3287d = i2;
                    }
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3285b ? 1 : 0);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f3286c ? 1 : 0);
/* 27 */            int i2 = this.f3287d;
/* 29 */            int i3 = i2 != 3 ? 0 : 1;
/* 33 */            w11.m9420b0(parcel, 3, 4);
/* 36 */            parcel.writeInt(i3);
/* 39 */            w11.m9420b0(parcel, 4, 4);
/* 42 */            parcel.writeInt(i2);
/* 47 */            w11.m9420b0(parcel, 1000, 4);
/* 52 */            parcel.writeInt(this.f3284a);
/* 55 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
