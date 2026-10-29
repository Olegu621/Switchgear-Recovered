            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Arrays;
            import p000.AbstractC0886en;
            import p000.C0996hm;
            import p000.InterfaceC2060p7;
            import p000.cl3;
            import p000.k02;
            import p000.xb0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class COSEAlgorithmIdentifier implements Parcelable {
                public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new cl3(12);

                /* JADX INFO: renamed from: a */
                public InterfaceC2060p7 f3780a;

                /* JADX INFO: renamed from: a */
                public static COSEAlgorithmIdentifier m2054a(int i) throws C0996hm {
                    InterfaceC2060p7 interfaceC2060p7;
/* 5 */             if (i != -262) {
/* 17 */                for (k02 k02Var : k02.values()) {
/* 23 */                    if (k02Var.f12557a == i) {
/* 25 */                        interfaceC2060p7 = k02Var;
                            }
                        }
/* 35 */                for (xb0 xb0Var : xb0.values()) {
/* 41 */                    if (xb0Var.f19012a == i) {
/* 43 */                        interfaceC2060p7 = xb0Var;
                            }
                        }
/* 66 */                throw new C0996hm(AbstractC0886en.m3505i(i, "Algorithm with COSE value ", " not supported"));
                    }
/* 7 */             interfaceC2060p7 = k02.RS1;
/* 44 */            COSEAlgorithmIdentifier cOSEAlgorithmIdentifier = new COSEAlgorithmIdentifier();
/* 47 */            cOSEAlgorithmIdentifier.f3780a = interfaceC2060p7;
/* 49 */            return cOSEAlgorithmIdentifier;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof COSEAlgorithmIdentifier) && this.f3780a.mo5931a() == ((COSEAlgorithmIdentifier) obj).f3780a.mo5931a();
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.f3780a});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 7 */             parcel.writeInt(this.f3780a.mo5931a());
                }
            }
