            package com.appsflyer.internal;

            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.graphics.Color;
            import android.graphics.PointF;
            import android.graphics.drawable.Drawable;
            import android.hardware.SensorManager;
            import android.media.AudioTrack;
            import android.os.Build;
            import android.os.Process;
            import android.os.SystemClock;
            import android.text.AndroidCharacter;
            import android.text.TextUtils;
            import android.util.TypedValue;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.widget.ExpandableListView;
            import com.appsflyer.AFLogger;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public final class AFc1iSDK extends HashMap<String, Object> {
                private static int $10 = 0;
                private static int $11 = 1;
                private static long AFAdRevenueData = 0;
                private static int areAllFieldsValid = 0;
                private static int component1 = 1;
                private static long getCurrencyIso4217Code;
                private static char[] getMediationNetwork;
                private final Map<String, Object> getMonetizationNetwork;
                private final Context getRevenue;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class AFa1ySDK {
                    public static byte[] AFAdRevenueData(String str) throws Exception {
/* 5 */                 return str.getBytes(Charset.defaultCharset());
                    }

                    public static byte[] getMediationNetwork(byte[] bArr) throws Exception {
/* 3 */                 for (int i = 0; i < bArr.length; i++) {
/* 13 */                    bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
                        }
/* 18 */                return bArr;
                    }
                }

                static {
/* 1 */             getCurrencyIso4217Code();
/* 5 */             TypedValue.complexToFloat(0);
/* 8 */             Color.red(0);
/* 12 */            PointF.length(0.0f, 0.0f);
/* 15 */            SystemClock.elapsedRealtime();
/* 20 */            Process.getGidForName(HttpUrl.FRAGMENT_ENCODE_SET);
/* 23 */            Color.alpha(0);
/* 26 */            TextUtils.indexOf(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0);
/* 29 */            ViewConfiguration.getMaximumDrawingCacheSize();
/* 32 */            KeyEvent.getMaxKeyCode();
/* 35 */            ViewConfiguration.getFadingEdgeLength();
/* 38 */            AudioTrack.getMaxVolume();
/* 47 */            areAllFieldsValid = (component1 + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE) % 128;
                }

                public AFc1iSDK(Map<String, Object> map, Context context) {
/* 4 */             this.getMonetizationNetwork = map;
/* 6 */             this.getRevenue = context;
/* 16 */            put(AFAdRevenueData(), getMediationNetwork());
                }

                private String AFAdRevenueData() {
                    Object obj;
/* 9 */             areAllFieldsValid = (component1 + 87) % 128;
                    try {
/* 15 */                String string = Integer.toString(Build.VERSION.SDK_INT);
/* 19 */                Map<String, Object> map = this.getMonetizationNetwork;
/* 44 */                Object[] objArr = new Object[1];
/* 46 */                m1784a(13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Process.myPid() >> 22, (char) (View.MeasureSpec.getSize(0) + 12973), objArr);
/* 61 */                String string2 = map.get(((String) objArr[0]).intern()).toString();
/* 65 */                Map<String, Object> map2 = this.getMonetizationNetwork;
/* 77 */                Object[] objArr2 = new Object[1];
/* 79 */                m1785b("\uf4f5噬뇤።绗", TextUtils.indexOf(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET) + 41609, objArr2);
/* 94 */                String string3 = map2.get(((String) objArr2[0]).intern()).toString();
/* 98 */                if (string3 == null) {
/* 102 */                   int i = component1 + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
/* 106 */                   areAllFieldsValid = i % 128;
/* 110 */                   if (i % 2 != 0) {
/* 134 */                       Object[] objArr3 = new Object[1];
/* 136 */                       m1784a(26 % (ViewConfiguration.getTapTimeout() >>> 67), 107 >>> Drawable.resolveOpacity(1, 0), (char) TextUtils.indexOf(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0), objArr3);
/* 139 */                       obj = objArr3[0];
                            } else {
/* 169 */                       Object[] objArr4 = new Object[1];
/* 171 */                       m1784a(8 - (ViewConfiguration.getTapTimeout() >> 16), 12 - Drawable.resolveOpacity(0, 0), (char) TextUtils.indexOf(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0), objArr4);
/* 174 */                       obj = objArr4[0];
                            }
/* 143 */                   string3 = ((String) obj).intern();
                        }
/* 179 */               StringBuilder sb = new StringBuilder(string2);
/* 182 */               sb.reverse();
/* 193 */               StringBuilder currencyIso4217Code = getCurrencyIso4217Code(string, string3, sb.toString());
/* 197 */               int length = currencyIso4217Code.length();
/* 202 */               if (length > 4) {
/* 204 */                   currencyIso4217Code.delete(4, length);
                        } else {
/* 208 */                   while (length < 4) {
/* 210 */                       length++;
/* 214 */                       currencyIso4217Code.append('1');
/* 223 */                       areAllFieldsValid = (component1 + 11) % 128;
                            }
                        }
/* 236 */               Object[] objArr5 = new Object[1];
/* 238 */               m1785b("\uf4fc댯筋", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18396, objArr5);
/* 249 */               currencyIso4217Code.insert(0, ((String) objArr5[0]).intern());
/* 252 */               return currencyIso4217Code.toString();
                    } catch (Exception e) {
/* 266 */               Object[] objArr6 = new Object[1];
/* 270 */               m1785b("\uf4b7ᒵ㑸听痕闼땂픑\uf6c6ᛚ㙃嘁矂靺뜴탸\uf0e7ၥ〨処熖酌넘틐\uf286ቄ㏲台獰錣볧\udcecﱜᰗ㷄巘絔鴇뻝\ude7c", 57412 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr6);
/* 281 */               AFLogger.afErrorLogForExcManagerOnly(((String) objArr6[0]).intern(), e);
/* 286 */               StringBuilder sb2 = new StringBuilder();
/* 311 */               Object[] objArr7 = new Object[1];
/* 313 */               m1784a(Color.green(0) + 42, 20 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr7);
/* 324 */               sb2.append(((String) objArr7[0]).intern());
/* 327 */               sb2.append(e);
/* 334 */               AFLogger.afRDLog(sb2.toString());
/* 345 */               Object[] objArr8 = new Object[1];
/* 349 */               m1785b("\uf4fc\uda8dꠏ翓䵒᳕\ue254", (ViewConfiguration.getTouchSlop() >> 8) + 11903, objArr8);
/* 356 */               return ((String) objArr8[0]).intern();
                    }
                }

                /* JADX INFO: renamed from: a */
                private static void m1784a(int i, int i2, char c, Object[] objArr) {
                    int i3;
/* 3 */             AFk1mSDK aFk1mSDK = new AFk1mSDK();
/* 6 */             long[] jArr = new long[i];
/* 9 */             aFk1mSDK.getMediationNetwork = 0;
/* 17 */            $10 = ($11 + 111) % 128;
                    while (true) {
/* 19 */                int i4 = aFk1mSDK.getMediationNetwork;
/* 21 */                if (i4 >= i) {
                            break;
                        }
/* 47 */                jArr[i4] = (((long) ((char) (((long) getMediationNetwork[i2 + i4]) ^ (-2577524606577954075L)))) ^ (((long) i4) * ((-2577524606577954075L) ^ getCurrencyIso4217Code))) ^ ((long) c);
/* 51 */                aFk1mSDK.getMediationNetwork = i4 + 1;
                    }
/* 54 */            char[] cArr = new char[i];
/* 56 */            aFk1mSDK.getMediationNetwork = 0;
/* 64 */            $10 = ($11 + 111) % 128;
                    while (true) {
/* 66 */                int i5 = aFk1mSDK.getMediationNetwork;
/* 68 */                if (i5 >= i) {
/* 107 */                   objArr[0] = new String(cArr);
/* 109 */                   return;
                        }
/* 72 */                int i6 = $11 + 75;
/* 76 */                $10 = i6 % 128;
/* 80 */                if (i6 % 2 != 0) {
/* 86 */                    cArr[i5] = (char) jArr[i5];
/* 88 */                    i3 = i5 / 0;
                        } else {
/* 97 */                    cArr[i5] = (char) jArr[i5];
/* 99 */                    i3 = i5 + 1;
                        }
/* 90 */                aFk1mSDK.getMediationNetwork = i3;
                    }
                }

                /* JADX INFO: renamed from: b */
                private static void m1785b(String str, int i, Object[] objArr) {
/* 7 */             $11 = ($10 + 57) % 128;
                    Object charArray = str;
/* 9 */             if (str != null) {
/* 11 */                charArray = str.toCharArray();
                    }
/* 15 */            char[] cArr = (char[]) charArray;
/* 19 */            AFk1nSDK aFk1nSDK = new AFk1nSDK();
/* 22 */            aFk1nSDK.AFAdRevenueData = i;
/* 24 */            int length = cArr.length;
/* 25 */            long[] jArr = new long[length];
/* 28 */            aFk1nSDK.getRevenue = 0;
/* 36 */            $11 = ($10 + 29) % 128;
                    while (true) {
/* 38 */                int i2 = aFk1nSDK.getRevenue;
/* 41 */                if (i2 >= cArr.length) {
                            break;
                        }
/* 47 */                int i3 = ($11 + 85) % 128;
/* 49 */                $10 = i3;
/* 69 */                jArr[i2] = (((long) cArr[i2]) ^ (((long) i2) * ((long) aFk1nSDK.AFAdRevenueData))) ^ (AFAdRevenueData ^ (-4672045500807300752L));
/* 73 */                aFk1nSDK.getRevenue = i2 + 1;
/* 79 */                $11 = (i3 + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE) % 128;
                    }
/* 82 */            char[] cArr2 = new char[length];
/* 84 */            aFk1nSDK.getRevenue = 0;
                    while (true) {
/* 86 */                int i4 = aFk1nSDK.getRevenue;
/* 89 */                if (i4 >= cArr.length) {
/* 107 */                   objArr[0] = new String(cArr2);
/* 109 */                   return;
                        } else {
/* 95 */                    cArr2[i4] = (char) jArr[i4];
/* 99 */                    aFk1nSDK.getRevenue = i4 + 1;
                        }
                    }
                }

                public static void getCurrencyIso4217Code() {
/* 8 */             getMediationNetwork = new char[]{32809, 60417, 22601, 50353, 12445, 40142, 2359, 30066, 57668, 19854, 47603, 9789, 45739, 56965, 27364, 63018, 523, 44623, 15281, 18408, 45699, 57003, 27346, 62980, 572, 44650, 15327, 18379, 54264, 32556, 35670, 5266, 41136, 52466, 22558, 58442, 28786, 40410, 10688, 46589, 49455, 27934, 65156, 2745, 38644, 8786, 20052, 55929, 26549, 62430, 8007, 43825, 14205, 16521, 60606, 30968, 33805, 4167, 48240, 51618, 21895, 57666, 37826, 65525, 19355, 55118, 9062, 36649, 45768, 57016, 27352, 63046, 627, 45699, 57003, 27346, 62980, 572, 44650, 15327, 18379, 54264, 32556, 35670, 5266, 41136, 52466, 22558, 58442, 28786, 40410, 10688, 46589, 49455, 27934, 65177, 2749, 38625, 8711, 20038, 55856, 26550, 62431, 7955, 43836, 14117, 16527, 60579, 30955, 33820, 4190, 48235, 51621, 21970, 57612, 3433, 39200, 45700, 56996, 27359, 63002, 566, 44647, 15259, 18306, 54260, 32556, 35655, 5253, 41151, 52466, 22617, 58437, 28790, 40334, 10690, 46583, 49447, 27920, 65197, 2717, 38617, 8742, 20070, 55874, 26520, 62441, 7972, 43804, 14148, 16548, 60572, 30925, 33853, 45713, 57007, 27350, 63000, 572, 44668, 15262, 18392, 54248, 32560, 35670, 45703, 30921, 5299, 45698, 57007, 27343, 63038, 619, 44632, 15262, 18368, 54248, 32551, 35603, 5253, 41123, 52468, 22552, 58454};
/* 15 */            getCurrencyIso4217Code = 4920180562940649162L;
/* 22 */            AFAdRevenueData = 2584127450055626215L;
                }

                /* JADX WARN: Code duplicated, block: B:17:0x01b0  */
                private String getMediationNetwork() {
                    String string;
                    int i;
                    String hexString;
                    try {
/* 13 */                Map<String, Object> map = this.getMonetizationNetwork;
/* 36 */                Object[] objArr = new Object[1];
/* 38 */                m1784a(12 - (KeyEvent.getMaxKeyCode() >> 16), ViewConfiguration.getFadingEdgeLength() >> 16, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12972), objArr);
/* 53 */                String string2 = map.get(((String) objArr[0]).intern()).toString();
/* 57 */                Map<String, Object> map2 = this.getMonetizationNetwork;
/* 69 */                Object[] objArr2 = new Object[1];
/* 71 */                m1785b("\uf4f1㞛爯뻋亮␢您ꌡ\uefd1⩹唍醄\udc4aᣂ孴", Color.blue(0) + 50021, objArr2);
/* 86 */                String string3 = map2.get(((String) objArr2[0]).intern()).toString();
/* 112 */               Object[] objArr3 = new Object[1];
/* 114 */               m1784a((ViewConfiguration.getWindowTouchSlop() >> 8) + 6, 62 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (KeyEvent.getDeadChar(0, 0) + 8465), objArr3);
/* 121 */               String strIntern = ((String) objArr3[0]).intern();
/* 147 */               Object[] objArr4 = new Object[1];
/* 149 */               m1784a('5' - AndroidCharacter.getMirror('0'), Color.rgb(0, 0, 0) + 16777284, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
/* 160 */               String strReplaceAll = strIntern.replaceAll(((String) objArr4[0]).intern(), HttpUrl.FRAGMENT_ENCODE_SET);
/* 166 */               StringBuilder sb = new StringBuilder();
/* 169 */               sb.append(string2);
/* 172 */               sb.append(string3);
/* 175 */               sb.append(strReplaceAll);
/* 186 */               string = AFj1dSDK.getCurrencyIso4217Code(sb.toString()).substring(0, 16);
                    } catch (Exception e) {
/* 200 */               Object[] objArr5 = new Object[1];
/* 204 */               m1785b("\uf4f0ꞯ剙໖맑吐Ø데渊᪷딕怎Ც콇篭ᚁ섣続⡺\udb15瞽≓\udd1b覭\u245b탫莋㸿\uea9b蕵〔\uecb2鼗䨜\ue6ac酌䷶\uf883", 21341 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr5);
/* 215 */               AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
/* 220 */               StringBuilder sb2 = new StringBuilder();
/* 242 */               Object[] objArr6 = new Object[1];
/* 244 */               m1784a(44 - View.MeasureSpec.getSize(0), 73 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) Color.red(0), objArr6);
/* 255 */               sb2.append(((String) objArr6[0]).intern());
/* 258 */               sb2.append(e);
/* 265 */               AFLogger.afRDLog(sb2.toString());
/* 270 */               StringBuilder sb3 = new StringBuilder(HttpUrl.FRAGMENT_ENCODE_SET);
/* 281 */               Object[] objArr7 = new Object[1];
/* 285 */               m1785b("\uf4f5ꑁ喛ۗ똪条ჭ솣焛⋈폕荳㰲\uedba麧丞ￖꢈ", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 20662, objArr7);
/* 296 */               sb3.append(((String) objArr7[0]).intern());
/* 299 */               string = sb3.toString();
                    }
/* 190 */           String str = string;
                    try {
/* 304 */               Context context = this.getRevenue;
/* 329 */               Object[] objArr8 = new Object[1];
/* 331 */               m1784a(37 - (ViewConfiguration.getScrollBarSize() >> 8), 117 - (Process.myPid() >> 22), (char) TextUtils.getOffsetBefore(HttpUrl.FRAGMENT_ENCODE_SET, 0), objArr8);
/* 346 */               Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
/* 350 */               int intExtra = -2700;
/* 352 */               if (intentRegisterReceiver != null) {
/* 373 */                   Object[] objArr9 = new Object[1];
/* 375 */                   m1784a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, View.combineMeasuredStates(0, 0) + 154, (char) Color.argb(0, 0, 0, 0), objArr9);
/* 386 */                   intExtra = intentRegisterReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
                        }
/* 400 */               String str2 = this.getRevenue.getApplicationInfo().nativeLibraryDir;
/* 402 */               if (str2 != null) {
/* 412 */                   Object[] objArr10 = new Object[1];
/* 414 */                   m1785b("\uf4ef\udfc6ꉳ", 11112 - TextUtils.lastIndexOf(HttpUrl.FRAGMENT_ENCODE_SET, '0'), objArr10);
/* 429 */                   if (str2.contains(((String) objArr10[0]).intern())) {
/* 431 */                       i = 1;
                            } else {
/* 433 */                       i = 0;
                            }
                        } else {
/* 433 */                   i = 0;
                        }
/* 434 */               Context context2 = this.getRevenue;
/* 444 */               Object[] objArr11 = new Object[1];
/* 446 */               m1785b("\uf4e4霛㌫\udf5f筜ݨ", TextUtils.lastIndexOf(HttpUrl.FRAGMENT_ENCODE_SET, '0') + 25578, objArr11);
/* 468 */               int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
/* 474 */               StringBuilder sb4 = new StringBuilder();
/* 500 */               Object[] objArr12 = new Object[1];
/* 502 */               m1784a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, 165 - View.MeasureSpec.getMode(0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr12);
/* 513 */               sb4.append(((String) objArr12[0]).intern());
/* 516 */               sb4.append(intExtra);
/* 527 */               Object[] objArr13 = new Object[1];
/* 529 */               m1785b("\uf4b1앾", Color.red(0) + 12689, objArr13);
/* 540 */               sb4.append(((String) objArr13[0]).intern());
/* 543 */               sb4.append(i);
/* 571 */               Object[] objArr14 = new Object[1];
/* 573 */               m1784a(View.combineMeasuredStates(0, 0) + 2, (-16777050) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 51722), objArr14);
/* 584 */               sb4.append(((String) objArr14[0]).intern());
/* 587 */               sb4.append(size);
/* 598 */               Object[] objArr15 = new Object[1];
/* 600 */               m1785b("\uf4b1诖", 32561 - View.resolveSizeAndState(0, 0, 0), objArr15);
/* 611 */               sb4.append(((String) objArr15[0]).intern());
/* 620 */               sb4.append(this.getMonetizationNetwork.size());
/* 623 */               String string4 = sb4.toString();
/* 629 */               StringBuilder sb5 = new StringBuilder();
/* 632 */               sb5.append(str);
/* 639 */               byte[] mediationNetwork = AFa1ySDK.getMediationNetwork(AFa1ySDK.AFAdRevenueData(string4));
/* 645 */               StringBuilder sb6 = new StringBuilder();
/* 648 */               int length = mediationNetwork.length;
/* 650 */               for (int i2 = 0; i2 < length; i2++) {
/* 654 */                   int i3 = component1 + 37;
/* 658 */                   areAllFieldsValid = i3 % 128;
/* 662 */                   if (i3 % 2 != 0) {
/* 666 */                       hexString = Integer.toHexString(mediationNetwork[i2]);
/* 674 */                       if (hexString.length() == 1) {
/* 691 */                           hexString = "0".concat(hexString);
/* 701 */                           areAllFieldsValid = (component1 + 69) % 128;
                                }
                            } else {
/* 679 */                       hexString = Integer.toHexString(mediationNetwork[i2]);
/* 687 */                       if (hexString.length() == 1) {
/* 691 */                           hexString = "0".concat(hexString);
/* 701 */                           areAllFieldsValid = (component1 + 69) % 128;
                                }
                            }
/* 703 */                   sb6.append(hexString);
                        }
/* 713 */               sb5.append(sb6.toString());
/* 716 */               return sb5.toString();
                    } catch (Exception e2) {
/* 741 */               Object[] objArr16 = new Object[1];
/* 743 */               m1784a(16 - View.MeasureSpec.getSize(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 168, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr16);
/* 754 */               AFLogger.afErrorLogForExcManagerOnly(((String) objArr16[0]).intern(), e2);
/* 759 */               StringBuilder sb7 = new StringBuilder();
/* 779 */               Object[] objArr17 = new Object[1];
/* 781 */               m1784a(KeyEvent.getDeadChar(0, 0) + 44, TextUtils.lastIndexOf(HttpUrl.FRAGMENT_ENCODE_SET, '0') + 74, (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr17);
/* 792 */               sb7.append(((String) objArr17[0]).intern());
/* 795 */               sb7.append(e2);
/* 802 */               AFLogger.afRDLog(sb7.toString());
/* 807 */               StringBuilder sb8 = new StringBuilder();
/* 810 */               sb8.append(str);
/* 822 */               Object[] objArr18 = new Object[1];
/* 826 */               m1785b("\uf4f1仦聤\uda64ᷢ埣ꥡ\ue361⛯磬눯\uf43f俳膮\udb78ᴵ", (ViewConfiguration.getJumpTapTimeout() >> 16) + 47681, objArr18);
/* 837 */               sb8.append(((String) objArr18[0]).intern());
/* 840 */               return sb8.toString();
                    }
                }

/* 24 */        private static StringBuilder getCurrencyIso4217Code(String... strArr) throws Exception {
/* 25 */            ArrayList arrayList = new ArrayList();
/* 26 */            int length = strArr.length;
                    int i = 0;
                    while (i < 3) {
/* 27 */                arrayList.add(Integer.valueOf(strArr[i].length()));
                        i++;
/* 28 */                component1 = (areAllFieldsValid + 87) % 128;
                    }
/* 29 */            Collections.sort(arrayList);
/* 30 */            int iIntValue = ((Integer) arrayList.get(0)).intValue();
/* 31 */            StringBuilder sb = new StringBuilder();
                    int i2 = 0;
                    while (i2 < iIntValue) {
                        Integer numValueOf = null;
                        for (int i3 = 0; i3 < 3; i3++) {
/* 33 */                    int iCharAt = strArr[i3].charAt(i2);
                            if (numValueOf != null) {
/* 34 */                        iCharAt ^= numValueOf.intValue();
                            }
                            numValueOf = Integer.valueOf(iCharAt);
                        }
/* 36 */                sb.append(Integer.toHexString(numValueOf.intValue()));
                        i2++;
/* 37 */                component1 = (areAllFieldsValid + 85) % 128;
                    }
                    return sb;
                }
            }
