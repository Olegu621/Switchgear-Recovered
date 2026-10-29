            package com.appsflyer.internal;

            import android.text.TextUtils;
            import android.view.View;
            import android.widget.ExpandableListView;
            import java.io.UnsupportedEncodingException;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFf1nSDK {
                private static int $10 = 0;
                private static int $11 = 1;
                private static int AFAdRevenueData = 0;
                private static int component2 = 1;
                private static char[] getCurrencyIso4217Code;
                private static int getMediationNetwork;
                private static boolean getMonetizationNetwork;
                private static boolean getRevenue;

                static {
/* 1 */             getMediationNetwork();
/* 6 */             ExpandableListView.getPackedPositionChild(0L);
/* 15 */            AFAdRevenueData = (component2 + 25) % 128;
                }

                /* JADX INFO: renamed from: a */
                private static void m1799a(String str, int[] iArr, String str2, int i, Object[] objArr) throws UnsupportedEncodingException {
                    Object charArray = str2;
/* 1 */             if (str2 != null) {
/* 9 */                 $11 = ($10 + 75) % 128;
/* 11 */                charArray = str2.toCharArray();
                    }
/* 15 */            char[] cArr = (char[]) charArray;
                    Object bytes = str;
/* 17 */            if (str != null) {
/* 21 */                bytes = str.getBytes("ISO-8859-1");
                    }
/* 25 */            byte[] bArr = (byte[]) bytes;
/* 29 */            AFk1oSDK aFk1oSDK = new AFk1oSDK();
/* 32 */            char[] cArr2 = getCurrencyIso4217Code;
/* 40 */            if (cArr2 != null) {
/* 42 */                int length = cArr2.length;
/* 43 */                char[] cArr3 = new char[length];
/* 46 */                for (int i2 = 0; i2 < length; i2++) {
/* 54 */                    cArr3[i2] = (char) (((long) cArr2[i2]) ^ 1825820251896122634L);
                        }
/* 59 */                cArr2 = cArr3;
                    }
/* 64 */            int i3 = (int) (1825820251896122634L ^ ((long) getMediationNetwork));
/* 67 */            if (getRevenue) {
/* 75 */                $10 = ($11 + 3) % 128;
/* 77 */                int length2 = bArr.length;
/* 78 */                aFk1oSDK.getMonetizationNetwork = length2;
/* 80 */                char[] cArr4 = new char[length2];
/* 82 */                aFk1oSDK.AFAdRevenueData = 0;
                        while (true) {
/* 84 */                    int i4 = aFk1oSDK.AFAdRevenueData;
/* 86 */                    int i5 = aFk1oSDK.getMonetizationNetwork;
/* 88 */                    if (i4 >= i5) {
/* 112 */                       objArr[0] = new String(cArr4);
/* 114 */                       return;
                            } else {
/* 100 */                       cArr4[i4] = (char) (cArr2[bArr[(i5 - 1) - i4] + i] - i3);
/* 104 */                       aFk1oSDK.AFAdRevenueData = i4 + 1;
                            }
                        }
                    } else {
/* 117 */               if (!getMonetizationNetwork) {
/* 157 */                   int length3 = iArr.length;
/* 158 */                   aFk1oSDK.getMonetizationNetwork = length3;
/* 160 */                   char[] cArr5 = new char[length3];
/* 162 */                   aFk1oSDK.AFAdRevenueData = 0;
                            while (true) {
/* 164 */                       int i6 = aFk1oSDK.AFAdRevenueData;
/* 166 */                       int i7 = aFk1oSDK.getMonetizationNetwork;
/* 168 */                       if (i6 >= i7) {
                                    break;
                                }
/* 176 */                       $10 = ($11 + 81) % 128;
/* 188 */                       cArr5[i6] = (char) (cArr2[iArr[(i7 - 1) - i6] - i] - i3);
/* 192 */                       aFk1oSDK.AFAdRevenueData = i6 + 1;
                            }
/* 197 */                   String str3 = new String(cArr5);
/* 202 */                   int i8 = $11 + 41;
/* 206 */                   $10 = i8 % 128;
/* 210 */                   if (i8 % 2 != 0) {
/* 216 */                       throw null;
                            }
/* 212 */                   objArr[0] = str3;
/* 214 */                   return;
                        }
/* 119 */               int length4 = cArr.length;
/* 120 */               aFk1oSDK.getMonetizationNetwork = length4;
/* 122 */               char[] cArr6 = new char[length4];
/* 124 */               aFk1oSDK.AFAdRevenueData = 0;
                        while (true) {
/* 126 */                   int i9 = aFk1oSDK.AFAdRevenueData;
/* 128 */                   int i10 = aFk1oSDK.getMonetizationNetwork;
/* 130 */                   if (i9 >= i10) {
/* 154 */                       objArr[0] = new String(cArr6);
/* 156 */                       return;
                            } else {
/* 142 */                       cArr6[i9] = (char) (cArr2[cArr[(i10 - 1) - i9] - i] - i3);
/* 146 */                       aFk1oSDK.AFAdRevenueData = i9 + 1;
                            }
                        }
                    }
                }

                private static AFi1sSDK getCurrencyIso4217Code(AFi1vSDK aFi1vSDK, String str, String str2, String str3) throws UnsupportedEncodingException {
                    String string;
/* 3 */             if (str == null) {
/* 17 */                return new AFi1sSDK(aFi1vSDK.getRevenue == AFh1dSDK.DEFAULT, AFi1ySDK.NA);
                    }
/* 27 */            Object[] objArr = new Object[1];
/* 32 */            m1799a("\u008c\u0085\u0081\u0086\u0087\u0085\u008c\u0082\u008b\u0085\u0082\u0082\u0082\u0081\u0086\u0082\u0086\u0081\u008b\u0082\u008c\u0087\u008d\u0083\u0082\u0087\u008c\u0083\u0086\u0087\u0083\u0083\u008b\u0087\u0081\u0083\u008a\u0086\u0089\u0086\u0088\u0086\u0084\u0085\u0087\u0086\u0083\u0085\u0085\u0086\u0086\u0085\u0084\u0082\u0084\u0081\u0083\u0082\u0083\u0081\u0081\u0082\u0081\u0081", null, null, 127 - View.resolveSizeAndState(0, 0, 0), objArr);
/* 39 */            String strIntern = ((String) objArr[0]).intern();
/* 47 */            if (aFi1vSDK.getRevenue == AFh1dSDK.CUSTOM) {
/* 58 */                string = new StringBuilder(str2).reverse().toString();
                    } else {
/* 63 */                string = HttpUrl.FRAGMENT_ENCODE_SET;
/* 65 */                str3 = strIntern;
                    }
/* 89 */            boolean zEquals = getMonetizationNetwork(new StringBuilder(str3).reverse().toString(), aFi1vSDK.getMediationNetwork, "android", "v1", string).equals(str);
/* 102 */           return new AFi1sSDK(zEquals, zEquals ? AFi1ySDK.SUCCESS : AFi1ySDK.FAILURE);
                }

                public static void getMediationNetwork() {
/* 8 */             getCurrencyIso4217Code = new char[]{36169, 36173, 36172, 36163, 36168, 36174, 36175, 36162, 36170, 36190, 36171, 36187, 36191};
/* 13 */            getMediationNetwork = 1912311066;
/* 16 */            getMonetizationNetwork = true;
/* 18 */            getRevenue = true;
                }

                private static String getMonetizationNetwork(String str, String str2, String str3, String str4, String str5) {
/* 13 */            String monetizationNetwork = AFj1dSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, HttpUrl.FRAGMENT_ENCODE_SET}), str);
/* 24 */            if (monetizationNetwork.length() >= 12) {
/* 48 */                return monetizationNetwork.substring(0, 12);
                    }
/* 30 */            int i = (AFAdRevenueData + 113) % 128;
/* 32 */            component2 = i;
/* 34 */            int i2 = i + 111;
/* 38 */            AFAdRevenueData = i2 % 128;
/* 42 */            if (i2 % 2 != 0) {
/* 46 */                int i3 = 63 / 0;
                    }
/* 47 */            return monetizationNetwork;
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0017 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:11:0x0019  */
                public final AFi1sSDK getRevenue(AFi1vSDK aFi1vSDK, String str, String str2, String str3) {
/* 2 */             if (aFi1vSDK != null) {
/* 6 */                 int i = AFAdRevenueData + 111;
/* 10 */                component2 = i % 128;
/* 14 */                if (i % 2 == 0) {
/* 18 */                    int i2 = 89 / 0;
/* 19 */                    if (str2 != null) {
/* 24 */                        if (str3 != null) {
/* 26 */                            return getCurrencyIso4217Code(aFi1vSDK, str, str2, str3);
                                }
                            }
                        } else if (str2 != null) {
/* 24 */                    if (str3 != null) {
/* 26 */                        return getCurrencyIso4217Code(aFi1vSDK, str, str2, str3);
                            }
                        }
                    }
/* 37 */            component2 = (AFAdRevenueData + 17) % 128;
/* 43 */            return new AFi1sSDK(false, AFi1ySDK.INTERNAL_ERROR);
                }
            }
