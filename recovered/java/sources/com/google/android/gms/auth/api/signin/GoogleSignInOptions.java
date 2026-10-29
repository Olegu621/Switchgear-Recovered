            package com.google.android.gms.auth.api.signin;

            import android.accounts.Account;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
            import com.google.android.gms.common.api.Scope;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import org.json.JSONArray;
            import org.json.JSONObject;
            import p000.InterfaceC0172b9;
            import p000.qd3;
            import p000.w11;
            import p000.wa3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public class GoogleSignInOptions extends AbstractSafeParcelable implements InterfaceC0172b9, ReflectedParcelable {
                public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

                /* JADX INFO: renamed from: V */
                public static final GoogleSignInOptions f3379V;

                /* JADX INFO: renamed from: W */
                public static final GoogleSignInOptions f3380W;

                /* JADX INFO: renamed from: X */
                public static final Scope f3381X;

                /* JADX INFO: renamed from: Y */
                public static final Scope f3382Y;

                /* JADX INFO: renamed from: Z */
                public static final Scope f3383Z;

                /* JADX INFO: renamed from: a0 */
                public static final wa3 f3384a0;

                /* JADX INFO: renamed from: U */
                public final String f3385U;

                /* JADX INFO: renamed from: a */
                public final int f3386a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f3387b;

                /* JADX INFO: renamed from: c */
                public final Account f3388c;

                /* JADX INFO: renamed from: d */
                public final boolean f3389d;

                /* JADX INFO: renamed from: e */
                public final boolean f3390e;

                /* JADX INFO: renamed from: f */
                public final boolean f3391f;

                /* JADX INFO: renamed from: i */
                public final String f3392i;

                /* JADX INFO: renamed from: v */
                public final String f3393v;

                /* JADX INFO: renamed from: w */
                public final ArrayList f3394w;

                static {
/* 6 */             Scope scope = new Scope(1, "profile");
/* 13 */            new Scope(1, NotificationCompat.CATEGORY_EMAIL);
/* 20 */            Scope scope2 = new Scope(1, "openid");
/* 23 */            f3381X = scope2;
/* 29 */            Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
/* 32 */            f3382Y = scope3;
/* 41 */            f3383Z = new Scope(1, "https://www.googleapis.com/auth/games");
/* 45 */            HashSet hashSet = new HashSet();
/* 50 */            HashMap map = new HashMap();
/* 53 */            hashSet.add(scope2);
/* 56 */            hashSet.add(scope);
/* 65 */            if (hashSet.contains(f3383Z)) {
/* 67 */                Scope scope4 = f3382Y;
/* 73 */                if (hashSet.contains(scope4)) {
/* 75 */                    hashSet.remove(scope4);
                        }
                    }
/* 96 */            f3379V = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
/* 100 */           HashSet hashSet2 = new HashSet();
/* 105 */           HashMap map2 = new HashMap();
/* 111 */           hashSet2.add(scope3);
/* 118 */           hashSet2.addAll(Arrays.asList(new Scope[0]));
/* 127 */           if (hashSet2.contains(f3383Z)) {
/* 129 */               Scope scope5 = f3382Y;
/* 135 */               if (hashSet2.contains(scope5)) {
/* 137 */                   hashSet2.remove(scope5);
                        }
                    }
/* 158 */           f3380W = new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
/* 167 */           CREATOR = new qd3(29);
/* 176 */           f3384a0 = new wa3(19);
                }

                public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, HashMap map, String str3) {
/* 4 */             this.f3386a = i;
/* 6 */             this.f3387b = arrayList;
/* 8 */             this.f3388c = account;
/* 10 */            this.f3389d = z;
/* 12 */            this.f3390e = z2;
/* 14 */            this.f3391f = z3;
/* 16 */            this.f3392i = str;
/* 18 */            this.f3393v = str2;
/* 29 */            this.f3394w = new ArrayList(map.values());
/* 31 */            this.f3385U = str3;
                }

                /* JADX INFO: renamed from: D1 */
                public static GoogleSignInOptions m1994D1(String str) {
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 5 */                 return null;
                    }
/* 13 */            JSONObject jSONObject = new JSONObject(str);
/* 18 */            HashSet hashSet = new HashSet();
/* 23 */            JSONArray jSONArray = jSONObject.getJSONArray("scopes");
/* 27 */            int length = jSONArray.length();
/* 32 */            for (int i = 0; i < length; i++) {
/* 44 */                hashSet.add(new Scope(1, jSONArray.getString(i)));
                    }
/* 63 */            String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
/* 141 */           return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
                }

                /* JADX INFO: renamed from: E1 */
                public static HashMap m1995E1(ArrayList arrayList) {
/* 3 */             HashMap map = new HashMap();
/* 6 */             if (arrayList != null) {
/* 9 */                 Iterator it = arrayList.iterator();
/* 17 */                while (it.hasNext()) {
/* 23 */                    GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
/* 31 */                    map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f3399b), googleSignInOptionsExtensionParcelable);
                        }
                    }
/* 35 */            return map;
                }

                public final boolean equals(Object obj) {
/* 1 */             String str = this.f3392i;
/* 3 */             ArrayList arrayList = this.f3387b;
/* 5 */             if (obj == null) {
/* 124 */               return false;
                    }
                    try {
/* 9 */                 GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
/* 11 */                ArrayList arrayList2 = googleSignInOptions.f3387b;
/* 13 */                String str2 = googleSignInOptions.f3392i;
/* 21 */                if (this.f3394w.isEmpty() && googleSignInOptions.f3394w.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
/* 59 */                    Account account = this.f3388c;
/* 61 */                    Account account2 = googleSignInOptions.f3388c;
/* 63 */                    if (account == null) {
/* 65 */                        if (account2 != null) {
/* 124 */                           return false;
                                }
                            } else if (!account.equals(account2)) {
/* 124 */                       return false;
                            }
/* 78 */                    if (TextUtils.isEmpty(str)) {
/* 84 */                        if (!TextUtils.isEmpty(str2)) {
/* 124 */                           return false;
                                }
                            } else if (!str.equals(str2)) {
/* 124 */                       return false;
                            }
                            return this.f3391f == googleSignInOptions.f3391f && this.f3389d == googleSignInOptions.f3389d && this.f3390e == googleSignInOptions.f3390e && TextUtils.equals(this.f3385U, googleSignInOptions.f3385U);
                        }
/* 124 */               return false;
                    } catch (ClassCastException unused) {
/* 124 */               return false;
                    }
                }

                public final int hashCode() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             ArrayList arrayList2 = this.f3387b;
/* 8 */             int size = arrayList2.size();
/* 14 */            for (int i = 0; i < size; i++) {
/* 24 */                arrayList.add(((Scope) arrayList2.get(i)).f3439b);
                    }
/* 30 */            Collections.sort(arrayList);
/* 41 */            int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
/* 43 */            Account account = this.f3388c;
/* 54 */            int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
/* 56 */            String str = this.f3392i;
/* 82 */            int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.f3391f ? 1 : 0)) * 31) + (this.f3389d ? 1 : 0)) * 31) + (this.f3390e ? 1 : 0)) * 31;
/* 84 */            String str2 = this.f3385U;
/* 93 */            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3386a);
/* 26 */            w11.m9414X(parcel, 2, new ArrayList(this.f3387b), false);
/* 32 */            w11.m9409S(parcel, 3, this.f3388c, i, false);
/* 35 */            w11.m9420b0(parcel, 4, 4);
/* 40 */            parcel.writeInt(this.f3389d ? 1 : 0);
/* 44 */            w11.m9420b0(parcel, 5, 4);
/* 49 */            parcel.writeInt(this.f3390e ? 1 : 0);
/* 53 */            w11.m9420b0(parcel, 6, 4);
/* 58 */            parcel.writeInt(this.f3391f ? 1 : 0);
/* 64 */            w11.m9410T(parcel, 7, this.f3392i, false);
/* 71 */            w11.m9410T(parcel, 8, this.f3393v, false);
/* 78 */            w11.m9414X(parcel, 9, this.f3394w, false);
/* 85 */            w11.m9410T(parcel, 10, this.f3385U, false);
/* 88 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
