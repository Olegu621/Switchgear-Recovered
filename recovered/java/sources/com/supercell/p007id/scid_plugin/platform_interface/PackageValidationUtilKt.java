            package com.supercell.p007id.scid_plugin.platform_interface;

            import android.content.pm.PackageManager;
            import android.content.pm.Signature;
            import android.content.pm.SigningInfo;
            import android.os.Build;
            import java.security.MessageDigest;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u0006\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0002\u001a\f\u0010\u000b\u001a\u00020\u0005*\u00020\bH\u0002\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m6176d2 = {"getPackageSignatures", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/content/pm/Signature;", "Landroid/content/pm/PackageManager;", "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;", "getSHA256", HttpUrl.FRAGMENT_ENCODE_SET, "hexArray", HttpUrl.FRAGMENT_ENCODE_SET, "toHexStringWithColons", "scid_plugin_release"}, m6177k = 2, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class PackageValidationUtilKt {
                private static final char[] hexArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

                /* JADX INFO: Access modifiers changed from: private */
                public static final Signature[] getPackageSignatures(PackageManager packageManager, String str) {
/* 5 */             if (Build.VERSION.SDK_INT < 28) {
/* 32 */                return packageManager.getPackageInfo(str, 64).signatures;
                    }
/* 1 */             SigningInfo signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
/* 17 */            if (signingInfo != null) {
/* 1 */                 return signingInfo.getApkContentsSigners();
                    }
/* 24 */            return null;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final byte[] getSHA256(Signature signature) {
/* 11 */            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(signature.toByteArray());
/* 15 */            bArrDigest.getClass();
/* 18 */            return bArrDigest;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String toHexStringWithColons(byte[] bArr) {
/* 6 */             char[] cArr = new char[(bArr.length * 3) - 1];
/* 8 */             int length = bArr.length;
/* 10 */            for (int i = 0; i < length; i++) {
/* 14 */                int i2 = bArr[i] & 255;
/* 16 */                int i3 = i * 3;
/* 18 */                char[] cArr2 = hexArray;
/* 24 */                cArr[i3] = cArr2[i2 / 16];
/* 32 */                cArr[i3 + 1] = cArr2[i2 % 16];
/* 37 */                if (i < bArr.length - 1) {
/* 43 */                    cArr[i3 + 2] = ':';
                        }
                    }
/* 50 */            return new String(cArr);
                }
            }
