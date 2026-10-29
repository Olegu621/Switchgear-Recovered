            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.internal.fido.zzba;
            import com.google.android.gms.internal.fido.zzh;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import p000.C1951n4;
            import p000.kb1;
            import p000.nz1;
            import p000.tc3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
                public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;

                /* JADX INFO: renamed from: a */
                public final PublicKeyCredentialType f3810a;

                /* JADX INFO: renamed from: b */
                public final byte[] f3811b;

                /* JADX INFO: renamed from: c */
                public final List f3812c;

                static {
/* 5 */             zzba.zzi(zzh.zza, zzh.zzb);
/* 15 */            CREATOR = new tc3(26);
                }

                public PublicKeyCredentialDescriptor(String str, byte[] bArr, ArrayList arrayList) {
/* 4 */             kb1.m6061n(str);
                    try {
/* 11 */                this.f3810a = PublicKeyCredentialType.m2056a(str);
/* 13 */                kb1.m6061n(bArr);
/* 16 */                this.f3811b = bArr;
/* 18 */                this.f3812c = arrayList;
                    } catch (nz1 e) {
/* 22 */                C1951n4.m6863n(e);
/* 26 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof PublicKeyCredentialDescriptor)) {
/* 3 */                 return false;
                    }
/* 7 */             PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
/* 9 */             List list = publicKeyCredentialDescriptor.f3812c;
/* 19 */            if (!this.f3810a.equals(publicKeyCredentialDescriptor.f3810a) || !Arrays.equals(this.f3811b, publicKeyCredentialDescriptor.f3811b)) {
/* 3 */                 return false;
                    }
/* 34 */            List list2 = this.f3812c;
/* 36 */            if (list2 == null && list == null) {
/* 33 */                return true;
                    }
                    return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
                }

                public final int hashCode() {
/* 19 */            return Arrays.hashCode(new Object[]{this.f3810a, Integer.valueOf(Arrays.hashCode(this.f3811b)), this.f3812c});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             this.f3810a.getClass();
/* 16 */            w11.m9410T(parcel, 2, "public-key", false);
/* 22 */            w11.m9403M(parcel, 3, this.f3811b, false);
/* 28 */            w11.m9414X(parcel, 4, this.f3812c, false);
/* 31 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
