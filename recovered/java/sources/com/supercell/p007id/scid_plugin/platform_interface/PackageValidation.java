            package com.supercell.p007id.scid_plugin.platform_interface;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.content.pm.Signature;
            import java.util.Locale;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.C1997od;
            import p000.p51;
            import p000.r51;
            import p000.yq1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u000e\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001d\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\r¨\u0006\u001e"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/content/Context;", "context", HttpUrl.FRAGMENT_ENCODE_SET, "callingPackage", "scidEnvironment", HttpUrl.FRAGMENT_ENCODE_SET, "callingUid", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V", HttpUrl.FRAGMENT_ENCODE_SET, "validateCaller", "()Z", "runValidation", "isStagingEnvironment", HttpUrl.FRAGMENT_ENCODE_SET, "getRemoteWhitelistIfReady", "()Ljava/util/Map;", "expectedHash", "isInWhiteList", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "Ljava/lang/String;", "I", "isValid$delegate", "Lp51;", "isValid", "Companion", "yq1", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 30 */    public final class PackageValidation {
                private static final String DEBUG_KEY = "15:3B:54:7B:87:0E:F4:85:4D:94:2E:2C:DD:57:7B:5E:79:97:E1:31:63:30:F3:25:B1:82:41:98:D3:93:A8:22";
                public static final int INVALID_UID = -1;
                private static final String TAG = "PackageValidation";
                private final String callingPackage;
                private final int callingUid;
                private final Context context;

                /* JADX INFO: renamed from: isValid$delegate, reason: from kotlin metadata */
                private final p51 isValid;
                private final String scidEnvironment;
                private static final ConcurrentHashMap<yq1, Long> validationCache = new ConcurrentHashMap<>();

                public PackageValidation(Context context, String str, String str2, int i) {
/* 1 */             context.getClass();
/* 4 */             str.getClass();
/* 10 */            this.context = context;
/* 12 */            this.callingPackage = str;
/* 14 */            this.scidEnvironment = str2;
/* 16 */            this.callingUid = i;
/* 29 */            this.isValid = r51.m8065b(new C1997od(this, 8));
                }

                private final Map<String, String> getRemoteWhitelistIfReady() {
                    try {
/* 11 */                return SharedDataWhitelist.INSTANCE.getInstance(this.context).getWhitelistSync();
                    } catch (Exception unused) {
/* 16 */                return null;
                    }
                }

                private final boolean isInWhiteList(String expectedHash) {
/* 2 */             if (expectedHash != null && expectedHash.length() != 0) {
                        try {
/* 13 */                    PackageManager packageManager = this.context.getPackageManager();
/* 17 */                    packageManager.getClass();
/* 1 */                     Signature[] packageSignatures = PackageValidationUtilKt.getPackageSignatures(packageManager, this.callingPackage);
/* 26 */                    if (packageSignatures != null) {
/* 30 */                        for (Signature signature : packageSignatures) {
/* 46 */                            if (Intrinsics.m6216a(PackageValidationUtilKt.toHexStringWithColons(PackageValidationUtilKt.getSHA256(signature)), expectedHash)) {
/* 48 */                                return true;
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
/* 1 */             return false;
                }

                private final boolean isStagingEnvironment() {
/* 1 */             String str = this.scidEnvironment;
                    return str != null && str.equalsIgnoreCase("staging");
                }

                private final boolean runValidation() {
                    String str;
/* 1 */             Map<String, String> remoteWhitelistIfReady = getRemoteWhitelistIfReady();
/* 6 */             if (remoteWhitelistIfReady != null && (str = remoteWhitelistIfReady.get(this.callingPackage)) != null && isInWhiteList(str)) {
/* 5 */                 return true;
                    }
/* 29 */            if (isStagingEnvironment() && SharedDataWhitelist.INSTANCE.getHardcodedHash(this.callingPackage) != null && isInWhiteList(DEBUG_KEY)) {
/* 5 */                 return true;
                    }
/* 54 */            String hardcodedHash = SharedDataWhitelist.INSTANCE.getHardcodedHash(this.callingPackage);
                    return hardcodedHash != null && isInWhiteList(hardcodedHash);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final boolean validateCaller() {
                    Long lValueOf;
/* 1 */             String lowerCase = null;
                    try {
/* 16 */                lValueOf = Long.valueOf(SharedDataWhitelist.INSTANCE.getInstance(this.context).getGeneration());
                    } catch (Exception unused) {
/* 21 */                lValueOf = null;
                    }
/* 22 */            int i = this.callingUid;
/* 25 */            if (i == -1 || lValueOf == null) {
/* 74 */                return runValidation();
                    }
/* 32 */            String str = this.callingPackage;
/* 34 */            String str2 = this.scidEnvironment;
/* 36 */            if (str2 != null) {
/* 40 */                lowerCase = str2.toLowerCase(Locale.ROOT);
/* 44 */                lowerCase.getClass();
                    }
/* 47 */            yq1 yq1Var = new yq1(str, i, lowerCase);
/* 50 */            ConcurrentHashMap<yq1, Long> concurrentHashMap = validationCache;
/* 60 */            if (Intrinsics.m6216a(concurrentHashMap.get(yq1Var), lValueOf)) {
/* 62 */                return true;
                    }
/* 64 */            boolean zRunValidation = runValidation();
/* 68 */            if (zRunValidation) {
/* 70 */                concurrentHashMap.put(yq1Var, lValueOf);
                    }
/* 73 */            return zRunValidation;
                }

                public final boolean isValid() {
/* 9 */             return ((Boolean) this.isValid.getValue()).booleanValue();
                }

/* 31 */        public /* synthetic */ PackageValidation(Context context, String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 32 */            this(context, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? -1 : i);
                }
            }
