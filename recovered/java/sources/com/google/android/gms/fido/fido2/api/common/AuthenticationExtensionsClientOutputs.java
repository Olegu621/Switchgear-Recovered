            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.de3;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
                public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new re3(12);

                /* JADX INFO: renamed from: a */
                public final UvmEntries f3757a;

                /* JADX INFO: renamed from: b */
                public final zze f3758b;

                public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zze zzeVar) {
/* 4 */             this.f3757a = uvmEntries;
/* 6 */             this.f3758b = zzeVar;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
/* 3 */                 return false;
                    }
/* 7 */             AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
                    return de3.m3029k(this.f3757a, authenticationExtensionsClientOutputs.f3757a) && de3.m3029k(this.f3758b, authenticationExtensionsClientOutputs.f3758b);
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f3757a, this.f3758b});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3757a, i, false);
/* 17 */            w11.m9409S(parcel, 2, this.f3758b, i, false);
/* 20 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
