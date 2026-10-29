            package p000;

            import android.accounts.Account;
            import android.content.Context;
            import android.content.SharedPreferences;
            import android.net.Uri;
            import android.text.TextUtils;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
            import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
            import com.google.android.gms.common.api.Scope;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.locks.ReentrantLock;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class eh2 {

                /* JADX INFO: renamed from: c */
                public static final ReentrantLock f7689c = new ReentrantLock();

                /* JADX INFO: renamed from: d */
                public static eh2 f7690d;

                /* JADX INFO: renamed from: a */
                public final ReentrantLock f7691a = new ReentrantLock();

                /* JADX INFO: renamed from: b */
                public final SharedPreferences f7692b;

                public eh2(Context context) {
/* 18 */            this.f7692b = context.getSharedPreferences("com.google.android.gms.signin", 0);
                }

                /* JADX INFO: renamed from: a */
                public static eh2 m3432a(Context context) {
/* 1 */             kb1.m6061n(context);
/* 4 */             ReentrantLock reentrantLock = f7689c;
/* 6 */             reentrantLock.lock();
                    try {
/* 11 */                if (f7690d == null) {
/* 22 */                    f7690d = new eh2(context.getApplicationContext());
                        }
/* 27 */                return f7690d;
                    } finally {
/* 33 */                reentrantLock.unlock();
                    }
                }

                /* JADX INFO: renamed from: f */
                public static final String m3433f(String str, String str2) {
/* 3 */             return AbstractC0886en.m3508l(str, ":", str2);
                }

                /* JADX INFO: renamed from: b */
                public final GoogleSignInAccount m3434b() {
                    String strM3436d;
/* 3 */             String strM3436d2 = m3436d("defaultGoogleSignInAccount");
/* 12 */            if (!TextUtils.isEmpty(strM3436d2) && (strM3436d = m3436d(m3433f("googleSignInAccount", strM3436d2))) != null) {
                        try {
/* 27 */                    return GoogleSignInAccount.m1992E1(strM3436d);
                        } catch (JSONException unused) {
                        }
                    }
/* 11 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public final void m3435c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
/* 1 */             kb1.m6061n(googleSignInOptions);
/* 4 */             String str = googleSignInAccount.f3378w;
/* 8 */             m3437e("defaultGoogleSignInAccount", str);
/* 13 */            String strM3433f = m3433f("googleSignInAccount", str);
/* 19 */            JSONObject jSONObject = new JSONObject();
                    try {
/* 22 */                String str2 = googleSignInAccount.f3371b;
/* 24 */                if (str2 != null) {
/* 28 */                    jSONObject.put("id", str2);
                        }
/* 31 */                String str3 = googleSignInAccount.f3372c;
/* 33 */                if (str3 != null) {
/* 37 */                    jSONObject.put("tokenId", str3);
                        }
/* 40 */                String str4 = googleSignInAccount.f3373d;
/* 42 */                if (str4 != null) {
/* 46 */                    jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str4);
                        }
/* 49 */                String str5 = googleSignInAccount.f3374e;
/* 51 */                if (str5 != null) {
/* 55 */                    jSONObject.put("displayName", str5);
                        }
/* 58 */                String str6 = googleSignInAccount.f3367V;
/* 60 */                if (str6 != null) {
/* 64 */                    jSONObject.put("givenName", str6);
                        }
/* 67 */                String str7 = googleSignInAccount.f3368W;
/* 69 */                if (str7 != null) {
/* 73 */                    jSONObject.put("familyName", str7);
                        }
/* 76 */                Uri uri = googleSignInAccount.f3375f;
/* 78 */                if (uri != null) {
/* 86 */                    jSONObject.put("photoUrl", uri.toString());
                        }
/* 89 */                String str8 = googleSignInAccount.f3376i;
/* 93 */                if (str8 != null) {
/* 95 */                    jSONObject.put("serverAuthCode", str8);
                        }
/* 102 */               jSONObject.put("expirationTime", googleSignInAccount.f3377v);
/* 107 */               jSONObject.put("obfuscatedIdentifier", str);
/* 112 */               JSONArray jSONArray = new JSONArray();
/* 115 */               List list = googleSignInAccount.f3366U;
/* 127 */               Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
/* 131 */               Arrays.sort(scopeArr, wa3.f18544b);
/* 136 */               for (Scope scope : scopeArr) {
/* 142 */                   jSONArray.put(scope.f3439b);
                        }
/* 150 */               jSONObject.put("grantedScopes", jSONArray);
/* 153 */               jSONObject.remove("serverAuthCode");
/* 160 */               m3437e(strM3433f, jSONObject.toString());
/* 165 */               String strM3433f2 = m3433f("googleSignInOptions", str);
/* 169 */               String str9 = googleSignInOptions.f3393v;
/* 171 */               String str10 = googleSignInOptions.f3392i;
/* 173 */               ArrayList arrayList = googleSignInOptions.f3387b;
/* 177 */               JSONObject jSONObject2 = new JSONObject();
                        try {
/* 182 */                   JSONArray jSONArray2 = new JSONArray();
/* 187 */                   Collections.sort(arrayList, GoogleSignInOptions.f3384a0);
/* 190 */                   Iterator it = arrayList.iterator();
/* 198 */                   while (it.hasNext()) {
/* 208 */                       jSONArray2.put(((Scope) it.next()).f3439b);
                            }
/* 214 */                   jSONObject2.put("scopes", jSONArray2);
/* 217 */                   Account account = googleSignInOptions.f3388c;
/* 219 */                   if (account != null) {
/* 225 */                       jSONObject2.put("accountName", account.name);
                            }
/* 232 */                   jSONObject2.put("idTokenRequested", googleSignInOptions.f3389d);
/* 239 */                   jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f3391f);
/* 246 */                   jSONObject2.put("serverAuthRequested", googleSignInOptions.f3390e);
/* 253 */                   if (!TextUtils.isEmpty(str10)) {
/* 257 */                       jSONObject2.put("serverClientId", str10);
                            }
/* 264 */                   if (!TextUtils.isEmpty(str9)) {
/* 268 */                       jSONObject2.put("hostedDomain", str9);
                            }
/* 275 */                   m3437e(strM3433f2, jSONObject2.toString());
                        } catch (JSONException e) {
/* 280 */                   ds0.m3199p(e);
                        }
                    } catch (JSONException e2) {
/* 285 */               ds0.m3199p(e2);
                    }
                }

                /* JADX INFO: renamed from: d */
                public final String m3436d(String str) {
/* 1 */             ReentrantLock reentrantLock = this.f7691a;
/* 3 */             reentrantLock.lock();
                    try {
/* 9 */                 return this.f7692b.getString(str, null);
                    } finally {
/* 18 */                reentrantLock.unlock();
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m3437e(String str, String str2) {
/* 1 */             ReentrantLock reentrantLock = this.f7691a;
/* 3 */             reentrantLock.lock();
                    try {
/* 16 */                this.f7692b.edit().putString(str, str2).apply();
                    } finally {
/* 24 */                reentrantLock.unlock();
                    }
                }
            }
