            package p000;

            import android.R;
            import android.app.Activity;
            import android.app.Application;
            import android.content.Context;
            import android.content.Intent;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Process;
            import android.os.StrictMode;
            import android.view.View;
            import android.widget.LinearLayout;
            import androidx.cardview.widget.CardView;
            import com.google.android.gms.internal.games_v2.zzar;
            import com.google.android.gms.internal.games_v2.zzax;
            import com.google.android.gms.internal.games_v2.zzbr;
            import com.google.android.gms.internal.games_v2.zzco;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageVendor;
            import com.usercentrics.sdk.services.tcf.interfaces.IdAndName;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
            import io.sentry.instrumentation.file.C1501h;
            import java.io.BufferedReader;
            import java.io.IOException;
            import java.text.SimpleDateFormat;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.TimeZone;
            import java.util.concurrent.TimeUnit;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.text.C1848a;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import kotlin.text.StringsKt__StringsKt;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mn0 {

                /* JADX INFO: renamed from: e */
                public static final p62 f13870e;

                /* JADX INFO: renamed from: f */
                public static final q62 f13871f;

                /* JADX INFO: renamed from: j */
                public static final String f13875j = "iglu:com.snowplowanalytics.snowplow.media/session/jsonschema/1-0-0";

                /* JADX INFO: renamed from: k */
                public static final String f13876k = "iglu:com.snowplowanalytics.snowplow.media/ad/jsonschema/1-0-0";

                /* JADX INFO: renamed from: l */
                public static final String f13877l = "iglu:com.snowplowanalytics.snowplow.media/ad_break/jsonschema/1-0-0";

                /* JADX INFO: renamed from: m */
                public static String f13878m;

                /* JADX INFO: renamed from: n */
                public static int f13879n;

                /* JADX INFO: renamed from: o */
                public static Boolean f13880o;

                /* JADX INFO: renamed from: p */
                public static final /* synthetic */ int f13881p = 0;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13882a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Rect f13883b;

                /* JADX INFO: renamed from: c */
                public static final C2131r4 f13868c = new C2131r4("RESUME_TOKEN", 8);

                /* JADX INFO: renamed from: d */
                public static final String[] f13869d = {"AT", "BE", "BG", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FR", "GR", "HR", "HU", "IE", "IS", "IT", "LI", "LT", "LU", "LV", "MT", "NL", "NO", "PL", "PT", "RO", "SE", "SI", "SK"};

                /* JADX INFO: renamed from: g */
                public static final ec0 f13872g = new ec0(29);

                /* JADX INFO: renamed from: h */
                public static final String[] f13873h = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

                /* JADX INFO: renamed from: i */
                public static final String[] f13874i = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

                static {
/* 80 */            int i = 0;
/* 84 */            f13870e = new p62(i);
/* 91 */            f13871f = new q62(i);
                }

                public /* synthetic */ mn0(int i, Rect rect) {
/* 1 */             this.f13882a = i;
/* 3 */             this.f13883b = rect;
                }

                /* JADX INFO: renamed from: A */
                public static int m6677A(Context context, int i) {
/* 8 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
/* 14 */            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
/* 18 */            typedArrayObtainStyledAttributes.recycle();
/* 21 */            return resourceId;
                }

                /* JADX INFO: renamed from: B */
                public static byte[] m6678B(C2074pl c2074pl) throws IOException {
/* 5 */             ArrayDeque arrayDeque = new ArrayDeque(20);
/* 23 */            int iMin = Math.min(Segment.SIZE, Math.max(128, Integer.highestOneBit(0) * 2));
/* 27 */            int i = 0;
/* 32 */            while (i < 2147483639) {
/* 35 */                int iMin2 = Math.min(iMin, 2147483639 - i);
/* 39 */                byte[] bArr = new byte[iMin2];
/* 41 */                arrayDeque.add(bArr);
/* 44 */                int i2 = 0;
/* 45 */                while (i2 < iMin2) {
/* 49 */                    int i3 = c2074pl.read(bArr, i2, iMin2 - i2);
/* 53 */                    if (i3 == -1) {
/* 55 */                        return m6690f(arrayDeque, i);
                            }
/* 60 */                    i2 += i3;
/* 61 */                    i += i3;
                        }
/* 72 */                long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
/* 78 */                if (j > 2147483647L) {
/* 80 */                    iMin = AbstractC0208c9.API_PRIORITY_OTHER;
                        } else {
/* 94 */                    iMin = j < -2147483648L ? Integer.MIN_VALUE : (int) j;
                        }
                    }
/* 100 */           if (c2074pl.read() == -1) {
/* 102 */               return m6690f(arrayDeque, 2147483639);
                    }
/* 114 */           throw new OutOfMemoryError("input is too large to fit in a byte array");
                }

                /* JADX INFO: renamed from: C */
                public static final long m6679C(double d, ib0 ib0Var) {
/* 3 */             double dM5734a = jb0.m5734a(d, ib0Var, ib0.NANOSECONDS);
/* 11 */            if (Double.isNaN(dM5734a)) {
/* 57 */                C1951n4.m6859j("Duration value cannot be NaN.");
/* 60 */                return 0L;
                    }
/* 13 */            long jM5797b = jd1.m5797b(dM5734a);
                    return (-4611686018426999999L > jM5797b || jM5797b >= 4611686018427000000L) ? m6694j(jd1.m5797b(jb0.m5734a(d, ib0Var, ib0.MILLISECONDS))) : m6695k(jM5797b);
                }

                /* JADX INFO: renamed from: D */
                public static final long m6680D(int i, ib0 ib0Var) {
/* 7 */             if (ib0Var.compareTo(ib0.SECONDS) > 0) {
/* 26 */                return m6681E(i, ib0Var);
                    }
                    long j = i;
/* 10 */            ib0 ib0Var2 = ib0.NANOSECONDS;
/* 20 */            return m6695k(TimeUnit.NANOSECONDS.convert(j, ib0Var.f9526a));
                }

                /* JADX INFO: renamed from: E */
                public static final long m6681E(long j, ib0 ib0Var) {
/* 1 */             ib0 ib0Var2 = ib0.NANOSECONDS;
/* 3 */             TimeUnit timeUnit = ib0Var.f9526a;
/* 10 */            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
/* 12 */            long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
/* 19 */            if ((-jConvert) <= j && j <= jConvert) {
/* 29 */                return m6695k(timeUnit2.convert(j, timeUnit));
                    }
/* 34 */            ib0 ib0Var3 = ib0.NANOSECONDS;
/* 46 */            return m6693i(r02.m8045b(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
                }

                /* JADX INFO: renamed from: F */
                public static final StorageVendor m6682F(TCFVendor tCFVendor) {
/* 1 */             List list = tCFVendor.f6211f;
/* 11 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 14 */            Iterator it = list.iterator();
/* 22 */            while (it.hasNext()) {
/* 36 */                arrayList.add(Integer.valueOf(((IdAndName) it.next()).f6157a));
                    }
/* 40 */            List list2 = tCFVendor.f6214i;
/* 48 */            ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(list2, 10));
/* 51 */            Iterator it2 = list2.iterator();
/* 59 */            while (it2.hasNext()) {
/* 73 */                arrayList2.add(Integer.valueOf(((IdAndName) it2.next()).f6157a));
                    }
/* 77 */            List list3 = tCFVendor.f6217l;
/* 85 */            ArrayList arrayList3 = new ArrayList(C2122qw.m8020h(list3, 10));
/* 88 */            Iterator it3 = list3.iterator();
/* 96 */            while (it3.hasNext()) {
/* 110 */               arrayList3.add(Integer.valueOf(((IdAndName) it3.next()).f6157a));
                    }
/* 116 */           return new StorageVendor(arrayList, arrayList2, arrayList3);
                }

                /* JADX INFO: renamed from: G */
                public static String m6683G(String str) {
/* 7 */             List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"://"}, false, 0, 6, null);
                    return listSplit$default.size() > 1 ? CollectionsKt.m6203x(CollectionsKt.m6183B(C1839a.m6210b(di2.m3089y(16, (String) CollectionsKt.m6200u(listSplit$default))), CollectionsKt.m6198s(1, listSplit$default)), "://", null, null, null, 62) : str;
                }

                /* JADX INFO: renamed from: H */
                public static int m6684H(int i) {
/* 2 */             int[] iArr = {1, 2, 3, 4, 5, 6};
/* 8 */             for (int i2 = 0; i2 < 6; i2++) {
/* 10 */                int i3 = iArr[i2];
/* 12 */                int i4 = i3 - 1;
/* 14 */                if (i3 == 0) {
/* 23 */                    throw null;
                        }
/* 16 */                if (i4 == i) {
/* 18 */                    return i3;
                        }
                    }
/* 24 */            return 1;
                }

                /* JADX INFO: renamed from: a */
                public static final ArrayList m6685a(ArrayList arrayList) {
/* 3 */             ArrayList arrayList2 = new ArrayList();
/* 6 */             Iterator it = arrayList.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                pa3 pa3Var = (pa3) it.next();
/* 24 */                Bundle bundle = new Bundle();
/* 31 */                bundle.putInt("event_type", pa3Var.f15046a);
/* 38 */                bundle.putLong("event_timestamp", pa3Var.f15047b);
/* 41 */                arrayList2.add(bundle);
                    }
/* 45 */            return arrayList2;
                }

                /* JADX INFO: renamed from: b */
                public static final long m6686b(String str) {
                    ib0 ib0Var;
                    char cCharAt;
/* 1 */             int length = str.length();
/* 7 */             if (length == 0) {
/* 340 */               C1951n4.m6859j("The string is empty");
/* 5 */                 return 0L;
                    }
/* 11 */            fb0.f8059b.getClass();
/* 15 */            char cCharAt2 = str.charAt(0);
/* 30 */            int i = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
/* 51 */            boolean z = i > 0 && str.length() > 0 && C1848a.m6251b(str.charAt(0), '-', false);
/* 52 */            if (length <= i) {
/* 334 */               C1951n4.m6859j("No components");
/* 5 */                 return 0L;
                    }
/* 60 */            if (str.charAt(i) != 'P') {
/* 328 */               f42.m3649e();
/* 5 */                 return 0L;
                    }
/* 62 */            int i2 = i + 1;
/* 63 */            if (i2 == length) {
/* 324 */               f42.m3649e();
/* 5 */                 return 0L;
                    }
/* 65 */            ib0 ib0Var2 = null;
/* 66 */            long jM3691g = 0;
/* 67 */            boolean z2 = false;
/* 68 */            while (i2 < length) {
/* 76 */                if (str.charAt(i2) != 'T') {
/* 90 */                    int i3 = i2;
/* 95 */                    while (i3 < str.length() && (('0' <= (cCharAt = str.charAt(i3)) && cCharAt < ':') || StringsKt.m6225A("+-.", cCharAt))) {
/* 118 */                       i3++;
                            }
/* 121 */                   String strSubstring = str.substring(i2, i3);
/* 129 */                   if (strSubstring.length() == 0) {
/* 306 */                       f42.m3649e();
/* 5 */                         return 0L;
                            }
/* 135 */                   int length2 = strSubstring.length() + i2;
/* 136 */                   if (length2 < 0 || length2 >= str.length()) {
/* 302 */                       C1951n4.m6859j("Missing unit for value ".concat(strSubstring));
/* 5 */                         return 0L;
                            }
/* 144 */                   char cCharAt3 = str.charAt(length2);
/* 148 */                   int i4 = length2 + 1;
/* 150 */                   if (z2) {
/* 181 */                       if (cCharAt3 == 'H') {
/* 217 */                           ib0Var = ib0.HOURS;
                                } else if (cCharAt3 == 'M') {
/* 214 */                           ib0Var = ib0.MINUTES;
                                } else {
/* 189 */                           if (cCharAt3 != 'S') {
/* 213 */                               throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                                    }
/* 191 */                           ib0Var = ib0.SECONDS;
                                }
                            } else {
/* 154 */                       if (cCharAt3 != 'D') {
/* 178 */                           throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                                }
/* 156 */                       ib0Var = ib0.DAYS;
                            }
/* 219 */                   if (ib0Var2 != null && ib0Var2.compareTo(ib0Var) <= 0) {
/* 230 */                       C1951n4.m6859j("Unexpected order of duration components");
/* 5 */                         return 0L;
                            }
/* 237 */                   int iM6226B = StringsKt.m6226B(strSubstring, '.', 0, 6);
/* 291 */                   jM3691g = (ib0Var != ib0.SECONDS || iM6226B <= 0) ? fb0.m3691g(jM3691g, m6681E(m6708y(strSubstring), ib0Var)) : fb0.m3691g(fb0.m3691g(jM3691g, m6681E(m6708y(strSubstring.substring(0, iM6226B)), ib0Var)), m6679C(Double.parseDouble(strSubstring.substring(iM6226B)), ib0Var));
/* 279 */                   ib0Var2 = ib0Var;
/* 280 */                   i2 = i4;
                        } else {
/* 78 */                    if (z2 || (i2 = i2 + 1) == length) {
/* 86 */                        f42.m3649e();
/* 5 */                         return 0L;
                            }
/* 84 */                    z2 = true;
                        }
                    }
/* 310 */           if (!z) {
/* 323 */               return jM3691g;
                    }
/* 319 */           long j = ((-(jM3691g >> 1)) << 1) + ((long) (((int) jM3691g) & 1));
/* 320 */           int i5 = gb0.f8530a;
/* 322 */           return j;
                }

                /* JADX INFO: renamed from: c */
                public static final LinkedHashMap m6687c(List list) {
/* 7 */             int iM6962c = nc1.m6962c(C2122qw.m8020h(list, 10));
/* 13 */            if (iM6962c < 16) {
/* 15 */                iM6962c = 16;
                    }
/* 18 */            LinkedHashMap linkedHashMap = new LinkedHashMap(iM6962c);
/* 21 */            Iterator it = list.iterator();
/* 29 */            while (it.hasNext()) {
/* 35 */                TCFVendor tCFVendor = (TCFVendor) it.next();
/* 47 */                linkedHashMap.put(Integer.valueOf(tCFVendor.f6209d), m6682F(tCFVendor));
                    }
/* 51 */            return linkedHashMap;
                }

                /* JADX INFO: renamed from: d */
                public static final void m6688d(Map map, String str, Object obj) {
/* 1 */             map.getClass();
/* 4 */             if (obj == null || str.length() == 0) {
/* 16 */                return;
                    }
/* 13 */            map.put(str, obj);
                }

                /* JADX INFO: renamed from: e */
                public static v72 m6689e(Activity activity) {
                    String str;
                    String str2;
/* 1 */             activity.getClass();
/* 4 */             String localClassName = activity.getLocalClassName();
/* 8 */             localClassName.getClass();
/* 13 */            Class<?> cls = activity.getClass();
                    try {
/* 25 */                Object obj = cls.getField("snowplowScreenId").get(activity);
/* 31 */                if (obj instanceof String) {
/* 33 */                    str = (String) obj;
                        } else {
/* 61 */                    k50.m5980q("v72", String.format("The value of field `snowplowScreenId` on Activity `%s` has to be a String.", Arrays.copyOf(new Object[]{cls.getSimpleName()}, 1)), new Object[0]);
/* 116 */                   str = null;
                        }
                    } catch (NoSuchFieldException e) {
/* 113 */               k50.m5968e("v72", String.format("Field `snowplowScreenId` not found on Activity `%s`.", Arrays.copyOf(new Object[]{cls.getSimpleName()}, 1)), e);
                    } catch (Exception e2) {
/* 87 */                k50.m5980q("v72", "Error retrieving value of field `snowplowScreenId`: " + e2.getMessage(), e2);
                    }
/* 121 */           if (localClassName.length() > 0) {
/* 123 */               str2 = localClassName;
                    } else {
/* 135 */               str2 = (str == null || str.length() <= 0) ? "Unknown" : str;
                    }
/* 139 */           v72 v72Var = new v72(str2, null);
/* 142 */           v72Var.f17904i = localClassName;
/* 144 */           v72Var.f17905j = str;
/* 146 */           v72Var.f17899d = localClassName;
/* 148 */           v72Var.f17903h = null;
/* 150 */           return v72Var;
                }

                /* JADX INFO: renamed from: f */
                public static byte[] m6690f(ArrayDeque arrayDeque, int i) {
/* 6 */             if (arrayDeque.isEmpty()) {
/* 8 */                 return new byte[0];
                    }
/* 15 */            byte[] bArr = (byte[]) arrayDeque.remove();
/* 18 */            if (bArr.length == i) {
/* 20 */                return bArr;
                    }
/* 22 */            int length = i - bArr.length;
/* 24 */            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
/* 28 */            while (length > 0) {
/* 34 */                byte[] bArr2 = (byte[]) arrayDeque.remove();
/* 37 */                int iMin = Math.min(length, bArr2.length);
/* 43 */                System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
/* 46 */                length -= iMin;
                    }
/* 48 */            return bArrCopyOf;
                }

                /* JADX INFO: renamed from: g */
                public static LinearLayout m6691g(Context context, ArrayList arrayList, int i) {
                    float measuredWidth;
/* 1 */             context.getClass();
/* 6 */             Paint paint = new Paint();
/* 17 */            int i2 = Resources.getSystem().getDisplayMetrics().widthPixels;
/* 19 */            int i3 = i * 2;
/* 23 */            LinearLayout linearLayout = new LinearLayout(context);
/* 27 */            linearLayout.setOrientation(1);
/* 32 */            LinearLayout linearLayout2 = new LinearLayout(context);
/* 36 */            linearLayout2.setOrientation(0);
/* 45 */            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
/* 48 */            Iterator it = arrayList.iterator();
/* 53 */            float f = 0.0f;
/* 58 */            while (it.hasNext()) {
/* 64 */                View view = (View) it.next();
/* 68 */                if (view instanceof UCTextView) {
/* 71 */                    UCTextView uCTextView = (UCTextView) view;
/* 77 */                    paint.setTextSize(uCTextView.getTextSize());
/* 88 */                    measuredWidth = paint.measureText(uCTextView.getText().toString());
                        } else {
/* 95 */                    measuredWidth = view.getMeasuredWidth();
                        }
/* 93 */                float f2 = measuredWidth + i3;
/* 106 */               if (f + f2 > i2) {
/* 108 */                   linearLayout.addView(linearLayout2);
/* 113 */                   linearLayout2 = new LinearLayout(context);
/* 116 */                   linearLayout2.setOrientation(0);
/* 124 */                   linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
/* 127 */                   f = 0.0f;
                        }
/* 130 */               LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
/* 133 */               layoutParams.setMarginStart(0);
/* 136 */               layoutParams.setMarginEnd(i);
/* 139 */               linearLayout2.addView(view, layoutParams);
/* 142 */               f += f2;
                    }
/* 148 */           if (linearLayout2.getChildCount() > 0) {
/* 150 */               linearLayout.addView(linearLayout2);
                    }
/* 153 */           return linearLayout;
                }

                /* JADX INFO: renamed from: h */
                public static final n62 m6692h(qk1 qk1Var) {
/* 1 */             LinkedHashMap linkedHashMap = qk1Var.f13548a;
/* 9 */             z62 z62Var = (z62) linkedHashMap.get(f13870e);
/* 12 */            if (z62Var == null) {
/* 138 */               C1951n4.m6859j("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
/* 11 */                return null;
                    }
/* 20 */            u33 u33Var = (u33) linkedHashMap.get(f13871f);
/* 22 */            if (u33Var == null) {
/* 132 */               C1951n4.m6859j("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
/* 11 */                return null;
                    }
/* 30 */            Bundle bundle = (Bundle) linkedHashMap.get(f13872g);
/* 38 */            String str = (String) linkedHashMap.get(xt0.f19358W);
/* 40 */            if (str == null) {
/* 126 */               C1951n4.m6859j("CreationExtras must have a value by `VIEW_MODEL_KEY`");
/* 11 */                return null;
                    }
/* 46 */            w62 w62VarM9723b = z62Var.getSavedStateRegistry().m9723b();
/* 57 */            s62 s62Var = w62VarM9723b instanceof s62 ? (s62) w62VarM9723b : null;
/* 58 */            if (s62Var == null) {
/* 120 */               f42.m3656l("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
/* 11 */                return null;
                    }
/* 64 */            LinkedHashMap linkedHashMap2 = m6703s(u33Var).f16930d;
/* 70 */            n62 n62Var = (n62) linkedHashMap2.get(str);
/* 72 */            if (n62Var != null) {
/* 117 */               return n62Var;
                    }
/* 74 */            Class[] clsArr = n62.f14144f;
/* 76 */            s62Var.m8416b();
/* 79 */            Bundle bundle2 = s62Var.f16452c;
/* 88 */            Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
/* 89 */            Bundle bundle4 = s62Var.f16452c;
/* 91 */            if (bundle4 != null) {
/* 93 */                bundle4.remove(str);
                    }
/* 96 */            Bundle bundle5 = s62Var.f16452c;
/* 98 */            if (bundle5 != null && bundle5.isEmpty()) {
/* 107 */               s62Var.f16452c = null;
                    }
/* 109 */           n62 n62VarM5644d = j13.m5644d(bundle3, bundle);
/* 113 */           linkedHashMap2.put(str, n62VarM5644d);
/* 116 */           return n62VarM5644d;
                }

                /* JADX INFO: renamed from: i */
                public static final long m6693i(long j) {
/* 5 */             long j2 = (j << 1) + 1;
/* 6 */             eb0 eb0Var = fb0.f8059b;
/* 8 */             int i = gb0.f8530a;
/* 10 */            return j2;
                }

                /* JADX INFO: renamed from: j */
                public static final long m6694j(long j) {
                    return (-4611686018426L > j || j >= 4611686018427L) ? m6693i(r02.m8045b(j)) : m6695k(j * 1000000);
                }

                /* JADX INFO: renamed from: k */
                public static final long m6695k(long j) {
/* 2 */             long j2 = j << 1;
/* 3 */             eb0 eb0Var = fb0.f8059b;
/* 5 */             int i = gb0.f8530a;
/* 7 */             return j2;
                }

                /* JADX INFO: renamed from: l */
                public static final void m6696l(z62 z62Var) {
/* 7 */             u61 u61Var = ((i71) z62Var.getLifecycle()).f9483c;
/* 11 */            if (u61Var != u61.f17375b && u61Var != u61.f17376c) {
/* 20 */                C1951n4.m6859j("Failed requirement.");
                    } else if (z62Var.getSavedStateRegistry().m9723b() == null) {
/* 43 */                s62 s62Var = new s62(z62Var.getSavedStateRegistry(), (u33) z62Var);
/* 52 */                z62Var.getSavedStateRegistry().m9724c("androidx.lifecycle.internal.SavedStateHandlesProvider", s62Var);
/* 65 */                z62Var.getLifecycle().mo4483a(new e12(s62Var, 2));
                    }
                }

                /* JADX INFO: renamed from: m */
                public static String m6697m(String str) {
/* 5 */             return fm0.m3784j("iglu:com.snowplowanalytics.snowplow.media/", str, "_event/jsonschema/1-0-0");
                }

                /* JADX INFO: renamed from: n */
                public static int m6698n(int i, int i2) {
/* 1 */             if (i2 < 0) {
/* 26 */                C1951n4.m6856g("cannot store more than MAX_VALUE elements");
/* 29 */                return 0;
                    }
/* 6 */             int iHighestOneBit = i + (i >> 1) + 1;
/* 8 */             if (iHighestOneBit < i2) {
/* 16 */                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
                    }
                    return iHighestOneBit < 0 ? AbstractC0208c9.API_PRIORITY_OTHER : iHighestOneBit;
                }

                /* JADX INFO: renamed from: o */
                public static final String m6699o(Date date) {
/* 12 */            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", new Locale("en"));
/* 21 */            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
/* 24 */            String str = simpleDateFormat.format(date);
/* 28 */            str.getClass();
/* 31 */            return str;
                }

                /* JADX INFO: renamed from: p */
                public static Drawable m6700p(Context context, int i) {
/* 5 */             return x32.m9695b().m9698c(context, i);
                }

                /* JADX INFO: renamed from: q */
                public static zzco m6701q() {
/* 1 */             zzbr.zzb();
/* 22 */            return new zzco(zzax.zza(zzbr.zza()), zzar.zza(zzbr.zza()));
                }

                /* JADX INFO: renamed from: r */
                public static String m6702r() throws Throwable {
                    BufferedReader bufferedReader;
/* 3 */             if (f13878m == null) {
/* 9 */                 if (Build.VERSION.SDK_INT >= 28) {
/* 15 */                    f13878m = Application.getProcessName();
                        } else {
/* 18 */                    int iMyPid = f13879n;
/* 20 */                    if (iMyPid == 0) {
/* 22 */                        iMyPid = Process.myPid();
/* 26 */                        f13879n = iMyPid;
                            }
/* 32 */                    String strTrim = null;
/* 32 */                    strTrim = null;
/* 32 */                    strTrim = null;
/* 32 */                    BufferedReader bufferedReader2 = null;
/* 33 */                    if (iMyPid > 0) {
                                try {
                                    try {
/* 48 */                                StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
/* 51 */                                sb.append("/proc/");
/* 54 */                                sb.append(iMyPid);
/* 57 */                                sb.append("/cmdline");
/* 60 */                                String string = sb.toString();
/* 64 */                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                        try {
/* 75 */                                    bufferedReader = new BufferedReader(new C1501h(string));
/* 78 */                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                            try {
/* 81 */                                        String line = bufferedReader.readLine();
/* 85 */                                        kb1.m6061n(line);
/* 88 */                                        strTrim = line.trim();
                                            } catch (IOException unused) {
/* 113 */                                       if (bufferedReader != null) {
                                                }
/* 116 */                                       f13878m = strTrim;
/* 118 */                                       return f13878m;
                                            } catch (Throwable th) {
/* 96 */                                        th = th;
/* 97 */                                        bufferedReader2 = bufferedReader;
/* 106 */                                       if (bufferedReader2 != null) {
                                                    try {
/* 108 */                                               bufferedReader2.close();
                                                    } catch (IOException unused2) {
                                                    }
                                                }
/* 111 */                                       throw th;
                                            }
                                        } catch (Throwable th2) {
/* 102 */                                   StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 105 */                                   throw th2;
                                        }
                                    } catch (IOException unused3) {
/* 112 */                               bufferedReader = null;
                                    } catch (Throwable th3) {
/* 99 */                                th = th3;
                                    }
/* 92 */                            bufferedReader.close();
                                } catch (IOException unused4) {
                                }
                            }
/* 116 */                   f13878m = strTrim;
                        }
                    }
/* 118 */           return f13878m;
                }

                /* JADX INFO: renamed from: s */
                public static final t62 m6703s(u33 u33Var) {
/* 36 */            return (t62) new ac1(u33Var.getViewModelStore(), new r62(), u33Var instanceof pt0 ? ((pt0) u33Var).getDefaultViewModelCreationExtras() : l20.f13077b).m182l(t62.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
                }

                /* JADX INFO: renamed from: t */
                public static final void m6704t(Throwable th, CoroutineContext coroutineContext) {
                    Throwable runtimeException;
/* 3 */             Iterator it = u10.f17329a.iterator();
/* 11 */            while (it.hasNext()) {
                        try {
/* 21 */                    ((C0171b8) ((t10) it.next())).m1296g(th);
                        } catch (Throwable th2) {
/* 26 */                    if (th == th2) {
/* 28 */                        runtimeException = th;
                            } else {
/* 34 */                        runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
/* 37 */                        jf0.m5798a(runtimeException, th);
                            }
/* 40 */                    Thread threadCurrentThread = Thread.currentThread();
/* 48 */                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
                        }
                    }
                    try {
/* 57 */                jf0.m5798a(th, new i80(coroutineContext));
                    } catch (Throwable unused) {
                    }
/* 60 */            Thread threadCurrentThread2 = Thread.currentThread();
/* 68 */            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }

                /* JADX INFO: renamed from: u */
                public static final boolean m6705u(Context context) {
/* 8 */             Activity activity = context instanceof Activity ? (Activity) context : null;
                    return activity == null || activity.isFinishing() || activity.isDestroyed();
                }

                /* JADX INFO: renamed from: v */
                public static final boolean m6706v(Context context) {
/* 1 */             context.getClass();
/* 4 */             boolean z = false;
/* 11 */            k50.m5958L("mn0", "Checking tracker internet connectivity.", new Object[0]);
/* 16 */            Object systemService = context.getSystemService("connectivity");
/* 22 */            NetworkInfo activeNetworkInfo = null;
/* 28 */            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
/* 30 */            if (connectivityManager != null) {
                        try {
/* 32 */                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        } catch (SecurityException e) {
/* 72 */                    k50.m5980q("mn0", "Security exception checking connection: %s", e.toString());
/* 29 */                    return true;
                        }
                    }
/* 39 */            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
/* 47 */                z = true;
                    }
/* 58 */            k50.m5968e("mn0", "Tracker connection online: %s", Boolean.valueOf(z));
/* 61 */            return z;
                }

                /* JADX INFO: renamed from: x */
                public static final void m6707x(Context context, String str) {
/* 3 */             context.getClass();
/* 6 */             str.getClass();
                    try {
/* 9 */                 StringsKt.m6228D(str);
/* 20 */                String string = StringsKt.m6239O(str).toString();
/* 31 */                if (!StringsKt.m6240z(string, "://", false)) {
/* 33 */                    string = "https://".concat(string);
                        }
/* 54 */                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)).putExtra("com.android.browser.application_id", context.getPackageName()));
                    } catch (Throwable th) {
/* 80 */                qu1.f15755a.mo2907b("Error when opening URL<" + str + ">", th);
                    }
                }

                /* JADX INFO: renamed from: y */
                public static final long m6708y(String str) {
                    char cCharAt;
/* 1 */             int length = str.length();
/* 23 */            int i = (length <= 0 || !StringsKt.m6225A("+-", str.charAt(0))) ? 0 : 1;
/* 32 */            if (length - i > 16) {
/* 34 */                int i2 = i;
                        while (true) {
/* 35 */                    if (i >= length) {
/* 59 */                        if (length - i2 <= 16) {
                                    break;
                                }
                                return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                            }
/* 37 */                    char cCharAt2 = str.charAt(i);
/* 41 */                    if (cCharAt2 == '0') {
/* 43 */                        if (i2 == i) {
/* 45 */                            i2++;
                                }
                            } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                                break;
                            }
/* 54 */                    i++;
                        }
                    }
                    return (!C1852e.m6263m(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(di2.m3087w(1, str));
                }

                /* JADX INFO: renamed from: z */
                public static void m6709z(C0210cb c0210cb, float f) {
/* 3 */             e52 e52Var = (e52) c0210cb.f2804b;
/* 7 */             CardView cardView = (CardView) c0210cb.f2805c;
/* 9 */             boolean useCompatPadding = cardView.getUseCompatPadding();
/* 13 */            boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
/* 21 */            if (f != e52Var.f7519e || e52Var.f7520f != useCompatPadding || e52Var.f7521g != preventCornerOverlap) {
/* 32 */                e52Var.f7519e = f;
/* 34 */                e52Var.f7520f = useCompatPadding;
/* 36 */                e52Var.f7521g = preventCornerOverlap;
/* 39 */                e52Var.m3322b(null);
/* 42 */                e52Var.invalidateSelf();
                    }
/* 49 */            if (!cardView.getUseCompatPadding()) {
/* 52 */                c0210cb.m1575I(0, 0, 0, 0);
/* 55 */                return;
                    }
/* 58 */            e52 e52Var2 = (e52) c0210cb.f2804b;
/* 60 */            float f2 = e52Var2.f7519e;
/* 62 */            float f3 = e52Var2.f7515a;
/* 77 */            int iCeil = (int) Math.ceil(f52.m3670a(f2, f3, cardView.getPreventCornerOverlap()));
/* 91 */            int iCeil2 = (int) Math.ceil(f52.m3671b(f2, f3, cardView.getPreventCornerOverlap()));
/* 92 */            c0210cb.m1575I(iCeil, iCeil2, iCeil, iCeil2);
                }

                /* JADX INFO: renamed from: w */
                public final Rect m6710w() {
/* 1 */             int i = this.f13882a;
/* 3 */             Rect rect = this.f13883b;
                    switch (i) {
                        case 0:
/* 15 */                    return rect;
                        default:
/* 12 */                    if (rect.isEmpty()) {
/* 14 */                        return null;
                            }
/* 15 */                    return rect;
                    }
                }
            }
