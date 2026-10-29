            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.C1951n4;
            import p000.C2494yd;
            import p000.de3;
            import p000.o32;
            import p000.tf3;
            import p000.w11;
            import p000.wd3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
                public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new tf3(26);

                /* JADX INFO: renamed from: a */
                public final Attachment f3770a;

                /* JADX INFO: renamed from: b */
                public final Boolean f3771b;

                /* JADX INFO: renamed from: c */
                public final zzat f3772c;

                /* JADX INFO: renamed from: d */
                public final ResidentKeyRequirement f3773d;

                public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
                    Attachment attachmentM2052a;
/* 5 */             if (str == null) {
/* 7 */                 attachmentM2052a = null;
                    } else {
                        try {
/* 9 */                     attachmentM2052a = Attachment.m2052a(str);
                        } catch (o32 | wd3 | C2494yd e) {
/* 43 */                    C1951n4.m6863n(e);
/* 46 */                    throw null;
                        }
                    }
/* 13 */            this.f3770a = attachmentM2052a;
/* 15 */            this.f3771b = bool;
/* 25 */            this.f3772c = str2 == null ? null : zzat.m2059a(str2);
/* 35 */            this.f3773d = str3 == null ? null : ResidentKeyRequirement.m2057a(str3);
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof AuthenticatorSelectionCriteria)) {
/* 3 */                 return false;
                    }
/* 7 */             AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
                    return de3.m3029k(this.f3770a, authenticatorSelectionCriteria.f3770a) && de3.m3029k(this.f3771b, authenticatorSelectionCriteria.f3771b) && de3.m3029k(this.f3772c, authenticatorSelectionCriteria.f3772c) && de3.m3029k(this.f3773d, authenticatorSelectionCriteria.f3773d);
                }

                public final int hashCode() {
/* 13 */            return Arrays.hashCode(new Object[]{this.f3770a, this.f3771b, this.f3772c, this.f3773d});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 8 */             Attachment attachment = this.f3770a;
/* 18 */            w11.m9410T(parcel, 2, attachment == null ? null : attachment.f3745a, false);
/* 24 */            w11.m9401K(parcel, 3, this.f3771b);
/* 27 */            zzat zzatVar = this.f3772c;
/* 36 */            w11.m9410T(parcel, 4, zzatVar == null ? null : zzatVar.f3846a, false);
/* 39 */            ResidentKeyRequirement residentKeyRequirement = this.f3773d;
/* 47 */            w11.m9410T(parcel, 5, residentKeyRequirement != null ? residentKeyRequirement.f3833a : null, false);
/* 50 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
