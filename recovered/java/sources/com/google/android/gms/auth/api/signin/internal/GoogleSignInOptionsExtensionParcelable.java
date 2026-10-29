            package com.google.android.gms.auth.api.signin.internal;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.qd3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
                public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new qd3(14);

                /* JADX INFO: renamed from: a */
                public final int f3398a;

                /* JADX INFO: renamed from: b */
                public final int f3399b;

                /* JADX INFO: renamed from: c */
                public final Bundle f3400c;

                public GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
/* 4 */             this.f3398a = i;
/* 6 */             this.f3399b = i2;
/* 8 */             this.f3400c = bundle;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3398a);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f3399b);
/* 30 */            w11.m9402L(parcel, 3, this.f3400c, false);
/* 33 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
