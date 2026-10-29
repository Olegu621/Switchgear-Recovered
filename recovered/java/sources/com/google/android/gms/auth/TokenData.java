            package com.google.android.gms.auth;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import p000.cl3;
            import p000.de3;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<TokenData> CREATOR = new cl3(8);

                /* JADX INFO: renamed from: a */
                public final int f3235a;

                /* JADX INFO: renamed from: b */
                public final String f3236b;

                /* JADX INFO: renamed from: c */
                public final Long f3237c;

                /* JADX INFO: renamed from: d */
                public final boolean f3238d;

                /* JADX INFO: renamed from: e */
                public final boolean f3239e;

                /* JADX INFO: renamed from: f */
                public final List f3240f;

                /* JADX INFO: renamed from: i */
                public final String f3241i;

                public TokenData(int i, String str, Long l, boolean z, boolean z2, ArrayList arrayList, String str2) {
/* 4 */             this.f3235a = i;
/* 6 */             kb1.m6058k(str);
/* 9 */             this.f3236b = str;
/* 11 */            this.f3237c = l;
/* 13 */            this.f3238d = z;
/* 15 */            this.f3239e = z2;
/* 17 */            this.f3240f = arrayList;
/* 19 */            this.f3241i = str2;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof TokenData)) {
/* 3 */                 return false;
                    }
/* 7 */             TokenData tokenData = (TokenData) obj;
                    return TextUtils.equals(this.f3236b, tokenData.f3236b) && de3.m3029k(this.f3237c, tokenData.f3237c) && this.f3238d == tokenData.f3238d && this.f3239e == tokenData.f3239e && de3.m3029k(this.f3240f, tokenData.f3240f) && de3.m3029k(this.f3241i, tokenData.f3241i);
                }

                public final int hashCode() {
/* 25 */            return Arrays.hashCode(new Object[]{this.f3236b, this.f3237c, Boolean.valueOf(this.f3238d), Boolean.valueOf(this.f3239e), this.f3240f, this.f3241i});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3235a);
/* 21 */            w11.m9410T(parcel, 2, this.f3236b, false);
/* 27 */            w11.m9408R(parcel, 3, this.f3237c);
/* 30 */            w11.m9420b0(parcel, 4, 4);
/* 35 */            parcel.writeInt(this.f3238d ? 1 : 0);
/* 39 */            w11.m9420b0(parcel, 5, 4);
/* 44 */            parcel.writeInt(this.f3239e ? 1 : 0);
/* 50 */            w11.m9412V(parcel, this.f3240f, 6);
/* 56 */            w11.m9410T(parcel, 7, this.f3241i, false);
/* 59 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
