            package com.google.android.gms.auth.api.credentials;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.List;
            import p000.C1951n4;
            import p000.de3;
            import p000.kb1;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<Credential> CREATOR = new ub3(13);

                /* JADX INFO: renamed from: a */
                public final String f3276a;

                /* JADX INFO: renamed from: b */
                public final String f3277b;

                /* JADX INFO: renamed from: c */
                public final Uri f3278c;

                /* JADX INFO: renamed from: d */
                public final List f3279d;

                /* JADX INFO: renamed from: e */
                public final String f3280e;

                /* JADX INFO: renamed from: f */
                public final String f3281f;

                /* JADX INFO: renamed from: i */
                public final String f3282i;

                /* JADX INFO: renamed from: v */
                public final String f3283v;

                public Credential(String str, String str2, Uri uri, ArrayList arrayList, String str3, String str4, String str5, String str6) {
                    Boolean boolValueOf;
/* 6 */             kb1.m6062o(str, "credential identifier cannot be null");
/* 9 */             String strTrim = str.trim();
/* 15 */            kb1.m6059l(strTrim, "credential identifier cannot be empty");
/* 19 */            if (str3 != null && TextUtils.isEmpty(str3)) {
/* 30 */                C1951n4.m6859j("Password must not be empty if set");
/* 33 */                throw null;
                    }
/* 34 */            if (str4 != null) {
/* 40 */                if (TextUtils.isEmpty(str4)) {
/* 42 */                    boolValueOf = Boolean.FALSE;
                        } else {
/* 45 */                    Uri uri2 = Uri.parse(str4);
/* 53 */                    if (!uri2.isAbsolute() || !uri2.isHierarchical() || TextUtils.isEmpty(uri2.getScheme()) || TextUtils.isEmpty(uri2.getAuthority())) {
/* 114 */                       boolValueOf = Boolean.FALSE;
                            } else {
/* 92 */                        boolean z = true;
/* 93 */                        if (!"http".equalsIgnoreCase(uri2.getScheme()) && !"https".equalsIgnoreCase(uri2.getScheme())) {
/* 108 */                           z = false;
                                }
/* 109 */                       boolValueOf = Boolean.valueOf(z);
                            }
                        }
/* 120 */               if (!boolValueOf.booleanValue()) {
/* 125 */                   C1951n4.m6859j("Account type must be a valid Http/Https URI");
/* 128 */                   throw null;
                        }
                    }
/* 133 */           if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
/* 144 */               C1951n4.m6859j("Password and AccountType are mutually exclusive");
/* 147 */               throw null;
                    }
/* 148 */           if (str2 != null && TextUtils.isEmpty(str2.trim())) {
/* 160 */               str2 = null;
                    }
/* 161 */           this.f3277b = str2;
/* 163 */           this.f3278c = uri;
/* 174 */           this.f3279d = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
/* 176 */           this.f3276a = strTrim;
/* 178 */           this.f3280e = str3;
/* 180 */           this.f3281f = str4;
/* 182 */           this.f3282i = str5;
/* 184 */           this.f3283v = str6;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Credential)) {
/* 7 */                 return false;
                    }
/* 11 */            Credential credential = (Credential) obj;
                    return TextUtils.equals(this.f3276a, credential.f3276a) && TextUtils.equals(this.f3277b, credential.f3277b) && de3.m3029k(this.f3278c, credential.f3278c) && TextUtils.equals(this.f3280e, credential.f3280e) && TextUtils.equals(this.f3281f, credential.f3281f);
                }

                public final int hashCode() {
/* 15 */            return Arrays.hashCode(new Object[]{this.f3276a, this.f3277b, this.f3278c, this.f3280e, this.f3281f});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3276a, false);
/* 17 */            w11.m9410T(parcel, 2, this.f3277b, false);
/* 23 */            w11.m9409S(parcel, 3, this.f3278c, i, false);
/* 29 */            w11.m9414X(parcel, 4, this.f3279d, false);
/* 35 */            w11.m9410T(parcel, 5, this.f3280e, false);
/* 41 */            w11.m9410T(parcel, 6, this.f3281f, false);
/* 48 */            w11.m9410T(parcel, 9, this.f3282i, false);
/* 55 */            w11.m9410T(parcel, 10, this.f3283v, false);
/* 58 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
