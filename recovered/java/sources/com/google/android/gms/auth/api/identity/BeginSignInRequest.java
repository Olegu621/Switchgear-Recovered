            package com.google.android.gms.auth.api.identity;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import p000.de3;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class BeginSignInRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new C0318a();

                /* JADX INFO: renamed from: a */
                public final PasswordRequestOptions f3307a;

                /* JADX INFO: renamed from: b */
                public final GoogleIdTokenRequestOptions f3308b;

                /* JADX INFO: renamed from: c */
                public final String f3309c;

                /* JADX INFO: renamed from: d */
                public final boolean f3310d;

                /* JADX INFO: renamed from: e */
                public final int f3311e;

                /* JADX INFO: renamed from: f */
                public final PasskeysRequestOptions f3312f;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
                    public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new C0319b();

                    /* JADX INFO: renamed from: a */
                    public final boolean f3313a;

                    /* JADX INFO: renamed from: b */
                    public final String f3314b;

                    /* JADX INFO: renamed from: c */
                    public final String f3315c;

                    /* JADX INFO: renamed from: d */
                    public final boolean f3316d;

                    /* JADX INFO: renamed from: e */
                    public final String f3317e;

                    /* JADX INFO: renamed from: f */
                    public final ArrayList f3318f;

                    /* JADX INFO: renamed from: i */
                    public final boolean f3319i;

                    public GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, ArrayList arrayList, boolean z3) {
/* 4 */                 boolean z4 = true;
/* 5 */                 if (z2 && z3) {
/* 10 */                    z4 = false;
                        }
/* 13 */                kb1.m6053f("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
/* 16 */                this.f3313a = z;
/* 18 */                if (z) {
/* 22 */                    kb1.m6062o(str, "serverClientId must be provided if Google ID tokens are requested");
                        }
/* 25 */                this.f3314b = str;
/* 27 */                this.f3315c = str2;
/* 29 */                this.f3316d = z2;
/* 31 */                ArrayList arrayList2 = null;
/* 32 */                if (arrayList != null && !arrayList.isEmpty()) {
/* 43 */                    arrayList2 = new ArrayList(arrayList);
/* 46 */                    Collections.sort(arrayList2);
                        }
/* 49 */                this.f3318f = arrayList2;
/* 51 */                this.f3317e = str3;
/* 53 */                this.f3319i = z3;
                    }

                    public final boolean equals(Object obj) {
/* 3 */                 if (!(obj instanceof GoogleIdTokenRequestOptions)) {
/* 68 */                    return false;
                        }
/* 6 */                 GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
                        return this.f3313a == googleIdTokenRequestOptions.f3313a && de3.m3029k(this.f3314b, googleIdTokenRequestOptions.f3314b) && de3.m3029k(this.f3315c, googleIdTokenRequestOptions.f3315c) && this.f3316d == googleIdTokenRequestOptions.f3316d && de3.m3029k(this.f3317e, googleIdTokenRequestOptions.f3317e) && de3.m3029k(this.f3318f, googleIdTokenRequestOptions.f3318f) && this.f3319i == googleIdTokenRequestOptions.f3319i;
                    }

                    public final int hashCode() {
/* 31 */                return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3313a), this.f3314b, this.f3315c, Boolean.valueOf(this.f3316d), this.f3317e, this.f3318f, Boolean.valueOf(this.f3319i)});
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 3 */                 int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */                 w11.m9420b0(parcel, 1, 4);
/* 14 */                parcel.writeInt(this.f3313a ? 1 : 0);
/* 21 */                w11.m9410T(parcel, 2, this.f3314b, false);
/* 27 */                w11.m9410T(parcel, 3, this.f3315c, false);
/* 30 */                w11.m9420b0(parcel, 4, 4);
/* 35 */                parcel.writeInt(this.f3316d ? 1 : 0);
/* 41 */                w11.m9410T(parcel, 5, this.f3317e, false);
/* 47 */                w11.m9412V(parcel, this.f3318f, 6);
/* 51 */                w11.m9420b0(parcel, 7, 4);
/* 56 */                parcel.writeInt(this.f3319i ? 1 : 0);
/* 59 */                w11.m9428f0(iM9422c0, parcel);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class PasskeysRequestOptions extends AbstractSafeParcelable {
                    public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new C0320c();

                    /* JADX INFO: renamed from: a */
                    public final boolean f3320a;

                    /* JADX INFO: renamed from: b */
                    public final byte[] f3321b;

                    /* JADX INFO: renamed from: c */
                    public final String f3322c;

                    public PasskeysRequestOptions(boolean z, byte[] bArr, String str) {
/* 4 */                 if (z) {
/* 6 */                     kb1.m6061n(bArr);
/* 9 */                     kb1.m6061n(str);
                        }
/* 12 */                this.f3320a = z;
/* 14 */                this.f3321b = bArr;
/* 16 */                this.f3322c = str;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
                    
                        r5 = r5.f3322c;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final boolean equals(Object obj) {
                        Object obj2;
                        String str;
/* 2 */                 if (this == obj) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(obj instanceof PasskeysRequestOptions)) {
/* 7 */                     return false;
                        }
/* 11 */                PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
                        return this.f3320a == passkeysRequestOptions.f3320a && Arrays.equals(this.f3321b, passkeysRequestOptions.f3321b) && ((str = this.f3322c) == obj2 || (str != null && str.equals(obj2)));
                    }

                    public final int hashCode() {
/* 25 */                return Arrays.hashCode(this.f3321b) + (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3320a), this.f3322c}) * 31);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 3 */                 int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */                 w11.m9420b0(parcel, 1, 4);
/* 14 */                parcel.writeInt(this.f3320a ? 1 : 0);
/* 21 */                w11.m9403M(parcel, 2, this.f3321b, false);
/* 27 */                w11.m9410T(parcel, 3, this.f3322c, false);
/* 30 */                w11.m9428f0(iM9422c0, parcel);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class PasswordRequestOptions extends AbstractSafeParcelable {
                    public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new C0321d();

                    /* JADX INFO: renamed from: a */
                    public final boolean f3323a;

                    public PasswordRequestOptions(boolean z) {
/* 4 */                 this.f3323a = z;
                    }

                    public final boolean equals(Object obj) {
                        return (obj instanceof PasswordRequestOptions) && this.f3323a == ((PasswordRequestOptions) obj).f3323a;
                    }

                    public final int hashCode() {
/* 11 */                return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3323a)});
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 3 */                 int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */                 w11.m9420b0(parcel, 1, 4);
/* 14 */                parcel.writeInt(this.f3323a ? 1 : 0);
/* 17 */                w11.m9428f0(iM9422c0, parcel);
                    }
                }

                public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z, int i, PasskeysRequestOptions passkeysRequestOptions) {
/* 4 */             kb1.m6061n(passwordRequestOptions);
/* 7 */             this.f3307a = passwordRequestOptions;
/* 9 */             kb1.m6061n(googleIdTokenRequestOptions);
/* 12 */            this.f3308b = googleIdTokenRequestOptions;
/* 14 */            this.f3309c = str;
/* 16 */            this.f3310d = z;
/* 18 */            this.f3311e = i;
/* 29 */            this.f3312f = passkeysRequestOptions == null ? new PasskeysRequestOptions(false, null, null) : passkeysRequestOptions;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof BeginSignInRequest)) {
/* 3 */                 return false;
                    }
/* 7 */             BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
                    return de3.m3029k(this.f3307a, beginSignInRequest.f3307a) && de3.m3029k(this.f3308b, beginSignInRequest.f3308b) && de3.m3029k(this.f3312f, beginSignInRequest.f3312f) && de3.m3029k(this.f3309c, beginSignInRequest.f3309c) && this.f3310d == beginSignInRequest.f3310d && this.f3311e == beginSignInRequest.f3311e;
                }

                public final int hashCode() {
/* 19 */            return Arrays.hashCode(new Object[]{this.f3307a, this.f3308b, this.f3312f, this.f3309c, Boolean.valueOf(this.f3310d)});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3307a, i, false);
/* 17 */            w11.m9409S(parcel, 2, this.f3308b, i, false);
/* 23 */            w11.m9410T(parcel, 3, this.f3309c, false);
/* 27 */            w11.m9420b0(parcel, 4, 4);
/* 32 */            parcel.writeInt(this.f3310d ? 1 : 0);
/* 36 */            w11.m9420b0(parcel, 5, 4);
/* 41 */            parcel.writeInt(this.f3311e);
/* 47 */            w11.m9409S(parcel, 6, this.f3312f, i, false);
/* 50 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
