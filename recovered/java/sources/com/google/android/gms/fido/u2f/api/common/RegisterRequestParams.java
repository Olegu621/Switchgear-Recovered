            package com.google.android.gms.fido.u2f.api.common;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import p000.de3;
            import p000.kb1;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public class RegisterRequestParams extends RequestParams {
                public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new tf3(21);

                /* JADX INFO: renamed from: a */
                public final Integer f3886a;

                /* JADX INFO: renamed from: b */
                public final Double f3887b;

                /* JADX INFO: renamed from: c */
                public final Uri f3888c;

                /* JADX INFO: renamed from: d */
                public final List f3889d;

                /* JADX INFO: renamed from: e */
                public final List f3890e;

                /* JADX INFO: renamed from: f */
                public final ChannelIdValue f3891f;

                /* JADX INFO: renamed from: i */
                public final String f3892i;

                public RegisterRequestParams(Integer num, Double d, Uri uri, ArrayList arrayList, ArrayList arrayList2, ChannelIdValue channelIdValue, String str) {
/* 4 */             this.f3886a = num;
/* 6 */             this.f3887b = d;
/* 8 */             this.f3888c = uri;
/* 25 */            kb1.m6053f("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
/* 28 */            this.f3889d = arrayList;
/* 30 */            this.f3890e = arrayList2;
/* 32 */            this.f3891f = channelIdValue;
/* 36 */            HashSet hashSet = new HashSet();
/* 39 */            if (uri != null) {
/* 41 */                hashSet.add(uri);
                    }
/* 44 */            Iterator it = arrayList.iterator();
/* 52 */            while (it.hasNext()) {
/* 58 */                RegisterRequest registerRequest = (RegisterRequest) it.next();
/* 71 */                kb1.m6053f("register request has null appId and no request appId is provided", (uri == null && registerRequest.f3885d == null) ? false : true);
/* 74 */                String str2 = registerRequest.f3885d;
/* 76 */                if (str2 != null) {
/* 82 */                    hashSet.add(Uri.parse(str2));
                        }
                    }
/* 86 */            Iterator it2 = arrayList2.iterator();
/* 94 */            while (it2.hasNext()) {
/* 100 */               RegisteredKey registeredKey = (RegisteredKey) it2.next();
/* 113 */               kb1.m6053f("registered key has null appId and no request appId is provided", (uri == null && registeredKey.f3897b == null) ? false : true);
/* 116 */               String str3 = registeredKey.f3897b;
/* 118 */               if (str3 != null) {
/* 124 */                   hashSet.add(Uri.parse(str3));
                        }
                    }
/* 141 */           kb1.m6053f("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
/* 144 */           this.f3892i = str;
                }

                public final boolean equals(Object obj) {
                    List list;
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof RegisterRequestParams)) {
/* 7 */                 return false;
                    }
/* 11 */            RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
/* 13 */            List list2 = registerRequestParams.f3890e;
                    return de3.m3029k(this.f3886a, registerRequestParams.f3886a) && de3.m3029k(this.f3887b, registerRequestParams.f3887b) && de3.m3029k(this.f3888c, registerRequestParams.f3888c) && de3.m3029k(this.f3889d, registerRequestParams.f3889d) && (((list = this.f3890e) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && de3.m3029k(this.f3891f, registerRequestParams.f3891f) && de3.m3029k(this.f3892i, registerRequestParams.f3892i);
                }

                public final int hashCode() {
/* 19 */            return Arrays.hashCode(new Object[]{this.f3886a, this.f3888c, this.f3887b, this.f3889d, this.f3890e, this.f3891f, this.f3892i});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 10 */            w11.m9407Q(parcel, 2, this.f3886a);
/* 16 */            w11.m9404N(parcel, 3, this.f3887b);
/* 23 */            w11.m9409S(parcel, 4, this.f3888c, i, false);
/* 29 */            w11.m9414X(parcel, 5, this.f3889d, false);
/* 35 */            w11.m9414X(parcel, 6, this.f3890e, false);
/* 41 */            w11.m9409S(parcel, 7, this.f3891f, i, false);
/* 48 */            w11.m9410T(parcel, 8, this.f3892i, false);
/* 51 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
