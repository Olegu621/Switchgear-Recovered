            package com.google.android.gms.fido.u2f.api.common;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import p000.cl3;
            import p000.de3;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public class SignRequestParams extends RequestParams {
                public static final Parcelable.Creator<SignRequestParams> CREATOR = new cl3(1);

                /* JADX INFO: renamed from: a */
                public final Integer f3899a;

                /* JADX INFO: renamed from: b */
                public final Double f3900b;

                /* JADX INFO: renamed from: c */
                public final Uri f3901c;

                /* JADX INFO: renamed from: d */
                public final byte[] f3902d;

                /* JADX INFO: renamed from: e */
                public final List f3903e;

                /* JADX INFO: renamed from: f */
                public final ChannelIdValue f3904f;

                /* JADX INFO: renamed from: i */
                public final String f3905i;

                public SignRequestParams(Integer num, Double d, Uri uri, byte[] bArr, ArrayList arrayList, ChannelIdValue channelIdValue, String str) {
/* 4 */             this.f3899a = num;
/* 6 */             this.f3900b = d;
/* 8 */             this.f3901c = uri;
/* 10 */            this.f3902d = bArr;
/* 27 */            kb1.m6053f("registeredKeys must not be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
/* 30 */            this.f3903e = arrayList;
/* 32 */            this.f3904f = channelIdValue;
/* 36 */            HashSet hashSet = new HashSet();
/* 39 */            if (uri != null) {
/* 41 */                hashSet.add(uri);
                    }
/* 44 */            Iterator it = arrayList.iterator();
/* 52 */            while (it.hasNext()) {
/* 58 */                RegisteredKey registeredKey = (RegisteredKey) it.next();
/* 71 */                kb1.m6053f("registered key has null appId and no request appId is provided", (registeredKey.f3897b == null && uri == null) ? false : true);
/* 74 */                String str2 = registeredKey.f3897b;
/* 76 */                if (str2 != null) {
/* 82 */                    hashSet.add(Uri.parse(str2));
                        }
                    }
/* 99 */            kb1.m6053f("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
/* 102 */           this.f3905i = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof SignRequestParams)) {
/* 7 */                 return false;
                    }
/* 11 */            SignRequestParams signRequestParams = (SignRequestParams) obj;
/* 13 */            List list = signRequestParams.f3903e;
/* 23 */            if (de3.m3029k(this.f3899a, signRequestParams.f3899a) && de3.m3029k(this.f3900b, signRequestParams.f3900b) && de3.m3029k(this.f3901c, signRequestParams.f3901c) && Arrays.equals(this.f3902d, signRequestParams.f3902d)) {
/* 55 */                List list2 = this.f3903e;
/* 61 */                if (list2.containsAll(list) && list.containsAll(list2) && de3.m3029k(this.f3904f, signRequestParams.f3904f) && de3.m3029k(this.f3905i, signRequestParams.f3905i)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 27 */            return Arrays.hashCode(new Object[]{this.f3899a, this.f3901c, this.f3900b, this.f3903e, this.f3904f, this.f3905i, Integer.valueOf(Arrays.hashCode(this.f3902d))});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 10 */            w11.m9407Q(parcel, 2, this.f3899a);
/* 16 */            w11.m9404N(parcel, 3, this.f3900b);
/* 23 */            w11.m9409S(parcel, 4, this.f3901c, i, false);
/* 29 */            w11.m9403M(parcel, 5, this.f3902d, false);
/* 35 */            w11.m9414X(parcel, 6, this.f3903e, false);
/* 41 */            w11.m9409S(parcel, 7, this.f3904f, i, false);
/* 48 */            w11.m9410T(parcel, 8, this.f3905i, false);
/* 51 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
