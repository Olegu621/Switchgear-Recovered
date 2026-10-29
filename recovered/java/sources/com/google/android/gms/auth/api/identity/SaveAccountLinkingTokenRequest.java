            package com.google.android.gms.auth.api.identity;

            import android.app.PendingIntent;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import java.util.List;
            import p000.de3;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new ub3(22);

                /* JADX INFO: renamed from: a */
                public final PendingIntent f3332a;

                /* JADX INFO: renamed from: b */
                public final String f3333b;

                /* JADX INFO: renamed from: c */
                public final String f3334c;

                /* JADX INFO: renamed from: d */
                public final List f3335d;

                /* JADX INFO: renamed from: e */
                public final String f3336e;

                /* JADX INFO: renamed from: f */
                public final int f3337f;

                public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i) {
/* 4 */             this.f3332a = pendingIntent;
/* 6 */             this.f3333b = str;
/* 8 */             this.f3334c = str2;
/* 10 */            this.f3335d = list;
/* 12 */            this.f3336e = str3;
/* 14 */            this.f3337f = i;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
/* 3 */                 return false;
                    }
/* 7 */             SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
/* 9 */             List list = saveAccountLinkingTokenRequest.f3335d;
/* 11 */            List list2 = this.f3335d;
                    return list2.size() == list.size() && list2.containsAll(list) && de3.m3029k(this.f3332a, saveAccountLinkingTokenRequest.f3332a) && de3.m3029k(this.f3333b, saveAccountLinkingTokenRequest.f3333b) && de3.m3029k(this.f3334c, saveAccountLinkingTokenRequest.f3334c) && de3.m3029k(this.f3336e, saveAccountLinkingTokenRequest.f3336e) && this.f3337f == saveAccountLinkingTokenRequest.f3337f;
                }

                public final int hashCode() {
/* 15 */            return Arrays.hashCode(new Object[]{this.f3332a, this.f3333b, this.f3334c, this.f3335d, this.f3336e});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3332a, i, false);
/* 17 */            w11.m9410T(parcel, 2, this.f3333b, false);
/* 23 */            w11.m9410T(parcel, 3, this.f3334c, false);
/* 29 */            w11.m9412V(parcel, this.f3335d, 4);
/* 35 */            w11.m9410T(parcel, 5, this.f3336e, false);
/* 39 */            w11.m9420b0(parcel, 6, 4);
/* 44 */            parcel.writeInt(this.f3337f);
/* 47 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
