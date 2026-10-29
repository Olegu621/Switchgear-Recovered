            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.cl3;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzn extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzn> CREATOR = new cl3(14);

                /* JADX INFO: renamed from: a */
                public final long f3849a;

                /* JADX INFO: renamed from: b */
                public final byte[] f3850b;

                /* JADX INFO: renamed from: c */
                public final byte[] f3851c;

                /* JADX INFO: renamed from: d */
                public final byte[] f3852d;

                public zzn(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
/* 4 */             this.f3849a = j;
/* 6 */             kb1.m6061n(bArr);
/* 9 */             this.f3850b = bArr;
/* 11 */            kb1.m6061n(bArr2);
/* 14 */            this.f3851c = bArr2;
/* 16 */            kb1.m6061n(bArr3);
/* 19 */            this.f3852d = bArr3;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zzn)) {
/* 3 */                 return false;
                    }
/* 7 */             zzn zznVar = (zzn) obj;
                    return this.f3849a == zznVar.f3849a && Arrays.equals(this.f3850b, zznVar.f3850b) && Arrays.equals(this.f3851c, zznVar.f3851c) && Arrays.equals(this.f3852d, zznVar.f3852d);
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{Long.valueOf(this.f3849a), this.f3850b, this.f3851c, this.f3852d});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 10 */            w11.m9420b0(parcel, 1, 8);
/* 15 */            parcel.writeLong(this.f3849a);
/* 22 */            w11.m9403M(parcel, 2, this.f3850b, false);
/* 28 */            w11.m9403M(parcel, 3, this.f3851c, false);
/* 34 */            w11.m9403M(parcel, 4, this.f3852d, false);
/* 37 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
