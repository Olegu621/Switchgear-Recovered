            package kotlin.text;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m6176d2 = {HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "kotlin-stdlib"}, m6177k = 5, m6178mv = {2, 2, 0}, m6180xi = 49, m6181xs = "kotlin/text/StringsKt")
            public class StringsKt__StringNumberConversionsKt extends C1851d {
                /* JADX INFO: renamed from: e */
                public static final void m6241e(String str) {
/* 1 */             str.getClass();
/* 28 */            throw new NumberFormatException("Invalid number format: '" + str + '\'');
                }

                public static Integer toIntOrNull(String str) {
                    boolean z;
                    int i;
                    int i2;
/* 1 */             str.getClass();
/* 4 */             str.getClass();
/* 9 */             CharsKt__CharJVMKt.checkRadix(10);
/* 12 */            int length = str.length();
/* 16 */            if (length == 0) {
/* 88 */                return null;
                    }
/* 19 */            int i3 = 0;
/* 20 */            char cCharAt = str.charAt(0);
/* 30 */            int i4 = -2147483647;
/* 33 */            if (Intrinsics.m6217b(cCharAt, 48) < 0) {
/* 35 */                i = 1;
/* 36 */                if (length == 1) {
/* 88 */                    return null;
                        }
/* 41 */                if (cCharAt == '+') {
/* 52 */                    z = false;
                        } else {
/* 45 */                    if (cCharAt != '-') {
/* 88 */                        return null;
                            }
/* 48 */                    i4 = Integer.MIN_VALUE;
/* 50 */                    z = true;
                        }
                    } else {
/* 54 */                z = false;
/* 55 */                i = 0;
                    }
/* 59 */            int i5 = -59652323;
/* 60 */            while (i < length) {
/* 66 */                int iDigit = Character.digit((int) str.charAt(i), 10);
/* 70 */                if (iDigit < 0) {
/* 88 */                    return null;
                        }
/* 73 */                if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + iDigit) {
/* 88 */                    return null;
                        }
/* 90 */                i3 = i2 - iDigit;
/* 91 */                i++;
                    }
                    return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
                }
            }
