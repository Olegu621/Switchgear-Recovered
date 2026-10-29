            package com.supercell.p007id.scid_plugin;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.security.keystore.KeyGenParameterSpec;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.EncryptedStorage;
            import io.sentry.android.core.AbstractC1245n0;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function0;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.be0;
            import p000.bx0;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/EncryptedStorage;", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/content/Context;", "context", HttpUrl.FRAGMENT_ENCODE_SET, "preferenceName", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "key", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "put", "(Ljava/lang/String;Ljava/lang/String;)V", "get", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "encryptedSharedPreferences$delegate", "Lp51;", "getEncryptedSharedPreferences", "()Landroid/content/SharedPreferences;", "encryptedSharedPreferences", "Lcom/supercell/id/scid_plugin/SecurePreferences;", "securePreferences$delegate", "getSecurePreferences", "()Lcom/supercell/id/scid_plugin/SecurePreferences;", "securePreferences", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class EncryptedStorage {
                private final Context context;

                /* JADX INFO: renamed from: encryptedSharedPreferences$delegate, reason: from kotlin metadata */
                private final p51 encryptedSharedPreferences;
                private final String preferenceName;

                /* JADX INFO: renamed from: securePreferences$delegate, reason: from kotlin metadata */
                private final p51 securePreferences;

                public EncryptedStorage(Context context, String str) {
/* 1 */             context.getClass();
/* 4 */             str.getClass();
/* 10 */            this.context = context;
/* 12 */            this.preferenceName = str;
/* 16 */            final int i = 0;
/* 24 */            this.encryptedSharedPreferences = r51.m8065b(new Function0(this) { // from class: ce0

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ EncryptedStorage f2862b;

                        {
/* 3 */                     this.f2862b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
/* 1 */                     int i2 = i;
/* 3 */                     EncryptedStorage encryptedStorage = this.f2862b;
                            switch (i2) {
                                case 0:
/* 1 */                             return EncryptedStorage.encryptedSharedPreferences_delegate$lambda$0(encryptedStorage);
                                default:
/* 1 */                             return EncryptedStorage.securePreferences_delegate$lambda$1(encryptedStorage);
                            }
                        }
                    });
/* 28 */            final int i2 = 1;
/* 36 */            this.securePreferences = r51.m8065b(new Function0(this) { // from class: ce0

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ EncryptedStorage f2862b;

                        {
/* 3 */                     this.f2862b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
/* 1 */                     int i3 = i2;
/* 3 */                     EncryptedStorage encryptedStorage = this.f2862b;
                            switch (i3) {
                                case 0:
/* 1 */                             return EncryptedStorage.encryptedSharedPreferences_delegate$lambda$0(encryptedStorage);
                                default:
/* 1 */                             return EncryptedStorage.securePreferences_delegate$lambda$1(encryptedStorage);
                            }
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final SharedPreferences encryptedSharedPreferences_delegate$lambda$0(EncryptedStorage encryptedStorage) {
/* 17 */            if (!encryptedStorage.context.getSharedPreferences(encryptedStorage.preferenceName, 0).getBoolean("FAILED_TO_CREATE_ENCRYPTED_SHARED_PREFS", false)) {
                        try {
/* 20 */                    Context context = encryptedStorage.context;
/* 22 */                    String str = encryptedStorage.preferenceName;
/* 26 */                    bx0 bx0Var = new bx0(context);
/* 33 */                    if (AbstractC0886en.m3520y(1) != 0) {
/* 75 */                        throw new IllegalArgumentException("Unsupported scheme: ".concat("AES256_GCM"));
                            }
/* 39 */                    if (((KeyGenParameterSpec) bx0Var.f2632d) != null) {
/* 61 */                        throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                            }
/* 41 */                    bx0Var.f2631c = 1;
/* 47 */                    return be0.m1341a(context, str, bx0Var.m1455a());
                        } catch (Exception e) {
/* 80 */                    AbstractC1245n0.m4891s("EncryptedStorage", "Failed to create EncryptedSharedPreferences", e);
/* 99 */                    encryptedStorage.context.getSharedPreferences(encryptedStorage.preferenceName, 0).edit().putBoolean("FAILED_TO_CREATE_ENCRYPTED_SHARED_PREFS", true).apply();
                        }
                    }
/* 16 */            return null;
                }

                private final SharedPreferences getEncryptedSharedPreferences() {
/* 7 */             return (SharedPreferences) this.encryptedSharedPreferences.getValue();
                }

                private final SecurePreferences getSecurePreferences() {
/* 7 */             return (SecurePreferences) this.securePreferences.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final SecurePreferences securePreferences_delegate$lambda$1(EncryptedStorage encryptedStorage) {
/* 3 */             char[] cArr = {'f', 'L', 'x', 'Y', 'B', '9', 'M', '8', '4', 'A', 'b', 'e', 'u', 's', 'E', 'R', 'M', 'Y', '9', 'Y', 'F', 'z', 'V', 'G'};
/* 10 */            String packageName = encryptedStorage.context.getPackageName();
/* 14 */            int length = packageName.length();
/* 18 */            String str = HttpUrl.FRAGMENT_ENCODE_SET;
                    while (true) {
/* 20 */                length--;
/* 22 */                if (length < 0) {
/* 61 */                    return new SecurePreferences(encryptedStorage.context, encryptedStorage.preferenceName, str, true);
                        }
/* 49 */                str = str + ((char) (((packageName.charAt(length) ^ cArr[length % 24]) & 31) + 48));
                    }
                }

                public final String get(String key) {
/* 1 */             key.getClass();
/* 4 */             SharedPreferences encryptedSharedPreferences = getEncryptedSharedPreferences();
                    return encryptedSharedPreferences != null ? encryptedSharedPreferences.getString(key, null) : getSecurePreferences().getString(key);
                }

                public final void put(String key, String value) {
/* 1 */             key.getClass();
/* 4 */             SharedPreferences encryptedSharedPreferences = getEncryptedSharedPreferences();
/* 8 */             if (encryptedSharedPreferences != null) {
/* 18 */                encryptedSharedPreferences.edit().putString(key, value).apply();
                    } else {
/* 26 */                getSecurePreferences().put(key, value);
                    }
                }
            }
