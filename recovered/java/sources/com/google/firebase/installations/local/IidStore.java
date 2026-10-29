            package com.google.firebase.installations.local;

            import android.content.SharedPreferences;
            import android.util.Base64;
            import io.sentry.android.core.AbstractC1245n0;
            import java.security.KeyFactory;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.security.PublicKey;
            import java.security.spec.InvalidKeySpecException;
            import java.security.spec.X509EncodedKeySpec;
            import okhttp3.HttpUrl;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            import p000.cj0;
            import p000.vi0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public class IidStore {
                private static final String[] ALLOWABLE_SCOPES = {"*", "FCM", "GCM", HttpUrl.FRAGMENT_ENCODE_SET};
                private static final String IID_SHARED_PREFS_NAME = "com.google.android.gms.appid";
                private static final String JSON_ENCODED_PREFIX = "{";
                private static final String JSON_TOKEN_KEY = "token";
                private static final String STORE_KEY_ID = "|S|id";
                private static final String STORE_KEY_PUB = "|S||P|";
                private static final String STORE_KEY_SEPARATOR = "|";
                private static final String STORE_KEY_TOKEN = "|T|";
                private final String defaultSenderId;
                private final SharedPreferences iidPrefs;

                public IidStore(vi0 vi0Var) {
/* 4 */             vi0Var.m9274a();
/* 16 */            this.iidPrefs = vi0Var.f18192a.getSharedPreferences(IID_SHARED_PREFS_NAME, 0);
/* 22 */            this.defaultSenderId = getDefaultSenderId(vi0Var);
                }

                private String createTokenKey(String str, String str2) {
/* 5 */             return AbstractC0886en.m3509m(STORE_KEY_TOKEN, str, STORE_KEY_SEPARATOR, str2);
                }

                private static String getDefaultSenderId(vi0 vi0Var) {
/* 1 */             vi0Var.m9274a();
/* 4 */             cj0 cj0Var = vi0Var.f18194c;
/* 6 */             String str = cj0Var.f2938e;
/* 8 */             if (str != null) {
/* 10 */                return str;
                    }
/* 11 */            vi0Var.m9274a();
/* 14 */            String str2 = cj0Var.f2935b;
/* 22 */            if (!str2.startsWith("1:") && !str2.startsWith("2:")) {
/* 32 */                return str2;
                    }
/* 35 */            String[] strArrSplit = str2.split(":");
/* 42 */            if (strArrSplit.length != 4) {
/* 41 */                return null;
                    }
/* 46 */            String str3 = strArrSplit[1];
/* 52 */            if (str3.isEmpty()) {
/* 41 */                return null;
                    }
/* 55 */            return str3;
                }

                private static String getIdFromPublicKey(PublicKey publicKey) {
                    try {
/* 11 */                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
/* 25 */                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
/* 31 */                return Base64.encodeToString(bArrDigest, 0, 8, 11);
                    } catch (NoSuchAlgorithmException unused) {
/* 40 */                AbstractC1245n0.m4889q("ContentValues", "Unexpected error, device missing required algorithms");
/* 43 */                return null;
                    }
                }

                private String parseIidTokenFromJson(String str) {
                    try {
/* 8 */                 return new JSONObject(str).getString(JSON_TOKEN_KEY);
                    } catch (JSONException unused) {
/* 13 */                return null;
                    }
                }

                private PublicKey parseKey(String str) {
                    try {
/* 18 */                return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
                    } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
/* 40 */                AbstractC1245n0.m4889q("ContentValues", "Invalid key stored " + e);
/* 43 */                return null;
                    }
                }

                private String readInstanceIdFromLocalStorage() {
                    String string;
                    synchronized (this.iidPrefs) {
/* 9 */                 string = this.iidPrefs.getString(STORE_KEY_ID, null);
                    }
/* 14 */            return string;
                }

                private String readPublicKeyFromLocalStorageAndCalculateInstanceId() {
                    synchronized (this.iidPrefs) {
                        try {
/* 9 */                     String string = this.iidPrefs.getString(STORE_KEY_PUB, null);
/* 13 */                    if (string == null) {
/* 8 */                         return null;
                            }
/* 19 */                    PublicKey key = parseKey(string);
/* 23 */                    if (key == null) {
/* 8 */                         return null;
                            }
/* 27 */                    return getIdFromPublicKey(key);
                        } catch (Throwable th) {
/* 34 */                    throw th;
                        }
                    }
                }

                public String readIid() {
                    synchronized (this.iidPrefs) {
                        try {
/* 4 */                     String instanceIdFromLocalStorage = readInstanceIdFromLocalStorage();
/* 8 */                     if (instanceIdFromLocalStorage != null) {
/* 11 */                        return instanceIdFromLocalStorage;
                            }
/* 14 */                    return readPublicKeyFromLocalStorageAndCalculateInstanceId();
                        } catch (Throwable th) {
/* 21 */                    throw th;
                        }
                    }
                }

                public String readToken() {
                    synchronized (this.iidPrefs) {
                        try {
/* 9 */                     for (String str : ALLOWABLE_SCOPES) {
/* 21 */                        String string = this.iidPrefs.getString(createTokenKey(this.defaultSenderId, str), null);
/* 25 */                        if (string != null && !string.isEmpty()) {
/* 39 */                            if (string.startsWith(JSON_ENCODED_PREFIX)) {
/* 41 */                                string = parseIidTokenFromJson(string);
                                    }
/* 49 */                            return string;
                                }
                            }
/* 8 */                     return null;
                        } catch (Throwable th) {
/* 56 */                    throw th;
                        }
                    }
                }

/* 24 */        public IidStore(SharedPreferences sharedPreferences, String str) {
/* 26 */            this.iidPrefs = sharedPreferences;
/* 27 */            this.defaultSenderId = str;
                }
            }
