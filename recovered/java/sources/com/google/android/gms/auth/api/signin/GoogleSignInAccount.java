            package com.google.android.gms.auth.api.signin;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.common.api.Scope;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.List;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.kb1;
            import p000.qd3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new qd3(23);

                /* JADX INFO: renamed from: U */
                public final List f3366U;

                /* JADX INFO: renamed from: V */
                public final String f3367V;

                /* JADX INFO: renamed from: W */
                public final String f3368W;

                /* JADX INFO: renamed from: X */
                public final HashSet f3369X = new HashSet();

                /* JADX INFO: renamed from: a */
                public final int f3370a;

                /* JADX INFO: renamed from: b */
                public final String f3371b;

                /* JADX INFO: renamed from: c */
                public final String f3372c;

                /* JADX INFO: renamed from: d */
                public final String f3373d;

                /* JADX INFO: renamed from: e */
                public final String f3374e;

                /* JADX INFO: renamed from: f */
                public final Uri f3375f;

                /* JADX INFO: renamed from: i */
                public String f3376i;

                /* JADX INFO: renamed from: v */
                public final long f3377v;

                /* JADX INFO: renamed from: w */
                public final String f3378w;

                public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
/* 11 */            this.f3370a = i;
/* 13 */            this.f3371b = str;
/* 15 */            this.f3372c = str2;
/* 17 */            this.f3373d = str3;
/* 19 */            this.f3374e = str4;
/* 21 */            this.f3375f = uri;
/* 23 */            this.f3376i = str5;
/* 25 */            this.f3377v = j;
/* 27 */            this.f3378w = str6;
/* 29 */            this.f3366U = arrayList;
/* 31 */            this.f3367V = str7;
/* 33 */            this.f3368W = str8;
                }

                /* JADX INFO: renamed from: E1 */
                public static GoogleSignInAccount m1992E1(String str) throws JSONException {
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 5 */                 return null;
                    }
/* 13 */            JSONObject jSONObject = new JSONObject(str);
/* 18 */            String strOptString = jSONObject.optString("photoUrl");
/* 34 */            Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
/* 41 */            long j = Long.parseLong(jSONObject.getString("expirationTime"));
/* 47 */            HashSet hashSet = new HashSet();
/* 52 */            JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
/* 56 */            int length = jSONArray.length();
/* 61 */            for (int i = 0; i < length; i++) {
/* 73 */                hashSet.add(new Scope(1, jSONArray.getString(i)));
                    }
/* 81 */            String strOptString2 = jSONObject.optString("id");
/* 99 */            String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
/* 114 */           String strOptString4 = jSONObject.has(NotificationCompat.CATEGORY_EMAIL) ? jSONObject.optString(NotificationCompat.CATEGORY_EMAIL) : null;
/* 129 */           String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
/* 144 */           String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
/* 160 */           String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
/* 164 */           String string = jSONObject.getString("obfuscatedIdentifier");
/* 170 */           kb1.m6058k(string);
/* 180 */           GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
/* 195 */           googleSignInAccount.f3376i = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
/* 197 */           return googleSignInAccount;
                }

                /* JADX INFO: renamed from: D1 */
                public final HashSet m1993D1() {
/* 5 */             HashSet hashSet = new HashSet(this.f3366U);
/* 10 */            hashSet.addAll(this.f3369X);
/* 13 */            return hashSet;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == null) {
/* 40 */                return false;
                    }
/* 4 */             if (obj == this) {
/* 38 */                return true;
                    }
/* 9 */             if (!(obj instanceof GoogleSignInAccount)) {
/* 40 */                return false;
                    }
/* 12 */            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
                    return googleSignInAccount.f3378w.equals(this.f3378w) && googleSignInAccount.m1993D1().equals(m1993D1());
                }

                public final int hashCode() {
/* 19 */            return ((this.f3378w.hashCode() + 527) * 31) + m1993D1().hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3370a);
/* 21 */            w11.m9410T(parcel, 2, this.f3371b, false);
/* 27 */            w11.m9410T(parcel, 3, this.f3372c, false);
/* 32 */            w11.m9410T(parcel, 4, this.f3373d, false);
/* 38 */            w11.m9410T(parcel, 5, this.f3374e, false);
/* 44 */            w11.m9409S(parcel, 6, this.f3375f, i, false);
/* 50 */            w11.m9410T(parcel, 7, this.f3376i, false);
/* 55 */            w11.m9420b0(parcel, 8, 8);
/* 60 */            parcel.writeLong(this.f3377v);
/* 67 */            w11.m9410T(parcel, 9, this.f3378w, false);
/* 74 */            w11.m9414X(parcel, 10, this.f3366U, false);
/* 81 */            w11.m9410T(parcel, 11, this.f3367V, false);
/* 88 */            w11.m9410T(parcel, 12, this.f3368W, false);
/* 91 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
