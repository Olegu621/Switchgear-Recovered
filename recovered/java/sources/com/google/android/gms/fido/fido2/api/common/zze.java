            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zze extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zze> CREATOR = new tf3(11);

                /* JADX INFO: renamed from: a */
                public final byte[] f3847a;

                /* JADX INFO: renamed from: b */
                public final byte[] f3848b;

                public zze(byte[] bArr, byte[] bArr2) {
/* 4 */             this.f3847a = bArr;
/* 6 */             this.f3848b = bArr2;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9403M(parcel, 1, this.f3847a, false);
/* 17 */            w11.m9403M(parcel, 2, this.f3848b, false);
/* 20 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
