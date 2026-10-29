            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.internal.fido.zzar;
            import java.util.Arrays;
            import p000.C1951n4;
            import p000.fm0;
            import p000.kb1;
            import p000.md3;
            import p000.sp2;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class TokenBinding extends AbstractSafeParcelable {
                public static final Parcelable.Creator<TokenBinding> CREATOR = new md3(6);

                /* JADX INFO: renamed from: a */
                public final TokenBindingStatus f3834a;

                /* JADX INFO: renamed from: b */
                public final String f3835b;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum TokenBindingStatus implements Parcelable {
                    /* JADX INFO: Fake field, exist only in values array */
                    PRESENT("present"),
                    /* JADX INFO: Fake field, exist only in values array */
                    SUPPORTED("supported"),
                    /* JADX INFO: Fake field, exist only in values array */
                    NOT_SUPPORTED("not-supported");

                    public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new C0327a();

                    /* JADX INFO: renamed from: a */
                    public final String f3837a;

                    TokenBindingStatus(String str) {
/* 4 */                 this.f3837a = str;
                    }

                    /* JADX INFO: renamed from: a */
                    public static TokenBindingStatus m2058a(String str) throws sp2 {
/* 7 */                 for (TokenBindingStatus tokenBindingStatus : values()) {
/* 17 */                    if (str.equals(tokenBindingStatus.f3837a)) {
/* 19 */                        return tokenBindingStatus;
                            }
                        }
/* 36 */                throw new sp2(fm0.m3784j("TokenBindingStatus ", str, " not supported"));
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
/* 1 */                 return 0;
                    }

                    @Override // java.lang.Enum
                    public final String toString() {
/* 1 */                 return this.f3837a;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 3 */                 parcel.writeString(this.f3837a);
                    }
                }

                static {
/* 14 */            new TokenBinding("supported", null);
/* 21 */            new TokenBinding("not-supported", null);
                }

                public TokenBinding(String str, String str2) {
/* 4 */             kb1.m6061n(str);
                    try {
/* 11 */                this.f3834a = TokenBindingStatus.m2058a(str);
/* 13 */                this.f3835b = str2;
                    } catch (sp2 e) {
/* 17 */                C1951n4.m6863n(e);
/* 21 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof TokenBinding)) {
/* 3 */                 return false;
                    }
/* 7 */             TokenBinding tokenBinding = (TokenBinding) obj;
                    return zzar.zza(this.f3834a, tokenBinding.f3834a) && zzar.zza(this.f3835b, tokenBinding.f3835b);
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f3834a, this.f3835b});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 13 */            w11.m9410T(parcel, 2, this.f3834a.f3837a, false);
/* 19 */            w11.m9410T(parcel, 3, this.f3835b, false);
/* 22 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
